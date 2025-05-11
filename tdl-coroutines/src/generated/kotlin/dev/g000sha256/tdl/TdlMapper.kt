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

import dev.g000sha256.tdl.dto.AccentColorDto
import dev.g000sha256.tdl.dto.AcceptedGiftTypesDto
import dev.g000sha256.tdl.dto.AccountInfoDto
import dev.g000sha256.tdl.dto.AccountTtlDto
import dev.g000sha256.tdl.dto.AddedReactionDto
import dev.g000sha256.tdl.dto.AddedReactionsDto
import dev.g000sha256.tdl.dto.AddressDto
import dev.g000sha256.tdl.dto.AffiliateInfoDto
import dev.g000sha256.tdl.dto.AffiliateProgramInfoDto
import dev.g000sha256.tdl.dto.AffiliateProgramParametersDto
import dev.g000sha256.tdl.dto.AffiliateProgramSortOrderDto
import dev.g000sha256.tdl.dto.AffiliateTypeDto
import dev.g000sha256.tdl.dto.AlternativeVideoDto
import dev.g000sha256.tdl.dto.AnimatedChatPhotoDto
import dev.g000sha256.tdl.dto.AnimatedEmojiDto
import dev.g000sha256.tdl.dto.AnimationDto
import dev.g000sha256.tdl.dto.AnimationsDto
import dev.g000sha256.tdl.dto.ArchiveChatListSettingsDto
import dev.g000sha256.tdl.dto.AttachmentMenuBotColorDto
import dev.g000sha256.tdl.dto.AttachmentMenuBotDto
import dev.g000sha256.tdl.dto.AudioDto
import dev.g000sha256.tdl.dto.AuthenticationCodeInfoDto
import dev.g000sha256.tdl.dto.AuthenticationCodeTypeDto
import dev.g000sha256.tdl.dto.AuthorizationStateDto
import dev.g000sha256.tdl.dto.AutoDownloadSettingsDto
import dev.g000sha256.tdl.dto.AutoDownloadSettingsPresetsDto
import dev.g000sha256.tdl.dto.AutosaveSettingsDto
import dev.g000sha256.tdl.dto.AutosaveSettingsExceptionDto
import dev.g000sha256.tdl.dto.AutosaveSettingsScopeDto
import dev.g000sha256.tdl.dto.AvailableReactionDto
import dev.g000sha256.tdl.dto.AvailableReactionsDto
import dev.g000sha256.tdl.dto.BackgroundDto
import dev.g000sha256.tdl.dto.BackgroundFillDto
import dev.g000sha256.tdl.dto.BackgroundTypeDto
import dev.g000sha256.tdl.dto.BackgroundsDto
import dev.g000sha256.tdl.dto.BankCardActionOpenUrlDto
import dev.g000sha256.tdl.dto.BankCardInfoDto
import dev.g000sha256.tdl.dto.BasicGroupDto
import dev.g000sha256.tdl.dto.BasicGroupFullInfoDto
import dev.g000sha256.tdl.dto.BirthdateDto
import dev.g000sha256.tdl.dto.BlockListDto
import dev.g000sha256.tdl.dto.BotCommandDto
import dev.g000sha256.tdl.dto.BotCommandScopeDto
import dev.g000sha256.tdl.dto.BotCommandsDto
import dev.g000sha256.tdl.dto.BotInfoDto
import dev.g000sha256.tdl.dto.BotMediaPreviewDto
import dev.g000sha256.tdl.dto.BotMediaPreviewInfoDto
import dev.g000sha256.tdl.dto.BotMediaPreviewsDto
import dev.g000sha256.tdl.dto.BotMenuButtonDto
import dev.g000sha256.tdl.dto.BotVerificationDto
import dev.g000sha256.tdl.dto.BotVerificationParametersDto
import dev.g000sha256.tdl.dto.BotWriteAccessAllowReasonDto
import dev.g000sha256.tdl.dto.BusinessAwayMessageScheduleDto
import dev.g000sha256.tdl.dto.BusinessAwayMessageSettingsDto
import dev.g000sha256.tdl.dto.BusinessBotManageBarDto
import dev.g000sha256.tdl.dto.BusinessBotRightsDto
import dev.g000sha256.tdl.dto.BusinessChatLinkDto
import dev.g000sha256.tdl.dto.BusinessChatLinkInfoDto
import dev.g000sha256.tdl.dto.BusinessChatLinksDto
import dev.g000sha256.tdl.dto.BusinessConnectedBotDto
import dev.g000sha256.tdl.dto.BusinessConnectionDto
import dev.g000sha256.tdl.dto.BusinessFeatureDto
import dev.g000sha256.tdl.dto.BusinessFeaturePromotionAnimationDto
import dev.g000sha256.tdl.dto.BusinessFeaturesDto
import dev.g000sha256.tdl.dto.BusinessGreetingMessageSettingsDto
import dev.g000sha256.tdl.dto.BusinessInfoDto
import dev.g000sha256.tdl.dto.BusinessLocationDto
import dev.g000sha256.tdl.dto.BusinessMessageDto
import dev.g000sha256.tdl.dto.BusinessMessagesDto
import dev.g000sha256.tdl.dto.BusinessOpeningHoursDto
import dev.g000sha256.tdl.dto.BusinessOpeningHoursIntervalDto
import dev.g000sha256.tdl.dto.BusinessRecipientsDto
import dev.g000sha256.tdl.dto.BusinessStartPageDto
import dev.g000sha256.tdl.dto.CallDiscardReasonDto
import dev.g000sha256.tdl.dto.CallDto
import dev.g000sha256.tdl.dto.CallIdDto
import dev.g000sha256.tdl.dto.CallProblemDto
import dev.g000sha256.tdl.dto.CallProtocolDto
import dev.g000sha256.tdl.dto.CallServerDto
import dev.g000sha256.tdl.dto.CallServerTypeDto
import dev.g000sha256.tdl.dto.CallStateDto
import dev.g000sha256.tdl.dto.CallbackQueryAnswerDto
import dev.g000sha256.tdl.dto.CallbackQueryPayloadDto
import dev.g000sha256.tdl.dto.CanPostStoryResultDto
import dev.g000sha256.tdl.dto.CanSendMessageToUserResultDto
import dev.g000sha256.tdl.dto.CanTransferOwnershipResultDto
import dev.g000sha256.tdl.dto.ChatActionBarDto
import dev.g000sha256.tdl.dto.ChatActionDto
import dev.g000sha256.tdl.dto.ChatActiveStoriesDto
import dev.g000sha256.tdl.dto.ChatAdministratorDto
import dev.g000sha256.tdl.dto.ChatAdministratorRightsDto
import dev.g000sha256.tdl.dto.ChatAdministratorsDto
import dev.g000sha256.tdl.dto.ChatAvailableReactionsDto
import dev.g000sha256.tdl.dto.ChatBackgroundDto
import dev.g000sha256.tdl.dto.ChatBoostDto
import dev.g000sha256.tdl.dto.ChatBoostFeaturesDto
import dev.g000sha256.tdl.dto.ChatBoostLevelFeaturesDto
import dev.g000sha256.tdl.dto.ChatBoostLinkDto
import dev.g000sha256.tdl.dto.ChatBoostLinkInfoDto
import dev.g000sha256.tdl.dto.ChatBoostSlotDto
import dev.g000sha256.tdl.dto.ChatBoostSlotsDto
import dev.g000sha256.tdl.dto.ChatBoostSourceDto
import dev.g000sha256.tdl.dto.ChatBoostStatusDto
import dev.g000sha256.tdl.dto.ChatDto
import dev.g000sha256.tdl.dto.ChatEventActionDto
import dev.g000sha256.tdl.dto.ChatEventDto
import dev.g000sha256.tdl.dto.ChatEventLogFiltersDto
import dev.g000sha256.tdl.dto.ChatEventsDto
import dev.g000sha256.tdl.dto.ChatFolderDto
import dev.g000sha256.tdl.dto.ChatFolderIconDto
import dev.g000sha256.tdl.dto.ChatFolderInfoDto
import dev.g000sha256.tdl.dto.ChatFolderInviteLinkDto
import dev.g000sha256.tdl.dto.ChatFolderInviteLinkInfoDto
import dev.g000sha256.tdl.dto.ChatFolderInviteLinksDto
import dev.g000sha256.tdl.dto.ChatFolderNameDto
import dev.g000sha256.tdl.dto.ChatInviteLinkCountDto
import dev.g000sha256.tdl.dto.ChatInviteLinkCountsDto
import dev.g000sha256.tdl.dto.ChatInviteLinkDto
import dev.g000sha256.tdl.dto.ChatInviteLinkInfoDto
import dev.g000sha256.tdl.dto.ChatInviteLinkMemberDto
import dev.g000sha256.tdl.dto.ChatInviteLinkMembersDto
import dev.g000sha256.tdl.dto.ChatInviteLinkSubscriptionInfoDto
import dev.g000sha256.tdl.dto.ChatInviteLinksDto
import dev.g000sha256.tdl.dto.ChatJoinRequestDto
import dev.g000sha256.tdl.dto.ChatJoinRequestsDto
import dev.g000sha256.tdl.dto.ChatJoinRequestsInfoDto
import dev.g000sha256.tdl.dto.ChatListDto
import dev.g000sha256.tdl.dto.ChatListsDto
import dev.g000sha256.tdl.dto.ChatLocationDto
import dev.g000sha256.tdl.dto.ChatMemberDto
import dev.g000sha256.tdl.dto.ChatMemberStatusDto
import dev.g000sha256.tdl.dto.ChatMembersDto
import dev.g000sha256.tdl.dto.ChatMembersFilterDto
import dev.g000sha256.tdl.dto.ChatMessageSenderDto
import dev.g000sha256.tdl.dto.ChatMessageSendersDto
import dev.g000sha256.tdl.dto.ChatNotificationSettingsDto
import dev.g000sha256.tdl.dto.ChatPermissionsDto
import dev.g000sha256.tdl.dto.ChatPhotoDto
import dev.g000sha256.tdl.dto.ChatPhotoInfoDto
import dev.g000sha256.tdl.dto.ChatPhotoStickerDto
import dev.g000sha256.tdl.dto.ChatPhotoStickerTypeDto
import dev.g000sha256.tdl.dto.ChatPhotosDto
import dev.g000sha256.tdl.dto.ChatPositionDto
import dev.g000sha256.tdl.dto.ChatRevenueAmountDto
import dev.g000sha256.tdl.dto.ChatRevenueStatisticsDto
import dev.g000sha256.tdl.dto.ChatRevenueTransactionDto
import dev.g000sha256.tdl.dto.ChatRevenueTransactionTypeDto
import dev.g000sha256.tdl.dto.ChatRevenueTransactionsDto
import dev.g000sha256.tdl.dto.ChatSourceDto
import dev.g000sha256.tdl.dto.ChatStatisticsAdministratorActionsInfoDto
import dev.g000sha256.tdl.dto.ChatStatisticsDto
import dev.g000sha256.tdl.dto.ChatStatisticsInteractionInfoDto
import dev.g000sha256.tdl.dto.ChatStatisticsInviterInfoDto
import dev.g000sha256.tdl.dto.ChatStatisticsMessageSenderInfoDto
import dev.g000sha256.tdl.dto.ChatStatisticsObjectTypeDto
import dev.g000sha256.tdl.dto.ChatThemeDto
import dev.g000sha256.tdl.dto.ChatTypeDto
import dev.g000sha256.tdl.dto.ChatsDto
import dev.g000sha256.tdl.dto.CheckChatUsernameResultDto
import dev.g000sha256.tdl.dto.CheckStickerSetNameResultDto
import dev.g000sha256.tdl.dto.CloseBirthdayUserDto
import dev.g000sha256.tdl.dto.ClosedVectorPathDto
import dev.g000sha256.tdl.dto.CollectibleItemInfoDto
import dev.g000sha256.tdl.dto.CollectibleItemTypeDto
import dev.g000sha256.tdl.dto.ConnectedAffiliateProgramDto
import dev.g000sha256.tdl.dto.ConnectedAffiliateProgramsDto
import dev.g000sha256.tdl.dto.ConnectedWebsiteDto
import dev.g000sha256.tdl.dto.ConnectedWebsitesDto
import dev.g000sha256.tdl.dto.ConnectionStateDto
import dev.g000sha256.tdl.dto.ContactDto
import dev.g000sha256.tdl.dto.CountDto
import dev.g000sha256.tdl.dto.CountriesDto
import dev.g000sha256.tdl.dto.CountryInfoDto
import dev.g000sha256.tdl.dto.CreatedBasicGroupChatDto
import dev.g000sha256.tdl.dto.CurrentWeatherDto
import dev.g000sha256.tdl.dto.CustomRequestResultDto
import dev.g000sha256.tdl.dto.DataDto
import dev.g000sha256.tdl.dto.DatabaseStatisticsDto
import dev.g000sha256.tdl.dto.DateDto
import dev.g000sha256.tdl.dto.DateRangeDto
import dev.g000sha256.tdl.dto.DatedFileDto
import dev.g000sha256.tdl.dto.DeepLinkInfoDto
import dev.g000sha256.tdl.dto.DeviceTokenDto
import dev.g000sha256.tdl.dto.DiceStickersDto
import dev.g000sha256.tdl.dto.DocumentDto
import dev.g000sha256.tdl.dto.DownloadedFileCountsDto
import dev.g000sha256.tdl.dto.DraftMessageDto
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationCodeInfoDto
import dev.g000sha256.tdl.dto.EmailAddressAuthenticationDto
import dev.g000sha256.tdl.dto.EmailAddressResetStateDto
import dev.g000sha256.tdl.dto.EmojiCategoriesDto
import dev.g000sha256.tdl.dto.EmojiCategoryDto
import dev.g000sha256.tdl.dto.EmojiCategorySourceDto
import dev.g000sha256.tdl.dto.EmojiCategoryTypeDto
import dev.g000sha256.tdl.dto.EmojiKeywordDto
import dev.g000sha256.tdl.dto.EmojiKeywordsDto
import dev.g000sha256.tdl.dto.EmojiReactionDto
import dev.g000sha256.tdl.dto.EmojiStatusCustomEmojisDto
import dev.g000sha256.tdl.dto.EmojiStatusDto
import dev.g000sha256.tdl.dto.EmojiStatusTypeDto
import dev.g000sha256.tdl.dto.EmojiStatusesDto
import dev.g000sha256.tdl.dto.EmojisDto
import dev.g000sha256.tdl.dto.EncryptedCredentialsDto
import dev.g000sha256.tdl.dto.EncryptedPassportElementDto
import dev.g000sha256.tdl.dto.ErrorDto
import dev.g000sha256.tdl.dto.FactCheckDto
import dev.g000sha256.tdl.dto.FailedToAddMemberDto
import dev.g000sha256.tdl.dto.FailedToAddMembersDto
import dev.g000sha256.tdl.dto.FileDownloadDto
import dev.g000sha256.tdl.dto.FileDownloadedPrefixSizeDto
import dev.g000sha256.tdl.dto.FileDto
import dev.g000sha256.tdl.dto.FileTypeDto
import dev.g000sha256.tdl.dto.FirebaseAuthenticationSettingsDto
import dev.g000sha256.tdl.dto.FirebaseDeviceVerificationParametersDto
import dev.g000sha256.tdl.dto.FormattedTextDto
import dev.g000sha256.tdl.dto.ForumTopicDto
import dev.g000sha256.tdl.dto.ForumTopicIconDto
import dev.g000sha256.tdl.dto.ForumTopicInfoDto
import dev.g000sha256.tdl.dto.ForumTopicsDto
import dev.g000sha256.tdl.dto.ForwardSourceDto
import dev.g000sha256.tdl.dto.FoundAffiliateProgramDto
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
import dev.g000sha256.tdl.dto.GameDto
import dev.g000sha256.tdl.dto.GameHighScoreDto
import dev.g000sha256.tdl.dto.GameHighScoresDto
import dev.g000sha256.tdl.dto.GiftDto
import dev.g000sha256.tdl.dto.GiftSettingsDto
import dev.g000sha256.tdl.dto.GiftUpgradePreviewDto
import dev.g000sha256.tdl.dto.GiftsDto
import dev.g000sha256.tdl.dto.GiveawayInfoDto
import dev.g000sha256.tdl.dto.GiveawayParametersDto
import dev.g000sha256.tdl.dto.GiveawayParticipantStatusDto
import dev.g000sha256.tdl.dto.GiveawayPrizeDto
import dev.g000sha256.tdl.dto.GroupCallDataChannelDto
import dev.g000sha256.tdl.dto.GroupCallDto
import dev.g000sha256.tdl.dto.GroupCallIdDto
import dev.g000sha256.tdl.dto.GroupCallInfoDto
import dev.g000sha256.tdl.dto.GroupCallJoinParametersDto
import dev.g000sha256.tdl.dto.GroupCallParticipantDto
import dev.g000sha256.tdl.dto.GroupCallParticipantVideoInfoDto
import dev.g000sha256.tdl.dto.GroupCallParticipantsDto
import dev.g000sha256.tdl.dto.GroupCallRecentSpeakerDto
import dev.g000sha256.tdl.dto.GroupCallVideoQualityDto
import dev.g000sha256.tdl.dto.GroupCallVideoSourceGroupDto
import dev.g000sha256.tdl.dto.HashtagsDto
import dev.g000sha256.tdl.dto.HttpUrlDto
import dev.g000sha256.tdl.dto.IdentityDocumentDto
import dev.g000sha256.tdl.dto.ImportedContactsDto
import dev.g000sha256.tdl.dto.InlineKeyboardButtonDto
import dev.g000sha256.tdl.dto.InlineKeyboardButtonTypeDto
import dev.g000sha256.tdl.dto.InlineQueryResultDto
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonDto
import dev.g000sha256.tdl.dto.InlineQueryResultsButtonTypeDto
import dev.g000sha256.tdl.dto.InlineQueryResultsDto
import dev.g000sha256.tdl.dto.InputBackgroundDto
import dev.g000sha256.tdl.dto.InputBusinessChatLinkDto
import dev.g000sha256.tdl.dto.InputBusinessStartPageDto
import dev.g000sha256.tdl.dto.InputChatPhotoDto
import dev.g000sha256.tdl.dto.InputCredentialsDto
import dev.g000sha256.tdl.dto.InputFileDto
import dev.g000sha256.tdl.dto.InputGroupCallDto
import dev.g000sha256.tdl.dto.InputIdentityDocumentDto
import dev.g000sha256.tdl.dto.InputInlineQueryResultDto
import dev.g000sha256.tdl.dto.InputInvoiceDto
import dev.g000sha256.tdl.dto.InputMessageContentDto
import dev.g000sha256.tdl.dto.InputMessageReplyToDto
import dev.g000sha256.tdl.dto.InputPaidMediaDto
import dev.g000sha256.tdl.dto.InputPaidMediaTypeDto
import dev.g000sha256.tdl.dto.InputPassportElementDto
import dev.g000sha256.tdl.dto.InputPassportElementErrorDto
import dev.g000sha256.tdl.dto.InputPassportElementErrorSourceDto
import dev.g000sha256.tdl.dto.InputPersonalDocumentDto
import dev.g000sha256.tdl.dto.InputStickerDto
import dev.g000sha256.tdl.dto.InputStoryAreaDto
import dev.g000sha256.tdl.dto.InputStoryAreaTypeDto
import dev.g000sha256.tdl.dto.InputStoryAreasDto
import dev.g000sha256.tdl.dto.InputStoryContentDto
import dev.g000sha256.tdl.dto.InputTextQuoteDto
import dev.g000sha256.tdl.dto.InputThumbnailDto
import dev.g000sha256.tdl.dto.InternalLinkTypeDto
import dev.g000sha256.tdl.dto.InviteGroupCallParticipantResultDto
import dev.g000sha256.tdl.dto.InviteLinkChatTypeDto
import dev.g000sha256.tdl.dto.InvoiceDto
import dev.g000sha256.tdl.dto.JsonObjectMemberDto
import dev.g000sha256.tdl.dto.JsonValueDto
import dev.g000sha256.tdl.dto.KeyboardButtonDto
import dev.g000sha256.tdl.dto.KeyboardButtonTypeDto
import dev.g000sha256.tdl.dto.LabeledPricePartDto
import dev.g000sha256.tdl.dto.LanguagePackInfoDto
import dev.g000sha256.tdl.dto.LanguagePackStringDto
import dev.g000sha256.tdl.dto.LanguagePackStringValueDto
import dev.g000sha256.tdl.dto.LanguagePackStringsDto
import dev.g000sha256.tdl.dto.LinkPreviewAlbumMediaDto
import dev.g000sha256.tdl.dto.LinkPreviewDto
import dev.g000sha256.tdl.dto.LinkPreviewOptionsDto
import dev.g000sha256.tdl.dto.LinkPreviewTypeDto
import dev.g000sha256.tdl.dto.LocalFileDto
import dev.g000sha256.tdl.dto.LocalizationTargetInfoDto
import dev.g000sha256.tdl.dto.LocationAddressDto
import dev.g000sha256.tdl.dto.LocationDto
import dev.g000sha256.tdl.dto.LogStreamDto
import dev.g000sha256.tdl.dto.LogTagsDto
import dev.g000sha256.tdl.dto.LogVerbosityLevelDto
import dev.g000sha256.tdl.dto.LoginUrlInfoDto
import dev.g000sha256.tdl.dto.MainWebAppDto
import dev.g000sha256.tdl.dto.MaskPointDto
import dev.g000sha256.tdl.dto.MaskPositionDto
import dev.g000sha256.tdl.dto.MessageAutoDeleteTimeDto
import dev.g000sha256.tdl.dto.MessageCalendarDayDto
import dev.g000sha256.tdl.dto.MessageCalendarDto
import dev.g000sha256.tdl.dto.MessageContentDto
import dev.g000sha256.tdl.dto.MessageCopyOptionsDto
import dev.g000sha256.tdl.dto.MessageDto
import dev.g000sha256.tdl.dto.MessageEffectDto
import dev.g000sha256.tdl.dto.MessageEffectTypeDto
import dev.g000sha256.tdl.dto.MessageFileTypeDto
import dev.g000sha256.tdl.dto.MessageForwardInfoDto
import dev.g000sha256.tdl.dto.MessageImportInfoDto
import dev.g000sha256.tdl.dto.MessageInteractionInfoDto
import dev.g000sha256.tdl.dto.MessageLinkDto
import dev.g000sha256.tdl.dto.MessageLinkInfoDto
import dev.g000sha256.tdl.dto.MessageOriginDto
import dev.g000sha256.tdl.dto.MessagePositionDto
import dev.g000sha256.tdl.dto.MessagePositionsDto
import dev.g000sha256.tdl.dto.MessagePropertiesDto
import dev.g000sha256.tdl.dto.MessageReactionDto
import dev.g000sha256.tdl.dto.MessageReactionsDto
import dev.g000sha256.tdl.dto.MessageReadDateDto
import dev.g000sha256.tdl.dto.MessageReplyInfoDto
import dev.g000sha256.tdl.dto.MessageReplyToDto
import dev.g000sha256.tdl.dto.MessageSchedulingStateDto
import dev.g000sha256.tdl.dto.MessageSelfDestructTypeDto
import dev.g000sha256.tdl.dto.MessageSendOptionsDto
import dev.g000sha256.tdl.dto.MessageSenderDto
import dev.g000sha256.tdl.dto.MessageSendersDto
import dev.g000sha256.tdl.dto.MessageSendingStateDto
import dev.g000sha256.tdl.dto.MessageSourceDto
import dev.g000sha256.tdl.dto.MessageSponsorDto
import dev.g000sha256.tdl.dto.MessageStatisticsDto
import dev.g000sha256.tdl.dto.MessageThreadInfoDto
import dev.g000sha256.tdl.dto.MessageViewerDto
import dev.g000sha256.tdl.dto.MessageViewersDto
import dev.g000sha256.tdl.dto.MessagesDto
import dev.g000sha256.tdl.dto.MinithumbnailDto
import dev.g000sha256.tdl.dto.NetworkStatisticsDto
import dev.g000sha256.tdl.dto.NetworkStatisticsEntryDto
import dev.g000sha256.tdl.dto.NetworkTypeDto
import dev.g000sha256.tdl.dto.NewChatPrivacySettingsDto
import dev.g000sha256.tdl.dto.NotificationDto
import dev.g000sha256.tdl.dto.NotificationGroupDto
import dev.g000sha256.tdl.dto.NotificationGroupTypeDto
import dev.g000sha256.tdl.dto.NotificationSettingsScopeDto
import dev.g000sha256.tdl.dto.NotificationSoundDto
import dev.g000sha256.tdl.dto.NotificationSoundsDto
import dev.g000sha256.tdl.dto.NotificationTypeDto
import dev.g000sha256.tdl.dto.OkDto
import dev.g000sha256.tdl.dto.OptionValueDto
import dev.g000sha256.tdl.dto.OrderInfoDto
import dev.g000sha256.tdl.dto.OutlineDto
import dev.g000sha256.tdl.dto.PageBlockCaptionDto
import dev.g000sha256.tdl.dto.PageBlockDto
import dev.g000sha256.tdl.dto.PageBlockHorizontalAlignmentDto
import dev.g000sha256.tdl.dto.PageBlockListItemDto
import dev.g000sha256.tdl.dto.PageBlockRelatedArticleDto
import dev.g000sha256.tdl.dto.PageBlockTableCellDto
import dev.g000sha256.tdl.dto.PageBlockVerticalAlignmentDto
import dev.g000sha256.tdl.dto.PaidMediaDto
import dev.g000sha256.tdl.dto.PaidReactionTypeDto
import dev.g000sha256.tdl.dto.PaidReactorDto
import dev.g000sha256.tdl.dto.PassportAuthorizationFormDto
import dev.g000sha256.tdl.dto.PassportElementDto
import dev.g000sha256.tdl.dto.PassportElementErrorDto
import dev.g000sha256.tdl.dto.PassportElementErrorSourceDto
import dev.g000sha256.tdl.dto.PassportElementTypeDto
import dev.g000sha256.tdl.dto.PassportElementsDto
import dev.g000sha256.tdl.dto.PassportElementsWithErrorsDto
import dev.g000sha256.tdl.dto.PassportRequiredElementDto
import dev.g000sha256.tdl.dto.PassportSuitableElementDto
import dev.g000sha256.tdl.dto.PasswordStateDto
import dev.g000sha256.tdl.dto.PaymentFormDto
import dev.g000sha256.tdl.dto.PaymentFormTypeDto
import dev.g000sha256.tdl.dto.PaymentOptionDto
import dev.g000sha256.tdl.dto.PaymentProviderDto
import dev.g000sha256.tdl.dto.PaymentReceiptDto
import dev.g000sha256.tdl.dto.PaymentReceiptTypeDto
import dev.g000sha256.tdl.dto.PaymentResultDto
import dev.g000sha256.tdl.dto.PersonalDetailsDto
import dev.g000sha256.tdl.dto.PersonalDocumentDto
import dev.g000sha256.tdl.dto.PhoneNumberAuthenticationSettingsDto
import dev.g000sha256.tdl.dto.PhoneNumberCodeTypeDto
import dev.g000sha256.tdl.dto.PhoneNumberInfoDto
import dev.g000sha256.tdl.dto.PhotoDto
import dev.g000sha256.tdl.dto.PhotoSizeDto
import dev.g000sha256.tdl.dto.PointDto
import dev.g000sha256.tdl.dto.PollDto
import dev.g000sha256.tdl.dto.PollOptionDto
import dev.g000sha256.tdl.dto.PollTypeDto
import dev.g000sha256.tdl.dto.PremiumFeatureDto
import dev.g000sha256.tdl.dto.PremiumFeaturePromotionAnimationDto
import dev.g000sha256.tdl.dto.PremiumFeaturesDto
import dev.g000sha256.tdl.dto.PremiumGiftCodeInfoDto
import dev.g000sha256.tdl.dto.PremiumGiftPaymentOptionDto
import dev.g000sha256.tdl.dto.PremiumGiftPaymentOptionsDto
import dev.g000sha256.tdl.dto.PremiumGiveawayPaymentOptionDto
import dev.g000sha256.tdl.dto.PremiumGiveawayPaymentOptionsDto
import dev.g000sha256.tdl.dto.PremiumLimitDto
import dev.g000sha256.tdl.dto.PremiumLimitTypeDto
import dev.g000sha256.tdl.dto.PremiumPaymentOptionDto
import dev.g000sha256.tdl.dto.PremiumSourceDto
import dev.g000sha256.tdl.dto.PremiumStateDto
import dev.g000sha256.tdl.dto.PremiumStatePaymentOptionDto
import dev.g000sha256.tdl.dto.PremiumStoryFeatureDto
import dev.g000sha256.tdl.dto.PrepaidGiveawayDto
import dev.g000sha256.tdl.dto.PreparedInlineMessageDto
import dev.g000sha256.tdl.dto.PreparedInlineMessageIdDto
import dev.g000sha256.tdl.dto.ProductInfoDto
import dev.g000sha256.tdl.dto.ProfileAccentColorDto
import dev.g000sha256.tdl.dto.ProfileAccentColorsDto
import dev.g000sha256.tdl.dto.ProfilePhotoDto
import dev.g000sha256.tdl.dto.ProxiesDto
import dev.g000sha256.tdl.dto.ProxyDto
import dev.g000sha256.tdl.dto.ProxyTypeDto
import dev.g000sha256.tdl.dto.PublicChatTypeDto
import dev.g000sha256.tdl.dto.PublicForwardDto
import dev.g000sha256.tdl.dto.PublicForwardsDto
import dev.g000sha256.tdl.dto.PushMessageContentDto
import dev.g000sha256.tdl.dto.PushReceiverIdDto
import dev.g000sha256.tdl.dto.QuickReplyMessageDto
import dev.g000sha256.tdl.dto.QuickReplyMessagesDto
import dev.g000sha256.tdl.dto.QuickReplyShortcutDto
import dev.g000sha256.tdl.dto.ReactionNotificationSettingsDto
import dev.g000sha256.tdl.dto.ReactionNotificationSourceDto
import dev.g000sha256.tdl.dto.ReactionTypeDto
import dev.g000sha256.tdl.dto.ReactionUnavailabilityReasonDto
import dev.g000sha256.tdl.dto.ReadDatePrivacySettingsDto
import dev.g000sha256.tdl.dto.ReceivedGiftDto
import dev.g000sha256.tdl.dto.ReceivedGiftsDto
import dev.g000sha256.tdl.dto.RecommendedChatFolderDto
import dev.g000sha256.tdl.dto.RecommendedChatFoldersDto
import dev.g000sha256.tdl.dto.RecoveryEmailAddressDto
import dev.g000sha256.tdl.dto.RemoteFileDto
import dev.g000sha256.tdl.dto.ReplyMarkupDto
import dev.g000sha256.tdl.dto.ReportChatResultDto
import dev.g000sha256.tdl.dto.ReportOptionDto
import dev.g000sha256.tdl.dto.ReportReasonDto
import dev.g000sha256.tdl.dto.ReportSponsoredResultDto
import dev.g000sha256.tdl.dto.ReportStoryResultDto
import dev.g000sha256.tdl.dto.ResendCodeReasonDto
import dev.g000sha256.tdl.dto.ResetPasswordResultDto
import dev.g000sha256.tdl.dto.RevenueWithdrawalStateDto
import dev.g000sha256.tdl.dto.RichTextDto
import dev.g000sha256.tdl.dto.RtmpUrlDto
import dev.g000sha256.tdl.dto.SavedCredentialsDto
import dev.g000sha256.tdl.dto.SavedMessagesTagDto
import dev.g000sha256.tdl.dto.SavedMessagesTagsDto
import dev.g000sha256.tdl.dto.SavedMessagesTopicDto
import dev.g000sha256.tdl.dto.SavedMessagesTopicTypeDto
import dev.g000sha256.tdl.dto.ScopeAutosaveSettingsDto
import dev.g000sha256.tdl.dto.ScopeNotificationSettingsDto
import dev.g000sha256.tdl.dto.SearchMessagesChatTypeFilterDto
import dev.g000sha256.tdl.dto.SearchMessagesFilterDto
import dev.g000sha256.tdl.dto.SecondsDto
import dev.g000sha256.tdl.dto.SecretChatDto
import dev.g000sha256.tdl.dto.SecretChatStateDto
import dev.g000sha256.tdl.dto.SentGiftDto
import dev.g000sha256.tdl.dto.SentWebAppMessageDto
import dev.g000sha256.tdl.dto.SessionDto
import dev.g000sha256.tdl.dto.SessionTypeDto
import dev.g000sha256.tdl.dto.SessionsDto
import dev.g000sha256.tdl.dto.SharedChatDto
import dev.g000sha256.tdl.dto.SharedUserDto
import dev.g000sha256.tdl.dto.ShippingOptionDto
import dev.g000sha256.tdl.dto.SpeechRecognitionResultDto
import dev.g000sha256.tdl.dto.SponsoredChatDto
import dev.g000sha256.tdl.dto.SponsoredChatsDto
import dev.g000sha256.tdl.dto.SponsoredMessageDto
import dev.g000sha256.tdl.dto.SponsoredMessagesDto
import dev.g000sha256.tdl.dto.StarAmountDto
import dev.g000sha256.tdl.dto.StarCountDto
import dev.g000sha256.tdl.dto.StarGiveawayPaymentOptionDto
import dev.g000sha256.tdl.dto.StarGiveawayPaymentOptionsDto
import dev.g000sha256.tdl.dto.StarGiveawayWinnerOptionDto
import dev.g000sha256.tdl.dto.StarPaymentOptionDto
import dev.g000sha256.tdl.dto.StarPaymentOptionsDto
import dev.g000sha256.tdl.dto.StarRevenueStatisticsDto
import dev.g000sha256.tdl.dto.StarRevenueStatusDto
import dev.g000sha256.tdl.dto.StarSubscriptionDto
import dev.g000sha256.tdl.dto.StarSubscriptionPricingDto
import dev.g000sha256.tdl.dto.StarSubscriptionTypeDto
import dev.g000sha256.tdl.dto.StarSubscriptionsDto
import dev.g000sha256.tdl.dto.StarTransactionDirectionDto
import dev.g000sha256.tdl.dto.StarTransactionDto
import dev.g000sha256.tdl.dto.StarTransactionTypeDto
import dev.g000sha256.tdl.dto.StarTransactionsDto
import dev.g000sha256.tdl.dto.StatisticalGraphDto
import dev.g000sha256.tdl.dto.StatisticalValueDto
import dev.g000sha256.tdl.dto.StickerDto
import dev.g000sha256.tdl.dto.StickerFormatDto
import dev.g000sha256.tdl.dto.StickerFullTypeDto
import dev.g000sha256.tdl.dto.StickerSetDto
import dev.g000sha256.tdl.dto.StickerSetInfoDto
import dev.g000sha256.tdl.dto.StickerSetsDto
import dev.g000sha256.tdl.dto.StickerTypeDto
import dev.g000sha256.tdl.dto.StickersDto
import dev.g000sha256.tdl.dto.StorageStatisticsByChatDto
import dev.g000sha256.tdl.dto.StorageStatisticsByFileTypeDto
import dev.g000sha256.tdl.dto.StorageStatisticsDto
import dev.g000sha256.tdl.dto.StorageStatisticsFastDto
import dev.g000sha256.tdl.dto.StorePaymentPurposeDto
import dev.g000sha256.tdl.dto.StoreTransactionDto
import dev.g000sha256.tdl.dto.StoriesDto
import dev.g000sha256.tdl.dto.StoryAreaDto
import dev.g000sha256.tdl.dto.StoryAreaPositionDto
import dev.g000sha256.tdl.dto.StoryAreaTypeDto
import dev.g000sha256.tdl.dto.StoryContentDto
import dev.g000sha256.tdl.dto.StoryDto
import dev.g000sha256.tdl.dto.StoryFullIdDto
import dev.g000sha256.tdl.dto.StoryInfoDto
import dev.g000sha256.tdl.dto.StoryInteractionDto
import dev.g000sha256.tdl.dto.StoryInteractionInfoDto
import dev.g000sha256.tdl.dto.StoryInteractionTypeDto
import dev.g000sha256.tdl.dto.StoryInteractionsDto
import dev.g000sha256.tdl.dto.StoryListDto
import dev.g000sha256.tdl.dto.StoryOriginDto
import dev.g000sha256.tdl.dto.StoryPrivacySettingsDto
import dev.g000sha256.tdl.dto.StoryRepostInfoDto
import dev.g000sha256.tdl.dto.StoryStatisticsDto
import dev.g000sha256.tdl.dto.StoryVideoDto
import dev.g000sha256.tdl.dto.SuggestedActionDto
import dev.g000sha256.tdl.dto.SupergroupDto
import dev.g000sha256.tdl.dto.SupergroupFullInfoDto
import dev.g000sha256.tdl.dto.SupergroupMembersFilterDto
import dev.g000sha256.tdl.dto.TMeUrlDto
import dev.g000sha256.tdl.dto.TMeUrlTypeDto
import dev.g000sha256.tdl.dto.TMeUrlsDto
import dev.g000sha256.tdl.dto.TargetChatDto
import dev.g000sha256.tdl.dto.TargetChatTypesDto
import dev.g000sha256.tdl.dto.TelegramPaymentPurposeDto
import dev.g000sha256.tdl.dto.TemporaryPasswordStateDto
import dev.g000sha256.tdl.dto.TermsOfServiceDto
import dev.g000sha256.tdl.dto.TestBytesDto
import dev.g000sha256.tdl.dto.TestIntDto
import dev.g000sha256.tdl.dto.TestStringDto
import dev.g000sha256.tdl.dto.TestVectorIntDto
import dev.g000sha256.tdl.dto.TestVectorIntObjectDto
import dev.g000sha256.tdl.dto.TestVectorStringDto
import dev.g000sha256.tdl.dto.TestVectorStringObjectDto
import dev.g000sha256.tdl.dto.TextDto
import dev.g000sha256.tdl.dto.TextEntitiesDto
import dev.g000sha256.tdl.dto.TextEntityDto
import dev.g000sha256.tdl.dto.TextEntityTypeDto
import dev.g000sha256.tdl.dto.TextParseModeDto
import dev.g000sha256.tdl.dto.TextQuoteDto
import dev.g000sha256.tdl.dto.ThemeParametersDto
import dev.g000sha256.tdl.dto.ThemeSettingsDto
import dev.g000sha256.tdl.dto.ThumbnailDto
import dev.g000sha256.tdl.dto.ThumbnailFormatDto
import dev.g000sha256.tdl.dto.TimeZoneDto
import dev.g000sha256.tdl.dto.TimeZonesDto
import dev.g000sha256.tdl.dto.TopChatCategoryDto
import dev.g000sha256.tdl.dto.TrendingStickerSetsDto
import dev.g000sha256.tdl.dto.UnconfirmedSessionDto
import dev.g000sha256.tdl.dto.UnreadReactionDto
import dev.g000sha256.tdl.dto.UpdatesDto
import dev.g000sha256.tdl.dto.UpgradeGiftResultDto
import dev.g000sha256.tdl.dto.UpgradedGiftBackdropColorsDto
import dev.g000sha256.tdl.dto.UpgradedGiftBackdropDto
import dev.g000sha256.tdl.dto.UpgradedGiftDto
import dev.g000sha256.tdl.dto.UpgradedGiftModelDto
import dev.g000sha256.tdl.dto.UpgradedGiftOriginalDetailsDto
import dev.g000sha256.tdl.dto.UpgradedGiftSymbolDto
import dev.g000sha256.tdl.dto.UserDto
import dev.g000sha256.tdl.dto.UserFullInfoDto
import dev.g000sha256.tdl.dto.UserLinkDto
import dev.g000sha256.tdl.dto.UserPrivacySettingDto
import dev.g000sha256.tdl.dto.UserPrivacySettingRuleDto
import dev.g000sha256.tdl.dto.UserPrivacySettingRulesDto
import dev.g000sha256.tdl.dto.UserStatusDto
import dev.g000sha256.tdl.dto.UserSupportInfoDto
import dev.g000sha256.tdl.dto.UserTypeDto
import dev.g000sha256.tdl.dto.UsernamesDto
import dev.g000sha256.tdl.dto.UsersDto
import dev.g000sha256.tdl.dto.ValidatedOrderInfoDto
import dev.g000sha256.tdl.dto.VectorPathCommandDto
import dev.g000sha256.tdl.dto.VenueDto
import dev.g000sha256.tdl.dto.VerificationStatusDto
import dev.g000sha256.tdl.dto.VideoChatDto
import dev.g000sha256.tdl.dto.VideoChatStreamDto
import dev.g000sha256.tdl.dto.VideoChatStreamsDto
import dev.g000sha256.tdl.dto.VideoDto
import dev.g000sha256.tdl.dto.VideoNoteDto
import dev.g000sha256.tdl.dto.VoiceNoteDto
import dev.g000sha256.tdl.dto.WebAppDto
import dev.g000sha256.tdl.dto.WebAppInfoDto
import dev.g000sha256.tdl.dto.WebAppOpenModeDto
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
import org.drinkless.tdlib.TdApi

internal class TdlMapper {
    fun map(dto: TdApi.AccentColor): AccentColorDto {
        return AccentColorDto(
            id = dto.id,
            builtInAccentColorId = dto.builtInAccentColorId,
            lightThemeColors = dto.lightThemeColors,
            darkThemeColors = dto.darkThemeColors,
            minChannelChatBoostLevel = dto.minChannelChatBoostLevel,
        )
    }

    fun map(dto: AccentColorDto): TdApi.AccentColor {
        return TdApi.AccentColor(
            id = dto.id,
            builtInAccentColorId = dto.builtInAccentColorId,
            lightThemeColors = dto.lightThemeColors,
            darkThemeColors = dto.darkThemeColors,
            minChannelChatBoostLevel = dto.minChannelChatBoostLevel,
        )
    }

    fun map(dto: TdApi.AcceptedGiftTypes): AcceptedGiftTypesDto {
        return AcceptedGiftTypesDto(
            unlimitedGifts = dto.unlimitedGifts,
            limitedGifts = dto.limitedGifts,
            upgradedGifts = dto.upgradedGifts,
            premiumSubscription = dto.premiumSubscription,
        )
    }

    fun map(dto: AcceptedGiftTypesDto): TdApi.AcceptedGiftTypes {
        return TdApi.AcceptedGiftTypes(
            unlimitedGifts = dto.unlimitedGifts,
            limitedGifts = dto.limitedGifts,
            upgradedGifts = dto.upgradedGifts,
            premiumSubscription = dto.premiumSubscription,
        )
    }

    fun map(dto: TdApi.AccountInfo): AccountInfoDto {
        return AccountInfoDto(
            registrationMonth = dto.registrationMonth,
            registrationYear = dto.registrationYear,
            phoneNumberCountryCode = dto.phoneNumberCountryCode,
            lastNameChangeDate = dto.lastNameChangeDate,
            lastPhotoChangeDate = dto.lastPhotoChangeDate,
        )
    }

    fun map(dto: AccountInfoDto): TdApi.AccountInfo {
        return TdApi.AccountInfo(
            registrationMonth = dto.registrationMonth,
            registrationYear = dto.registrationYear,
            phoneNumberCountryCode = dto.phoneNumberCountryCode,
            lastNameChangeDate = dto.lastNameChangeDate,
            lastPhotoChangeDate = dto.lastPhotoChangeDate,
        )
    }

    fun map(dto: TdApi.AccountTtl): AccountTtlDto {
        return AccountTtlDto(
            days = dto.days,
        )
    }

    fun map(dto: AccountTtlDto): TdApi.AccountTtl {
        return TdApi.AccountTtl(
            days = dto.days,
        )
    }

    fun map(dto: TdApi.AddedReaction): AddedReactionDto {
        return AddedReactionDto(
            type = map(dto.type),
            senderId = map(dto.senderId),
            isOutgoing = dto.isOutgoing,
            date = dto.date,
        )
    }

    fun map(dto: AddedReactionDto): TdApi.AddedReaction {
        return TdApi.AddedReaction(
            type = map(dto.type),
            senderId = map(dto.senderId),
            isOutgoing = dto.isOutgoing,
            date = dto.date,
        )
    }

    fun map(dto: TdApi.AddedReactions): AddedReactionsDto {
        return AddedReactionsDto(
            totalCount = dto.totalCount,
            reactions = dto.reactions.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: AddedReactionsDto): TdApi.AddedReactions {
        return TdApi.AddedReactions(
            totalCount = dto.totalCount,
            reactions = dto.reactions.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.Address): AddressDto {
        return AddressDto(
            countryCode = dto.countryCode,
            state = dto.state,
            city = dto.city,
            streetLine1 = dto.streetLine1,
            streetLine2 = dto.streetLine2,
            postalCode = dto.postalCode,
        )
    }

    fun map(dto: AddressDto): TdApi.Address {
        return TdApi.Address(
            countryCode = dto.countryCode,
            state = dto.state,
            city = dto.city,
            streetLine1 = dto.streetLine1,
            streetLine2 = dto.streetLine2,
            postalCode = dto.postalCode,
        )
    }

    fun map(dto: TdApi.AffiliateInfo): AffiliateInfoDto {
        return AffiliateInfoDto(
            commissionPerMille = dto.commissionPerMille,
            affiliateChatId = dto.affiliateChatId,
            starAmount = map(dto.starAmount),
        )
    }

    fun map(dto: AffiliateInfoDto): TdApi.AffiliateInfo {
        return TdApi.AffiliateInfo(
            commissionPerMille = dto.commissionPerMille,
            affiliateChatId = dto.affiliateChatId,
            starAmount = map(dto.starAmount),
        )
    }

    fun map(dto: TdApi.AffiliateProgramInfo): AffiliateProgramInfoDto {
        return AffiliateProgramInfoDto(
            parameters = map(dto.parameters),
            endDate = dto.endDate,
            dailyRevenuePerUserAmount = map(dto.dailyRevenuePerUserAmount),
        )
    }

    fun map(dto: AffiliateProgramInfoDto): TdApi.AffiliateProgramInfo {
        return TdApi.AffiliateProgramInfo(
            parameters = map(dto.parameters),
            endDate = dto.endDate,
            dailyRevenuePerUserAmount = map(dto.dailyRevenuePerUserAmount),
        )
    }

    fun map(dto: TdApi.AffiliateProgramParameters): AffiliateProgramParametersDto {
        return AffiliateProgramParametersDto(
            commissionPerMille = dto.commissionPerMille,
            monthCount = dto.monthCount,
        )
    }

    fun map(dto: AffiliateProgramParametersDto): TdApi.AffiliateProgramParameters {
        return TdApi.AffiliateProgramParameters(
            commissionPerMille = dto.commissionPerMille,
            monthCount = dto.monthCount,
        )
    }

    fun map(dto: TdApi.AlternativeVideo): AlternativeVideoDto {
        return AlternativeVideoDto(
            id = dto.id,
            width = dto.width,
            height = dto.height,
            codec = dto.codec,
            hlsFile = map(dto.hlsFile),
            video = map(dto.video),
        )
    }

    fun map(dto: AlternativeVideoDto): TdApi.AlternativeVideo {
        return TdApi.AlternativeVideo(
            id = dto.id,
            width = dto.width,
            height = dto.height,
            codec = dto.codec,
            hlsFile = map(dto.hlsFile),
            video = map(dto.video),
        )
    }

    fun map(dto: TdApi.AnimatedChatPhoto): AnimatedChatPhotoDto {
        return AnimatedChatPhotoDto(
            length = dto.length,
            file = map(dto.file),
            mainFrameTimestamp = dto.mainFrameTimestamp,
        )
    }

    fun map(dto: AnimatedChatPhotoDto): TdApi.AnimatedChatPhoto {
        return TdApi.AnimatedChatPhoto(
            length = dto.length,
            file = map(dto.file),
            mainFrameTimestamp = dto.mainFrameTimestamp,
        )
    }

    fun map(dto: TdApi.AnimatedEmoji): AnimatedEmojiDto {
        return AnimatedEmojiDto(
            sticker = dto.sticker?.let { map(it) },
            stickerWidth = dto.stickerWidth,
            stickerHeight = dto.stickerHeight,
            fitzpatrickType = dto.fitzpatrickType,
            sound = dto.sound?.let { map(it) },
        )
    }

    fun map(dto: AnimatedEmojiDto): TdApi.AnimatedEmoji {
        return TdApi.AnimatedEmoji(
            sticker = dto.sticker?.let { map(it) },
            stickerWidth = dto.stickerWidth,
            stickerHeight = dto.stickerHeight,
            fitzpatrickType = dto.fitzpatrickType,
            sound = dto.sound?.let { map(it) },
        )
    }

    fun map(dto: TdApi.Animation): AnimationDto {
        return AnimationDto(
            duration = dto.duration,
            width = dto.width,
            height = dto.height,
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            hasStickers = dto.hasStickers,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            animation = map(dto.animation),
        )
    }

    fun map(dto: AnimationDto): TdApi.Animation {
        return TdApi.Animation(
            duration = dto.duration,
            width = dto.width,
            height = dto.height,
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            hasStickers = dto.hasStickers,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            animation = map(dto.animation),
        )
    }

    fun map(dto: TdApi.Animations): AnimationsDto {
        return AnimationsDto(
            animations = dto.animations.mapArray { map(it) },
        )
    }

    fun map(dto: AnimationsDto): TdApi.Animations {
        return TdApi.Animations(
            animations = dto.animations.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ArchiveChatListSettings): ArchiveChatListSettingsDto {
        return ArchiveChatListSettingsDto(
            archiveAndMuteNewChatsFromUnknownUsers = dto.archiveAndMuteNewChatsFromUnknownUsers,
            keepUnmutedChatsArchived = dto.keepUnmutedChatsArchived,
            keepChatsFromFoldersArchived = dto.keepChatsFromFoldersArchived,
        )
    }

    fun map(dto: ArchiveChatListSettingsDto): TdApi.ArchiveChatListSettings {
        return TdApi.ArchiveChatListSettings(
            archiveAndMuteNewChatsFromUnknownUsers = dto.archiveAndMuteNewChatsFromUnknownUsers,
            keepUnmutedChatsArchived = dto.keepUnmutedChatsArchived,
            keepChatsFromFoldersArchived = dto.keepChatsFromFoldersArchived,
        )
    }

    fun map(dto: TdApi.AttachmentMenuBot): AttachmentMenuBotDto {
        return AttachmentMenuBotDto(
            botUserId = dto.botUserId,
            supportsSelfChat = dto.supportsSelfChat,
            supportsUserChats = dto.supportsUserChats,
            supportsBotChats = dto.supportsBotChats,
            supportsGroupChats = dto.supportsGroupChats,
            supportsChannelChats = dto.supportsChannelChats,
            requestWriteAccess = dto.requestWriteAccess,
            isAdded = dto.isAdded,
            showInAttachmentMenu = dto.showInAttachmentMenu,
            showInSideMenu = dto.showInSideMenu,
            showDisclaimerInSideMenu = dto.showDisclaimerInSideMenu,
            name = dto.name,
            nameColor = dto.nameColor?.let { map(it) },
            defaultIcon = dto.defaultIcon?.let { map(it) },
            iosStaticIcon = dto.iosStaticIcon?.let { map(it) },
            iosAnimatedIcon = dto.iosAnimatedIcon?.let { map(it) },
            iosSideMenuIcon = dto.iosSideMenuIcon?.let { map(it) },
            androidIcon = dto.androidIcon?.let { map(it) },
            androidSideMenuIcon = dto.androidSideMenuIcon?.let { map(it) },
            macosIcon = dto.macosIcon?.let { map(it) },
            macosSideMenuIcon = dto.macosSideMenuIcon?.let { map(it) },
            iconColor = dto.iconColor?.let { map(it) },
            webAppPlaceholder = dto.webAppPlaceholder?.let { map(it) },
        )
    }

    fun map(dto: AttachmentMenuBotDto): TdApi.AttachmentMenuBot {
        return TdApi.AttachmentMenuBot(
            botUserId = dto.botUserId,
            supportsSelfChat = dto.supportsSelfChat,
            supportsUserChats = dto.supportsUserChats,
            supportsBotChats = dto.supportsBotChats,
            supportsGroupChats = dto.supportsGroupChats,
            supportsChannelChats = dto.supportsChannelChats,
            requestWriteAccess = dto.requestWriteAccess,
            isAdded = dto.isAdded,
            showInAttachmentMenu = dto.showInAttachmentMenu,
            showInSideMenu = dto.showInSideMenu,
            showDisclaimerInSideMenu = dto.showDisclaimerInSideMenu,
            name = dto.name,
            nameColor = dto.nameColor?.let { map(it) },
            defaultIcon = dto.defaultIcon?.let { map(it) },
            iosStaticIcon = dto.iosStaticIcon?.let { map(it) },
            iosAnimatedIcon = dto.iosAnimatedIcon?.let { map(it) },
            iosSideMenuIcon = dto.iosSideMenuIcon?.let { map(it) },
            androidIcon = dto.androidIcon?.let { map(it) },
            androidSideMenuIcon = dto.androidSideMenuIcon?.let { map(it) },
            macosIcon = dto.macosIcon?.let { map(it) },
            macosSideMenuIcon = dto.macosSideMenuIcon?.let { map(it) },
            iconColor = dto.iconColor?.let { map(it) },
            webAppPlaceholder = dto.webAppPlaceholder?.let { map(it) },
        )
    }

    fun map(dto: TdApi.AttachmentMenuBotColor): AttachmentMenuBotColorDto {
        return AttachmentMenuBotColorDto(
            lightColor = dto.lightColor,
            darkColor = dto.darkColor,
        )
    }

    fun map(dto: AttachmentMenuBotColorDto): TdApi.AttachmentMenuBotColor {
        return TdApi.AttachmentMenuBotColor(
            lightColor = dto.lightColor,
            darkColor = dto.darkColor,
        )
    }

    fun map(dto: TdApi.Audio): AudioDto {
        return AudioDto(
            duration = dto.duration,
            title = dto.title,
            performer = dto.performer,
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            albumCoverMinithumbnail = dto.albumCoverMinithumbnail?.let { map(it) },
            albumCoverThumbnail = dto.albumCoverThumbnail?.let { map(it) },
            externalAlbumCovers = dto.externalAlbumCovers.mapArray { map(it) },
            audio = map(dto.audio),
        )
    }

    fun map(dto: AudioDto): TdApi.Audio {
        return TdApi.Audio(
            duration = dto.duration,
            title = dto.title,
            performer = dto.performer,
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            albumCoverMinithumbnail = dto.albumCoverMinithumbnail?.let { map(it) },
            albumCoverThumbnail = dto.albumCoverThumbnail?.let { map(it) },
            externalAlbumCovers = dto.externalAlbumCovers.mapArray { map(it) },
            audio = map(dto.audio),
        )
    }

    fun map(dto: TdApi.AuthenticationCodeInfo): AuthenticationCodeInfoDto {
        return AuthenticationCodeInfoDto(
            phoneNumber = dto.phoneNumber,
            type = map(dto.type),
            nextType = dto.nextType?.let { map(it) },
            timeout = dto.timeout,
        )
    }

    fun map(dto: AuthenticationCodeInfoDto): TdApi.AuthenticationCodeInfo {
        return TdApi.AuthenticationCodeInfo(
            phoneNumber = dto.phoneNumber,
            type = map(dto.type),
            nextType = dto.nextType?.let { map(it) },
            timeout = dto.timeout,
        )
    }

    fun map(dto: TdApi.AutoDownloadSettings): AutoDownloadSettingsDto {
        return AutoDownloadSettingsDto(
            isAutoDownloadEnabled = dto.isAutoDownloadEnabled,
            maxPhotoFileSize = dto.maxPhotoFileSize,
            maxVideoFileSize = dto.maxVideoFileSize,
            maxOtherFileSize = dto.maxOtherFileSize,
            videoUploadBitrate = dto.videoUploadBitrate,
            preloadLargeVideos = dto.preloadLargeVideos,
            preloadNextAudio = dto.preloadNextAudio,
            preloadStories = dto.preloadStories,
            useLessDataForCalls = dto.useLessDataForCalls,
        )
    }

    fun map(dto: AutoDownloadSettingsDto): TdApi.AutoDownloadSettings {
        return TdApi.AutoDownloadSettings(
            isAutoDownloadEnabled = dto.isAutoDownloadEnabled,
            maxPhotoFileSize = dto.maxPhotoFileSize,
            maxVideoFileSize = dto.maxVideoFileSize,
            maxOtherFileSize = dto.maxOtherFileSize,
            videoUploadBitrate = dto.videoUploadBitrate,
            preloadLargeVideos = dto.preloadLargeVideos,
            preloadNextAudio = dto.preloadNextAudio,
            preloadStories = dto.preloadStories,
            useLessDataForCalls = dto.useLessDataForCalls,
        )
    }

    fun map(dto: TdApi.AutoDownloadSettingsPresets): AutoDownloadSettingsPresetsDto {
        return AutoDownloadSettingsPresetsDto(
            low = map(dto.low),
            medium = map(dto.medium),
            high = map(dto.high),
        )
    }

    fun map(dto: AutoDownloadSettingsPresetsDto): TdApi.AutoDownloadSettingsPresets {
        return TdApi.AutoDownloadSettingsPresets(
            low = map(dto.low),
            medium = map(dto.medium),
            high = map(dto.high),
        )
    }

    fun map(dto: TdApi.AutosaveSettings): AutosaveSettingsDto {
        return AutosaveSettingsDto(
            privateChatSettings = map(dto.privateChatSettings),
            groupSettings = map(dto.groupSettings),
            channelSettings = map(dto.channelSettings),
            exceptions = dto.exceptions.mapArray { map(it) },
        )
    }

    fun map(dto: AutosaveSettingsDto): TdApi.AutosaveSettings {
        return TdApi.AutosaveSettings(
            privateChatSettings = map(dto.privateChatSettings),
            groupSettings = map(dto.groupSettings),
            channelSettings = map(dto.channelSettings),
            exceptions = dto.exceptions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.AutosaveSettingsException): AutosaveSettingsExceptionDto {
        return AutosaveSettingsExceptionDto(
            chatId = dto.chatId,
            settings = map(dto.settings),
        )
    }

    fun map(dto: AutosaveSettingsExceptionDto): TdApi.AutosaveSettingsException {
        return TdApi.AutosaveSettingsException(
            chatId = dto.chatId,
            settings = map(dto.settings),
        )
    }

    fun map(dto: TdApi.AvailableReaction): AvailableReactionDto {
        return AvailableReactionDto(
            type = map(dto.type),
            needsPremium = dto.needsPremium,
        )
    }

    fun map(dto: AvailableReactionDto): TdApi.AvailableReaction {
        return TdApi.AvailableReaction(
            type = map(dto.type),
            needsPremium = dto.needsPremium,
        )
    }

    fun map(dto: TdApi.AvailableReactions): AvailableReactionsDto {
        return AvailableReactionsDto(
            topReactions = dto.topReactions.mapArray { map(it) },
            recentReactions = dto.recentReactions.mapArray { map(it) },
            popularReactions = dto.popularReactions.mapArray { map(it) },
            allowCustomEmoji = dto.allowCustomEmoji,
            areTags = dto.areTags,
            unavailabilityReason = dto.unavailabilityReason?.let { map(it) },
        )
    }

    fun map(dto: AvailableReactionsDto): TdApi.AvailableReactions {
        return TdApi.AvailableReactions(
            topReactions = dto.topReactions.mapArray { map(it) },
            recentReactions = dto.recentReactions.mapArray { map(it) },
            popularReactions = dto.popularReactions.mapArray { map(it) },
            allowCustomEmoji = dto.allowCustomEmoji,
            areTags = dto.areTags,
            unavailabilityReason = dto.unavailabilityReason?.let { map(it) },
        )
    }

    fun map(dto: TdApi.Background): BackgroundDto {
        return BackgroundDto(
            id = dto.id,
            isDefault = dto.isDefault,
            isDark = dto.isDark,
            name = dto.name,
            document = dto.document?.let { map(it) },
            type = map(dto.type),
        )
    }

    fun map(dto: BackgroundDto): TdApi.Background {
        return TdApi.Background(
            id = dto.id,
            isDefault = dto.isDefault,
            isDark = dto.isDark,
            name = dto.name,
            document = dto.document?.let { map(it) },
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.Backgrounds): BackgroundsDto {
        return BackgroundsDto(
            backgrounds = dto.backgrounds.mapArray { map(it) },
        )
    }

    fun map(dto: BackgroundsDto): TdApi.Backgrounds {
        return TdApi.Backgrounds(
            backgrounds = dto.backgrounds.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BankCardActionOpenUrl): BankCardActionOpenUrlDto {
        return BankCardActionOpenUrlDto(
            text = dto.text,
            url = dto.url,
        )
    }

    fun map(dto: BankCardActionOpenUrlDto): TdApi.BankCardActionOpenUrl {
        return TdApi.BankCardActionOpenUrl(
            text = dto.text,
            url = dto.url,
        )
    }

    fun map(dto: TdApi.BankCardInfo): BankCardInfoDto {
        return BankCardInfoDto(
            title = dto.title,
            actions = dto.actions.mapArray { map(it) },
        )
    }

    fun map(dto: BankCardInfoDto): TdApi.BankCardInfo {
        return TdApi.BankCardInfo(
            title = dto.title,
            actions = dto.actions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BasicGroup): BasicGroupDto {
        return BasicGroupDto(
            id = dto.id,
            memberCount = dto.memberCount,
            status = map(dto.status),
            isActive = dto.isActive,
            upgradedToSupergroupId = dto.upgradedToSupergroupId,
        )
    }

    fun map(dto: BasicGroupDto): TdApi.BasicGroup {
        return TdApi.BasicGroup(
            id = dto.id,
            memberCount = dto.memberCount,
            status = map(dto.status),
            isActive = dto.isActive,
            upgradedToSupergroupId = dto.upgradedToSupergroupId,
        )
    }

    fun map(dto: TdApi.BasicGroupFullInfo): BasicGroupFullInfoDto {
        return BasicGroupFullInfoDto(
            photo = dto.photo?.let { map(it) },
            description = dto.description,
            creatorUserId = dto.creatorUserId,
            members = dto.members.mapArray { map(it) },
            canHideMembers = dto.canHideMembers,
            canToggleAggressiveAntiSpam = dto.canToggleAggressiveAntiSpam,
            inviteLink = dto.inviteLink?.let { map(it) },
            botCommands = dto.botCommands.mapArray { map(it) },
        )
    }

    fun map(dto: BasicGroupFullInfoDto): TdApi.BasicGroupFullInfo {
        return TdApi.BasicGroupFullInfo(
            photo = dto.photo?.let { map(it) },
            description = dto.description,
            creatorUserId = dto.creatorUserId,
            members = dto.members.mapArray { map(it) },
            canHideMembers = dto.canHideMembers,
            canToggleAggressiveAntiSpam = dto.canToggleAggressiveAntiSpam,
            inviteLink = dto.inviteLink?.let { map(it) },
            botCommands = dto.botCommands.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Birthdate): BirthdateDto {
        return BirthdateDto(
            day = dto.day,
            month = dto.month,
            year = dto.year,
        )
    }

    fun map(dto: BirthdateDto): TdApi.Birthdate {
        return TdApi.Birthdate(
            day = dto.day,
            month = dto.month,
            year = dto.year,
        )
    }

    fun map(dto: TdApi.BotCommand): BotCommandDto {
        return BotCommandDto(
            command = dto.command,
            description = dto.description,
        )
    }

    fun map(dto: BotCommandDto): TdApi.BotCommand {
        return TdApi.BotCommand(
            command = dto.command,
            description = dto.description,
        )
    }

    fun map(dto: TdApi.BotCommands): BotCommandsDto {
        return BotCommandsDto(
            botUserId = dto.botUserId,
            commands = dto.commands.mapArray { map(it) },
        )
    }

    fun map(dto: BotCommandsDto): TdApi.BotCommands {
        return TdApi.BotCommands(
            botUserId = dto.botUserId,
            commands = dto.commands.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BotInfo): BotInfoDto {
        return BotInfoDto(
            shortDescription = dto.shortDescription,
            description = dto.description,
            photo = dto.photo?.let { map(it) },
            animation = dto.animation?.let { map(it) },
            menuButton = dto.menuButton?.let { map(it) },
            commands = dto.commands.mapArray { map(it) },
            privacyPolicyUrl = dto.privacyPolicyUrl,
            defaultGroupAdministratorRights = dto.defaultGroupAdministratorRights?.let { map(it) },
            defaultChannelAdministratorRights = dto.defaultChannelAdministratorRights?.let { map(it) },
            affiliateProgram = dto.affiliateProgram?.let { map(it) },
            webAppBackgroundLightColor = dto.webAppBackgroundLightColor,
            webAppBackgroundDarkColor = dto.webAppBackgroundDarkColor,
            webAppHeaderLightColor = dto.webAppHeaderLightColor,
            webAppHeaderDarkColor = dto.webAppHeaderDarkColor,
            verificationParameters = dto.verificationParameters?.let { map(it) },
            canGetRevenueStatistics = dto.canGetRevenueStatistics,
            canManageEmojiStatus = dto.canManageEmojiStatus,
            hasMediaPreviews = dto.hasMediaPreviews,
            editCommandsLink = dto.editCommandsLink?.let { map(it) },
            editDescriptionLink = dto.editDescriptionLink?.let { map(it) },
            editDescriptionMediaLink = dto.editDescriptionMediaLink?.let { map(it) },
            editSettingsLink = dto.editSettingsLink?.let { map(it) },
        )
    }

    fun map(dto: BotInfoDto): TdApi.BotInfo {
        return TdApi.BotInfo(
            shortDescription = dto.shortDescription,
            description = dto.description,
            photo = dto.photo?.let { map(it) },
            animation = dto.animation?.let { map(it) },
            menuButton = dto.menuButton?.let { map(it) },
            commands = dto.commands.mapArray { map(it) },
            privacyPolicyUrl = dto.privacyPolicyUrl,
            defaultGroupAdministratorRights = dto.defaultGroupAdministratorRights?.let { map(it) },
            defaultChannelAdministratorRights = dto.defaultChannelAdministratorRights?.let { map(it) },
            affiliateProgram = dto.affiliateProgram?.let { map(it) },
            webAppBackgroundLightColor = dto.webAppBackgroundLightColor,
            webAppBackgroundDarkColor = dto.webAppBackgroundDarkColor,
            webAppHeaderLightColor = dto.webAppHeaderLightColor,
            webAppHeaderDarkColor = dto.webAppHeaderDarkColor,
            verificationParameters = dto.verificationParameters?.let { map(it) },
            canGetRevenueStatistics = dto.canGetRevenueStatistics,
            canManageEmojiStatus = dto.canManageEmojiStatus,
            hasMediaPreviews = dto.hasMediaPreviews,
            editCommandsLink = dto.editCommandsLink?.let { map(it) },
            editDescriptionLink = dto.editDescriptionLink?.let { map(it) },
            editDescriptionMediaLink = dto.editDescriptionMediaLink?.let { map(it) },
            editSettingsLink = dto.editSettingsLink?.let { map(it) },
        )
    }

    fun map(dto: TdApi.BotMediaPreview): BotMediaPreviewDto {
        return BotMediaPreviewDto(
            date = dto.date,
            content = map(dto.content),
        )
    }

    fun map(dto: BotMediaPreviewDto): TdApi.BotMediaPreview {
        return TdApi.BotMediaPreview(
            date = dto.date,
            content = map(dto.content),
        )
    }

    fun map(dto: TdApi.BotMediaPreviewInfo): BotMediaPreviewInfoDto {
        return BotMediaPreviewInfoDto(
            previews = dto.previews.mapArray { map(it) },
            languageCodes = dto.languageCodes,
        )
    }

    fun map(dto: BotMediaPreviewInfoDto): TdApi.BotMediaPreviewInfo {
        return TdApi.BotMediaPreviewInfo(
            previews = dto.previews.mapArray { map(it) },
            languageCodes = dto.languageCodes,
        )
    }

    fun map(dto: TdApi.BotMediaPreviews): BotMediaPreviewsDto {
        return BotMediaPreviewsDto(
            previews = dto.previews.mapArray { map(it) },
        )
    }

    fun map(dto: BotMediaPreviewsDto): TdApi.BotMediaPreviews {
        return TdApi.BotMediaPreviews(
            previews = dto.previews.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BotMenuButton): BotMenuButtonDto {
        return BotMenuButtonDto(
            text = dto.text,
            url = dto.url,
        )
    }

    fun map(dto: BotMenuButtonDto): TdApi.BotMenuButton {
        return TdApi.BotMenuButton(
            text = dto.text,
            url = dto.url,
        )
    }

    fun map(dto: TdApi.BotVerification): BotVerificationDto {
        return BotVerificationDto(
            botUserId = dto.botUserId,
            iconCustomEmojiId = dto.iconCustomEmojiId,
            customDescription = map(dto.customDescription),
        )
    }

    fun map(dto: BotVerificationDto): TdApi.BotVerification {
        return TdApi.BotVerification(
            botUserId = dto.botUserId,
            iconCustomEmojiId = dto.iconCustomEmojiId,
            customDescription = map(dto.customDescription),
        )
    }

    fun map(dto: TdApi.BotVerificationParameters): BotVerificationParametersDto {
        return BotVerificationParametersDto(
            iconCustomEmojiId = dto.iconCustomEmojiId,
            organizationName = dto.organizationName,
            defaultCustomDescription = dto.defaultCustomDescription?.let { map(it) },
            canSetCustomDescription = dto.canSetCustomDescription,
        )
    }

    fun map(dto: BotVerificationParametersDto): TdApi.BotVerificationParameters {
        return TdApi.BotVerificationParameters(
            iconCustomEmojiId = dto.iconCustomEmojiId,
            organizationName = dto.organizationName,
            defaultCustomDescription = dto.defaultCustomDescription?.let { map(it) },
            canSetCustomDescription = dto.canSetCustomDescription,
        )
    }

    fun map(dto: TdApi.BusinessAwayMessageSettings): BusinessAwayMessageSettingsDto {
        return BusinessAwayMessageSettingsDto(
            shortcutId = dto.shortcutId,
            recipients = map(dto.recipients),
            schedule = map(dto.schedule),
            offlineOnly = dto.offlineOnly,
        )
    }

    fun map(dto: BusinessAwayMessageSettingsDto): TdApi.BusinessAwayMessageSettings {
        return TdApi.BusinessAwayMessageSettings(
            shortcutId = dto.shortcutId,
            recipients = map(dto.recipients),
            schedule = map(dto.schedule),
            offlineOnly = dto.offlineOnly,
        )
    }

    fun map(dto: TdApi.BusinessBotManageBar): BusinessBotManageBarDto {
        return BusinessBotManageBarDto(
            botUserId = dto.botUserId,
            manageUrl = dto.manageUrl,
            isBotPaused = dto.isBotPaused,
            canBotReply = dto.canBotReply,
        )
    }

    fun map(dto: BusinessBotManageBarDto): TdApi.BusinessBotManageBar {
        return TdApi.BusinessBotManageBar(
            botUserId = dto.botUserId,
            manageUrl = dto.manageUrl,
            isBotPaused = dto.isBotPaused,
            canBotReply = dto.canBotReply,
        )
    }

    fun map(dto: TdApi.BusinessBotRights): BusinessBotRightsDto {
        return BusinessBotRightsDto(
            canReply = dto.canReply,
            canReadMessages = dto.canReadMessages,
            canDeleteSentMessages = dto.canDeleteSentMessages,
            canDeleteAllMessages = dto.canDeleteAllMessages,
            canEditName = dto.canEditName,
            canEditBio = dto.canEditBio,
            canEditProfilePhoto = dto.canEditProfilePhoto,
            canEditUsername = dto.canEditUsername,
            canViewGiftsAndStars = dto.canViewGiftsAndStars,
            canSellGifts = dto.canSellGifts,
            canChangeGiftSettings = dto.canChangeGiftSettings,
            canTransferAndUpgradeGifts = dto.canTransferAndUpgradeGifts,
            canTransferStars = dto.canTransferStars,
            canManageStories = dto.canManageStories,
        )
    }

    fun map(dto: BusinessBotRightsDto): TdApi.BusinessBotRights {
        return TdApi.BusinessBotRights(
            canReply = dto.canReply,
            canReadMessages = dto.canReadMessages,
            canDeleteSentMessages = dto.canDeleteSentMessages,
            canDeleteAllMessages = dto.canDeleteAllMessages,
            canEditName = dto.canEditName,
            canEditBio = dto.canEditBio,
            canEditProfilePhoto = dto.canEditProfilePhoto,
            canEditUsername = dto.canEditUsername,
            canViewGiftsAndStars = dto.canViewGiftsAndStars,
            canSellGifts = dto.canSellGifts,
            canChangeGiftSettings = dto.canChangeGiftSettings,
            canTransferAndUpgradeGifts = dto.canTransferAndUpgradeGifts,
            canTransferStars = dto.canTransferStars,
            canManageStories = dto.canManageStories,
        )
    }

    fun map(dto: TdApi.BusinessChatLink): BusinessChatLinkDto {
        return BusinessChatLinkDto(
            link = dto.link,
            text = map(dto.text),
            title = dto.title,
            viewCount = dto.viewCount,
        )
    }

    fun map(dto: BusinessChatLinkDto): TdApi.BusinessChatLink {
        return TdApi.BusinessChatLink(
            link = dto.link,
            text = map(dto.text),
            title = dto.title,
            viewCount = dto.viewCount,
        )
    }

    fun map(dto: TdApi.BusinessChatLinkInfo): BusinessChatLinkInfoDto {
        return BusinessChatLinkInfoDto(
            chatId = dto.chatId,
            text = map(dto.text),
        )
    }

    fun map(dto: BusinessChatLinkInfoDto): TdApi.BusinessChatLinkInfo {
        return TdApi.BusinessChatLinkInfo(
            chatId = dto.chatId,
            text = map(dto.text),
        )
    }

    fun map(dto: TdApi.BusinessChatLinks): BusinessChatLinksDto {
        return BusinessChatLinksDto(
            links = dto.links.mapArray { map(it) },
        )
    }

    fun map(dto: BusinessChatLinksDto): TdApi.BusinessChatLinks {
        return TdApi.BusinessChatLinks(
            links = dto.links.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BusinessConnectedBot): BusinessConnectedBotDto {
        return BusinessConnectedBotDto(
            botUserId = dto.botUserId,
            recipients = map(dto.recipients),
            rights = map(dto.rights),
        )
    }

    fun map(dto: BusinessConnectedBotDto): TdApi.BusinessConnectedBot {
        return TdApi.BusinessConnectedBot(
            botUserId = dto.botUserId,
            recipients = map(dto.recipients),
            rights = map(dto.rights),
        )
    }

    fun map(dto: TdApi.BusinessConnection): BusinessConnectionDto {
        return BusinessConnectionDto(
            id = dto.id,
            userId = dto.userId,
            userChatId = dto.userChatId,
            date = dto.date,
            rights = dto.rights?.let { map(it) },
            isEnabled = dto.isEnabled,
        )
    }

    fun map(dto: BusinessConnectionDto): TdApi.BusinessConnection {
        return TdApi.BusinessConnection(
            id = dto.id,
            userId = dto.userId,
            userChatId = dto.userChatId,
            date = dto.date,
            rights = dto.rights?.let { map(it) },
            isEnabled = dto.isEnabled,
        )
    }

    fun map(dto: TdApi.BusinessFeaturePromotionAnimation): BusinessFeaturePromotionAnimationDto {
        return BusinessFeaturePromotionAnimationDto(
            feature = map(dto.feature),
            animation = map(dto.animation),
        )
    }

    fun map(dto: BusinessFeaturePromotionAnimationDto): TdApi.BusinessFeaturePromotionAnimation {
        return TdApi.BusinessFeaturePromotionAnimation(
            feature = map(dto.feature),
            animation = map(dto.animation),
        )
    }

    fun map(dto: TdApi.BusinessFeatures): BusinessFeaturesDto {
        return BusinessFeaturesDto(
            features = dto.features.mapArray { map(it) },
        )
    }

    fun map(dto: BusinessFeaturesDto): TdApi.BusinessFeatures {
        return TdApi.BusinessFeatures(
            features = dto.features.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BusinessGreetingMessageSettings): BusinessGreetingMessageSettingsDto {
        return BusinessGreetingMessageSettingsDto(
            shortcutId = dto.shortcutId,
            recipients = map(dto.recipients),
            inactivityDays = dto.inactivityDays,
        )
    }

    fun map(dto: BusinessGreetingMessageSettingsDto): TdApi.BusinessGreetingMessageSettings {
        return TdApi.BusinessGreetingMessageSettings(
            shortcutId = dto.shortcutId,
            recipients = map(dto.recipients),
            inactivityDays = dto.inactivityDays,
        )
    }

    fun map(dto: TdApi.BusinessInfo): BusinessInfoDto {
        return BusinessInfoDto(
            location = dto.location?.let { map(it) },
            openingHours = dto.openingHours?.let { map(it) },
            localOpeningHours = dto.localOpeningHours?.let { map(it) },
            nextOpenIn = dto.nextOpenIn,
            nextCloseIn = dto.nextCloseIn,
            greetingMessageSettings = dto.greetingMessageSettings?.let { map(it) },
            awayMessageSettings = dto.awayMessageSettings?.let { map(it) },
            startPage = dto.startPage?.let { map(it) },
        )
    }

    fun map(dto: BusinessInfoDto): TdApi.BusinessInfo {
        return TdApi.BusinessInfo(
            location = dto.location?.let { map(it) },
            openingHours = dto.openingHours?.let { map(it) },
            localOpeningHours = dto.localOpeningHours?.let { map(it) },
            nextOpenIn = dto.nextOpenIn,
            nextCloseIn = dto.nextCloseIn,
            greetingMessageSettings = dto.greetingMessageSettings?.let { map(it) },
            awayMessageSettings = dto.awayMessageSettings?.let { map(it) },
            startPage = dto.startPage?.let { map(it) },
        )
    }

    fun map(dto: TdApi.BusinessLocation): BusinessLocationDto {
        return BusinessLocationDto(
            location = dto.location?.let { map(it) },
            address = dto.address,
        )
    }

    fun map(dto: BusinessLocationDto): TdApi.BusinessLocation {
        return TdApi.BusinessLocation(
            location = dto.location?.let { map(it) },
            address = dto.address,
        )
    }

    fun map(dto: TdApi.BusinessMessage): BusinessMessageDto {
        return BusinessMessageDto(
            message = map(dto.message),
            replyToMessage = dto.replyToMessage?.let { map(it) },
        )
    }

    fun map(dto: BusinessMessageDto): TdApi.BusinessMessage {
        return TdApi.BusinessMessage(
            message = map(dto.message),
            replyToMessage = dto.replyToMessage?.let { map(it) },
        )
    }

    fun map(dto: TdApi.BusinessMessages): BusinessMessagesDto {
        return BusinessMessagesDto(
            messages = dto.messages.mapArray { map(it) },
        )
    }

    fun map(dto: BusinessMessagesDto): TdApi.BusinessMessages {
        return TdApi.BusinessMessages(
            messages = dto.messages.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BusinessOpeningHours): BusinessOpeningHoursDto {
        return BusinessOpeningHoursDto(
            timeZoneId = dto.timeZoneId,
            openingHours = dto.openingHours.mapArray { map(it) },
        )
    }

    fun map(dto: BusinessOpeningHoursDto): TdApi.BusinessOpeningHours {
        return TdApi.BusinessOpeningHours(
            timeZoneId = dto.timeZoneId,
            openingHours = dto.openingHours.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.BusinessOpeningHoursInterval): BusinessOpeningHoursIntervalDto {
        return BusinessOpeningHoursIntervalDto(
            startMinute = dto.startMinute,
            endMinute = dto.endMinute,
        )
    }

    fun map(dto: BusinessOpeningHoursIntervalDto): TdApi.BusinessOpeningHoursInterval {
        return TdApi.BusinessOpeningHoursInterval(
            startMinute = dto.startMinute,
            endMinute = dto.endMinute,
        )
    }

    fun map(dto: TdApi.BusinessRecipients): BusinessRecipientsDto {
        return BusinessRecipientsDto(
            chatIds = dto.chatIds,
            excludedChatIds = dto.excludedChatIds,
            selectExistingChats = dto.selectExistingChats,
            selectNewChats = dto.selectNewChats,
            selectContacts = dto.selectContacts,
            selectNonContacts = dto.selectNonContacts,
            excludeSelected = dto.excludeSelected,
        )
    }

    fun map(dto: BusinessRecipientsDto): TdApi.BusinessRecipients {
        return TdApi.BusinessRecipients(
            chatIds = dto.chatIds,
            excludedChatIds = dto.excludedChatIds,
            selectExistingChats = dto.selectExistingChats,
            selectNewChats = dto.selectNewChats,
            selectContacts = dto.selectContacts,
            selectNonContacts = dto.selectNonContacts,
            excludeSelected = dto.excludeSelected,
        )
    }

    fun map(dto: TdApi.BusinessStartPage): BusinessStartPageDto {
        return BusinessStartPageDto(
            title = dto.title,
            message = dto.message,
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: BusinessStartPageDto): TdApi.BusinessStartPage {
        return TdApi.BusinessStartPage(
            title = dto.title,
            message = dto.message,
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: TdApi.Call): CallDto {
        return CallDto(
            id = dto.id,
            userId = dto.userId,
            isOutgoing = dto.isOutgoing,
            isVideo = dto.isVideo,
            state = map(dto.state),
        )
    }

    fun map(dto: CallDto): TdApi.Call {
        return TdApi.Call(
            id = dto.id,
            userId = dto.userId,
            isOutgoing = dto.isOutgoing,
            isVideo = dto.isVideo,
            state = map(dto.state),
        )
    }

    fun map(dto: TdApi.CallId): CallIdDto {
        return CallIdDto(
            id = dto.id,
        )
    }

    fun map(dto: CallIdDto): TdApi.CallId {
        return TdApi.CallId(
            id = dto.id,
        )
    }

    fun map(dto: TdApi.CallProtocol): CallProtocolDto {
        return CallProtocolDto(
            udpP2p = dto.udpP2p,
            udpReflector = dto.udpReflector,
            minLayer = dto.minLayer,
            maxLayer = dto.maxLayer,
            libraryVersions = dto.libraryVersions,
        )
    }

    fun map(dto: CallProtocolDto): TdApi.CallProtocol {
        return TdApi.CallProtocol(
            udpP2p = dto.udpP2p,
            udpReflector = dto.udpReflector,
            minLayer = dto.minLayer,
            maxLayer = dto.maxLayer,
            libraryVersions = dto.libraryVersions,
        )
    }

    fun map(dto: TdApi.CallServer): CallServerDto {
        return CallServerDto(
            id = dto.id,
            ipAddress = dto.ipAddress,
            ipv6Address = dto.ipv6Address,
            port = dto.port,
            type = map(dto.type),
        )
    }

    fun map(dto: CallServerDto): TdApi.CallServer {
        return TdApi.CallServer(
            id = dto.id,
            ipAddress = dto.ipAddress,
            ipv6Address = dto.ipv6Address,
            port = dto.port,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.CallbackQueryAnswer): CallbackQueryAnswerDto {
        return CallbackQueryAnswerDto(
            text = dto.text,
            showAlert = dto.showAlert,
            url = dto.url,
        )
    }

    fun map(dto: CallbackQueryAnswerDto): TdApi.CallbackQueryAnswer {
        return TdApi.CallbackQueryAnswer(
            text = dto.text,
            showAlert = dto.showAlert,
            url = dto.url,
        )
    }

    fun map(dto: TdApi.Chat): ChatDto {
        return ChatDto(
            id = dto.id,
            type = map(dto.type),
            title = dto.title,
            photo = dto.photo?.let { map(it) },
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            profileAccentColorId = dto.profileAccentColorId,
            profileBackgroundCustomEmojiId = dto.profileBackgroundCustomEmojiId,
            permissions = map(dto.permissions),
            lastMessage = dto.lastMessage?.let { map(it) },
            positions = dto.positions.mapArray { map(it) },
            chatLists = dto.chatLists.mapArray { map(it) },
            messageSenderId = dto.messageSenderId?.let { map(it) },
            blockList = dto.blockList?.let { map(it) },
            hasProtectedContent = dto.hasProtectedContent,
            isTranslatable = dto.isTranslatable,
            isMarkedAsUnread = dto.isMarkedAsUnread,
            viewAsTopics = dto.viewAsTopics,
            hasScheduledMessages = dto.hasScheduledMessages,
            canBeDeletedOnlyForSelf = dto.canBeDeletedOnlyForSelf,
            canBeDeletedForAllUsers = dto.canBeDeletedForAllUsers,
            canBeReported = dto.canBeReported,
            defaultDisableNotification = dto.defaultDisableNotification,
            unreadCount = dto.unreadCount,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            unreadMentionCount = dto.unreadMentionCount,
            unreadReactionCount = dto.unreadReactionCount,
            notificationSettings = map(dto.notificationSettings),
            availableReactions = map(dto.availableReactions),
            messageAutoDeleteTime = dto.messageAutoDeleteTime,
            emojiStatus = dto.emojiStatus?.let { map(it) },
            background = dto.background?.let { map(it) },
            themeName = dto.themeName,
            actionBar = dto.actionBar?.let { map(it) },
            businessBotManageBar = dto.businessBotManageBar?.let { map(it) },
            videoChat = map(dto.videoChat),
            pendingJoinRequests = dto.pendingJoinRequests?.let { map(it) },
            replyMarkupMessageId = dto.replyMarkupMessageId,
            draftMessage = dto.draftMessage?.let { map(it) },
            clientData = dto.clientData,
        )
    }

    fun map(dto: ChatDto): TdApi.Chat {
        return TdApi.Chat(
            id = dto.id,
            type = map(dto.type),
            title = dto.title,
            photo = dto.photo?.let { map(it) },
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            profileAccentColorId = dto.profileAccentColorId,
            profileBackgroundCustomEmojiId = dto.profileBackgroundCustomEmojiId,
            permissions = map(dto.permissions),
            lastMessage = dto.lastMessage?.let { map(it) },
            positions = dto.positions.mapArray { map(it) },
            chatLists = dto.chatLists.mapArray { map(it) },
            messageSenderId = dto.messageSenderId?.let { map(it) },
            blockList = dto.blockList?.let { map(it) },
            hasProtectedContent = dto.hasProtectedContent,
            isTranslatable = dto.isTranslatable,
            isMarkedAsUnread = dto.isMarkedAsUnread,
            viewAsTopics = dto.viewAsTopics,
            hasScheduledMessages = dto.hasScheduledMessages,
            canBeDeletedOnlyForSelf = dto.canBeDeletedOnlyForSelf,
            canBeDeletedForAllUsers = dto.canBeDeletedForAllUsers,
            canBeReported = dto.canBeReported,
            defaultDisableNotification = dto.defaultDisableNotification,
            unreadCount = dto.unreadCount,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            unreadMentionCount = dto.unreadMentionCount,
            unreadReactionCount = dto.unreadReactionCount,
            notificationSettings = map(dto.notificationSettings),
            availableReactions = map(dto.availableReactions),
            messageAutoDeleteTime = dto.messageAutoDeleteTime,
            emojiStatus = dto.emojiStatus?.let { map(it) },
            background = dto.background?.let { map(it) },
            themeName = dto.themeName,
            actionBar = dto.actionBar?.let { map(it) },
            businessBotManageBar = dto.businessBotManageBar?.let { map(it) },
            videoChat = map(dto.videoChat),
            pendingJoinRequests = dto.pendingJoinRequests?.let { map(it) },
            replyMarkupMessageId = dto.replyMarkupMessageId,
            draftMessage = dto.draftMessage?.let { map(it) },
            clientData = dto.clientData,
        )
    }

    fun map(dto: TdApi.ChatActiveStories): ChatActiveStoriesDto {
        return ChatActiveStoriesDto(
            chatId = dto.chatId,
            list = dto.list?.let { map(it) },
            order = dto.order,
            maxReadStoryId = dto.maxReadStoryId,
            stories = dto.stories.mapArray { map(it) },
        )
    }

    fun map(dto: ChatActiveStoriesDto): TdApi.ChatActiveStories {
        return TdApi.ChatActiveStories(
            chatId = dto.chatId,
            list = dto.list?.let { map(it) },
            order = dto.order,
            maxReadStoryId = dto.maxReadStoryId,
            stories = dto.stories.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatAdministrator): ChatAdministratorDto {
        return ChatAdministratorDto(
            userId = dto.userId,
            customTitle = dto.customTitle,
            isOwner = dto.isOwner,
        )
    }

    fun map(dto: ChatAdministratorDto): TdApi.ChatAdministrator {
        return TdApi.ChatAdministrator(
            userId = dto.userId,
            customTitle = dto.customTitle,
            isOwner = dto.isOwner,
        )
    }

    fun map(dto: TdApi.ChatAdministratorRights): ChatAdministratorRightsDto {
        return ChatAdministratorRightsDto(
            canManageChat = dto.canManageChat,
            canChangeInfo = dto.canChangeInfo,
            canPostMessages = dto.canPostMessages,
            canEditMessages = dto.canEditMessages,
            canDeleteMessages = dto.canDeleteMessages,
            canInviteUsers = dto.canInviteUsers,
            canRestrictMembers = dto.canRestrictMembers,
            canPinMessages = dto.canPinMessages,
            canManageTopics = dto.canManageTopics,
            canPromoteMembers = dto.canPromoteMembers,
            canManageVideoChats = dto.canManageVideoChats,
            canPostStories = dto.canPostStories,
            canEditStories = dto.canEditStories,
            canDeleteStories = dto.canDeleteStories,
            isAnonymous = dto.isAnonymous,
        )
    }

    fun map(dto: ChatAdministratorRightsDto): TdApi.ChatAdministratorRights {
        return TdApi.ChatAdministratorRights(
            canManageChat = dto.canManageChat,
            canChangeInfo = dto.canChangeInfo,
            canPostMessages = dto.canPostMessages,
            canEditMessages = dto.canEditMessages,
            canDeleteMessages = dto.canDeleteMessages,
            canInviteUsers = dto.canInviteUsers,
            canRestrictMembers = dto.canRestrictMembers,
            canPinMessages = dto.canPinMessages,
            canManageTopics = dto.canManageTopics,
            canPromoteMembers = dto.canPromoteMembers,
            canManageVideoChats = dto.canManageVideoChats,
            canPostStories = dto.canPostStories,
            canEditStories = dto.canEditStories,
            canDeleteStories = dto.canDeleteStories,
            isAnonymous = dto.isAnonymous,
        )
    }

    fun map(dto: TdApi.ChatAdministrators): ChatAdministratorsDto {
        return ChatAdministratorsDto(
            administrators = dto.administrators.mapArray { map(it) },
        )
    }

    fun map(dto: ChatAdministratorsDto): TdApi.ChatAdministrators {
        return TdApi.ChatAdministrators(
            administrators = dto.administrators.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatBackground): ChatBackgroundDto {
        return ChatBackgroundDto(
            background = map(dto.background),
            darkThemeDimming = dto.darkThemeDimming,
        )
    }

    fun map(dto: ChatBackgroundDto): TdApi.ChatBackground {
        return TdApi.ChatBackground(
            background = map(dto.background),
            darkThemeDimming = dto.darkThemeDimming,
        )
    }

    fun map(dto: TdApi.ChatBoost): ChatBoostDto {
        return ChatBoostDto(
            id = dto.id,
            count = dto.count,
            source = map(dto.source),
            startDate = dto.startDate,
            expirationDate = dto.expirationDate,
        )
    }

    fun map(dto: ChatBoostDto): TdApi.ChatBoost {
        return TdApi.ChatBoost(
            id = dto.id,
            count = dto.count,
            source = map(dto.source),
            startDate = dto.startDate,
            expirationDate = dto.expirationDate,
        )
    }

    fun map(dto: TdApi.ChatBoostFeatures): ChatBoostFeaturesDto {
        return ChatBoostFeaturesDto(
            features = dto.features.mapArray { map(it) },
            minProfileBackgroundCustomEmojiBoostLevel = dto.minProfileBackgroundCustomEmojiBoostLevel,
            minBackgroundCustomEmojiBoostLevel = dto.minBackgroundCustomEmojiBoostLevel,
            minEmojiStatusBoostLevel = dto.minEmojiStatusBoostLevel,
            minChatThemeBackgroundBoostLevel = dto.minChatThemeBackgroundBoostLevel,
            minCustomBackgroundBoostLevel = dto.minCustomBackgroundBoostLevel,
            minCustomEmojiStickerSetBoostLevel = dto.minCustomEmojiStickerSetBoostLevel,
            minSpeechRecognitionBoostLevel = dto.minSpeechRecognitionBoostLevel,
            minSponsoredMessageDisableBoostLevel = dto.minSponsoredMessageDisableBoostLevel,
        )
    }

    fun map(dto: ChatBoostFeaturesDto): TdApi.ChatBoostFeatures {
        return TdApi.ChatBoostFeatures(
            features = dto.features.mapArray { map(it) },
            minProfileBackgroundCustomEmojiBoostLevel = dto.minProfileBackgroundCustomEmojiBoostLevel,
            minBackgroundCustomEmojiBoostLevel = dto.minBackgroundCustomEmojiBoostLevel,
            minEmojiStatusBoostLevel = dto.minEmojiStatusBoostLevel,
            minChatThemeBackgroundBoostLevel = dto.minChatThemeBackgroundBoostLevel,
            minCustomBackgroundBoostLevel = dto.minCustomBackgroundBoostLevel,
            minCustomEmojiStickerSetBoostLevel = dto.minCustomEmojiStickerSetBoostLevel,
            minSpeechRecognitionBoostLevel = dto.minSpeechRecognitionBoostLevel,
            minSponsoredMessageDisableBoostLevel = dto.minSponsoredMessageDisableBoostLevel,
        )
    }

    fun map(dto: TdApi.ChatBoostLevelFeatures): ChatBoostLevelFeaturesDto {
        return ChatBoostLevelFeaturesDto(
            level = dto.level,
            storyPerDayCount = dto.storyPerDayCount,
            customEmojiReactionCount = dto.customEmojiReactionCount,
            titleColorCount = dto.titleColorCount,
            profileAccentColorCount = dto.profileAccentColorCount,
            canSetProfileBackgroundCustomEmoji = dto.canSetProfileBackgroundCustomEmoji,
            accentColorCount = dto.accentColorCount,
            canSetBackgroundCustomEmoji = dto.canSetBackgroundCustomEmoji,
            canSetEmojiStatus = dto.canSetEmojiStatus,
            chatThemeBackgroundCount = dto.chatThemeBackgroundCount,
            canSetCustomBackground = dto.canSetCustomBackground,
            canSetCustomEmojiStickerSet = dto.canSetCustomEmojiStickerSet,
            canRecognizeSpeech = dto.canRecognizeSpeech,
            canDisableSponsoredMessages = dto.canDisableSponsoredMessages,
        )
    }

    fun map(dto: ChatBoostLevelFeaturesDto): TdApi.ChatBoostLevelFeatures {
        return TdApi.ChatBoostLevelFeatures(
            level = dto.level,
            storyPerDayCount = dto.storyPerDayCount,
            customEmojiReactionCount = dto.customEmojiReactionCount,
            titleColorCount = dto.titleColorCount,
            profileAccentColorCount = dto.profileAccentColorCount,
            canSetProfileBackgroundCustomEmoji = dto.canSetProfileBackgroundCustomEmoji,
            accentColorCount = dto.accentColorCount,
            canSetBackgroundCustomEmoji = dto.canSetBackgroundCustomEmoji,
            canSetEmojiStatus = dto.canSetEmojiStatus,
            chatThemeBackgroundCount = dto.chatThemeBackgroundCount,
            canSetCustomBackground = dto.canSetCustomBackground,
            canSetCustomEmojiStickerSet = dto.canSetCustomEmojiStickerSet,
            canRecognizeSpeech = dto.canRecognizeSpeech,
            canDisableSponsoredMessages = dto.canDisableSponsoredMessages,
        )
    }

    fun map(dto: TdApi.ChatBoostLink): ChatBoostLinkDto {
        return ChatBoostLinkDto(
            link = dto.link,
            isPublic = dto.isPublic,
        )
    }

    fun map(dto: ChatBoostLinkDto): TdApi.ChatBoostLink {
        return TdApi.ChatBoostLink(
            link = dto.link,
            isPublic = dto.isPublic,
        )
    }

    fun map(dto: TdApi.ChatBoostLinkInfo): ChatBoostLinkInfoDto {
        return ChatBoostLinkInfoDto(
            isPublic = dto.isPublic,
            chatId = dto.chatId,
        )
    }

    fun map(dto: ChatBoostLinkInfoDto): TdApi.ChatBoostLinkInfo {
        return TdApi.ChatBoostLinkInfo(
            isPublic = dto.isPublic,
            chatId = dto.chatId,
        )
    }

    fun map(dto: TdApi.ChatBoostSlot): ChatBoostSlotDto {
        return ChatBoostSlotDto(
            slotId = dto.slotId,
            currentlyBoostedChatId = dto.currentlyBoostedChatId,
            startDate = dto.startDate,
            expirationDate = dto.expirationDate,
            cooldownUntilDate = dto.cooldownUntilDate,
        )
    }

    fun map(dto: ChatBoostSlotDto): TdApi.ChatBoostSlot {
        return TdApi.ChatBoostSlot(
            slotId = dto.slotId,
            currentlyBoostedChatId = dto.currentlyBoostedChatId,
            startDate = dto.startDate,
            expirationDate = dto.expirationDate,
            cooldownUntilDate = dto.cooldownUntilDate,
        )
    }

    fun map(dto: TdApi.ChatBoostSlots): ChatBoostSlotsDto {
        return ChatBoostSlotsDto(
            slots = dto.slots.mapArray { map(it) },
        )
    }

    fun map(dto: ChatBoostSlotsDto): TdApi.ChatBoostSlots {
        return TdApi.ChatBoostSlots(
            slots = dto.slots.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatBoostStatus): ChatBoostStatusDto {
        return ChatBoostStatusDto(
            boostUrl = dto.boostUrl,
            appliedSlotIds = dto.appliedSlotIds,
            level = dto.level,
            giftCodeBoostCount = dto.giftCodeBoostCount,
            boostCount = dto.boostCount,
            currentLevelBoostCount = dto.currentLevelBoostCount,
            nextLevelBoostCount = dto.nextLevelBoostCount,
            premiumMemberCount = dto.premiumMemberCount,
            premiumMemberPercentage = dto.premiumMemberPercentage,
            prepaidGiveaways = dto.prepaidGiveaways.mapArray { map(it) },
        )
    }

    fun map(dto: ChatBoostStatusDto): TdApi.ChatBoostStatus {
        return TdApi.ChatBoostStatus(
            boostUrl = dto.boostUrl,
            appliedSlotIds = dto.appliedSlotIds,
            level = dto.level,
            giftCodeBoostCount = dto.giftCodeBoostCount,
            boostCount = dto.boostCount,
            currentLevelBoostCount = dto.currentLevelBoostCount,
            nextLevelBoostCount = dto.nextLevelBoostCount,
            premiumMemberCount = dto.premiumMemberCount,
            premiumMemberPercentage = dto.premiumMemberPercentage,
            prepaidGiveaways = dto.prepaidGiveaways.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatEvent): ChatEventDto {
        return ChatEventDto(
            id = dto.id,
            date = dto.date,
            memberId = map(dto.memberId),
            action = map(dto.action),
        )
    }

    fun map(dto: ChatEventDto): TdApi.ChatEvent {
        return TdApi.ChatEvent(
            id = dto.id,
            date = dto.date,
            memberId = map(dto.memberId),
            action = map(dto.action),
        )
    }

    fun map(dto: TdApi.ChatEventLogFilters): ChatEventLogFiltersDto {
        return ChatEventLogFiltersDto(
            messageEdits = dto.messageEdits,
            messageDeletions = dto.messageDeletions,
            messagePins = dto.messagePins,
            memberJoins = dto.memberJoins,
            memberLeaves = dto.memberLeaves,
            memberInvites = dto.memberInvites,
            memberPromotions = dto.memberPromotions,
            memberRestrictions = dto.memberRestrictions,
            infoChanges = dto.infoChanges,
            settingChanges = dto.settingChanges,
            inviteLinkChanges = dto.inviteLinkChanges,
            videoChatChanges = dto.videoChatChanges,
            forumChanges = dto.forumChanges,
            subscriptionExtensions = dto.subscriptionExtensions,
        )
    }

    fun map(dto: ChatEventLogFiltersDto): TdApi.ChatEventLogFilters {
        return TdApi.ChatEventLogFilters(
            messageEdits = dto.messageEdits,
            messageDeletions = dto.messageDeletions,
            messagePins = dto.messagePins,
            memberJoins = dto.memberJoins,
            memberLeaves = dto.memberLeaves,
            memberInvites = dto.memberInvites,
            memberPromotions = dto.memberPromotions,
            memberRestrictions = dto.memberRestrictions,
            infoChanges = dto.infoChanges,
            settingChanges = dto.settingChanges,
            inviteLinkChanges = dto.inviteLinkChanges,
            videoChatChanges = dto.videoChatChanges,
            forumChanges = dto.forumChanges,
            subscriptionExtensions = dto.subscriptionExtensions,
        )
    }

    fun map(dto: TdApi.ChatEvents): ChatEventsDto {
        return ChatEventsDto(
            events = dto.events.mapArray { map(it) },
        )
    }

    fun map(dto: ChatEventsDto): TdApi.ChatEvents {
        return TdApi.ChatEvents(
            events = dto.events.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatFolder): ChatFolderDto {
        return ChatFolderDto(
            name = map(dto.name),
            icon = dto.icon?.let { map(it) },
            colorId = dto.colorId,
            isShareable = dto.isShareable,
            pinnedChatIds = dto.pinnedChatIds,
            includedChatIds = dto.includedChatIds,
            excludedChatIds = dto.excludedChatIds,
            excludeMuted = dto.excludeMuted,
            excludeRead = dto.excludeRead,
            excludeArchived = dto.excludeArchived,
            includeContacts = dto.includeContacts,
            includeNonContacts = dto.includeNonContacts,
            includeBots = dto.includeBots,
            includeGroups = dto.includeGroups,
            includeChannels = dto.includeChannels,
        )
    }

    fun map(dto: ChatFolderDto): TdApi.ChatFolder {
        return TdApi.ChatFolder(
            name = map(dto.name),
            icon = dto.icon?.let { map(it) },
            colorId = dto.colorId,
            isShareable = dto.isShareable,
            pinnedChatIds = dto.pinnedChatIds,
            includedChatIds = dto.includedChatIds,
            excludedChatIds = dto.excludedChatIds,
            excludeMuted = dto.excludeMuted,
            excludeRead = dto.excludeRead,
            excludeArchived = dto.excludeArchived,
            includeContacts = dto.includeContacts,
            includeNonContacts = dto.includeNonContacts,
            includeBots = dto.includeBots,
            includeGroups = dto.includeGroups,
            includeChannels = dto.includeChannels,
        )
    }

    fun map(dto: TdApi.ChatFolderIcon): ChatFolderIconDto {
        return ChatFolderIconDto(
            name = dto.name,
        )
    }

    fun map(dto: ChatFolderIconDto): TdApi.ChatFolderIcon {
        return TdApi.ChatFolderIcon(
            name = dto.name,
        )
    }

    fun map(dto: TdApi.ChatFolderInfo): ChatFolderInfoDto {
        return ChatFolderInfoDto(
            id = dto.id,
            name = map(dto.name),
            icon = map(dto.icon),
            colorId = dto.colorId,
            isShareable = dto.isShareable,
            hasMyInviteLinks = dto.hasMyInviteLinks,
        )
    }

    fun map(dto: ChatFolderInfoDto): TdApi.ChatFolderInfo {
        return TdApi.ChatFolderInfo(
            id = dto.id,
            name = map(dto.name),
            icon = map(dto.icon),
            colorId = dto.colorId,
            isShareable = dto.isShareable,
            hasMyInviteLinks = dto.hasMyInviteLinks,
        )
    }

    fun map(dto: TdApi.ChatFolderInviteLink): ChatFolderInviteLinkDto {
        return ChatFolderInviteLinkDto(
            inviteLink = dto.inviteLink,
            name = dto.name,
            chatIds = dto.chatIds,
        )
    }

    fun map(dto: ChatFolderInviteLinkDto): TdApi.ChatFolderInviteLink {
        return TdApi.ChatFolderInviteLink(
            inviteLink = dto.inviteLink,
            name = dto.name,
            chatIds = dto.chatIds,
        )
    }

    fun map(dto: TdApi.ChatFolderInviteLinkInfo): ChatFolderInviteLinkInfoDto {
        return ChatFolderInviteLinkInfoDto(
            chatFolderInfo = map(dto.chatFolderInfo),
            missingChatIds = dto.missingChatIds,
            addedChatIds = dto.addedChatIds,
        )
    }

    fun map(dto: ChatFolderInviteLinkInfoDto): TdApi.ChatFolderInviteLinkInfo {
        return TdApi.ChatFolderInviteLinkInfo(
            chatFolderInfo = map(dto.chatFolderInfo),
            missingChatIds = dto.missingChatIds,
            addedChatIds = dto.addedChatIds,
        )
    }

    fun map(dto: TdApi.ChatFolderInviteLinks): ChatFolderInviteLinksDto {
        return ChatFolderInviteLinksDto(
            inviteLinks = dto.inviteLinks.mapArray { map(it) },
        )
    }

    fun map(dto: ChatFolderInviteLinksDto): TdApi.ChatFolderInviteLinks {
        return TdApi.ChatFolderInviteLinks(
            inviteLinks = dto.inviteLinks.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatFolderName): ChatFolderNameDto {
        return ChatFolderNameDto(
            text = map(dto.text),
            animateCustomEmoji = dto.animateCustomEmoji,
        )
    }

    fun map(dto: ChatFolderNameDto): TdApi.ChatFolderName {
        return TdApi.ChatFolderName(
            text = map(dto.text),
            animateCustomEmoji = dto.animateCustomEmoji,
        )
    }

    fun map(dto: TdApi.ChatInviteLink): ChatInviteLinkDto {
        return ChatInviteLinkDto(
            inviteLink = dto.inviteLink,
            name = dto.name,
            creatorUserId = dto.creatorUserId,
            date = dto.date,
            editDate = dto.editDate,
            expirationDate = dto.expirationDate,
            subscriptionPricing = dto.subscriptionPricing?.let { map(it) },
            memberLimit = dto.memberLimit,
            memberCount = dto.memberCount,
            expiredMemberCount = dto.expiredMemberCount,
            pendingJoinRequestCount = dto.pendingJoinRequestCount,
            createsJoinRequest = dto.createsJoinRequest,
            isPrimary = dto.isPrimary,
            isRevoked = dto.isRevoked,
        )
    }

    fun map(dto: ChatInviteLinkDto): TdApi.ChatInviteLink {
        return TdApi.ChatInviteLink(
            inviteLink = dto.inviteLink,
            name = dto.name,
            creatorUserId = dto.creatorUserId,
            date = dto.date,
            editDate = dto.editDate,
            expirationDate = dto.expirationDate,
            subscriptionPricing = dto.subscriptionPricing?.let { map(it) },
            memberLimit = dto.memberLimit,
            memberCount = dto.memberCount,
            expiredMemberCount = dto.expiredMemberCount,
            pendingJoinRequestCount = dto.pendingJoinRequestCount,
            createsJoinRequest = dto.createsJoinRequest,
            isPrimary = dto.isPrimary,
            isRevoked = dto.isRevoked,
        )
    }

    fun map(dto: TdApi.ChatInviteLinkCount): ChatInviteLinkCountDto {
        return ChatInviteLinkCountDto(
            userId = dto.userId,
            inviteLinkCount = dto.inviteLinkCount,
            revokedInviteLinkCount = dto.revokedInviteLinkCount,
        )
    }

    fun map(dto: ChatInviteLinkCountDto): TdApi.ChatInviteLinkCount {
        return TdApi.ChatInviteLinkCount(
            userId = dto.userId,
            inviteLinkCount = dto.inviteLinkCount,
            revokedInviteLinkCount = dto.revokedInviteLinkCount,
        )
    }

    fun map(dto: TdApi.ChatInviteLinkCounts): ChatInviteLinkCountsDto {
        return ChatInviteLinkCountsDto(
            inviteLinkCounts = dto.inviteLinkCounts.mapArray { map(it) },
        )
    }

    fun map(dto: ChatInviteLinkCountsDto): TdApi.ChatInviteLinkCounts {
        return TdApi.ChatInviteLinkCounts(
            inviteLinkCounts = dto.inviteLinkCounts.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatInviteLinkInfo): ChatInviteLinkInfoDto {
        return ChatInviteLinkInfoDto(
            chatId = dto.chatId,
            accessibleFor = dto.accessibleFor,
            type = map(dto.type),
            title = dto.title,
            photo = dto.photo?.let { map(it) },
            accentColorId = dto.accentColorId,
            description = dto.description,
            memberCount = dto.memberCount,
            memberUserIds = dto.memberUserIds,
            subscriptionInfo = dto.subscriptionInfo?.let { map(it) },
            createsJoinRequest = dto.createsJoinRequest,
            isPublic = dto.isPublic,
            verificationStatus = dto.verificationStatus?.let { map(it) },
        )
    }

    fun map(dto: ChatInviteLinkInfoDto): TdApi.ChatInviteLinkInfo {
        return TdApi.ChatInviteLinkInfo(
            chatId = dto.chatId,
            accessibleFor = dto.accessibleFor,
            type = map(dto.type),
            title = dto.title,
            photo = dto.photo?.let { map(it) },
            accentColorId = dto.accentColorId,
            description = dto.description,
            memberCount = dto.memberCount,
            memberUserIds = dto.memberUserIds,
            subscriptionInfo = dto.subscriptionInfo?.let { map(it) },
            createsJoinRequest = dto.createsJoinRequest,
            isPublic = dto.isPublic,
            verificationStatus = dto.verificationStatus?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ChatInviteLinkMember): ChatInviteLinkMemberDto {
        return ChatInviteLinkMemberDto(
            userId = dto.userId,
            joinedChatDate = dto.joinedChatDate,
            viaChatFolderInviteLink = dto.viaChatFolderInviteLink,
            approverUserId = dto.approverUserId,
        )
    }

    fun map(dto: ChatInviteLinkMemberDto): TdApi.ChatInviteLinkMember {
        return TdApi.ChatInviteLinkMember(
            userId = dto.userId,
            joinedChatDate = dto.joinedChatDate,
            viaChatFolderInviteLink = dto.viaChatFolderInviteLink,
            approverUserId = dto.approverUserId,
        )
    }

    fun map(dto: TdApi.ChatInviteLinkMembers): ChatInviteLinkMembersDto {
        return ChatInviteLinkMembersDto(
            totalCount = dto.totalCount,
            members = dto.members.mapArray { map(it) },
        )
    }

    fun map(dto: ChatInviteLinkMembersDto): TdApi.ChatInviteLinkMembers {
        return TdApi.ChatInviteLinkMembers(
            totalCount = dto.totalCount,
            members = dto.members.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatInviteLinkSubscriptionInfo): ChatInviteLinkSubscriptionInfoDto {
        return ChatInviteLinkSubscriptionInfoDto(
            pricing = map(dto.pricing),
            canReuse = dto.canReuse,
            formId = dto.formId,
        )
    }

    fun map(dto: ChatInviteLinkSubscriptionInfoDto): TdApi.ChatInviteLinkSubscriptionInfo {
        return TdApi.ChatInviteLinkSubscriptionInfo(
            pricing = map(dto.pricing),
            canReuse = dto.canReuse,
            formId = dto.formId,
        )
    }

    fun map(dto: TdApi.ChatInviteLinks): ChatInviteLinksDto {
        return ChatInviteLinksDto(
            totalCount = dto.totalCount,
            inviteLinks = dto.inviteLinks.mapArray { map(it) },
        )
    }

    fun map(dto: ChatInviteLinksDto): TdApi.ChatInviteLinks {
        return TdApi.ChatInviteLinks(
            totalCount = dto.totalCount,
            inviteLinks = dto.inviteLinks.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatJoinRequest): ChatJoinRequestDto {
        return ChatJoinRequestDto(
            userId = dto.userId,
            date = dto.date,
            bio = dto.bio,
        )
    }

    fun map(dto: ChatJoinRequestDto): TdApi.ChatJoinRequest {
        return TdApi.ChatJoinRequest(
            userId = dto.userId,
            date = dto.date,
            bio = dto.bio,
        )
    }

    fun map(dto: TdApi.ChatJoinRequests): ChatJoinRequestsDto {
        return ChatJoinRequestsDto(
            totalCount = dto.totalCount,
            requests = dto.requests.mapArray { map(it) },
        )
    }

    fun map(dto: ChatJoinRequestsDto): TdApi.ChatJoinRequests {
        return TdApi.ChatJoinRequests(
            totalCount = dto.totalCount,
            requests = dto.requests.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatJoinRequestsInfo): ChatJoinRequestsInfoDto {
        return ChatJoinRequestsInfoDto(
            totalCount = dto.totalCount,
            userIds = dto.userIds,
        )
    }

    fun map(dto: ChatJoinRequestsInfoDto): TdApi.ChatJoinRequestsInfo {
        return TdApi.ChatJoinRequestsInfo(
            totalCount = dto.totalCount,
            userIds = dto.userIds,
        )
    }

    fun map(dto: TdApi.ChatLists): ChatListsDto {
        return ChatListsDto(
            chatLists = dto.chatLists.mapArray { map(it) },
        )
    }

    fun map(dto: ChatListsDto): TdApi.ChatLists {
        return TdApi.ChatLists(
            chatLists = dto.chatLists.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatLocation): ChatLocationDto {
        return ChatLocationDto(
            location = map(dto.location),
            address = dto.address,
        )
    }

    fun map(dto: ChatLocationDto): TdApi.ChatLocation {
        return TdApi.ChatLocation(
            location = map(dto.location),
            address = dto.address,
        )
    }

    fun map(dto: TdApi.ChatMember): ChatMemberDto {
        return ChatMemberDto(
            memberId = map(dto.memberId),
            inviterUserId = dto.inviterUserId,
            joinedChatDate = dto.joinedChatDate,
            status = map(dto.status),
        )
    }

    fun map(dto: ChatMemberDto): TdApi.ChatMember {
        return TdApi.ChatMember(
            memberId = map(dto.memberId),
            inviterUserId = dto.inviterUserId,
            joinedChatDate = dto.joinedChatDate,
            status = map(dto.status),
        )
    }

    fun map(dto: TdApi.ChatMembers): ChatMembersDto {
        return ChatMembersDto(
            totalCount = dto.totalCount,
            members = dto.members.mapArray { map(it) },
        )
    }

    fun map(dto: ChatMembersDto): TdApi.ChatMembers {
        return TdApi.ChatMembers(
            totalCount = dto.totalCount,
            members = dto.members.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatMessageSender): ChatMessageSenderDto {
        return ChatMessageSenderDto(
            sender = map(dto.sender),
            needsPremium = dto.needsPremium,
        )
    }

    fun map(dto: ChatMessageSenderDto): TdApi.ChatMessageSender {
        return TdApi.ChatMessageSender(
            sender = map(dto.sender),
            needsPremium = dto.needsPremium,
        )
    }

    fun map(dto: TdApi.ChatMessageSenders): ChatMessageSendersDto {
        return ChatMessageSendersDto(
            senders = dto.senders.mapArray { map(it) },
        )
    }

    fun map(dto: ChatMessageSendersDto): TdApi.ChatMessageSenders {
        return TdApi.ChatMessageSenders(
            senders = dto.senders.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatNotificationSettings): ChatNotificationSettingsDto {
        return ChatNotificationSettingsDto(
            useDefaultMuteFor = dto.useDefaultMuteFor,
            muteFor = dto.muteFor,
            useDefaultSound = dto.useDefaultSound,
            soundId = dto.soundId,
            useDefaultShowPreview = dto.useDefaultShowPreview,
            showPreview = dto.showPreview,
            useDefaultMuteStories = dto.useDefaultMuteStories,
            muteStories = dto.muteStories,
            useDefaultStorySound = dto.useDefaultStorySound,
            storySoundId = dto.storySoundId,
            useDefaultShowStoryPoster = dto.useDefaultShowStoryPoster,
            showStoryPoster = dto.showStoryPoster,
            useDefaultDisablePinnedMessageNotifications = dto.useDefaultDisablePinnedMessageNotifications,
            disablePinnedMessageNotifications = dto.disablePinnedMessageNotifications,
            useDefaultDisableMentionNotifications = dto.useDefaultDisableMentionNotifications,
            disableMentionNotifications = dto.disableMentionNotifications,
        )
    }

    fun map(dto: ChatNotificationSettingsDto): TdApi.ChatNotificationSettings {
        return TdApi.ChatNotificationSettings(
            useDefaultMuteFor = dto.useDefaultMuteFor,
            muteFor = dto.muteFor,
            useDefaultSound = dto.useDefaultSound,
            soundId = dto.soundId,
            useDefaultShowPreview = dto.useDefaultShowPreview,
            showPreview = dto.showPreview,
            useDefaultMuteStories = dto.useDefaultMuteStories,
            muteStories = dto.muteStories,
            useDefaultStorySound = dto.useDefaultStorySound,
            storySoundId = dto.storySoundId,
            useDefaultShowStoryPoster = dto.useDefaultShowStoryPoster,
            showStoryPoster = dto.showStoryPoster,
            useDefaultDisablePinnedMessageNotifications = dto.useDefaultDisablePinnedMessageNotifications,
            disablePinnedMessageNotifications = dto.disablePinnedMessageNotifications,
            useDefaultDisableMentionNotifications = dto.useDefaultDisableMentionNotifications,
            disableMentionNotifications = dto.disableMentionNotifications,
        )
    }

    fun map(dto: TdApi.ChatPermissions): ChatPermissionsDto {
        return ChatPermissionsDto(
            canSendBasicMessages = dto.canSendBasicMessages,
            canSendAudios = dto.canSendAudios,
            canSendDocuments = dto.canSendDocuments,
            canSendPhotos = dto.canSendPhotos,
            canSendVideos = dto.canSendVideos,
            canSendVideoNotes = dto.canSendVideoNotes,
            canSendVoiceNotes = dto.canSendVoiceNotes,
            canSendPolls = dto.canSendPolls,
            canSendOtherMessages = dto.canSendOtherMessages,
            canAddLinkPreviews = dto.canAddLinkPreviews,
            canChangeInfo = dto.canChangeInfo,
            canInviteUsers = dto.canInviteUsers,
            canPinMessages = dto.canPinMessages,
            canCreateTopics = dto.canCreateTopics,
        )
    }

    fun map(dto: ChatPermissionsDto): TdApi.ChatPermissions {
        return TdApi.ChatPermissions(
            canSendBasicMessages = dto.canSendBasicMessages,
            canSendAudios = dto.canSendAudios,
            canSendDocuments = dto.canSendDocuments,
            canSendPhotos = dto.canSendPhotos,
            canSendVideos = dto.canSendVideos,
            canSendVideoNotes = dto.canSendVideoNotes,
            canSendVoiceNotes = dto.canSendVoiceNotes,
            canSendPolls = dto.canSendPolls,
            canSendOtherMessages = dto.canSendOtherMessages,
            canAddLinkPreviews = dto.canAddLinkPreviews,
            canChangeInfo = dto.canChangeInfo,
            canInviteUsers = dto.canInviteUsers,
            canPinMessages = dto.canPinMessages,
            canCreateTopics = dto.canCreateTopics,
        )
    }

    fun map(dto: TdApi.ChatPhoto): ChatPhotoDto {
        return ChatPhotoDto(
            id = dto.id,
            addedDate = dto.addedDate,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            sizes = dto.sizes.mapArray { map(it) },
            animation = dto.animation?.let { map(it) },
            smallAnimation = dto.smallAnimation?.let { map(it) },
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: ChatPhotoDto): TdApi.ChatPhoto {
        return TdApi.ChatPhoto(
            id = dto.id,
            addedDate = dto.addedDate,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            sizes = dto.sizes.mapArray { map(it) },
            animation = dto.animation?.let { map(it) },
            smallAnimation = dto.smallAnimation?.let { map(it) },
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ChatPhotoInfo): ChatPhotoInfoDto {
        return ChatPhotoInfoDto(
            small = map(dto.small),
            big = map(dto.big),
            minithumbnail = dto.minithumbnail?.let { map(it) },
            hasAnimation = dto.hasAnimation,
            isPersonal = dto.isPersonal,
        )
    }

    fun map(dto: ChatPhotoInfoDto): TdApi.ChatPhotoInfo {
        return TdApi.ChatPhotoInfo(
            small = map(dto.small),
            big = map(dto.big),
            minithumbnail = dto.minithumbnail?.let { map(it) },
            hasAnimation = dto.hasAnimation,
            isPersonal = dto.isPersonal,
        )
    }

    fun map(dto: TdApi.ChatPhotoSticker): ChatPhotoStickerDto {
        return ChatPhotoStickerDto(
            type = map(dto.type),
            backgroundFill = map(dto.backgroundFill),
        )
    }

    fun map(dto: ChatPhotoStickerDto): TdApi.ChatPhotoSticker {
        return TdApi.ChatPhotoSticker(
            type = map(dto.type),
            backgroundFill = map(dto.backgroundFill),
        )
    }

    fun map(dto: TdApi.ChatPhotos): ChatPhotosDto {
        return ChatPhotosDto(
            totalCount = dto.totalCount,
            photos = dto.photos.mapArray { map(it) },
        )
    }

    fun map(dto: ChatPhotosDto): TdApi.ChatPhotos {
        return TdApi.ChatPhotos(
            totalCount = dto.totalCount,
            photos = dto.photos.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatPosition): ChatPositionDto {
        return ChatPositionDto(
            list = map(dto.list),
            order = dto.order,
            isPinned = dto.isPinned,
            source = dto.source?.let { map(it) },
        )
    }

    fun map(dto: ChatPositionDto): TdApi.ChatPosition {
        return TdApi.ChatPosition(
            list = map(dto.list),
            order = dto.order,
            isPinned = dto.isPinned,
            source = dto.source?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ChatRevenueAmount): ChatRevenueAmountDto {
        return ChatRevenueAmountDto(
            cryptocurrency = dto.cryptocurrency,
            totalAmount = dto.totalAmount,
            balanceAmount = dto.balanceAmount,
            availableAmount = dto.availableAmount,
            withdrawalEnabled = dto.withdrawalEnabled,
        )
    }

    fun map(dto: ChatRevenueAmountDto): TdApi.ChatRevenueAmount {
        return TdApi.ChatRevenueAmount(
            cryptocurrency = dto.cryptocurrency,
            totalAmount = dto.totalAmount,
            balanceAmount = dto.balanceAmount,
            availableAmount = dto.availableAmount,
            withdrawalEnabled = dto.withdrawalEnabled,
        )
    }

    fun map(dto: TdApi.ChatRevenueStatistics): ChatRevenueStatisticsDto {
        return ChatRevenueStatisticsDto(
            revenueByHourGraph = map(dto.revenueByHourGraph),
            revenueGraph = map(dto.revenueGraph),
            revenueAmount = map(dto.revenueAmount),
            usdRate = dto.usdRate,
        )
    }

    fun map(dto: ChatRevenueStatisticsDto): TdApi.ChatRevenueStatistics {
        return TdApi.ChatRevenueStatistics(
            revenueByHourGraph = map(dto.revenueByHourGraph),
            revenueGraph = map(dto.revenueGraph),
            revenueAmount = map(dto.revenueAmount),
            usdRate = dto.usdRate,
        )
    }

    fun map(dto: TdApi.ChatRevenueTransaction): ChatRevenueTransactionDto {
        return ChatRevenueTransactionDto(
            cryptocurrency = dto.cryptocurrency,
            cryptocurrencyAmount = dto.cryptocurrencyAmount,
            type = map(dto.type),
        )
    }

    fun map(dto: ChatRevenueTransactionDto): TdApi.ChatRevenueTransaction {
        return TdApi.ChatRevenueTransaction(
            cryptocurrency = dto.cryptocurrency,
            cryptocurrencyAmount = dto.cryptocurrencyAmount,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.ChatRevenueTransactions): ChatRevenueTransactionsDto {
        return ChatRevenueTransactionsDto(
            totalCount = dto.totalCount,
            transactions = dto.transactions.mapArray { map(it) },
        )
    }

    fun map(dto: ChatRevenueTransactionsDto): TdApi.ChatRevenueTransactions {
        return TdApi.ChatRevenueTransactions(
            totalCount = dto.totalCount,
            transactions = dto.transactions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ChatStatisticsAdministratorActionsInfo): ChatStatisticsAdministratorActionsInfoDto {
        return ChatStatisticsAdministratorActionsInfoDto(
            userId = dto.userId,
            deletedMessageCount = dto.deletedMessageCount,
            bannedUserCount = dto.bannedUserCount,
            restrictedUserCount = dto.restrictedUserCount,
        )
    }

    fun map(dto: ChatStatisticsAdministratorActionsInfoDto): TdApi.ChatStatisticsAdministratorActionsInfo {
        return TdApi.ChatStatisticsAdministratorActionsInfo(
            userId = dto.userId,
            deletedMessageCount = dto.deletedMessageCount,
            bannedUserCount = dto.bannedUserCount,
            restrictedUserCount = dto.restrictedUserCount,
        )
    }

    fun map(dto: TdApi.ChatStatisticsInteractionInfo): ChatStatisticsInteractionInfoDto {
        return ChatStatisticsInteractionInfoDto(
            objectType = map(dto.objectType),
            viewCount = dto.viewCount,
            forwardCount = dto.forwardCount,
            reactionCount = dto.reactionCount,
        )
    }

    fun map(dto: ChatStatisticsInteractionInfoDto): TdApi.ChatStatisticsInteractionInfo {
        return TdApi.ChatStatisticsInteractionInfo(
            objectType = map(dto.objectType),
            viewCount = dto.viewCount,
            forwardCount = dto.forwardCount,
            reactionCount = dto.reactionCount,
        )
    }

    fun map(dto: TdApi.ChatStatisticsInviterInfo): ChatStatisticsInviterInfoDto {
        return ChatStatisticsInviterInfoDto(
            userId = dto.userId,
            addedMemberCount = dto.addedMemberCount,
        )
    }

    fun map(dto: ChatStatisticsInviterInfoDto): TdApi.ChatStatisticsInviterInfo {
        return TdApi.ChatStatisticsInviterInfo(
            userId = dto.userId,
            addedMemberCount = dto.addedMemberCount,
        )
    }

    fun map(dto: TdApi.ChatStatisticsMessageSenderInfo): ChatStatisticsMessageSenderInfoDto {
        return ChatStatisticsMessageSenderInfoDto(
            userId = dto.userId,
            sentMessageCount = dto.sentMessageCount,
            averageCharacterCount = dto.averageCharacterCount,
        )
    }

    fun map(dto: ChatStatisticsMessageSenderInfoDto): TdApi.ChatStatisticsMessageSenderInfo {
        return TdApi.ChatStatisticsMessageSenderInfo(
            userId = dto.userId,
            sentMessageCount = dto.sentMessageCount,
            averageCharacterCount = dto.averageCharacterCount,
        )
    }

    fun map(dto: TdApi.ChatTheme): ChatThemeDto {
        return ChatThemeDto(
            name = dto.name,
            lightSettings = map(dto.lightSettings),
            darkSettings = map(dto.darkSettings),
        )
    }

    fun map(dto: ChatThemeDto): TdApi.ChatTheme {
        return TdApi.ChatTheme(
            name = dto.name,
            lightSettings = map(dto.lightSettings),
            darkSettings = map(dto.darkSettings),
        )
    }

    fun map(dto: TdApi.Chats): ChatsDto {
        return ChatsDto(
            totalCount = dto.totalCount,
            chatIds = dto.chatIds,
        )
    }

    fun map(dto: ChatsDto): TdApi.Chats {
        return TdApi.Chats(
            totalCount = dto.totalCount,
            chatIds = dto.chatIds,
        )
    }

    fun map(dto: TdApi.CloseBirthdayUser): CloseBirthdayUserDto {
        return CloseBirthdayUserDto(
            userId = dto.userId,
            birthdate = map(dto.birthdate),
        )
    }

    fun map(dto: CloseBirthdayUserDto): TdApi.CloseBirthdayUser {
        return TdApi.CloseBirthdayUser(
            userId = dto.userId,
            birthdate = map(dto.birthdate),
        )
    }

    fun map(dto: TdApi.ClosedVectorPath): ClosedVectorPathDto {
        return ClosedVectorPathDto(
            commands = dto.commands.mapArray { map(it) },
        )
    }

    fun map(dto: ClosedVectorPathDto): TdApi.ClosedVectorPath {
        return TdApi.ClosedVectorPath(
            commands = dto.commands.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.CollectibleItemInfo): CollectibleItemInfoDto {
        return CollectibleItemInfoDto(
            purchaseDate = dto.purchaseDate,
            currency = dto.currency,
            amount = dto.amount,
            cryptocurrency = dto.cryptocurrency,
            cryptocurrencyAmount = dto.cryptocurrencyAmount,
            url = dto.url,
        )
    }

    fun map(dto: CollectibleItemInfoDto): TdApi.CollectibleItemInfo {
        return TdApi.CollectibleItemInfo(
            purchaseDate = dto.purchaseDate,
            currency = dto.currency,
            amount = dto.amount,
            cryptocurrency = dto.cryptocurrency,
            cryptocurrencyAmount = dto.cryptocurrencyAmount,
            url = dto.url,
        )
    }

    fun map(dto: TdApi.ConnectedAffiliateProgram): ConnectedAffiliateProgramDto {
        return ConnectedAffiliateProgramDto(
            url = dto.url,
            botUserId = dto.botUserId,
            parameters = map(dto.parameters),
            connectionDate = dto.connectionDate,
            isDisconnected = dto.isDisconnected,
            userCount = dto.userCount,
            revenueStarCount = dto.revenueStarCount,
        )
    }

    fun map(dto: ConnectedAffiliateProgramDto): TdApi.ConnectedAffiliateProgram {
        return TdApi.ConnectedAffiliateProgram(
            url = dto.url,
            botUserId = dto.botUserId,
            parameters = map(dto.parameters),
            connectionDate = dto.connectionDate,
            isDisconnected = dto.isDisconnected,
            userCount = dto.userCount,
            revenueStarCount = dto.revenueStarCount,
        )
    }

    fun map(dto: TdApi.ConnectedAffiliatePrograms): ConnectedAffiliateProgramsDto {
        return ConnectedAffiliateProgramsDto(
            totalCount = dto.totalCount,
            programs = dto.programs.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: ConnectedAffiliateProgramsDto): TdApi.ConnectedAffiliatePrograms {
        return TdApi.ConnectedAffiliatePrograms(
            totalCount = dto.totalCount,
            programs = dto.programs.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.ConnectedWebsite): ConnectedWebsiteDto {
        return ConnectedWebsiteDto(
            id = dto.id,
            domainName = dto.domainName,
            botUserId = dto.botUserId,
            browser = dto.browser,
            platform = dto.platform,
            logInDate = dto.logInDate,
            lastActiveDate = dto.lastActiveDate,
            ipAddress = dto.ipAddress,
            location = dto.location,
        )
    }

    fun map(dto: ConnectedWebsiteDto): TdApi.ConnectedWebsite {
        return TdApi.ConnectedWebsite(
            id = dto.id,
            domainName = dto.domainName,
            botUserId = dto.botUserId,
            browser = dto.browser,
            platform = dto.platform,
            logInDate = dto.logInDate,
            lastActiveDate = dto.lastActiveDate,
            ipAddress = dto.ipAddress,
            location = dto.location,
        )
    }

    fun map(dto: TdApi.ConnectedWebsites): ConnectedWebsitesDto {
        return ConnectedWebsitesDto(
            websites = dto.websites.mapArray { map(it) },
        )
    }

    fun map(dto: ConnectedWebsitesDto): TdApi.ConnectedWebsites {
        return TdApi.ConnectedWebsites(
            websites = dto.websites.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Contact): ContactDto {
        return ContactDto(
            phoneNumber = dto.phoneNumber,
            firstName = dto.firstName,
            lastName = dto.lastName,
            vcard = dto.vcard,
            userId = dto.userId,
        )
    }

    fun map(dto: ContactDto): TdApi.Contact {
        return TdApi.Contact(
            phoneNumber = dto.phoneNumber,
            firstName = dto.firstName,
            lastName = dto.lastName,
            vcard = dto.vcard,
            userId = dto.userId,
        )
    }

    fun map(dto: TdApi.Count): CountDto {
        return CountDto(
            count = dto.count,
        )
    }

    fun map(dto: CountDto): TdApi.Count {
        return TdApi.Count(
            count = dto.count,
        )
    }

    fun map(dto: TdApi.Countries): CountriesDto {
        return CountriesDto(
            countries = dto.countries.mapArray { map(it) },
        )
    }

    fun map(dto: CountriesDto): TdApi.Countries {
        return TdApi.Countries(
            countries = dto.countries.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.CountryInfo): CountryInfoDto {
        return CountryInfoDto(
            countryCode = dto.countryCode,
            name = dto.name,
            englishName = dto.englishName,
            isHidden = dto.isHidden,
            callingCodes = dto.callingCodes,
        )
    }

    fun map(dto: CountryInfoDto): TdApi.CountryInfo {
        return TdApi.CountryInfo(
            countryCode = dto.countryCode,
            name = dto.name,
            englishName = dto.englishName,
            isHidden = dto.isHidden,
            callingCodes = dto.callingCodes,
        )
    }

    fun map(dto: TdApi.CreatedBasicGroupChat): CreatedBasicGroupChatDto {
        return CreatedBasicGroupChatDto(
            chatId = dto.chatId,
            failedToAddMembers = map(dto.failedToAddMembers),
        )
    }

    fun map(dto: CreatedBasicGroupChatDto): TdApi.CreatedBasicGroupChat {
        return TdApi.CreatedBasicGroupChat(
            chatId = dto.chatId,
            failedToAddMembers = map(dto.failedToAddMembers),
        )
    }

    fun map(dto: TdApi.CurrentWeather): CurrentWeatherDto {
        return CurrentWeatherDto(
            temperature = dto.temperature,
            emoji = dto.emoji,
        )
    }

    fun map(dto: CurrentWeatherDto): TdApi.CurrentWeather {
        return TdApi.CurrentWeather(
            temperature = dto.temperature,
            emoji = dto.emoji,
        )
    }

    fun map(dto: TdApi.CustomRequestResult): CustomRequestResultDto {
        return CustomRequestResultDto(
            result = dto.result,
        )
    }

    fun map(dto: CustomRequestResultDto): TdApi.CustomRequestResult {
        return TdApi.CustomRequestResult(
            result = dto.result,
        )
    }

    fun map(dto: TdApi.Data): DataDto {
        return DataDto(
            data = dto.data,
        )
    }

    fun map(dto: DataDto): TdApi.Data {
        return TdApi.Data(
            data = dto.data,
        )
    }

    fun map(dto: TdApi.DatabaseStatistics): DatabaseStatisticsDto {
        return DatabaseStatisticsDto(
            statistics = dto.statistics,
        )
    }

    fun map(dto: DatabaseStatisticsDto): TdApi.DatabaseStatistics {
        return TdApi.DatabaseStatistics(
            statistics = dto.statistics,
        )
    }

    fun map(dto: TdApi.Date): DateDto {
        return DateDto(
            day = dto.day,
            month = dto.month,
            year = dto.year,
        )
    }

    fun map(dto: DateDto): TdApi.Date {
        return TdApi.Date(
            day = dto.day,
            month = dto.month,
            year = dto.year,
        )
    }

    fun map(dto: TdApi.DateRange): DateRangeDto {
        return DateRangeDto(
            startDate = dto.startDate,
            endDate = dto.endDate,
        )
    }

    fun map(dto: DateRangeDto): TdApi.DateRange {
        return TdApi.DateRange(
            startDate = dto.startDate,
            endDate = dto.endDate,
        )
    }

    fun map(dto: TdApi.DatedFile): DatedFileDto {
        return DatedFileDto(
            file = map(dto.file),
            date = dto.date,
        )
    }

    fun map(dto: DatedFileDto): TdApi.DatedFile {
        return TdApi.DatedFile(
            file = map(dto.file),
            date = dto.date,
        )
    }

    fun map(dto: TdApi.DeepLinkInfo): DeepLinkInfoDto {
        return DeepLinkInfoDto(
            text = map(dto.text),
            needUpdateApplication = dto.needUpdateApplication,
        )
    }

    fun map(dto: DeepLinkInfoDto): TdApi.DeepLinkInfo {
        return TdApi.DeepLinkInfo(
            text = map(dto.text),
            needUpdateApplication = dto.needUpdateApplication,
        )
    }

    fun map(dto: TdApi.Document): DocumentDto {
        return DocumentDto(
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            document = map(dto.document),
        )
    }

    fun map(dto: DocumentDto): TdApi.Document {
        return TdApi.Document(
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            document = map(dto.document),
        )
    }

    fun map(dto: TdApi.DownloadedFileCounts): DownloadedFileCountsDto {
        return DownloadedFileCountsDto(
            activeCount = dto.activeCount,
            pausedCount = dto.pausedCount,
            completedCount = dto.completedCount,
        )
    }

    fun map(dto: DownloadedFileCountsDto): TdApi.DownloadedFileCounts {
        return TdApi.DownloadedFileCounts(
            activeCount = dto.activeCount,
            pausedCount = dto.pausedCount,
            completedCount = dto.completedCount,
        )
    }

    fun map(dto: TdApi.DraftMessage): DraftMessageDto {
        return DraftMessageDto(
            replyTo = dto.replyTo?.let { map(it) },
            date = dto.date,
            inputMessageText = map(dto.inputMessageText),
            effectId = dto.effectId,
        )
    }

    fun map(dto: DraftMessageDto): TdApi.DraftMessage {
        return TdApi.DraftMessage(
            replyTo = dto.replyTo?.let { map(it) },
            date = dto.date,
            inputMessageText = map(dto.inputMessageText),
            effectId = dto.effectId,
        )
    }

    fun map(dto: TdApi.EmailAddressAuthenticationCodeInfo): EmailAddressAuthenticationCodeInfoDto {
        return EmailAddressAuthenticationCodeInfoDto(
            emailAddressPattern = dto.emailAddressPattern,
            length = dto.length,
        )
    }

    fun map(dto: EmailAddressAuthenticationCodeInfoDto): TdApi.EmailAddressAuthenticationCodeInfo {
        return TdApi.EmailAddressAuthenticationCodeInfo(
            emailAddressPattern = dto.emailAddressPattern,
            length = dto.length,
        )
    }

    fun map(dto: TdApi.EmojiCategories): EmojiCategoriesDto {
        return EmojiCategoriesDto(
            categories = dto.categories.mapArray { map(it) },
        )
    }

    fun map(dto: EmojiCategoriesDto): TdApi.EmojiCategories {
        return TdApi.EmojiCategories(
            categories = dto.categories.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.EmojiCategory): EmojiCategoryDto {
        return EmojiCategoryDto(
            name = dto.name,
            icon = map(dto.icon),
            source = map(dto.source),
            isGreeting = dto.isGreeting,
        )
    }

    fun map(dto: EmojiCategoryDto): TdApi.EmojiCategory {
        return TdApi.EmojiCategory(
            name = dto.name,
            icon = map(dto.icon),
            source = map(dto.source),
            isGreeting = dto.isGreeting,
        )
    }

    fun map(dto: TdApi.EmojiKeyword): EmojiKeywordDto {
        return EmojiKeywordDto(
            emoji = dto.emoji,
            keyword = dto.keyword,
        )
    }

    fun map(dto: EmojiKeywordDto): TdApi.EmojiKeyword {
        return TdApi.EmojiKeyword(
            emoji = dto.emoji,
            keyword = dto.keyword,
        )
    }

    fun map(dto: TdApi.EmojiKeywords): EmojiKeywordsDto {
        return EmojiKeywordsDto(
            emojiKeywords = dto.emojiKeywords.mapArray { map(it) },
        )
    }

    fun map(dto: EmojiKeywordsDto): TdApi.EmojiKeywords {
        return TdApi.EmojiKeywords(
            emojiKeywords = dto.emojiKeywords.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.EmojiReaction): EmojiReactionDto {
        return EmojiReactionDto(
            emoji = dto.emoji,
            title = dto.title,
            isActive = dto.isActive,
            staticIcon = map(dto.staticIcon),
            appearAnimation = map(dto.appearAnimation),
            selectAnimation = map(dto.selectAnimation),
            activateAnimation = map(dto.activateAnimation),
            effectAnimation = map(dto.effectAnimation),
            aroundAnimation = dto.aroundAnimation?.let { map(it) },
            centerAnimation = dto.centerAnimation?.let { map(it) },
        )
    }

    fun map(dto: EmojiReactionDto): TdApi.EmojiReaction {
        return TdApi.EmojiReaction(
            emoji = dto.emoji,
            title = dto.title,
            isActive = dto.isActive,
            staticIcon = map(dto.staticIcon),
            appearAnimation = map(dto.appearAnimation),
            selectAnimation = map(dto.selectAnimation),
            activateAnimation = map(dto.activateAnimation),
            effectAnimation = map(dto.effectAnimation),
            aroundAnimation = dto.aroundAnimation?.let { map(it) },
            centerAnimation = dto.centerAnimation?.let { map(it) },
        )
    }

    fun map(dto: TdApi.EmojiStatus): EmojiStatusDto {
        return EmojiStatusDto(
            type = map(dto.type),
            expirationDate = dto.expirationDate,
        )
    }

    fun map(dto: EmojiStatusDto): TdApi.EmojiStatus {
        return TdApi.EmojiStatus(
            type = map(dto.type),
            expirationDate = dto.expirationDate,
        )
    }

    fun map(dto: TdApi.EmojiStatusCustomEmojis): EmojiStatusCustomEmojisDto {
        return EmojiStatusCustomEmojisDto(
            customEmojiIds = dto.customEmojiIds,
        )
    }

    fun map(dto: EmojiStatusCustomEmojisDto): TdApi.EmojiStatusCustomEmojis {
        return TdApi.EmojiStatusCustomEmojis(
            customEmojiIds = dto.customEmojiIds,
        )
    }

    fun map(dto: TdApi.EmojiStatuses): EmojiStatusesDto {
        return EmojiStatusesDto(
            emojiStatuses = dto.emojiStatuses.mapArray { map(it) },
        )
    }

    fun map(dto: EmojiStatusesDto): TdApi.EmojiStatuses {
        return TdApi.EmojiStatuses(
            emojiStatuses = dto.emojiStatuses.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Emojis): EmojisDto {
        return EmojisDto(
            emojis = dto.emojis,
        )
    }

    fun map(dto: EmojisDto): TdApi.Emojis {
        return TdApi.Emojis(
            emojis = dto.emojis,
        )
    }

    fun map(dto: TdApi.EncryptedCredentials): EncryptedCredentialsDto {
        return EncryptedCredentialsDto(
            data = dto.data,
            hash = dto.hash,
            secret = dto.secret,
        )
    }

    fun map(dto: EncryptedCredentialsDto): TdApi.EncryptedCredentials {
        return TdApi.EncryptedCredentials(
            data = dto.data,
            hash = dto.hash,
            secret = dto.secret,
        )
    }

    fun map(dto: TdApi.EncryptedPassportElement): EncryptedPassportElementDto {
        return EncryptedPassportElementDto(
            type = map(dto.type),
            data = dto.data,
            frontSide = map(dto.frontSide),
            reverseSide = dto.reverseSide?.let { map(it) },
            selfie = dto.selfie?.let { map(it) },
            translation = dto.translation.mapArray { map(it) },
            files = dto.files.mapArray { map(it) },
            value = dto.value,
            hash = dto.hash,
        )
    }

    fun map(dto: EncryptedPassportElementDto): TdApi.EncryptedPassportElement {
        return TdApi.EncryptedPassportElement(
            type = map(dto.type),
            data = dto.data,
            frontSide = map(dto.frontSide),
            reverseSide = dto.reverseSide?.let { map(it) },
            selfie = dto.selfie?.let { map(it) },
            translation = dto.translation.mapArray { map(it) },
            files = dto.files.mapArray { map(it) },
            value = dto.value,
            hash = dto.hash,
        )
    }

    fun map(dto: TdApi.Error): ErrorDto {
        return ErrorDto(
            code = dto.code,
            message = dto.message,
        )
    }

    fun map(dto: ErrorDto): TdApi.Error {
        return TdApi.Error(
            code = dto.code,
            message = dto.message,
        )
    }

    fun map(dto: TdApi.FactCheck): FactCheckDto {
        return FactCheckDto(
            text = map(dto.text),
            countryCode = dto.countryCode,
        )
    }

    fun map(dto: FactCheckDto): TdApi.FactCheck {
        return TdApi.FactCheck(
            text = map(dto.text),
            countryCode = dto.countryCode,
        )
    }

    fun map(dto: TdApi.FailedToAddMember): FailedToAddMemberDto {
        return FailedToAddMemberDto(
            userId = dto.userId,
            premiumWouldAllowInvite = dto.premiumWouldAllowInvite,
            premiumRequiredToSendMessages = dto.premiumRequiredToSendMessages,
        )
    }

    fun map(dto: FailedToAddMemberDto): TdApi.FailedToAddMember {
        return TdApi.FailedToAddMember(
            userId = dto.userId,
            premiumWouldAllowInvite = dto.premiumWouldAllowInvite,
            premiumRequiredToSendMessages = dto.premiumRequiredToSendMessages,
        )
    }

    fun map(dto: TdApi.FailedToAddMembers): FailedToAddMembersDto {
        return FailedToAddMembersDto(
            failedToAddMembers = dto.failedToAddMembers.mapArray { map(it) },
        )
    }

    fun map(dto: FailedToAddMembersDto): TdApi.FailedToAddMembers {
        return TdApi.FailedToAddMembers(
            failedToAddMembers = dto.failedToAddMembers.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.File): FileDto {
        return FileDto(
            id = dto.id,
            size = dto.size,
            expectedSize = dto.expectedSize,
            local = map(dto.local),
            remote = map(dto.remote),
        )
    }

    fun map(dto: FileDto): TdApi.File {
        return TdApi.File(
            id = dto.id,
            size = dto.size,
            expectedSize = dto.expectedSize,
            local = map(dto.local),
            remote = map(dto.remote),
        )
    }

    fun map(dto: TdApi.FileDownload): FileDownloadDto {
        return FileDownloadDto(
            fileId = dto.fileId,
            message = map(dto.message),
            addDate = dto.addDate,
            completeDate = dto.completeDate,
            isPaused = dto.isPaused,
        )
    }

    fun map(dto: FileDownloadDto): TdApi.FileDownload {
        return TdApi.FileDownload(
            fileId = dto.fileId,
            message = map(dto.message),
            addDate = dto.addDate,
            completeDate = dto.completeDate,
            isPaused = dto.isPaused,
        )
    }

    fun map(dto: TdApi.FileDownloadedPrefixSize): FileDownloadedPrefixSizeDto {
        return FileDownloadedPrefixSizeDto(
            size = dto.size,
        )
    }

    fun map(dto: FileDownloadedPrefixSizeDto): TdApi.FileDownloadedPrefixSize {
        return TdApi.FileDownloadedPrefixSize(
            size = dto.size,
        )
    }

    fun map(dto: TdApi.FormattedText): FormattedTextDto {
        return FormattedTextDto(
            text = dto.text,
            entities = dto.entities.mapArray { map(it) },
        )
    }

    fun map(dto: FormattedTextDto): TdApi.FormattedText {
        return TdApi.FormattedText(
            text = dto.text,
            entities = dto.entities.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ForumTopic): ForumTopicDto {
        return ForumTopicDto(
            info = map(dto.info),
            lastMessage = dto.lastMessage?.let { map(it) },
            order = dto.order,
            isPinned = dto.isPinned,
            unreadCount = dto.unreadCount,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            unreadMentionCount = dto.unreadMentionCount,
            unreadReactionCount = dto.unreadReactionCount,
            notificationSettings = map(dto.notificationSettings),
            draftMessage = dto.draftMessage?.let { map(it) },
        )
    }

    fun map(dto: ForumTopicDto): TdApi.ForumTopic {
        return TdApi.ForumTopic(
            info = map(dto.info),
            lastMessage = dto.lastMessage?.let { map(it) },
            order = dto.order,
            isPinned = dto.isPinned,
            unreadCount = dto.unreadCount,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            unreadMentionCount = dto.unreadMentionCount,
            unreadReactionCount = dto.unreadReactionCount,
            notificationSettings = map(dto.notificationSettings),
            draftMessage = dto.draftMessage?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ForumTopicIcon): ForumTopicIconDto {
        return ForumTopicIconDto(
            color = dto.color,
            customEmojiId = dto.customEmojiId,
        )
    }

    fun map(dto: ForumTopicIconDto): TdApi.ForumTopicIcon {
        return TdApi.ForumTopicIcon(
            color = dto.color,
            customEmojiId = dto.customEmojiId,
        )
    }

    fun map(dto: TdApi.ForumTopicInfo): ForumTopicInfoDto {
        return ForumTopicInfoDto(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            name = dto.name,
            icon = map(dto.icon),
            creationDate = dto.creationDate,
            creatorId = map(dto.creatorId),
            isGeneral = dto.isGeneral,
            isOutgoing = dto.isOutgoing,
            isClosed = dto.isClosed,
            isHidden = dto.isHidden,
        )
    }

    fun map(dto: ForumTopicInfoDto): TdApi.ForumTopicInfo {
        return TdApi.ForumTopicInfo(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            name = dto.name,
            icon = map(dto.icon),
            creationDate = dto.creationDate,
            creatorId = map(dto.creatorId),
            isGeneral = dto.isGeneral,
            isOutgoing = dto.isOutgoing,
            isClosed = dto.isClosed,
            isHidden = dto.isHidden,
        )
    }

    fun map(dto: TdApi.ForumTopics): ForumTopicsDto {
        return ForumTopicsDto(
            totalCount = dto.totalCount,
            topics = dto.topics.mapArray { map(it) },
            nextOffsetDate = dto.nextOffsetDate,
            nextOffsetMessageId = dto.nextOffsetMessageId,
            nextOffsetMessageThreadId = dto.nextOffsetMessageThreadId,
        )
    }

    fun map(dto: ForumTopicsDto): TdApi.ForumTopics {
        return TdApi.ForumTopics(
            totalCount = dto.totalCount,
            topics = dto.topics.mapArray { map(it) },
            nextOffsetDate = dto.nextOffsetDate,
            nextOffsetMessageId = dto.nextOffsetMessageId,
            nextOffsetMessageThreadId = dto.nextOffsetMessageThreadId,
        )
    }

    fun map(dto: TdApi.ForwardSource): ForwardSourceDto {
        return ForwardSourceDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            senderId = dto.senderId?.let { map(it) },
            senderName = dto.senderName,
            date = dto.date,
            isOutgoing = dto.isOutgoing,
        )
    }

    fun map(dto: ForwardSourceDto): TdApi.ForwardSource {
        return TdApi.ForwardSource(
            chatId = dto.chatId,
            messageId = dto.messageId,
            senderId = dto.senderId?.let { map(it) },
            senderName = dto.senderName,
            date = dto.date,
            isOutgoing = dto.isOutgoing,
        )
    }

    fun map(dto: TdApi.FoundAffiliateProgram): FoundAffiliateProgramDto {
        return FoundAffiliateProgramDto(
            botUserId = dto.botUserId,
            info = map(dto.info),
        )
    }

    fun map(dto: FoundAffiliateProgramDto): TdApi.FoundAffiliateProgram {
        return TdApi.FoundAffiliateProgram(
            botUserId = dto.botUserId,
            info = map(dto.info),
        )
    }

    fun map(dto: TdApi.FoundAffiliatePrograms): FoundAffiliateProgramsDto {
        return FoundAffiliateProgramsDto(
            totalCount = dto.totalCount,
            programs = dto.programs.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: FoundAffiliateProgramsDto): TdApi.FoundAffiliatePrograms {
        return TdApi.FoundAffiliatePrograms(
            totalCount = dto.totalCount,
            programs = dto.programs.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.FoundChatBoosts): FoundChatBoostsDto {
        return FoundChatBoostsDto(
            totalCount = dto.totalCount,
            boosts = dto.boosts.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: FoundChatBoostsDto): TdApi.FoundChatBoosts {
        return TdApi.FoundChatBoosts(
            totalCount = dto.totalCount,
            boosts = dto.boosts.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.FoundChatMessages): FoundChatMessagesDto {
        return FoundChatMessagesDto(
            totalCount = dto.totalCount,
            messages = dto.messages.mapArray { map(it) },
            nextFromMessageId = dto.nextFromMessageId,
        )
    }

    fun map(dto: FoundChatMessagesDto): TdApi.FoundChatMessages {
        return TdApi.FoundChatMessages(
            totalCount = dto.totalCount,
            messages = dto.messages.mapArray { map(it) },
            nextFromMessageId = dto.nextFromMessageId,
        )
    }

    fun map(dto: TdApi.FoundFileDownloads): FoundFileDownloadsDto {
        return FoundFileDownloadsDto(
            totalCounts = map(dto.totalCounts),
            files = dto.files.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: FoundFileDownloadsDto): TdApi.FoundFileDownloads {
        return TdApi.FoundFileDownloads(
            totalCounts = map(dto.totalCounts),
            files = dto.files.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.FoundMessages): FoundMessagesDto {
        return FoundMessagesDto(
            totalCount = dto.totalCount,
            messages = dto.messages.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: FoundMessagesDto): TdApi.FoundMessages {
        return TdApi.FoundMessages(
            totalCount = dto.totalCount,
            messages = dto.messages.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.FoundPosition): FoundPositionDto {
        return FoundPositionDto(
            position = dto.position,
        )
    }

    fun map(dto: FoundPositionDto): TdApi.FoundPosition {
        return TdApi.FoundPosition(
            position = dto.position,
        )
    }

    fun map(dto: TdApi.FoundPositions): FoundPositionsDto {
        return FoundPositionsDto(
            totalCount = dto.totalCount,
            positions = dto.positions,
        )
    }

    fun map(dto: FoundPositionsDto): TdApi.FoundPositions {
        return TdApi.FoundPositions(
            totalCount = dto.totalCount,
            positions = dto.positions,
        )
    }

    fun map(dto: TdApi.FoundStories): FoundStoriesDto {
        return FoundStoriesDto(
            totalCount = dto.totalCount,
            stories = dto.stories.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: FoundStoriesDto): TdApi.FoundStories {
        return TdApi.FoundStories(
            totalCount = dto.totalCount,
            stories = dto.stories.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.FoundUsers): FoundUsersDto {
        return FoundUsersDto(
            userIds = dto.userIds,
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: FoundUsersDto): TdApi.FoundUsers {
        return TdApi.FoundUsers(
            userIds = dto.userIds,
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.FoundWebApp): FoundWebAppDto {
        return FoundWebAppDto(
            webApp = map(dto.webApp),
            requestWriteAccess = dto.requestWriteAccess,
            skipConfirmation = dto.skipConfirmation,
        )
    }

    fun map(dto: FoundWebAppDto): TdApi.FoundWebApp {
        return TdApi.FoundWebApp(
            webApp = map(dto.webApp),
            requestWriteAccess = dto.requestWriteAccess,
            skipConfirmation = dto.skipConfirmation,
        )
    }

    fun map(dto: TdApi.Game): GameDto {
        return GameDto(
            id = dto.id,
            shortName = dto.shortName,
            title = dto.title,
            text = map(dto.text),
            description = dto.description,
            photo = map(dto.photo),
            animation = dto.animation?.let { map(it) },
        )
    }

    fun map(dto: GameDto): TdApi.Game {
        return TdApi.Game(
            id = dto.id,
            shortName = dto.shortName,
            title = dto.title,
            text = map(dto.text),
            description = dto.description,
            photo = map(dto.photo),
            animation = dto.animation?.let { map(it) },
        )
    }

    fun map(dto: TdApi.GameHighScore): GameHighScoreDto {
        return GameHighScoreDto(
            position = dto.position,
            userId = dto.userId,
            score = dto.score,
        )
    }

    fun map(dto: GameHighScoreDto): TdApi.GameHighScore {
        return TdApi.GameHighScore(
            position = dto.position,
            userId = dto.userId,
            score = dto.score,
        )
    }

    fun map(dto: TdApi.GameHighScores): GameHighScoresDto {
        return GameHighScoresDto(
            scores = dto.scores.mapArray { map(it) },
        )
    }

    fun map(dto: GameHighScoresDto): TdApi.GameHighScores {
        return TdApi.GameHighScores(
            scores = dto.scores.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Gift): GiftDto {
        return GiftDto(
            id = dto.id,
            sticker = map(dto.sticker),
            starCount = dto.starCount,
            defaultSellStarCount = dto.defaultSellStarCount,
            upgradeStarCount = dto.upgradeStarCount,
            isForBirthday = dto.isForBirthday,
            remainingCount = dto.remainingCount,
            totalCount = dto.totalCount,
            firstSendDate = dto.firstSendDate,
            lastSendDate = dto.lastSendDate,
        )
    }

    fun map(dto: GiftDto): TdApi.Gift {
        return TdApi.Gift(
            id = dto.id,
            sticker = map(dto.sticker),
            starCount = dto.starCount,
            defaultSellStarCount = dto.defaultSellStarCount,
            upgradeStarCount = dto.upgradeStarCount,
            isForBirthday = dto.isForBirthday,
            remainingCount = dto.remainingCount,
            totalCount = dto.totalCount,
            firstSendDate = dto.firstSendDate,
            lastSendDate = dto.lastSendDate,
        )
    }

    fun map(dto: TdApi.GiftSettings): GiftSettingsDto {
        return GiftSettingsDto(
            showGiftButton = dto.showGiftButton,
            acceptedGiftTypes = map(dto.acceptedGiftTypes),
        )
    }

    fun map(dto: GiftSettingsDto): TdApi.GiftSettings {
        return TdApi.GiftSettings(
            showGiftButton = dto.showGiftButton,
            acceptedGiftTypes = map(dto.acceptedGiftTypes),
        )
    }

    fun map(dto: TdApi.GiftUpgradePreview): GiftUpgradePreviewDto {
        return GiftUpgradePreviewDto(
            models = dto.models.mapArray { map(it) },
            symbols = dto.symbols.mapArray { map(it) },
            backdrops = dto.backdrops.mapArray { map(it) },
        )
    }

    fun map(dto: GiftUpgradePreviewDto): TdApi.GiftUpgradePreview {
        return TdApi.GiftUpgradePreview(
            models = dto.models.mapArray { map(it) },
            symbols = dto.symbols.mapArray { map(it) },
            backdrops = dto.backdrops.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Gifts): GiftsDto {
        return GiftsDto(
            gifts = dto.gifts.mapArray { map(it) },
        )
    }

    fun map(dto: GiftsDto): TdApi.Gifts {
        return TdApi.Gifts(
            gifts = dto.gifts.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.GiveawayParameters): GiveawayParametersDto {
        return GiveawayParametersDto(
            boostedChatId = dto.boostedChatId,
            additionalChatIds = dto.additionalChatIds,
            winnersSelectionDate = dto.winnersSelectionDate,
            onlyNewMembers = dto.onlyNewMembers,
            hasPublicWinners = dto.hasPublicWinners,
            countryCodes = dto.countryCodes,
            prizeDescription = dto.prizeDescription,
        )
    }

    fun map(dto: GiveawayParametersDto): TdApi.GiveawayParameters {
        return TdApi.GiveawayParameters(
            boostedChatId = dto.boostedChatId,
            additionalChatIds = dto.additionalChatIds,
            winnersSelectionDate = dto.winnersSelectionDate,
            onlyNewMembers = dto.onlyNewMembers,
            hasPublicWinners = dto.hasPublicWinners,
            countryCodes = dto.countryCodes,
            prizeDescription = dto.prizeDescription,
        )
    }

    fun map(dto: TdApi.GroupCall): GroupCallDto {
        return GroupCallDto(
            id = dto.id,
            title = dto.title,
            inviteLink = dto.inviteLink,
            scheduledStartDate = dto.scheduledStartDate,
            enabledStartNotification = dto.enabledStartNotification,
            isActive = dto.isActive,
            isVideoChat = dto.isVideoChat,
            isRtmpStream = dto.isRtmpStream,
            isJoined = dto.isJoined,
            needRejoin = dto.needRejoin,
            isOwned = dto.isOwned,
            canBeManaged = dto.canBeManaged,
            participantCount = dto.participantCount,
            hasHiddenListeners = dto.hasHiddenListeners,
            loadedAllParticipants = dto.loadedAllParticipants,
            recentSpeakers = dto.recentSpeakers.mapArray { map(it) },
            isMyVideoEnabled = dto.isMyVideoEnabled,
            isMyVideoPaused = dto.isMyVideoPaused,
            canEnableVideo = dto.canEnableVideo,
            muteNewParticipants = dto.muteNewParticipants,
            canToggleMuteNewParticipants = dto.canToggleMuteNewParticipants,
            recordDuration = dto.recordDuration,
            isVideoRecorded = dto.isVideoRecorded,
            duration = dto.duration,
        )
    }

    fun map(dto: GroupCallDto): TdApi.GroupCall {
        return TdApi.GroupCall(
            id = dto.id,
            title = dto.title,
            inviteLink = dto.inviteLink,
            scheduledStartDate = dto.scheduledStartDate,
            enabledStartNotification = dto.enabledStartNotification,
            isActive = dto.isActive,
            isVideoChat = dto.isVideoChat,
            isRtmpStream = dto.isRtmpStream,
            isJoined = dto.isJoined,
            needRejoin = dto.needRejoin,
            isOwned = dto.isOwned,
            canBeManaged = dto.canBeManaged,
            participantCount = dto.participantCount,
            hasHiddenListeners = dto.hasHiddenListeners,
            loadedAllParticipants = dto.loadedAllParticipants,
            recentSpeakers = dto.recentSpeakers.mapArray { map(it) },
            isMyVideoEnabled = dto.isMyVideoEnabled,
            isMyVideoPaused = dto.isMyVideoPaused,
            canEnableVideo = dto.canEnableVideo,
            muteNewParticipants = dto.muteNewParticipants,
            canToggleMuteNewParticipants = dto.canToggleMuteNewParticipants,
            recordDuration = dto.recordDuration,
            isVideoRecorded = dto.isVideoRecorded,
            duration = dto.duration,
        )
    }

    fun map(dto: TdApi.GroupCallId): GroupCallIdDto {
        return GroupCallIdDto(
            id = dto.id,
        )
    }

    fun map(dto: GroupCallIdDto): TdApi.GroupCallId {
        return TdApi.GroupCallId(
            id = dto.id,
        )
    }

    fun map(dto: TdApi.GroupCallInfo): GroupCallInfoDto {
        return GroupCallInfoDto(
            groupCallId = dto.groupCallId,
            joinPayload = dto.joinPayload,
        )
    }

    fun map(dto: GroupCallInfoDto): TdApi.GroupCallInfo {
        return TdApi.GroupCallInfo(
            groupCallId = dto.groupCallId,
            joinPayload = dto.joinPayload,
        )
    }

    fun map(dto: TdApi.GroupCallJoinParameters): GroupCallJoinParametersDto {
        return GroupCallJoinParametersDto(
            audioSourceId = dto.audioSourceId,
            payload = dto.payload,
            isMuted = dto.isMuted,
            isMyVideoEnabled = dto.isMyVideoEnabled,
        )
    }

    fun map(dto: GroupCallJoinParametersDto): TdApi.GroupCallJoinParameters {
        return TdApi.GroupCallJoinParameters(
            audioSourceId = dto.audioSourceId,
            payload = dto.payload,
            isMuted = dto.isMuted,
            isMyVideoEnabled = dto.isMyVideoEnabled,
        )
    }

    fun map(dto: TdApi.GroupCallParticipant): GroupCallParticipantDto {
        return GroupCallParticipantDto(
            participantId = map(dto.participantId),
            audioSourceId = dto.audioSourceId,
            screenSharingAudioSourceId = dto.screenSharingAudioSourceId,
            videoInfo = dto.videoInfo?.let { map(it) },
            screenSharingVideoInfo = dto.screenSharingVideoInfo?.let { map(it) },
            bio = dto.bio,
            isCurrentUser = dto.isCurrentUser,
            isSpeaking = dto.isSpeaking,
            isHandRaised = dto.isHandRaised,
            canBeMutedForAllUsers = dto.canBeMutedForAllUsers,
            canBeUnmutedForAllUsers = dto.canBeUnmutedForAllUsers,
            canBeMutedForCurrentUser = dto.canBeMutedForCurrentUser,
            canBeUnmutedForCurrentUser = dto.canBeUnmutedForCurrentUser,
            isMutedForAllUsers = dto.isMutedForAllUsers,
            isMutedForCurrentUser = dto.isMutedForCurrentUser,
            canUnmuteSelf = dto.canUnmuteSelf,
            volumeLevel = dto.volumeLevel,
            order = dto.order,
        )
    }

    fun map(dto: GroupCallParticipantDto): TdApi.GroupCallParticipant {
        return TdApi.GroupCallParticipant(
            participantId = map(dto.participantId),
            audioSourceId = dto.audioSourceId,
            screenSharingAudioSourceId = dto.screenSharingAudioSourceId,
            videoInfo = dto.videoInfo?.let { map(it) },
            screenSharingVideoInfo = dto.screenSharingVideoInfo?.let { map(it) },
            bio = dto.bio,
            isCurrentUser = dto.isCurrentUser,
            isSpeaking = dto.isSpeaking,
            isHandRaised = dto.isHandRaised,
            canBeMutedForAllUsers = dto.canBeMutedForAllUsers,
            canBeUnmutedForAllUsers = dto.canBeUnmutedForAllUsers,
            canBeMutedForCurrentUser = dto.canBeMutedForCurrentUser,
            canBeUnmutedForCurrentUser = dto.canBeUnmutedForCurrentUser,
            isMutedForAllUsers = dto.isMutedForAllUsers,
            isMutedForCurrentUser = dto.isMutedForCurrentUser,
            canUnmuteSelf = dto.canUnmuteSelf,
            volumeLevel = dto.volumeLevel,
            order = dto.order,
        )
    }

    fun map(dto: TdApi.GroupCallParticipantVideoInfo): GroupCallParticipantVideoInfoDto {
        return GroupCallParticipantVideoInfoDto(
            sourceGroups = dto.sourceGroups.mapArray { map(it) },
            endpointId = dto.endpointId,
            isPaused = dto.isPaused,
        )
    }

    fun map(dto: GroupCallParticipantVideoInfoDto): TdApi.GroupCallParticipantVideoInfo {
        return TdApi.GroupCallParticipantVideoInfo(
            sourceGroups = dto.sourceGroups.mapArray { map(it) },
            endpointId = dto.endpointId,
            isPaused = dto.isPaused,
        )
    }

    fun map(dto: TdApi.GroupCallParticipants): GroupCallParticipantsDto {
        return GroupCallParticipantsDto(
            totalCount = dto.totalCount,
            participantIds = dto.participantIds.mapArray { map(it) },
        )
    }

    fun map(dto: GroupCallParticipantsDto): TdApi.GroupCallParticipants {
        return TdApi.GroupCallParticipants(
            totalCount = dto.totalCount,
            participantIds = dto.participantIds.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.GroupCallRecentSpeaker): GroupCallRecentSpeakerDto {
        return GroupCallRecentSpeakerDto(
            participantId = map(dto.participantId),
            isSpeaking = dto.isSpeaking,
        )
    }

    fun map(dto: GroupCallRecentSpeakerDto): TdApi.GroupCallRecentSpeaker {
        return TdApi.GroupCallRecentSpeaker(
            participantId = map(dto.participantId),
            isSpeaking = dto.isSpeaking,
        )
    }

    fun map(dto: TdApi.GroupCallVideoSourceGroup): GroupCallVideoSourceGroupDto {
        return GroupCallVideoSourceGroupDto(
            semantics = dto.semantics,
            sourceIds = dto.sourceIds,
        )
    }

    fun map(dto: GroupCallVideoSourceGroupDto): TdApi.GroupCallVideoSourceGroup {
        return TdApi.GroupCallVideoSourceGroup(
            semantics = dto.semantics,
            sourceIds = dto.sourceIds,
        )
    }

    fun map(dto: TdApi.Hashtags): HashtagsDto {
        return HashtagsDto(
            hashtags = dto.hashtags,
        )
    }

    fun map(dto: HashtagsDto): TdApi.Hashtags {
        return TdApi.Hashtags(
            hashtags = dto.hashtags,
        )
    }

    fun map(dto: TdApi.HttpUrl): HttpUrlDto {
        return HttpUrlDto(
            url = dto.url,
        )
    }

    fun map(dto: HttpUrlDto): TdApi.HttpUrl {
        return TdApi.HttpUrl(
            url = dto.url,
        )
    }

    fun map(dto: TdApi.IdentityDocument): IdentityDocumentDto {
        return IdentityDocumentDto(
            number = dto.number,
            expirationDate = dto.expirationDate?.let { map(it) },
            frontSide = map(dto.frontSide),
            reverseSide = dto.reverseSide?.let { map(it) },
            selfie = dto.selfie?.let { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: IdentityDocumentDto): TdApi.IdentityDocument {
        return TdApi.IdentityDocument(
            number = dto.number,
            expirationDate = dto.expirationDate?.let { map(it) },
            frontSide = map(dto.frontSide),
            reverseSide = dto.reverseSide?.let { map(it) },
            selfie = dto.selfie?.let { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.ImportedContacts): ImportedContactsDto {
        return ImportedContactsDto(
            userIds = dto.userIds,
            importerCount = dto.importerCount,
        )
    }

    fun map(dto: ImportedContactsDto): TdApi.ImportedContacts {
        return TdApi.ImportedContacts(
            userIds = dto.userIds,
            importerCount = dto.importerCount,
        )
    }

    fun map(dto: TdApi.InlineKeyboardButton): InlineKeyboardButtonDto {
        return InlineKeyboardButtonDto(
            text = dto.text,
            type = map(dto.type),
        )
    }

    fun map(dto: InlineKeyboardButtonDto): TdApi.InlineKeyboardButton {
        return TdApi.InlineKeyboardButton(
            text = dto.text,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.InlineQueryResults): InlineQueryResultsDto {
        return InlineQueryResultsDto(
            inlineQueryId = dto.inlineQueryId,
            button = dto.button?.let { map(it) },
            results = dto.results.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: InlineQueryResultsDto): TdApi.InlineQueryResults {
        return TdApi.InlineQueryResults(
            inlineQueryId = dto.inlineQueryId,
            button = dto.button?.let { map(it) },
            results = dto.results.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.InlineQueryResultsButton): InlineQueryResultsButtonDto {
        return InlineQueryResultsButtonDto(
            text = dto.text,
            type = map(dto.type),
        )
    }

    fun map(dto: InlineQueryResultsButtonDto): TdApi.InlineQueryResultsButton {
        return TdApi.InlineQueryResultsButton(
            text = dto.text,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.InputBusinessChatLink): InputBusinessChatLinkDto {
        return InputBusinessChatLinkDto(
            text = map(dto.text),
            title = dto.title,
        )
    }

    fun map(dto: InputBusinessChatLinkDto): TdApi.InputBusinessChatLink {
        return TdApi.InputBusinessChatLink(
            text = map(dto.text),
            title = dto.title,
        )
    }

    fun map(dto: TdApi.InputBusinessStartPage): InputBusinessStartPageDto {
        return InputBusinessStartPageDto(
            title = dto.title,
            message = dto.message,
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: InputBusinessStartPageDto): TdApi.InputBusinessStartPage {
        return TdApi.InputBusinessStartPage(
            title = dto.title,
            message = dto.message,
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: TdApi.InputIdentityDocument): InputIdentityDocumentDto {
        return InputIdentityDocumentDto(
            number = dto.number,
            expirationDate = dto.expirationDate?.let { map(it) },
            frontSide = map(dto.frontSide),
            reverseSide = dto.reverseSide?.let { map(it) },
            selfie = dto.selfie?.let { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: InputIdentityDocumentDto): TdApi.InputIdentityDocument {
        return TdApi.InputIdentityDocument(
            number = dto.number,
            expirationDate = dto.expirationDate?.let { map(it) },
            frontSide = map(dto.frontSide),
            reverseSide = dto.reverseSide?.let { map(it) },
            selfie = dto.selfie?.let { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.InputPaidMedia): InputPaidMediaDto {
        return InputPaidMediaDto(
            type = map(dto.type),
            media = map(dto.media),
            thumbnail = dto.thumbnail?.let { map(it) },
            addedStickerFileIds = dto.addedStickerFileIds,
            width = dto.width,
            height = dto.height,
        )
    }

    fun map(dto: InputPaidMediaDto): TdApi.InputPaidMedia {
        return TdApi.InputPaidMedia(
            type = map(dto.type),
            media = map(dto.media),
            thumbnail = dto.thumbnail?.let { map(it) },
            addedStickerFileIds = dto.addedStickerFileIds,
            width = dto.width,
            height = dto.height,
        )
    }

    fun map(dto: TdApi.InputPassportElementError): InputPassportElementErrorDto {
        return InputPassportElementErrorDto(
            type = map(dto.type),
            message = dto.message,
            source = map(dto.source),
        )
    }

    fun map(dto: InputPassportElementErrorDto): TdApi.InputPassportElementError {
        return TdApi.InputPassportElementError(
            type = map(dto.type),
            message = dto.message,
            source = map(dto.source),
        )
    }

    fun map(dto: TdApi.InputPersonalDocument): InputPersonalDocumentDto {
        return InputPersonalDocumentDto(
            files = dto.files.mapArray { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: InputPersonalDocumentDto): TdApi.InputPersonalDocument {
        return TdApi.InputPersonalDocument(
            files = dto.files.mapArray { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.InputSticker): InputStickerDto {
        return InputStickerDto(
            sticker = map(dto.sticker),
            format = map(dto.format),
            emojis = dto.emojis,
            maskPosition = dto.maskPosition?.let { map(it) },
            keywords = dto.keywords,
        )
    }

    fun map(dto: InputStickerDto): TdApi.InputSticker {
        return TdApi.InputSticker(
            sticker = map(dto.sticker),
            format = map(dto.format),
            emojis = dto.emojis,
            maskPosition = dto.maskPosition?.let { map(it) },
            keywords = dto.keywords,
        )
    }

    fun map(dto: TdApi.InputStoryArea): InputStoryAreaDto {
        return InputStoryAreaDto(
            position = map(dto.position),
            type = map(dto.type),
        )
    }

    fun map(dto: InputStoryAreaDto): TdApi.InputStoryArea {
        return TdApi.InputStoryArea(
            position = map(dto.position),
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.InputStoryAreas): InputStoryAreasDto {
        return InputStoryAreasDto(
            areas = dto.areas.mapArray { map(it) },
        )
    }

    fun map(dto: InputStoryAreasDto): TdApi.InputStoryAreas {
        return TdApi.InputStoryAreas(
            areas = dto.areas.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.InputTextQuote): InputTextQuoteDto {
        return InputTextQuoteDto(
            text = map(dto.text),
            position = dto.position,
        )
    }

    fun map(dto: InputTextQuoteDto): TdApi.InputTextQuote {
        return TdApi.InputTextQuote(
            text = map(dto.text),
            position = dto.position,
        )
    }

    fun map(dto: TdApi.InputThumbnail): InputThumbnailDto {
        return InputThumbnailDto(
            thumbnail = map(dto.thumbnail),
            width = dto.width,
            height = dto.height,
        )
    }

    fun map(dto: InputThumbnailDto): TdApi.InputThumbnail {
        return TdApi.InputThumbnail(
            thumbnail = map(dto.thumbnail),
            width = dto.width,
            height = dto.height,
        )
    }

    fun map(dto: TdApi.Invoice): InvoiceDto {
        return InvoiceDto(
            currency = dto.currency,
            priceParts = dto.priceParts.mapArray { map(it) },
            subscriptionPeriod = dto.subscriptionPeriod,
            maxTipAmount = dto.maxTipAmount,
            suggestedTipAmounts = dto.suggestedTipAmounts,
            recurringPaymentTermsOfServiceUrl = dto.recurringPaymentTermsOfServiceUrl,
            termsOfServiceUrl = dto.termsOfServiceUrl,
            isTest = dto.isTest,
            needName = dto.needName,
            needPhoneNumber = dto.needPhoneNumber,
            needEmailAddress = dto.needEmailAddress,
            needShippingAddress = dto.needShippingAddress,
            sendPhoneNumberToProvider = dto.sendPhoneNumberToProvider,
            sendEmailAddressToProvider = dto.sendEmailAddressToProvider,
            isFlexible = dto.isFlexible,
        )
    }

    fun map(dto: InvoiceDto): TdApi.Invoice {
        return TdApi.Invoice(
            currency = dto.currency,
            priceParts = dto.priceParts.mapArray { map(it) },
            subscriptionPeriod = dto.subscriptionPeriod,
            maxTipAmount = dto.maxTipAmount,
            suggestedTipAmounts = dto.suggestedTipAmounts,
            recurringPaymentTermsOfServiceUrl = dto.recurringPaymentTermsOfServiceUrl,
            termsOfServiceUrl = dto.termsOfServiceUrl,
            isTest = dto.isTest,
            needName = dto.needName,
            needPhoneNumber = dto.needPhoneNumber,
            needEmailAddress = dto.needEmailAddress,
            needShippingAddress = dto.needShippingAddress,
            sendPhoneNumberToProvider = dto.sendPhoneNumberToProvider,
            sendEmailAddressToProvider = dto.sendEmailAddressToProvider,
            isFlexible = dto.isFlexible,
        )
    }

    fun map(dto: TdApi.JsonObjectMember): JsonObjectMemberDto {
        return JsonObjectMemberDto(
            key = dto.key,
            value = map(dto.value),
        )
    }

    fun map(dto: JsonObjectMemberDto): TdApi.JsonObjectMember {
        return TdApi.JsonObjectMember(
            key = dto.key,
            value = map(dto.value),
        )
    }

    fun map(dto: TdApi.KeyboardButton): KeyboardButtonDto {
        return KeyboardButtonDto(
            text = dto.text,
            type = map(dto.type),
        )
    }

    fun map(dto: KeyboardButtonDto): TdApi.KeyboardButton {
        return TdApi.KeyboardButton(
            text = dto.text,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.LabeledPricePart): LabeledPricePartDto {
        return LabeledPricePartDto(
            label = dto.label,
            amount = dto.amount,
        )
    }

    fun map(dto: LabeledPricePartDto): TdApi.LabeledPricePart {
        return TdApi.LabeledPricePart(
            label = dto.label,
            amount = dto.amount,
        )
    }

    fun map(dto: TdApi.LanguagePackInfo): LanguagePackInfoDto {
        return LanguagePackInfoDto(
            id = dto.id,
            baseLanguagePackId = dto.baseLanguagePackId,
            name = dto.name,
            nativeName = dto.nativeName,
            pluralCode = dto.pluralCode,
            isOfficial = dto.isOfficial,
            isRtl = dto.isRtl,
            isBeta = dto.isBeta,
            isInstalled = dto.isInstalled,
            totalStringCount = dto.totalStringCount,
            translatedStringCount = dto.translatedStringCount,
            localStringCount = dto.localStringCount,
            translationUrl = dto.translationUrl,
        )
    }

    fun map(dto: LanguagePackInfoDto): TdApi.LanguagePackInfo {
        return TdApi.LanguagePackInfo(
            id = dto.id,
            baseLanguagePackId = dto.baseLanguagePackId,
            name = dto.name,
            nativeName = dto.nativeName,
            pluralCode = dto.pluralCode,
            isOfficial = dto.isOfficial,
            isRtl = dto.isRtl,
            isBeta = dto.isBeta,
            isInstalled = dto.isInstalled,
            totalStringCount = dto.totalStringCount,
            translatedStringCount = dto.translatedStringCount,
            localStringCount = dto.localStringCount,
            translationUrl = dto.translationUrl,
        )
    }

    fun map(dto: TdApi.LanguagePackString): LanguagePackStringDto {
        return LanguagePackStringDto(
            key = dto.key,
            value = dto.value?.let { map(it) },
        )
    }

    fun map(dto: LanguagePackStringDto): TdApi.LanguagePackString {
        return TdApi.LanguagePackString(
            key = dto.key,
            value = dto.value?.let { map(it) },
        )
    }

    fun map(dto: TdApi.LanguagePackStrings): LanguagePackStringsDto {
        return LanguagePackStringsDto(
            strings = dto.strings.mapArray { map(it) },
        )
    }

    fun map(dto: LanguagePackStringsDto): TdApi.LanguagePackStrings {
        return TdApi.LanguagePackStrings(
            strings = dto.strings.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.LinkPreview): LinkPreviewDto {
        return LinkPreviewDto(
            url = dto.url,
            displayUrl = dto.displayUrl,
            siteName = dto.siteName,
            title = dto.title,
            description = map(dto.description),
            author = dto.author,
            type = map(dto.type),
            hasLargeMedia = dto.hasLargeMedia,
            showLargeMedia = dto.showLargeMedia,
            showMediaAboveDescription = dto.showMediaAboveDescription,
            skipConfirmation = dto.skipConfirmation,
            showAboveText = dto.showAboveText,
            instantViewVersion = dto.instantViewVersion,
        )
    }

    fun map(dto: LinkPreviewDto): TdApi.LinkPreview {
        return TdApi.LinkPreview(
            url = dto.url,
            displayUrl = dto.displayUrl,
            siteName = dto.siteName,
            title = dto.title,
            description = map(dto.description),
            author = dto.author,
            type = map(dto.type),
            hasLargeMedia = dto.hasLargeMedia,
            showLargeMedia = dto.showLargeMedia,
            showMediaAboveDescription = dto.showMediaAboveDescription,
            skipConfirmation = dto.skipConfirmation,
            showAboveText = dto.showAboveText,
            instantViewVersion = dto.instantViewVersion,
        )
    }

    fun map(dto: TdApi.LinkPreviewOptions): LinkPreviewOptionsDto {
        return LinkPreviewOptionsDto(
            isDisabled = dto.isDisabled,
            url = dto.url,
            forceSmallMedia = dto.forceSmallMedia,
            forceLargeMedia = dto.forceLargeMedia,
            showAboveText = dto.showAboveText,
        )
    }

    fun map(dto: LinkPreviewOptionsDto): TdApi.LinkPreviewOptions {
        return TdApi.LinkPreviewOptions(
            isDisabled = dto.isDisabled,
            url = dto.url,
            forceSmallMedia = dto.forceSmallMedia,
            forceLargeMedia = dto.forceLargeMedia,
            showAboveText = dto.showAboveText,
        )
    }

    fun map(dto: TdApi.LocalFile): LocalFileDto {
        return LocalFileDto(
            path = dto.path,
            canBeDownloaded = dto.canBeDownloaded,
            canBeDeleted = dto.canBeDeleted,
            isDownloadingActive = dto.isDownloadingActive,
            isDownloadingCompleted = dto.isDownloadingCompleted,
            downloadOffset = dto.downloadOffset,
            downloadedPrefixSize = dto.downloadedPrefixSize,
            downloadedSize = dto.downloadedSize,
        )
    }

    fun map(dto: LocalFileDto): TdApi.LocalFile {
        return TdApi.LocalFile(
            path = dto.path,
            canBeDownloaded = dto.canBeDownloaded,
            canBeDeleted = dto.canBeDeleted,
            isDownloadingActive = dto.isDownloadingActive,
            isDownloadingCompleted = dto.isDownloadingCompleted,
            downloadOffset = dto.downloadOffset,
            downloadedPrefixSize = dto.downloadedPrefixSize,
            downloadedSize = dto.downloadedSize,
        )
    }

    fun map(dto: TdApi.LocalizationTargetInfo): LocalizationTargetInfoDto {
        return LocalizationTargetInfoDto(
            languagePacks = dto.languagePacks.mapArray { map(it) },
        )
    }

    fun map(dto: LocalizationTargetInfoDto): TdApi.LocalizationTargetInfo {
        return TdApi.LocalizationTargetInfo(
            languagePacks = dto.languagePacks.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Location): LocationDto {
        return LocationDto(
            latitude = dto.latitude,
            longitude = dto.longitude,
            horizontalAccuracy = dto.horizontalAccuracy,
        )
    }

    fun map(dto: LocationDto): TdApi.Location {
        return TdApi.Location(
            latitude = dto.latitude,
            longitude = dto.longitude,
            horizontalAccuracy = dto.horizontalAccuracy,
        )
    }

    fun map(dto: TdApi.LocationAddress): LocationAddressDto {
        return LocationAddressDto(
            countryCode = dto.countryCode,
            state = dto.state,
            city = dto.city,
            street = dto.street,
        )
    }

    fun map(dto: LocationAddressDto): TdApi.LocationAddress {
        return TdApi.LocationAddress(
            countryCode = dto.countryCode,
            state = dto.state,
            city = dto.city,
            street = dto.street,
        )
    }

    fun map(dto: TdApi.LogTags): LogTagsDto {
        return LogTagsDto(
            tags = dto.tags,
        )
    }

    fun map(dto: LogTagsDto): TdApi.LogTags {
        return TdApi.LogTags(
            tags = dto.tags,
        )
    }

    fun map(dto: TdApi.LogVerbosityLevel): LogVerbosityLevelDto {
        return LogVerbosityLevelDto(
            verbosityLevel = dto.verbosityLevel,
        )
    }

    fun map(dto: LogVerbosityLevelDto): TdApi.LogVerbosityLevel {
        return TdApi.LogVerbosityLevel(
            verbosityLevel = dto.verbosityLevel,
        )
    }

    fun map(dto: TdApi.MainWebApp): MainWebAppDto {
        return MainWebAppDto(
            url = dto.url,
            mode = map(dto.mode),
        )
    }

    fun map(dto: MainWebAppDto): TdApi.MainWebApp {
        return TdApi.MainWebApp(
            url = dto.url,
            mode = map(dto.mode),
        )
    }

    fun map(dto: TdApi.MaskPosition): MaskPositionDto {
        return MaskPositionDto(
            point = map(dto.point),
            xShift = dto.xShift,
            yShift = dto.yShift,
            scale = dto.scale,
        )
    }

    fun map(dto: MaskPositionDto): TdApi.MaskPosition {
        return TdApi.MaskPosition(
            point = map(dto.point),
            xShift = dto.xShift,
            yShift = dto.yShift,
            scale = dto.scale,
        )
    }

    fun map(dto: TdApi.Message): MessageDto {
        return MessageDto(
            id = dto.id,
            senderId = map(dto.senderId),
            chatId = dto.chatId,
            sendingState = dto.sendingState?.let { map(it) },
            schedulingState = dto.schedulingState?.let { map(it) },
            isOutgoing = dto.isOutgoing,
            isPinned = dto.isPinned,
            isFromOffline = dto.isFromOffline,
            canBeSaved = dto.canBeSaved,
            hasTimestampedMedia = dto.hasTimestampedMedia,
            isChannelPost = dto.isChannelPost,
            isTopicMessage = dto.isTopicMessage,
            containsUnreadMention = dto.containsUnreadMention,
            date = dto.date,
            editDate = dto.editDate,
            forwardInfo = dto.forwardInfo?.let { map(it) },
            importInfo = dto.importInfo?.let { map(it) },
            interactionInfo = dto.interactionInfo?.let { map(it) },
            unreadReactions = dto.unreadReactions.mapArray { map(it) },
            factCheck = dto.factCheck?.let { map(it) },
            replyTo = dto.replyTo?.let { map(it) },
            messageThreadId = dto.messageThreadId,
            savedMessagesTopicId = dto.savedMessagesTopicId,
            selfDestructType = dto.selfDestructType?.let { map(it) },
            selfDestructIn = dto.selfDestructIn,
            autoDeleteIn = dto.autoDeleteIn,
            viaBotUserId = dto.viaBotUserId,
            senderBusinessBotUserId = dto.senderBusinessBotUserId,
            senderBoostCount = dto.senderBoostCount,
            paidMessageStarCount = dto.paidMessageStarCount,
            authorSignature = dto.authorSignature,
            mediaAlbumId = dto.mediaAlbumId,
            effectId = dto.effectId,
            hasSensitiveContent = dto.hasSensitiveContent,
            restrictionReason = dto.restrictionReason,
            content = map(dto.content),
            replyMarkup = dto.replyMarkup?.let { map(it) },
        )
    }

    fun map(dto: MessageDto): TdApi.Message {
        return TdApi.Message(
            id = dto.id,
            senderId = map(dto.senderId),
            chatId = dto.chatId,
            sendingState = dto.sendingState?.let { map(it) },
            schedulingState = dto.schedulingState?.let { map(it) },
            isOutgoing = dto.isOutgoing,
            isPinned = dto.isPinned,
            isFromOffline = dto.isFromOffline,
            canBeSaved = dto.canBeSaved,
            hasTimestampedMedia = dto.hasTimestampedMedia,
            isChannelPost = dto.isChannelPost,
            isTopicMessage = dto.isTopicMessage,
            containsUnreadMention = dto.containsUnreadMention,
            date = dto.date,
            editDate = dto.editDate,
            forwardInfo = dto.forwardInfo?.let { map(it) },
            importInfo = dto.importInfo?.let { map(it) },
            interactionInfo = dto.interactionInfo?.let { map(it) },
            unreadReactions = dto.unreadReactions.mapArray { map(it) },
            factCheck = dto.factCheck?.let { map(it) },
            replyTo = dto.replyTo?.let { map(it) },
            messageThreadId = dto.messageThreadId,
            savedMessagesTopicId = dto.savedMessagesTopicId,
            selfDestructType = dto.selfDestructType?.let { map(it) },
            selfDestructIn = dto.selfDestructIn,
            autoDeleteIn = dto.autoDeleteIn,
            viaBotUserId = dto.viaBotUserId,
            senderBusinessBotUserId = dto.senderBusinessBotUserId,
            senderBoostCount = dto.senderBoostCount,
            paidMessageStarCount = dto.paidMessageStarCount,
            authorSignature = dto.authorSignature,
            mediaAlbumId = dto.mediaAlbumId,
            effectId = dto.effectId,
            hasSensitiveContent = dto.hasSensitiveContent,
            restrictionReason = dto.restrictionReason,
            content = map(dto.content),
            replyMarkup = dto.replyMarkup?.let { map(it) },
        )
    }

    fun map(dto: TdApi.MessageAutoDeleteTime): MessageAutoDeleteTimeDto {
        return MessageAutoDeleteTimeDto(
            time = dto.time,
        )
    }

    fun map(dto: MessageAutoDeleteTimeDto): TdApi.MessageAutoDeleteTime {
        return TdApi.MessageAutoDeleteTime(
            time = dto.time,
        )
    }

    fun map(dto: TdApi.MessageCalendar): MessageCalendarDto {
        return MessageCalendarDto(
            totalCount = dto.totalCount,
            days = dto.days.mapArray { map(it) },
        )
    }

    fun map(dto: MessageCalendarDto): TdApi.MessageCalendar {
        return TdApi.MessageCalendar(
            totalCount = dto.totalCount,
            days = dto.days.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.MessageCalendarDay): MessageCalendarDayDto {
        return MessageCalendarDayDto(
            totalCount = dto.totalCount,
            message = map(dto.message),
        )
    }

    fun map(dto: MessageCalendarDayDto): TdApi.MessageCalendarDay {
        return TdApi.MessageCalendarDay(
            totalCount = dto.totalCount,
            message = map(dto.message),
        )
    }

    fun map(dto: TdApi.MessageCopyOptions): MessageCopyOptionsDto {
        return MessageCopyOptionsDto(
            sendCopy = dto.sendCopy,
            replaceCaption = dto.replaceCaption,
            newCaption = dto.newCaption?.let { map(it) },
            newShowCaptionAboveMedia = dto.newShowCaptionAboveMedia,
        )
    }

    fun map(dto: MessageCopyOptionsDto): TdApi.MessageCopyOptions {
        return TdApi.MessageCopyOptions(
            sendCopy = dto.sendCopy,
            replaceCaption = dto.replaceCaption,
            newCaption = dto.newCaption?.let { map(it) },
            newShowCaptionAboveMedia = dto.newShowCaptionAboveMedia,
        )
    }

    fun map(dto: TdApi.MessageEffect): MessageEffectDto {
        return MessageEffectDto(
            id = dto.id,
            staticIcon = dto.staticIcon?.let { map(it) },
            emoji = dto.emoji,
            isPremium = dto.isPremium,
            type = map(dto.type),
        )
    }

    fun map(dto: MessageEffectDto): TdApi.MessageEffect {
        return TdApi.MessageEffect(
            id = dto.id,
            staticIcon = dto.staticIcon?.let { map(it) },
            emoji = dto.emoji,
            isPremium = dto.isPremium,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.MessageForwardInfo): MessageForwardInfoDto {
        return MessageForwardInfoDto(
            origin = map(dto.origin),
            date = dto.date,
            source = dto.source?.let { map(it) },
            publicServiceAnnouncementType = dto.publicServiceAnnouncementType,
        )
    }

    fun map(dto: MessageForwardInfoDto): TdApi.MessageForwardInfo {
        return TdApi.MessageForwardInfo(
            origin = map(dto.origin),
            date = dto.date,
            source = dto.source?.let { map(it) },
            publicServiceAnnouncementType = dto.publicServiceAnnouncementType,
        )
    }

    fun map(dto: TdApi.MessageImportInfo): MessageImportInfoDto {
        return MessageImportInfoDto(
            senderName = dto.senderName,
            date = dto.date,
        )
    }

    fun map(dto: MessageImportInfoDto): TdApi.MessageImportInfo {
        return TdApi.MessageImportInfo(
            senderName = dto.senderName,
            date = dto.date,
        )
    }

    fun map(dto: TdApi.MessageInteractionInfo): MessageInteractionInfoDto {
        return MessageInteractionInfoDto(
            viewCount = dto.viewCount,
            forwardCount = dto.forwardCount,
            replyInfo = dto.replyInfo?.let { map(it) },
            reactions = dto.reactions?.let { map(it) },
        )
    }

    fun map(dto: MessageInteractionInfoDto): TdApi.MessageInteractionInfo {
        return TdApi.MessageInteractionInfo(
            viewCount = dto.viewCount,
            forwardCount = dto.forwardCount,
            replyInfo = dto.replyInfo?.let { map(it) },
            reactions = dto.reactions?.let { map(it) },
        )
    }

    fun map(dto: TdApi.MessageLink): MessageLinkDto {
        return MessageLinkDto(
            link = dto.link,
            isPublic = dto.isPublic,
        )
    }

    fun map(dto: MessageLinkDto): TdApi.MessageLink {
        return TdApi.MessageLink(
            link = dto.link,
            isPublic = dto.isPublic,
        )
    }

    fun map(dto: TdApi.MessageLinkInfo): MessageLinkInfoDto {
        return MessageLinkInfoDto(
            isPublic = dto.isPublic,
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            message = dto.message?.let { map(it) },
            mediaTimestamp = dto.mediaTimestamp,
            forAlbum = dto.forAlbum,
        )
    }

    fun map(dto: MessageLinkInfoDto): TdApi.MessageLinkInfo {
        return TdApi.MessageLinkInfo(
            isPublic = dto.isPublic,
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            message = dto.message?.let { map(it) },
            mediaTimestamp = dto.mediaTimestamp,
            forAlbum = dto.forAlbum,
        )
    }

    fun map(dto: TdApi.MessagePosition): MessagePositionDto {
        return MessagePositionDto(
            position = dto.position,
            messageId = dto.messageId,
            date = dto.date,
        )
    }

    fun map(dto: MessagePositionDto): TdApi.MessagePosition {
        return TdApi.MessagePosition(
            position = dto.position,
            messageId = dto.messageId,
            date = dto.date,
        )
    }

    fun map(dto: TdApi.MessagePositions): MessagePositionsDto {
        return MessagePositionsDto(
            totalCount = dto.totalCount,
            positions = dto.positions.mapArray { map(it) },
        )
    }

    fun map(dto: MessagePositionsDto): TdApi.MessagePositions {
        return TdApi.MessagePositions(
            totalCount = dto.totalCount,
            positions = dto.positions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.MessageProperties): MessagePropertiesDto {
        return MessagePropertiesDto(
            canBeCopiedToSecretChat = dto.canBeCopiedToSecretChat,
            canBeDeletedOnlyForSelf = dto.canBeDeletedOnlyForSelf,
            canBeDeletedForAllUsers = dto.canBeDeletedForAllUsers,
            canBeEdited = dto.canBeEdited,
            canBeForwarded = dto.canBeForwarded,
            canBePaid = dto.canBePaid,
            canBePinned = dto.canBePinned,
            canBeReplied = dto.canBeReplied,
            canBeRepliedInAnotherChat = dto.canBeRepliedInAnotherChat,
            canBeSaved = dto.canBeSaved,
            canBeSharedInStory = dto.canBeSharedInStory,
            canEditMedia = dto.canEditMedia,
            canEditSchedulingState = dto.canEditSchedulingState,
            canGetEmbeddingCode = dto.canGetEmbeddingCode,
            canGetLink = dto.canGetLink,
            canGetMediaTimestampLinks = dto.canGetMediaTimestampLinks,
            canGetMessageThread = dto.canGetMessageThread,
            canGetReadDate = dto.canGetReadDate,
            canGetStatistics = dto.canGetStatistics,
            canGetViewers = dto.canGetViewers,
            canRecognizeSpeech = dto.canRecognizeSpeech,
            canReportChat = dto.canReportChat,
            canReportReactions = dto.canReportReactions,
            canReportSupergroupSpam = dto.canReportSupergroupSpam,
            canSetFactCheck = dto.canSetFactCheck,
            needShowStatistics = dto.needShowStatistics,
        )
    }

    fun map(dto: MessagePropertiesDto): TdApi.MessageProperties {
        return TdApi.MessageProperties(
            canBeCopiedToSecretChat = dto.canBeCopiedToSecretChat,
            canBeDeletedOnlyForSelf = dto.canBeDeletedOnlyForSelf,
            canBeDeletedForAllUsers = dto.canBeDeletedForAllUsers,
            canBeEdited = dto.canBeEdited,
            canBeForwarded = dto.canBeForwarded,
            canBePaid = dto.canBePaid,
            canBePinned = dto.canBePinned,
            canBeReplied = dto.canBeReplied,
            canBeRepliedInAnotherChat = dto.canBeRepliedInAnotherChat,
            canBeSaved = dto.canBeSaved,
            canBeSharedInStory = dto.canBeSharedInStory,
            canEditMedia = dto.canEditMedia,
            canEditSchedulingState = dto.canEditSchedulingState,
            canGetEmbeddingCode = dto.canGetEmbeddingCode,
            canGetLink = dto.canGetLink,
            canGetMediaTimestampLinks = dto.canGetMediaTimestampLinks,
            canGetMessageThread = dto.canGetMessageThread,
            canGetReadDate = dto.canGetReadDate,
            canGetStatistics = dto.canGetStatistics,
            canGetViewers = dto.canGetViewers,
            canRecognizeSpeech = dto.canRecognizeSpeech,
            canReportChat = dto.canReportChat,
            canReportReactions = dto.canReportReactions,
            canReportSupergroupSpam = dto.canReportSupergroupSpam,
            canSetFactCheck = dto.canSetFactCheck,
            needShowStatistics = dto.needShowStatistics,
        )
    }

    fun map(dto: TdApi.MessageReaction): MessageReactionDto {
        return MessageReactionDto(
            type = map(dto.type),
            totalCount = dto.totalCount,
            isChosen = dto.isChosen,
            usedSenderId = dto.usedSenderId?.let { map(it) },
            recentSenderIds = dto.recentSenderIds.mapArray { map(it) },
        )
    }

    fun map(dto: MessageReactionDto): TdApi.MessageReaction {
        return TdApi.MessageReaction(
            type = map(dto.type),
            totalCount = dto.totalCount,
            isChosen = dto.isChosen,
            usedSenderId = dto.usedSenderId?.let { map(it) },
            recentSenderIds = dto.recentSenderIds.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.MessageReactions): MessageReactionsDto {
        return MessageReactionsDto(
            reactions = dto.reactions.mapArray { map(it) },
            areTags = dto.areTags,
            paidReactors = dto.paidReactors.mapArray { map(it) },
            canGetAddedReactions = dto.canGetAddedReactions,
        )
    }

    fun map(dto: MessageReactionsDto): TdApi.MessageReactions {
        return TdApi.MessageReactions(
            reactions = dto.reactions.mapArray { map(it) },
            areTags = dto.areTags,
            paidReactors = dto.paidReactors.mapArray { map(it) },
            canGetAddedReactions = dto.canGetAddedReactions,
        )
    }

    fun map(dto: TdApi.MessageReplyInfo): MessageReplyInfoDto {
        return MessageReplyInfoDto(
            replyCount = dto.replyCount,
            recentReplierIds = dto.recentReplierIds.mapArray { map(it) },
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            lastMessageId = dto.lastMessageId,
        )
    }

    fun map(dto: MessageReplyInfoDto): TdApi.MessageReplyInfo {
        return TdApi.MessageReplyInfo(
            replyCount = dto.replyCount,
            recentReplierIds = dto.recentReplierIds.mapArray { map(it) },
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            lastMessageId = dto.lastMessageId,
        )
    }

    fun map(dto: TdApi.MessageSendOptions): MessageSendOptionsDto {
        return MessageSendOptionsDto(
            disableNotification = dto.disableNotification,
            fromBackground = dto.fromBackground,
            protectContent = dto.protectContent,
            allowPaidBroadcast = dto.allowPaidBroadcast,
            paidMessageStarCount = dto.paidMessageStarCount,
            updateOrderOfInstalledStickerSets = dto.updateOrderOfInstalledStickerSets,
            schedulingState = dto.schedulingState?.let { map(it) },
            effectId = dto.effectId,
            sendingId = dto.sendingId,
            onlyPreview = dto.onlyPreview,
        )
    }

    fun map(dto: MessageSendOptionsDto): TdApi.MessageSendOptions {
        return TdApi.MessageSendOptions(
            disableNotification = dto.disableNotification,
            fromBackground = dto.fromBackground,
            protectContent = dto.protectContent,
            allowPaidBroadcast = dto.allowPaidBroadcast,
            paidMessageStarCount = dto.paidMessageStarCount,
            updateOrderOfInstalledStickerSets = dto.updateOrderOfInstalledStickerSets,
            schedulingState = dto.schedulingState?.let { map(it) },
            effectId = dto.effectId,
            sendingId = dto.sendingId,
            onlyPreview = dto.onlyPreview,
        )
    }

    fun map(dto: TdApi.MessageSenders): MessageSendersDto {
        return MessageSendersDto(
            totalCount = dto.totalCount,
            senders = dto.senders.mapArray { map(it) },
        )
    }

    fun map(dto: MessageSendersDto): TdApi.MessageSenders {
        return TdApi.MessageSenders(
            totalCount = dto.totalCount,
            senders = dto.senders.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.MessageSponsor): MessageSponsorDto {
        return MessageSponsorDto(
            url = dto.url,
            photo = dto.photo?.let { map(it) },
            info = dto.info,
        )
    }

    fun map(dto: MessageSponsorDto): TdApi.MessageSponsor {
        return TdApi.MessageSponsor(
            url = dto.url,
            photo = dto.photo?.let { map(it) },
            info = dto.info,
        )
    }

    fun map(dto: TdApi.MessageStatistics): MessageStatisticsDto {
        return MessageStatisticsDto(
            messageInteractionGraph = map(dto.messageInteractionGraph),
            messageReactionGraph = map(dto.messageReactionGraph),
        )
    }

    fun map(dto: MessageStatisticsDto): TdApi.MessageStatistics {
        return TdApi.MessageStatistics(
            messageInteractionGraph = map(dto.messageInteractionGraph),
            messageReactionGraph = map(dto.messageReactionGraph),
        )
    }

    fun map(dto: TdApi.MessageThreadInfo): MessageThreadInfoDto {
        return MessageThreadInfoDto(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            replyInfo = dto.replyInfo?.let { map(it) },
            unreadMessageCount = dto.unreadMessageCount,
            messages = dto.messages.mapArray { map(it) },
            draftMessage = dto.draftMessage?.let { map(it) },
        )
    }

    fun map(dto: MessageThreadInfoDto): TdApi.MessageThreadInfo {
        return TdApi.MessageThreadInfo(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            replyInfo = dto.replyInfo?.let { map(it) },
            unreadMessageCount = dto.unreadMessageCount,
            messages = dto.messages.mapArray { map(it) },
            draftMessage = dto.draftMessage?.let { map(it) },
        )
    }

    fun map(dto: TdApi.MessageViewer): MessageViewerDto {
        return MessageViewerDto(
            userId = dto.userId,
            viewDate = dto.viewDate,
        )
    }

    fun map(dto: MessageViewerDto): TdApi.MessageViewer {
        return TdApi.MessageViewer(
            userId = dto.userId,
            viewDate = dto.viewDate,
        )
    }

    fun map(dto: TdApi.MessageViewers): MessageViewersDto {
        return MessageViewersDto(
            viewers = dto.viewers.mapArray { map(it) },
        )
    }

    fun map(dto: MessageViewersDto): TdApi.MessageViewers {
        return TdApi.MessageViewers(
            viewers = dto.viewers.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Messages): MessagesDto {
        return MessagesDto(
            totalCount = dto.totalCount,
            messages = dto.messages?.mapArray { map(it) },
        )
    }

    fun map(dto: MessagesDto): TdApi.Messages {
        return TdApi.Messages(
            totalCount = dto.totalCount,
            messages = dto.messages?.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Minithumbnail): MinithumbnailDto {
        return MinithumbnailDto(
            width = dto.width,
            height = dto.height,
            data = dto.data,
        )
    }

    fun map(dto: MinithumbnailDto): TdApi.Minithumbnail {
        return TdApi.Minithumbnail(
            width = dto.width,
            height = dto.height,
            data = dto.data,
        )
    }

    fun map(dto: TdApi.NetworkStatistics): NetworkStatisticsDto {
        return NetworkStatisticsDto(
            sinceDate = dto.sinceDate,
            entries = dto.entries.mapArray { map(it) },
        )
    }

    fun map(dto: NetworkStatisticsDto): TdApi.NetworkStatistics {
        return TdApi.NetworkStatistics(
            sinceDate = dto.sinceDate,
            entries = dto.entries.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.NewChatPrivacySettings): NewChatPrivacySettingsDto {
        return NewChatPrivacySettingsDto(
            allowNewChatsFromUnknownUsers = dto.allowNewChatsFromUnknownUsers,
            incomingPaidMessageStarCount = dto.incomingPaidMessageStarCount,
        )
    }

    fun map(dto: NewChatPrivacySettingsDto): TdApi.NewChatPrivacySettings {
        return TdApi.NewChatPrivacySettings(
            allowNewChatsFromUnknownUsers = dto.allowNewChatsFromUnknownUsers,
            incomingPaidMessageStarCount = dto.incomingPaidMessageStarCount,
        )
    }

    fun map(dto: TdApi.Notification): NotificationDto {
        return NotificationDto(
            id = dto.id,
            date = dto.date,
            isSilent = dto.isSilent,
            type = map(dto.type),
        )
    }

    fun map(dto: NotificationDto): TdApi.Notification {
        return TdApi.Notification(
            id = dto.id,
            date = dto.date,
            isSilent = dto.isSilent,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.NotificationGroup): NotificationGroupDto {
        return NotificationGroupDto(
            id = dto.id,
            type = map(dto.type),
            chatId = dto.chatId,
            totalCount = dto.totalCount,
            notifications = dto.notifications.mapArray { map(it) },
        )
    }

    fun map(dto: NotificationGroupDto): TdApi.NotificationGroup {
        return TdApi.NotificationGroup(
            id = dto.id,
            type = map(dto.type),
            chatId = dto.chatId,
            totalCount = dto.totalCount,
            notifications = dto.notifications.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.NotificationSound): NotificationSoundDto {
        return NotificationSoundDto(
            id = dto.id,
            duration = dto.duration,
            date = dto.date,
            title = dto.title,
            data = dto.data,
            sound = map(dto.sound),
        )
    }

    fun map(dto: NotificationSoundDto): TdApi.NotificationSound {
        return TdApi.NotificationSound(
            id = dto.id,
            duration = dto.duration,
            date = dto.date,
            title = dto.title,
            data = dto.data,
            sound = map(dto.sound),
        )
    }

    fun map(dto: TdApi.NotificationSounds): NotificationSoundsDto {
        return NotificationSoundsDto(
            notificationSounds = dto.notificationSounds.mapArray { map(it) },
        )
    }

    fun map(dto: NotificationSoundsDto): TdApi.NotificationSounds {
        return TdApi.NotificationSounds(
            notificationSounds = dto.notificationSounds.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Ok): OkDto {
        return OkDto(
        )
    }

    fun map(dto: OkDto): TdApi.Ok {
        return TdApi.Ok(
        )
    }

    fun map(dto: TdApi.OrderInfo): OrderInfoDto {
        return OrderInfoDto(
            name = dto.name,
            phoneNumber = dto.phoneNumber,
            emailAddress = dto.emailAddress,
            shippingAddress = dto.shippingAddress?.let { map(it) },
        )
    }

    fun map(dto: OrderInfoDto): TdApi.OrderInfo {
        return TdApi.OrderInfo(
            name = dto.name,
            phoneNumber = dto.phoneNumber,
            emailAddress = dto.emailAddress,
            shippingAddress = dto.shippingAddress?.let { map(it) },
        )
    }

    fun map(dto: TdApi.Outline): OutlineDto {
        return OutlineDto(
            paths = dto.paths.mapArray { map(it) },
        )
    }

    fun map(dto: OutlineDto): TdApi.Outline {
        return TdApi.Outline(
            paths = dto.paths.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PageBlockCaption): PageBlockCaptionDto {
        return PageBlockCaptionDto(
            text = map(dto.text),
            credit = map(dto.credit),
        )
    }

    fun map(dto: PageBlockCaptionDto): TdApi.PageBlockCaption {
        return TdApi.PageBlockCaption(
            text = map(dto.text),
            credit = map(dto.credit),
        )
    }

    fun map(dto: TdApi.PageBlockListItem): PageBlockListItemDto {
        return PageBlockListItemDto(
            label = dto.label,
            pageBlocks = dto.pageBlocks.mapArray { map(it) },
        )
    }

    fun map(dto: PageBlockListItemDto): TdApi.PageBlockListItem {
        return TdApi.PageBlockListItem(
            label = dto.label,
            pageBlocks = dto.pageBlocks.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PageBlockRelatedArticle): PageBlockRelatedArticleDto {
        return PageBlockRelatedArticleDto(
            url = dto.url,
            title = dto.title,
            description = dto.description,
            photo = dto.photo?.let { map(it) },
            author = dto.author,
            publishDate = dto.publishDate,
        )
    }

    fun map(dto: PageBlockRelatedArticleDto): TdApi.PageBlockRelatedArticle {
        return TdApi.PageBlockRelatedArticle(
            url = dto.url,
            title = dto.title,
            description = dto.description,
            photo = dto.photo?.let { map(it) },
            author = dto.author,
            publishDate = dto.publishDate,
        )
    }

    fun map(dto: TdApi.PageBlockTableCell): PageBlockTableCellDto {
        return PageBlockTableCellDto(
            text = dto.text?.let { map(it) },
            isHeader = dto.isHeader,
            colspan = dto.colspan,
            rowspan = dto.rowspan,
            align = map(dto.align),
            valign = map(dto.valign),
        )
    }

    fun map(dto: PageBlockTableCellDto): TdApi.PageBlockTableCell {
        return TdApi.PageBlockTableCell(
            text = dto.text?.let { map(it) },
            isHeader = dto.isHeader,
            colspan = dto.colspan,
            rowspan = dto.rowspan,
            align = map(dto.align),
            valign = map(dto.valign),
        )
    }

    fun map(dto: TdApi.PaidReactor): PaidReactorDto {
        return PaidReactorDto(
            senderId = dto.senderId?.let { map(it) },
            starCount = dto.starCount,
            isTop = dto.isTop,
            isMe = dto.isMe,
            isAnonymous = dto.isAnonymous,
        )
    }

    fun map(dto: PaidReactorDto): TdApi.PaidReactor {
        return TdApi.PaidReactor(
            senderId = dto.senderId?.let { map(it) },
            starCount = dto.starCount,
            isTop = dto.isTop,
            isMe = dto.isMe,
            isAnonymous = dto.isAnonymous,
        )
    }

    fun map(dto: TdApi.PassportAuthorizationForm): PassportAuthorizationFormDto {
        return PassportAuthorizationFormDto(
            id = dto.id,
            requiredElements = dto.requiredElements.mapArray { map(it) },
            privacyPolicyUrl = dto.privacyPolicyUrl,
        )
    }

    fun map(dto: PassportAuthorizationFormDto): TdApi.PassportAuthorizationForm {
        return TdApi.PassportAuthorizationForm(
            id = dto.id,
            requiredElements = dto.requiredElements.mapArray { map(it) },
            privacyPolicyUrl = dto.privacyPolicyUrl,
        )
    }

    fun map(dto: TdApi.PassportElementError): PassportElementErrorDto {
        return PassportElementErrorDto(
            type = map(dto.type),
            message = dto.message,
            source = map(dto.source),
        )
    }

    fun map(dto: PassportElementErrorDto): TdApi.PassportElementError {
        return TdApi.PassportElementError(
            type = map(dto.type),
            message = dto.message,
            source = map(dto.source),
        )
    }

    fun map(dto: TdApi.PassportElements): PassportElementsDto {
        return PassportElementsDto(
            elements = dto.elements.mapArray { map(it) },
        )
    }

    fun map(dto: PassportElementsDto): TdApi.PassportElements {
        return TdApi.PassportElements(
            elements = dto.elements.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PassportElementsWithErrors): PassportElementsWithErrorsDto {
        return PassportElementsWithErrorsDto(
            elements = dto.elements.mapArray { map(it) },
            errors = dto.errors.mapArray { map(it) },
        )
    }

    fun map(dto: PassportElementsWithErrorsDto): TdApi.PassportElementsWithErrors {
        return TdApi.PassportElementsWithErrors(
            elements = dto.elements.mapArray { map(it) },
            errors = dto.errors.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PassportRequiredElement): PassportRequiredElementDto {
        return PassportRequiredElementDto(
            suitableElements = dto.suitableElements.mapArray { map(it) },
        )
    }

    fun map(dto: PassportRequiredElementDto): TdApi.PassportRequiredElement {
        return TdApi.PassportRequiredElement(
            suitableElements = dto.suitableElements.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PassportSuitableElement): PassportSuitableElementDto {
        return PassportSuitableElementDto(
            type = map(dto.type),
            isSelfieRequired = dto.isSelfieRequired,
            isTranslationRequired = dto.isTranslationRequired,
            isNativeNameRequired = dto.isNativeNameRequired,
        )
    }

    fun map(dto: PassportSuitableElementDto): TdApi.PassportSuitableElement {
        return TdApi.PassportSuitableElement(
            type = map(dto.type),
            isSelfieRequired = dto.isSelfieRequired,
            isTranslationRequired = dto.isTranslationRequired,
            isNativeNameRequired = dto.isNativeNameRequired,
        )
    }

    fun map(dto: TdApi.PasswordState): PasswordStateDto {
        return PasswordStateDto(
            hasPassword = dto.hasPassword,
            passwordHint = dto.passwordHint,
            hasRecoveryEmailAddress = dto.hasRecoveryEmailAddress,
            hasPassportData = dto.hasPassportData,
            recoveryEmailAddressCodeInfo = dto.recoveryEmailAddressCodeInfo?.let { map(it) },
            loginEmailAddressPattern = dto.loginEmailAddressPattern,
            pendingResetDate = dto.pendingResetDate,
        )
    }

    fun map(dto: PasswordStateDto): TdApi.PasswordState {
        return TdApi.PasswordState(
            hasPassword = dto.hasPassword,
            passwordHint = dto.passwordHint,
            hasRecoveryEmailAddress = dto.hasRecoveryEmailAddress,
            hasPassportData = dto.hasPassportData,
            recoveryEmailAddressCodeInfo = dto.recoveryEmailAddressCodeInfo?.let { map(it) },
            loginEmailAddressPattern = dto.loginEmailAddressPattern,
            pendingResetDate = dto.pendingResetDate,
        )
    }

    fun map(dto: TdApi.PaymentForm): PaymentFormDto {
        return PaymentFormDto(
            id = dto.id,
            type = map(dto.type),
            sellerBotUserId = dto.sellerBotUserId,
            productInfo = map(dto.productInfo),
        )
    }

    fun map(dto: PaymentFormDto): TdApi.PaymentForm {
        return TdApi.PaymentForm(
            id = dto.id,
            type = map(dto.type),
            sellerBotUserId = dto.sellerBotUserId,
            productInfo = map(dto.productInfo),
        )
    }

    fun map(dto: TdApi.PaymentOption): PaymentOptionDto {
        return PaymentOptionDto(
            title = dto.title,
            url = dto.url,
        )
    }

    fun map(dto: PaymentOptionDto): TdApi.PaymentOption {
        return TdApi.PaymentOption(
            title = dto.title,
            url = dto.url,
        )
    }

    fun map(dto: TdApi.PaymentReceipt): PaymentReceiptDto {
        return PaymentReceiptDto(
            productInfo = map(dto.productInfo),
            date = dto.date,
            sellerBotUserId = dto.sellerBotUserId,
            type = map(dto.type),
        )
    }

    fun map(dto: PaymentReceiptDto): TdApi.PaymentReceipt {
        return TdApi.PaymentReceipt(
            productInfo = map(dto.productInfo),
            date = dto.date,
            sellerBotUserId = dto.sellerBotUserId,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.PaymentResult): PaymentResultDto {
        return PaymentResultDto(
            success = dto.success,
            verificationUrl = dto.verificationUrl,
        )
    }

    fun map(dto: PaymentResultDto): TdApi.PaymentResult {
        return TdApi.PaymentResult(
            success = dto.success,
            verificationUrl = dto.verificationUrl,
        )
    }

    fun map(dto: TdApi.PersonalDetails): PersonalDetailsDto {
        return PersonalDetailsDto(
            firstName = dto.firstName,
            middleName = dto.middleName,
            lastName = dto.lastName,
            nativeFirstName = dto.nativeFirstName,
            nativeMiddleName = dto.nativeMiddleName,
            nativeLastName = dto.nativeLastName,
            birthdate = map(dto.birthdate),
            gender = dto.gender,
            countryCode = dto.countryCode,
            residenceCountryCode = dto.residenceCountryCode,
        )
    }

    fun map(dto: PersonalDetailsDto): TdApi.PersonalDetails {
        return TdApi.PersonalDetails(
            firstName = dto.firstName,
            middleName = dto.middleName,
            lastName = dto.lastName,
            nativeFirstName = dto.nativeFirstName,
            nativeMiddleName = dto.nativeMiddleName,
            nativeLastName = dto.nativeLastName,
            birthdate = map(dto.birthdate),
            gender = dto.gender,
            countryCode = dto.countryCode,
            residenceCountryCode = dto.residenceCountryCode,
        )
    }

    fun map(dto: TdApi.PersonalDocument): PersonalDocumentDto {
        return PersonalDocumentDto(
            files = dto.files.mapArray { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: PersonalDocumentDto): TdApi.PersonalDocument {
        return TdApi.PersonalDocument(
            files = dto.files.mapArray { map(it) },
            translation = dto.translation.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PhoneNumberAuthenticationSettings): PhoneNumberAuthenticationSettingsDto {
        return PhoneNumberAuthenticationSettingsDto(
            allowFlashCall = dto.allowFlashCall,
            allowMissedCall = dto.allowMissedCall,
            isCurrentPhoneNumber = dto.isCurrentPhoneNumber,
            hasUnknownPhoneNumber = dto.hasUnknownPhoneNumber,
            allowSmsRetrieverApi = dto.allowSmsRetrieverApi,
            firebaseAuthenticationSettings = dto.firebaseAuthenticationSettings?.let { map(it) },
            authenticationTokens = dto.authenticationTokens,
        )
    }

    fun map(dto: PhoneNumberAuthenticationSettingsDto): TdApi.PhoneNumberAuthenticationSettings {
        return TdApi.PhoneNumberAuthenticationSettings(
            allowFlashCall = dto.allowFlashCall,
            allowMissedCall = dto.allowMissedCall,
            isCurrentPhoneNumber = dto.isCurrentPhoneNumber,
            hasUnknownPhoneNumber = dto.hasUnknownPhoneNumber,
            allowSmsRetrieverApi = dto.allowSmsRetrieverApi,
            firebaseAuthenticationSettings = dto.firebaseAuthenticationSettings?.let { map(it) },
            authenticationTokens = dto.authenticationTokens,
        )
    }

    fun map(dto: TdApi.PhoneNumberInfo): PhoneNumberInfoDto {
        return PhoneNumberInfoDto(
            country = dto.country?.let { map(it) },
            countryCallingCode = dto.countryCallingCode,
            formattedPhoneNumber = dto.formattedPhoneNumber,
            isAnonymous = dto.isAnonymous,
        )
    }

    fun map(dto: PhoneNumberInfoDto): TdApi.PhoneNumberInfo {
        return TdApi.PhoneNumberInfo(
            country = dto.country?.let { map(it) },
            countryCallingCode = dto.countryCallingCode,
            formattedPhoneNumber = dto.formattedPhoneNumber,
            isAnonymous = dto.isAnonymous,
        )
    }

    fun map(dto: TdApi.Photo): PhotoDto {
        return PhotoDto(
            hasStickers = dto.hasStickers,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            sizes = dto.sizes.mapArray { map(it) },
        )
    }

    fun map(dto: PhotoDto): TdApi.Photo {
        return TdApi.Photo(
            hasStickers = dto.hasStickers,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            sizes = dto.sizes.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PhotoSize): PhotoSizeDto {
        return PhotoSizeDto(
            type = dto.type,
            photo = map(dto.photo),
            width = dto.width,
            height = dto.height,
            progressiveSizes = dto.progressiveSizes,
        )
    }

    fun map(dto: PhotoSizeDto): TdApi.PhotoSize {
        return TdApi.PhotoSize(
            type = dto.type,
            photo = map(dto.photo),
            width = dto.width,
            height = dto.height,
            progressiveSizes = dto.progressiveSizes,
        )
    }

    fun map(dto: TdApi.Point): PointDto {
        return PointDto(
            x = dto.x,
            y = dto.y,
        )
    }

    fun map(dto: PointDto): TdApi.Point {
        return TdApi.Point(
            x = dto.x,
            y = dto.y,
        )
    }

    fun map(dto: TdApi.Poll): PollDto {
        return PollDto(
            id = dto.id,
            question = map(dto.question),
            options = dto.options.mapArray { map(it) },
            totalVoterCount = dto.totalVoterCount,
            recentVoterIds = dto.recentVoterIds.mapArray { map(it) },
            isAnonymous = dto.isAnonymous,
            type = map(dto.type),
            openPeriod = dto.openPeriod,
            closeDate = dto.closeDate,
            isClosed = dto.isClosed,
        )
    }

    fun map(dto: PollDto): TdApi.Poll {
        return TdApi.Poll(
            id = dto.id,
            question = map(dto.question),
            options = dto.options.mapArray { map(it) },
            totalVoterCount = dto.totalVoterCount,
            recentVoterIds = dto.recentVoterIds.mapArray { map(it) },
            isAnonymous = dto.isAnonymous,
            type = map(dto.type),
            openPeriod = dto.openPeriod,
            closeDate = dto.closeDate,
            isClosed = dto.isClosed,
        )
    }

    fun map(dto: TdApi.PollOption): PollOptionDto {
        return PollOptionDto(
            text = map(dto.text),
            voterCount = dto.voterCount,
            votePercentage = dto.votePercentage,
            isChosen = dto.isChosen,
            isBeingChosen = dto.isBeingChosen,
        )
    }

    fun map(dto: PollOptionDto): TdApi.PollOption {
        return TdApi.PollOption(
            text = map(dto.text),
            voterCount = dto.voterCount,
            votePercentage = dto.votePercentage,
            isChosen = dto.isChosen,
            isBeingChosen = dto.isBeingChosen,
        )
    }

    fun map(dto: TdApi.PremiumFeaturePromotionAnimation): PremiumFeaturePromotionAnimationDto {
        return PremiumFeaturePromotionAnimationDto(
            feature = map(dto.feature),
            animation = map(dto.animation),
        )
    }

    fun map(dto: PremiumFeaturePromotionAnimationDto): TdApi.PremiumFeaturePromotionAnimation {
        return TdApi.PremiumFeaturePromotionAnimation(
            feature = map(dto.feature),
            animation = map(dto.animation),
        )
    }

    fun map(dto: TdApi.PremiumFeatures): PremiumFeaturesDto {
        return PremiumFeaturesDto(
            features = dto.features.mapArray { map(it) },
            limits = dto.limits.mapArray { map(it) },
            paymentLink = dto.paymentLink?.let { map(it) },
        )
    }

    fun map(dto: PremiumFeaturesDto): TdApi.PremiumFeatures {
        return TdApi.PremiumFeatures(
            features = dto.features.mapArray { map(it) },
            limits = dto.limits.mapArray { map(it) },
            paymentLink = dto.paymentLink?.let { map(it) },
        )
    }

    fun map(dto: TdApi.PremiumGiftCodeInfo): PremiumGiftCodeInfoDto {
        return PremiumGiftCodeInfoDto(
            creatorId = dto.creatorId?.let { map(it) },
            creationDate = dto.creationDate,
            isFromGiveaway = dto.isFromGiveaway,
            giveawayMessageId = dto.giveawayMessageId,
            monthCount = dto.monthCount,
            userId = dto.userId,
            useDate = dto.useDate,
        )
    }

    fun map(dto: PremiumGiftCodeInfoDto): TdApi.PremiumGiftCodeInfo {
        return TdApi.PremiumGiftCodeInfo(
            creatorId = dto.creatorId?.let { map(it) },
            creationDate = dto.creationDate,
            isFromGiveaway = dto.isFromGiveaway,
            giveawayMessageId = dto.giveawayMessageId,
            monthCount = dto.monthCount,
            userId = dto.userId,
            useDate = dto.useDate,
        )
    }

    fun map(dto: TdApi.PremiumGiftPaymentOption): PremiumGiftPaymentOptionDto {
        return PremiumGiftPaymentOptionDto(
            currency = dto.currency,
            amount = dto.amount,
            starCount = dto.starCount,
            discountPercentage = dto.discountPercentage,
            monthCount = dto.monthCount,
            storeProductId = dto.storeProductId,
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: PremiumGiftPaymentOptionDto): TdApi.PremiumGiftPaymentOption {
        return TdApi.PremiumGiftPaymentOption(
            currency = dto.currency,
            amount = dto.amount,
            starCount = dto.starCount,
            discountPercentage = dto.discountPercentage,
            monthCount = dto.monthCount,
            storeProductId = dto.storeProductId,
            sticker = dto.sticker?.let { map(it) },
        )
    }

    fun map(dto: TdApi.PremiumGiftPaymentOptions): PremiumGiftPaymentOptionsDto {
        return PremiumGiftPaymentOptionsDto(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: PremiumGiftPaymentOptionsDto): TdApi.PremiumGiftPaymentOptions {
        return TdApi.PremiumGiftPaymentOptions(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PremiumGiveawayPaymentOption): PremiumGiveawayPaymentOptionDto {
        return PremiumGiveawayPaymentOptionDto(
            currency = dto.currency,
            amount = dto.amount,
            winnerCount = dto.winnerCount,
            monthCount = dto.monthCount,
            storeProductId = dto.storeProductId,
            storeProductQuantity = dto.storeProductQuantity,
        )
    }

    fun map(dto: PremiumGiveawayPaymentOptionDto): TdApi.PremiumGiveawayPaymentOption {
        return TdApi.PremiumGiveawayPaymentOption(
            currency = dto.currency,
            amount = dto.amount,
            winnerCount = dto.winnerCount,
            monthCount = dto.monthCount,
            storeProductId = dto.storeProductId,
            storeProductQuantity = dto.storeProductQuantity,
        )
    }

    fun map(dto: TdApi.PremiumGiveawayPaymentOptions): PremiumGiveawayPaymentOptionsDto {
        return PremiumGiveawayPaymentOptionsDto(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: PremiumGiveawayPaymentOptionsDto): TdApi.PremiumGiveawayPaymentOptions {
        return TdApi.PremiumGiveawayPaymentOptions(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PremiumLimit): PremiumLimitDto {
        return PremiumLimitDto(
            type = map(dto.type),
            defaultValue = dto.defaultValue,
            premiumValue = dto.premiumValue,
        )
    }

    fun map(dto: PremiumLimitDto): TdApi.PremiumLimit {
        return TdApi.PremiumLimit(
            type = map(dto.type),
            defaultValue = dto.defaultValue,
            premiumValue = dto.premiumValue,
        )
    }

    fun map(dto: TdApi.PremiumPaymentOption): PremiumPaymentOptionDto {
        return PremiumPaymentOptionDto(
            currency = dto.currency,
            amount = dto.amount,
            discountPercentage = dto.discountPercentage,
            monthCount = dto.monthCount,
            storeProductId = dto.storeProductId,
            paymentLink = dto.paymentLink?.let { map(it) },
        )
    }

    fun map(dto: PremiumPaymentOptionDto): TdApi.PremiumPaymentOption {
        return TdApi.PremiumPaymentOption(
            currency = dto.currency,
            amount = dto.amount,
            discountPercentage = dto.discountPercentage,
            monthCount = dto.monthCount,
            storeProductId = dto.storeProductId,
            paymentLink = dto.paymentLink?.let { map(it) },
        )
    }

    fun map(dto: TdApi.PremiumState): PremiumStateDto {
        return PremiumStateDto(
            state = map(dto.state),
            paymentOptions = dto.paymentOptions.mapArray { map(it) },
            animations = dto.animations.mapArray { map(it) },
            businessAnimations = dto.businessAnimations.mapArray { map(it) },
        )
    }

    fun map(dto: PremiumStateDto): TdApi.PremiumState {
        return TdApi.PremiumState(
            state = map(dto.state),
            paymentOptions = dto.paymentOptions.mapArray { map(it) },
            animations = dto.animations.mapArray { map(it) },
            businessAnimations = dto.businessAnimations.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.PremiumStatePaymentOption): PremiumStatePaymentOptionDto {
        return PremiumStatePaymentOptionDto(
            paymentOption = map(dto.paymentOption),
            isCurrent = dto.isCurrent,
            isUpgrade = dto.isUpgrade,
            lastTransactionId = dto.lastTransactionId,
        )
    }

    fun map(dto: PremiumStatePaymentOptionDto): TdApi.PremiumStatePaymentOption {
        return TdApi.PremiumStatePaymentOption(
            paymentOption = map(dto.paymentOption),
            isCurrent = dto.isCurrent,
            isUpgrade = dto.isUpgrade,
            lastTransactionId = dto.lastTransactionId,
        )
    }

    fun map(dto: TdApi.PrepaidGiveaway): PrepaidGiveawayDto {
        return PrepaidGiveawayDto(
            id = dto.id,
            winnerCount = dto.winnerCount,
            prize = map(dto.prize),
            boostCount = dto.boostCount,
            paymentDate = dto.paymentDate,
        )
    }

    fun map(dto: PrepaidGiveawayDto): TdApi.PrepaidGiveaway {
        return TdApi.PrepaidGiveaway(
            id = dto.id,
            winnerCount = dto.winnerCount,
            prize = map(dto.prize),
            boostCount = dto.boostCount,
            paymentDate = dto.paymentDate,
        )
    }

    fun map(dto: TdApi.PreparedInlineMessage): PreparedInlineMessageDto {
        return PreparedInlineMessageDto(
            inlineQueryId = dto.inlineQueryId,
            result = map(dto.result),
            chatTypes = map(dto.chatTypes),
        )
    }

    fun map(dto: PreparedInlineMessageDto): TdApi.PreparedInlineMessage {
        return TdApi.PreparedInlineMessage(
            inlineQueryId = dto.inlineQueryId,
            result = map(dto.result),
            chatTypes = map(dto.chatTypes),
        )
    }

    fun map(dto: TdApi.PreparedInlineMessageId): PreparedInlineMessageIdDto {
        return PreparedInlineMessageIdDto(
            id = dto.id,
            expirationDate = dto.expirationDate,
        )
    }

    fun map(dto: PreparedInlineMessageIdDto): TdApi.PreparedInlineMessageId {
        return TdApi.PreparedInlineMessageId(
            id = dto.id,
            expirationDate = dto.expirationDate,
        )
    }

    fun map(dto: TdApi.ProductInfo): ProductInfoDto {
        return ProductInfoDto(
            title = dto.title,
            description = map(dto.description),
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: ProductInfoDto): TdApi.ProductInfo {
        return TdApi.ProductInfo(
            title = dto.title,
            description = map(dto.description),
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ProfileAccentColor): ProfileAccentColorDto {
        return ProfileAccentColorDto(
            id = dto.id,
            lightThemeColors = map(dto.lightThemeColors),
            darkThemeColors = map(dto.darkThemeColors),
            minSupergroupChatBoostLevel = dto.minSupergroupChatBoostLevel,
            minChannelChatBoostLevel = dto.minChannelChatBoostLevel,
        )
    }

    fun map(dto: ProfileAccentColorDto): TdApi.ProfileAccentColor {
        return TdApi.ProfileAccentColor(
            id = dto.id,
            lightThemeColors = map(dto.lightThemeColors),
            darkThemeColors = map(dto.darkThemeColors),
            minSupergroupChatBoostLevel = dto.minSupergroupChatBoostLevel,
            minChannelChatBoostLevel = dto.minChannelChatBoostLevel,
        )
    }

    fun map(dto: TdApi.ProfileAccentColors): ProfileAccentColorsDto {
        return ProfileAccentColorsDto(
            paletteColors = dto.paletteColors,
            backgroundColors = dto.backgroundColors,
            storyColors = dto.storyColors,
        )
    }

    fun map(dto: ProfileAccentColorsDto): TdApi.ProfileAccentColors {
        return TdApi.ProfileAccentColors(
            paletteColors = dto.paletteColors,
            backgroundColors = dto.backgroundColors,
            storyColors = dto.storyColors,
        )
    }

    fun map(dto: TdApi.ProfilePhoto): ProfilePhotoDto {
        return ProfilePhotoDto(
            id = dto.id,
            small = map(dto.small),
            big = map(dto.big),
            minithumbnail = dto.minithumbnail?.let { map(it) },
            hasAnimation = dto.hasAnimation,
            isPersonal = dto.isPersonal,
        )
    }

    fun map(dto: ProfilePhotoDto): TdApi.ProfilePhoto {
        return TdApi.ProfilePhoto(
            id = dto.id,
            small = map(dto.small),
            big = map(dto.big),
            minithumbnail = dto.minithumbnail?.let { map(it) },
            hasAnimation = dto.hasAnimation,
            isPersonal = dto.isPersonal,
        )
    }

    fun map(dto: TdApi.Proxies): ProxiesDto {
        return ProxiesDto(
            proxies = dto.proxies.mapArray { map(it) },
        )
    }

    fun map(dto: ProxiesDto): TdApi.Proxies {
        return TdApi.Proxies(
            proxies = dto.proxies.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Proxy): ProxyDto {
        return ProxyDto(
            id = dto.id,
            server = dto.server,
            port = dto.port,
            lastUsedDate = dto.lastUsedDate,
            isEnabled = dto.isEnabled,
            type = map(dto.type),
        )
    }

    fun map(dto: ProxyDto): TdApi.Proxy {
        return TdApi.Proxy(
            id = dto.id,
            server = dto.server,
            port = dto.port,
            lastUsedDate = dto.lastUsedDate,
            isEnabled = dto.isEnabled,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.PublicForwards): PublicForwardsDto {
        return PublicForwardsDto(
            totalCount = dto.totalCount,
            forwards = dto.forwards.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: PublicForwardsDto): TdApi.PublicForwards {
        return TdApi.PublicForwards(
            totalCount = dto.totalCount,
            forwards = dto.forwards.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.PushReceiverId): PushReceiverIdDto {
        return PushReceiverIdDto(
            id = dto.id,
        )
    }

    fun map(dto: PushReceiverIdDto): TdApi.PushReceiverId {
        return TdApi.PushReceiverId(
            id = dto.id,
        )
    }

    fun map(dto: TdApi.QuickReplyMessage): QuickReplyMessageDto {
        return QuickReplyMessageDto(
            id = dto.id,
            sendingState = dto.sendingState?.let { map(it) },
            canBeEdited = dto.canBeEdited,
            replyToMessageId = dto.replyToMessageId,
            viaBotUserId = dto.viaBotUserId,
            mediaAlbumId = dto.mediaAlbumId,
            content = map(dto.content),
            replyMarkup = dto.replyMarkup?.let { map(it) },
        )
    }

    fun map(dto: QuickReplyMessageDto): TdApi.QuickReplyMessage {
        return TdApi.QuickReplyMessage(
            id = dto.id,
            sendingState = dto.sendingState?.let { map(it) },
            canBeEdited = dto.canBeEdited,
            replyToMessageId = dto.replyToMessageId,
            viaBotUserId = dto.viaBotUserId,
            mediaAlbumId = dto.mediaAlbumId,
            content = map(dto.content),
            replyMarkup = dto.replyMarkup?.let { map(it) },
        )
    }

    fun map(dto: TdApi.QuickReplyMessages): QuickReplyMessagesDto {
        return QuickReplyMessagesDto(
            messages = dto.messages?.mapArray { map(it) },
        )
    }

    fun map(dto: QuickReplyMessagesDto): TdApi.QuickReplyMessages {
        return TdApi.QuickReplyMessages(
            messages = dto.messages?.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.QuickReplyShortcut): QuickReplyShortcutDto {
        return QuickReplyShortcutDto(
            id = dto.id,
            name = dto.name,
            firstMessage = map(dto.firstMessage),
            messageCount = dto.messageCount,
        )
    }

    fun map(dto: QuickReplyShortcutDto): TdApi.QuickReplyShortcut {
        return TdApi.QuickReplyShortcut(
            id = dto.id,
            name = dto.name,
            firstMessage = map(dto.firstMessage),
            messageCount = dto.messageCount,
        )
    }

    fun map(dto: TdApi.ReactionNotificationSettings): ReactionNotificationSettingsDto {
        return ReactionNotificationSettingsDto(
            messageReactionSource = map(dto.messageReactionSource),
            storyReactionSource = map(dto.storyReactionSource),
            soundId = dto.soundId,
            showPreview = dto.showPreview,
        )
    }

    fun map(dto: ReactionNotificationSettingsDto): TdApi.ReactionNotificationSettings {
        return TdApi.ReactionNotificationSettings(
            messageReactionSource = map(dto.messageReactionSource),
            storyReactionSource = map(dto.storyReactionSource),
            soundId = dto.soundId,
            showPreview = dto.showPreview,
        )
    }

    fun map(dto: TdApi.ReadDatePrivacySettings): ReadDatePrivacySettingsDto {
        return ReadDatePrivacySettingsDto(
            showReadDate = dto.showReadDate,
        )
    }

    fun map(dto: ReadDatePrivacySettingsDto): TdApi.ReadDatePrivacySettings {
        return TdApi.ReadDatePrivacySettings(
            showReadDate = dto.showReadDate,
        )
    }

    fun map(dto: TdApi.ReceivedGift): ReceivedGiftDto {
        return ReceivedGiftDto(
            receivedGiftId = dto.receivedGiftId,
            senderId = dto.senderId?.let { map(it) },
            text = map(dto.text),
            isPrivate = dto.isPrivate,
            isSaved = dto.isSaved,
            isPinned = dto.isPinned,
            canBeUpgraded = dto.canBeUpgraded,
            canBeTransferred = dto.canBeTransferred,
            wasRefunded = dto.wasRefunded,
            date = dto.date,
            gift = map(dto.gift),
            sellStarCount = dto.sellStarCount,
            prepaidUpgradeStarCount = dto.prepaidUpgradeStarCount,
            transferStarCount = dto.transferStarCount,
            exportDate = dto.exportDate,
        )
    }

    fun map(dto: ReceivedGiftDto): TdApi.ReceivedGift {
        return TdApi.ReceivedGift(
            receivedGiftId = dto.receivedGiftId,
            senderId = dto.senderId?.let { map(it) },
            text = map(dto.text),
            isPrivate = dto.isPrivate,
            isSaved = dto.isSaved,
            isPinned = dto.isPinned,
            canBeUpgraded = dto.canBeUpgraded,
            canBeTransferred = dto.canBeTransferred,
            wasRefunded = dto.wasRefunded,
            date = dto.date,
            gift = map(dto.gift),
            sellStarCount = dto.sellStarCount,
            prepaidUpgradeStarCount = dto.prepaidUpgradeStarCount,
            transferStarCount = dto.transferStarCount,
            exportDate = dto.exportDate,
        )
    }

    fun map(dto: TdApi.ReceivedGifts): ReceivedGiftsDto {
        return ReceivedGiftsDto(
            totalCount = dto.totalCount,
            gifts = dto.gifts.mapArray { map(it) },
            areNotificationsEnabled = dto.areNotificationsEnabled,
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: ReceivedGiftsDto): TdApi.ReceivedGifts {
        return TdApi.ReceivedGifts(
            totalCount = dto.totalCount,
            gifts = dto.gifts.mapArray { map(it) },
            areNotificationsEnabled = dto.areNotificationsEnabled,
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.RecommendedChatFolder): RecommendedChatFolderDto {
        return RecommendedChatFolderDto(
            folder = map(dto.folder),
            description = dto.description,
        )
    }

    fun map(dto: RecommendedChatFolderDto): TdApi.RecommendedChatFolder {
        return TdApi.RecommendedChatFolder(
            folder = map(dto.folder),
            description = dto.description,
        )
    }

    fun map(dto: TdApi.RecommendedChatFolders): RecommendedChatFoldersDto {
        return RecommendedChatFoldersDto(
            chatFolders = dto.chatFolders.mapArray { map(it) },
        )
    }

    fun map(dto: RecommendedChatFoldersDto): TdApi.RecommendedChatFolders {
        return TdApi.RecommendedChatFolders(
            chatFolders = dto.chatFolders.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.RecoveryEmailAddress): RecoveryEmailAddressDto {
        return RecoveryEmailAddressDto(
            recoveryEmailAddress = dto.recoveryEmailAddress,
        )
    }

    fun map(dto: RecoveryEmailAddressDto): TdApi.RecoveryEmailAddress {
        return TdApi.RecoveryEmailAddress(
            recoveryEmailAddress = dto.recoveryEmailAddress,
        )
    }

    fun map(dto: TdApi.RemoteFile): RemoteFileDto {
        return RemoteFileDto(
            id = dto.id,
            uniqueId = dto.uniqueId,
            isUploadingActive = dto.isUploadingActive,
            isUploadingCompleted = dto.isUploadingCompleted,
            uploadedSize = dto.uploadedSize,
        )
    }

    fun map(dto: RemoteFileDto): TdApi.RemoteFile {
        return TdApi.RemoteFile(
            id = dto.id,
            uniqueId = dto.uniqueId,
            isUploadingActive = dto.isUploadingActive,
            isUploadingCompleted = dto.isUploadingCompleted,
            uploadedSize = dto.uploadedSize,
        )
    }

    fun map(dto: TdApi.ReportOption): ReportOptionDto {
        return ReportOptionDto(
            id = dto.id,
            text = dto.text,
        )
    }

    fun map(dto: ReportOptionDto): TdApi.ReportOption {
        return TdApi.ReportOption(
            id = dto.id,
            text = dto.text,
        )
    }

    fun map(dto: TdApi.RtmpUrl): RtmpUrlDto {
        return RtmpUrlDto(
            url = dto.url,
            streamKey = dto.streamKey,
        )
    }

    fun map(dto: RtmpUrlDto): TdApi.RtmpUrl {
        return TdApi.RtmpUrl(
            url = dto.url,
            streamKey = dto.streamKey,
        )
    }

    fun map(dto: TdApi.SavedCredentials): SavedCredentialsDto {
        return SavedCredentialsDto(
            id = dto.id,
            title = dto.title,
        )
    }

    fun map(dto: SavedCredentialsDto): TdApi.SavedCredentials {
        return TdApi.SavedCredentials(
            id = dto.id,
            title = dto.title,
        )
    }

    fun map(dto: TdApi.SavedMessagesTag): SavedMessagesTagDto {
        return SavedMessagesTagDto(
            tag = map(dto.tag),
            label = dto.label,
            count = dto.count,
        )
    }

    fun map(dto: SavedMessagesTagDto): TdApi.SavedMessagesTag {
        return TdApi.SavedMessagesTag(
            tag = map(dto.tag),
            label = dto.label,
            count = dto.count,
        )
    }

    fun map(dto: TdApi.SavedMessagesTags): SavedMessagesTagsDto {
        return SavedMessagesTagsDto(
            tags = dto.tags.mapArray { map(it) },
        )
    }

    fun map(dto: SavedMessagesTagsDto): TdApi.SavedMessagesTags {
        return TdApi.SavedMessagesTags(
            tags = dto.tags.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.SavedMessagesTopic): SavedMessagesTopicDto {
        return SavedMessagesTopicDto(
            id = dto.id,
            type = map(dto.type),
            isPinned = dto.isPinned,
            order = dto.order,
            lastMessage = dto.lastMessage?.let { map(it) },
            draftMessage = dto.draftMessage?.let { map(it) },
        )
    }

    fun map(dto: SavedMessagesTopicDto): TdApi.SavedMessagesTopic {
        return TdApi.SavedMessagesTopic(
            id = dto.id,
            type = map(dto.type),
            isPinned = dto.isPinned,
            order = dto.order,
            lastMessage = dto.lastMessage?.let { map(it) },
            draftMessage = dto.draftMessage?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ScopeAutosaveSettings): ScopeAutosaveSettingsDto {
        return ScopeAutosaveSettingsDto(
            autosavePhotos = dto.autosavePhotos,
            autosaveVideos = dto.autosaveVideos,
            maxVideoFileSize = dto.maxVideoFileSize,
        )
    }

    fun map(dto: ScopeAutosaveSettingsDto): TdApi.ScopeAutosaveSettings {
        return TdApi.ScopeAutosaveSettings(
            autosavePhotos = dto.autosavePhotos,
            autosaveVideos = dto.autosaveVideos,
            maxVideoFileSize = dto.maxVideoFileSize,
        )
    }

    fun map(dto: TdApi.ScopeNotificationSettings): ScopeNotificationSettingsDto {
        return ScopeNotificationSettingsDto(
            muteFor = dto.muteFor,
            soundId = dto.soundId,
            showPreview = dto.showPreview,
            useDefaultMuteStories = dto.useDefaultMuteStories,
            muteStories = dto.muteStories,
            storySoundId = dto.storySoundId,
            showStoryPoster = dto.showStoryPoster,
            disablePinnedMessageNotifications = dto.disablePinnedMessageNotifications,
            disableMentionNotifications = dto.disableMentionNotifications,
        )
    }

    fun map(dto: ScopeNotificationSettingsDto): TdApi.ScopeNotificationSettings {
        return TdApi.ScopeNotificationSettings(
            muteFor = dto.muteFor,
            soundId = dto.soundId,
            showPreview = dto.showPreview,
            useDefaultMuteStories = dto.useDefaultMuteStories,
            muteStories = dto.muteStories,
            storySoundId = dto.storySoundId,
            showStoryPoster = dto.showStoryPoster,
            disablePinnedMessageNotifications = dto.disablePinnedMessageNotifications,
            disableMentionNotifications = dto.disableMentionNotifications,
        )
    }

    fun map(dto: TdApi.Seconds): SecondsDto {
        return SecondsDto(
            seconds = dto.seconds,
        )
    }

    fun map(dto: SecondsDto): TdApi.Seconds {
        return TdApi.Seconds(
            seconds = dto.seconds,
        )
    }

    fun map(dto: TdApi.SecretChat): SecretChatDto {
        return SecretChatDto(
            id = dto.id,
            userId = dto.userId,
            state = map(dto.state),
            isOutbound = dto.isOutbound,
            keyHash = dto.keyHash,
            layer = dto.layer,
        )
    }

    fun map(dto: SecretChatDto): TdApi.SecretChat {
        return TdApi.SecretChat(
            id = dto.id,
            userId = dto.userId,
            state = map(dto.state),
            isOutbound = dto.isOutbound,
            keyHash = dto.keyHash,
            layer = dto.layer,
        )
    }

    fun map(dto: TdApi.SentWebAppMessage): SentWebAppMessageDto {
        return SentWebAppMessageDto(
            inlineMessageId = dto.inlineMessageId,
        )
    }

    fun map(dto: SentWebAppMessageDto): TdApi.SentWebAppMessage {
        return TdApi.SentWebAppMessage(
            inlineMessageId = dto.inlineMessageId,
        )
    }

    fun map(dto: TdApi.Session): SessionDto {
        return SessionDto(
            id = dto.id,
            isCurrent = dto.isCurrent,
            isPasswordPending = dto.isPasswordPending,
            isUnconfirmed = dto.isUnconfirmed,
            canAcceptSecretChats = dto.canAcceptSecretChats,
            canAcceptCalls = dto.canAcceptCalls,
            type = map(dto.type),
            apiId = dto.apiId,
            applicationName = dto.applicationName,
            applicationVersion = dto.applicationVersion,
            isOfficialApplication = dto.isOfficialApplication,
            deviceModel = dto.deviceModel,
            platform = dto.platform,
            systemVersion = dto.systemVersion,
            logInDate = dto.logInDate,
            lastActiveDate = dto.lastActiveDate,
            ipAddress = dto.ipAddress,
            location = dto.location,
        )
    }

    fun map(dto: SessionDto): TdApi.Session {
        return TdApi.Session(
            id = dto.id,
            isCurrent = dto.isCurrent,
            isPasswordPending = dto.isPasswordPending,
            isUnconfirmed = dto.isUnconfirmed,
            canAcceptSecretChats = dto.canAcceptSecretChats,
            canAcceptCalls = dto.canAcceptCalls,
            type = map(dto.type),
            apiId = dto.apiId,
            applicationName = dto.applicationName,
            applicationVersion = dto.applicationVersion,
            isOfficialApplication = dto.isOfficialApplication,
            deviceModel = dto.deviceModel,
            platform = dto.platform,
            systemVersion = dto.systemVersion,
            logInDate = dto.logInDate,
            lastActiveDate = dto.lastActiveDate,
            ipAddress = dto.ipAddress,
            location = dto.location,
        )
    }

    fun map(dto: TdApi.Sessions): SessionsDto {
        return SessionsDto(
            sessions = dto.sessions.mapArray { map(it) },
            inactiveSessionTtlDays = dto.inactiveSessionTtlDays,
        )
    }

    fun map(dto: SessionsDto): TdApi.Sessions {
        return TdApi.Sessions(
            sessions = dto.sessions.mapArray { map(it) },
            inactiveSessionTtlDays = dto.inactiveSessionTtlDays,
        )
    }

    fun map(dto: TdApi.SharedChat): SharedChatDto {
        return SharedChatDto(
            chatId = dto.chatId,
            title = dto.title,
            username = dto.username,
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: SharedChatDto): TdApi.SharedChat {
        return TdApi.SharedChat(
            chatId = dto.chatId,
            title = dto.title,
            username = dto.username,
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.SharedUser): SharedUserDto {
        return SharedUserDto(
            userId = dto.userId,
            firstName = dto.firstName,
            lastName = dto.lastName,
            username = dto.username,
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: SharedUserDto): TdApi.SharedUser {
        return TdApi.SharedUser(
            userId = dto.userId,
            firstName = dto.firstName,
            lastName = dto.lastName,
            username = dto.username,
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.ShippingOption): ShippingOptionDto {
        return ShippingOptionDto(
            id = dto.id,
            title = dto.title,
            priceParts = dto.priceParts.mapArray { map(it) },
        )
    }

    fun map(dto: ShippingOptionDto): TdApi.ShippingOption {
        return TdApi.ShippingOption(
            id = dto.id,
            title = dto.title,
            priceParts = dto.priceParts.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.SponsoredChat): SponsoredChatDto {
        return SponsoredChatDto(
            uniqueId = dto.uniqueId,
            chatId = dto.chatId,
            sponsorInfo = dto.sponsorInfo,
            additionalInfo = dto.additionalInfo,
        )
    }

    fun map(dto: SponsoredChatDto): TdApi.SponsoredChat {
        return TdApi.SponsoredChat(
            uniqueId = dto.uniqueId,
            chatId = dto.chatId,
            sponsorInfo = dto.sponsorInfo,
            additionalInfo = dto.additionalInfo,
        )
    }

    fun map(dto: TdApi.SponsoredChats): SponsoredChatsDto {
        return SponsoredChatsDto(
            chats = dto.chats.mapArray { map(it) },
        )
    }

    fun map(dto: SponsoredChatsDto): TdApi.SponsoredChats {
        return TdApi.SponsoredChats(
            chats = dto.chats.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.SponsoredMessage): SponsoredMessageDto {
        return SponsoredMessageDto(
            messageId = dto.messageId,
            isRecommended = dto.isRecommended,
            canBeReported = dto.canBeReported,
            content = map(dto.content),
            sponsor = map(dto.sponsor),
            title = dto.title,
            buttonText = dto.buttonText,
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            additionalInfo = dto.additionalInfo,
        )
    }

    fun map(dto: SponsoredMessageDto): TdApi.SponsoredMessage {
        return TdApi.SponsoredMessage(
            messageId = dto.messageId,
            isRecommended = dto.isRecommended,
            canBeReported = dto.canBeReported,
            content = map(dto.content),
            sponsor = map(dto.sponsor),
            title = dto.title,
            buttonText = dto.buttonText,
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            additionalInfo = dto.additionalInfo,
        )
    }

    fun map(dto: TdApi.SponsoredMessages): SponsoredMessagesDto {
        return SponsoredMessagesDto(
            messages = dto.messages.mapArray { map(it) },
            messagesBetween = dto.messagesBetween,
        )
    }

    fun map(dto: SponsoredMessagesDto): TdApi.SponsoredMessages {
        return TdApi.SponsoredMessages(
            messages = dto.messages.mapArray { map(it) },
            messagesBetween = dto.messagesBetween,
        )
    }

    fun map(dto: TdApi.StarAmount): StarAmountDto {
        return StarAmountDto(
            starCount = dto.starCount,
            nanostarCount = dto.nanostarCount,
        )
    }

    fun map(dto: StarAmountDto): TdApi.StarAmount {
        return TdApi.StarAmount(
            starCount = dto.starCount,
            nanostarCount = dto.nanostarCount,
        )
    }

    fun map(dto: TdApi.StarCount): StarCountDto {
        return StarCountDto(
            starCount = dto.starCount,
        )
    }

    fun map(dto: StarCountDto): TdApi.StarCount {
        return TdApi.StarCount(
            starCount = dto.starCount,
        )
    }

    fun map(dto: TdApi.StarGiveawayPaymentOption): StarGiveawayPaymentOptionDto {
        return StarGiveawayPaymentOptionDto(
            currency = dto.currency,
            amount = dto.amount,
            starCount = dto.starCount,
            storeProductId = dto.storeProductId,
            yearlyBoostCount = dto.yearlyBoostCount,
            winnerOptions = dto.winnerOptions.mapArray { map(it) },
            isDefault = dto.isDefault,
            isAdditional = dto.isAdditional,
        )
    }

    fun map(dto: StarGiveawayPaymentOptionDto): TdApi.StarGiveawayPaymentOption {
        return TdApi.StarGiveawayPaymentOption(
            currency = dto.currency,
            amount = dto.amount,
            starCount = dto.starCount,
            storeProductId = dto.storeProductId,
            yearlyBoostCount = dto.yearlyBoostCount,
            winnerOptions = dto.winnerOptions.mapArray { map(it) },
            isDefault = dto.isDefault,
            isAdditional = dto.isAdditional,
        )
    }

    fun map(dto: TdApi.StarGiveawayPaymentOptions): StarGiveawayPaymentOptionsDto {
        return StarGiveawayPaymentOptionsDto(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: StarGiveawayPaymentOptionsDto): TdApi.StarGiveawayPaymentOptions {
        return TdApi.StarGiveawayPaymentOptions(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StarGiveawayWinnerOption): StarGiveawayWinnerOptionDto {
        return StarGiveawayWinnerOptionDto(
            winnerCount = dto.winnerCount,
            wonStarCount = dto.wonStarCount,
            isDefault = dto.isDefault,
        )
    }

    fun map(dto: StarGiveawayWinnerOptionDto): TdApi.StarGiveawayWinnerOption {
        return TdApi.StarGiveawayWinnerOption(
            winnerCount = dto.winnerCount,
            wonStarCount = dto.wonStarCount,
            isDefault = dto.isDefault,
        )
    }

    fun map(dto: TdApi.StarPaymentOption): StarPaymentOptionDto {
        return StarPaymentOptionDto(
            currency = dto.currency,
            amount = dto.amount,
            starCount = dto.starCount,
            storeProductId = dto.storeProductId,
            isAdditional = dto.isAdditional,
        )
    }

    fun map(dto: StarPaymentOptionDto): TdApi.StarPaymentOption {
        return TdApi.StarPaymentOption(
            currency = dto.currency,
            amount = dto.amount,
            starCount = dto.starCount,
            storeProductId = dto.storeProductId,
            isAdditional = dto.isAdditional,
        )
    }

    fun map(dto: TdApi.StarPaymentOptions): StarPaymentOptionsDto {
        return StarPaymentOptionsDto(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: StarPaymentOptionsDto): TdApi.StarPaymentOptions {
        return TdApi.StarPaymentOptions(
            options = dto.options.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StarRevenueStatistics): StarRevenueStatisticsDto {
        return StarRevenueStatisticsDto(
            revenueByDayGraph = map(dto.revenueByDayGraph),
            status = map(dto.status),
            usdRate = dto.usdRate,
        )
    }

    fun map(dto: StarRevenueStatisticsDto): TdApi.StarRevenueStatistics {
        return TdApi.StarRevenueStatistics(
            revenueByDayGraph = map(dto.revenueByDayGraph),
            status = map(dto.status),
            usdRate = dto.usdRate,
        )
    }

    fun map(dto: TdApi.StarRevenueStatus): StarRevenueStatusDto {
        return StarRevenueStatusDto(
            totalAmount = map(dto.totalAmount),
            currentAmount = map(dto.currentAmount),
            availableAmount = map(dto.availableAmount),
            withdrawalEnabled = dto.withdrawalEnabled,
            nextWithdrawalIn = dto.nextWithdrawalIn,
        )
    }

    fun map(dto: StarRevenueStatusDto): TdApi.StarRevenueStatus {
        return TdApi.StarRevenueStatus(
            totalAmount = map(dto.totalAmount),
            currentAmount = map(dto.currentAmount),
            availableAmount = map(dto.availableAmount),
            withdrawalEnabled = dto.withdrawalEnabled,
            nextWithdrawalIn = dto.nextWithdrawalIn,
        )
    }

    fun map(dto: TdApi.StarSubscription): StarSubscriptionDto {
        return StarSubscriptionDto(
            id = dto.id,
            chatId = dto.chatId,
            expirationDate = dto.expirationDate,
            isCanceled = dto.isCanceled,
            isExpiring = dto.isExpiring,
            pricing = map(dto.pricing),
            type = map(dto.type),
        )
    }

    fun map(dto: StarSubscriptionDto): TdApi.StarSubscription {
        return TdApi.StarSubscription(
            id = dto.id,
            chatId = dto.chatId,
            expirationDate = dto.expirationDate,
            isCanceled = dto.isCanceled,
            isExpiring = dto.isExpiring,
            pricing = map(dto.pricing),
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.StarSubscriptionPricing): StarSubscriptionPricingDto {
        return StarSubscriptionPricingDto(
            period = dto.period,
            starCount = dto.starCount,
        )
    }

    fun map(dto: StarSubscriptionPricingDto): TdApi.StarSubscriptionPricing {
        return TdApi.StarSubscriptionPricing(
            period = dto.period,
            starCount = dto.starCount,
        )
    }

    fun map(dto: TdApi.StarSubscriptions): StarSubscriptionsDto {
        return StarSubscriptionsDto(
            starAmount = map(dto.starAmount),
            subscriptions = dto.subscriptions.mapArray { map(it) },
            requiredStarCount = dto.requiredStarCount,
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: StarSubscriptionsDto): TdApi.StarSubscriptions {
        return TdApi.StarSubscriptions(
            starAmount = map(dto.starAmount),
            subscriptions = dto.subscriptions.mapArray { map(it) },
            requiredStarCount = dto.requiredStarCount,
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.StarTransaction): StarTransactionDto {
        return StarTransactionDto(
            id = dto.id,
            starAmount = map(dto.starAmount),
            isRefund = dto.isRefund,
            date = dto.date,
            type = map(dto.type),
        )
    }

    fun map(dto: StarTransactionDto): TdApi.StarTransaction {
        return TdApi.StarTransaction(
            id = dto.id,
            starAmount = map(dto.starAmount),
            isRefund = dto.isRefund,
            date = dto.date,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.StarTransactions): StarTransactionsDto {
        return StarTransactionsDto(
            starAmount = map(dto.starAmount),
            transactions = dto.transactions.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: StarTransactionsDto): TdApi.StarTransactions {
        return TdApi.StarTransactions(
            starAmount = map(dto.starAmount),
            transactions = dto.transactions.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.StatisticalValue): StatisticalValueDto {
        return StatisticalValueDto(
            value = dto.value,
            previousValue = dto.previousValue,
            growthRatePercentage = dto.growthRatePercentage,
        )
    }

    fun map(dto: StatisticalValueDto): TdApi.StatisticalValue {
        return TdApi.StatisticalValue(
            value = dto.value,
            previousValue = dto.previousValue,
            growthRatePercentage = dto.growthRatePercentage,
        )
    }

    fun map(dto: TdApi.Sticker): StickerDto {
        return StickerDto(
            id = dto.id,
            setId = dto.setId,
            width = dto.width,
            height = dto.height,
            emoji = dto.emoji,
            format = map(dto.format),
            fullType = map(dto.fullType),
            thumbnail = dto.thumbnail?.let { map(it) },
            sticker = map(dto.sticker),
        )
    }

    fun map(dto: StickerDto): TdApi.Sticker {
        return TdApi.Sticker(
            id = dto.id,
            setId = dto.setId,
            width = dto.width,
            height = dto.height,
            emoji = dto.emoji,
            format = map(dto.format),
            fullType = map(dto.fullType),
            thumbnail = dto.thumbnail?.let { map(it) },
            sticker = map(dto.sticker),
        )
    }

    fun map(dto: TdApi.StickerSet): StickerSetDto {
        return StickerSetDto(
            id = dto.id,
            title = dto.title,
            name = dto.name,
            thumbnail = dto.thumbnail?.let { map(it) },
            thumbnailOutline = dto.thumbnailOutline?.let { map(it) },
            isOwned = dto.isOwned,
            isInstalled = dto.isInstalled,
            isArchived = dto.isArchived,
            isOfficial = dto.isOfficial,
            stickerType = map(dto.stickerType),
            needsRepainting = dto.needsRepainting,
            isAllowedAsChatEmojiStatus = dto.isAllowedAsChatEmojiStatus,
            isViewed = dto.isViewed,
            stickers = dto.stickers.mapArray { map(it) },
            emojis = dto.emojis.mapArray { map(it) },
        )
    }

    fun map(dto: StickerSetDto): TdApi.StickerSet {
        return TdApi.StickerSet(
            id = dto.id,
            title = dto.title,
            name = dto.name,
            thumbnail = dto.thumbnail?.let { map(it) },
            thumbnailOutline = dto.thumbnailOutline?.let { map(it) },
            isOwned = dto.isOwned,
            isInstalled = dto.isInstalled,
            isArchived = dto.isArchived,
            isOfficial = dto.isOfficial,
            stickerType = map(dto.stickerType),
            needsRepainting = dto.needsRepainting,
            isAllowedAsChatEmojiStatus = dto.isAllowedAsChatEmojiStatus,
            isViewed = dto.isViewed,
            stickers = dto.stickers.mapArray { map(it) },
            emojis = dto.emojis.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StickerSetInfo): StickerSetInfoDto {
        return StickerSetInfoDto(
            id = dto.id,
            title = dto.title,
            name = dto.name,
            thumbnail = dto.thumbnail?.let { map(it) },
            thumbnailOutline = dto.thumbnailOutline?.let { map(it) },
            isOwned = dto.isOwned,
            isInstalled = dto.isInstalled,
            isArchived = dto.isArchived,
            isOfficial = dto.isOfficial,
            stickerType = map(dto.stickerType),
            needsRepainting = dto.needsRepainting,
            isAllowedAsChatEmojiStatus = dto.isAllowedAsChatEmojiStatus,
            isViewed = dto.isViewed,
            size = dto.size,
            covers = dto.covers.mapArray { map(it) },
        )
    }

    fun map(dto: StickerSetInfoDto): TdApi.StickerSetInfo {
        return TdApi.StickerSetInfo(
            id = dto.id,
            title = dto.title,
            name = dto.name,
            thumbnail = dto.thumbnail?.let { map(it) },
            thumbnailOutline = dto.thumbnailOutline?.let { map(it) },
            isOwned = dto.isOwned,
            isInstalled = dto.isInstalled,
            isArchived = dto.isArchived,
            isOfficial = dto.isOfficial,
            stickerType = map(dto.stickerType),
            needsRepainting = dto.needsRepainting,
            isAllowedAsChatEmojiStatus = dto.isAllowedAsChatEmojiStatus,
            isViewed = dto.isViewed,
            size = dto.size,
            covers = dto.covers.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StickerSets): StickerSetsDto {
        return StickerSetsDto(
            totalCount = dto.totalCount,
            sets = dto.sets.mapArray { map(it) },
        )
    }

    fun map(dto: StickerSetsDto): TdApi.StickerSets {
        return TdApi.StickerSets(
            totalCount = dto.totalCount,
            sets = dto.sets.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Stickers): StickersDto {
        return StickersDto(
            stickers = dto.stickers.mapArray { map(it) },
        )
    }

    fun map(dto: StickersDto): TdApi.Stickers {
        return TdApi.Stickers(
            stickers = dto.stickers.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StorageStatistics): StorageStatisticsDto {
        return StorageStatisticsDto(
            size = dto.size,
            count = dto.count,
            byChat = dto.byChat.mapArray { map(it) },
        )
    }

    fun map(dto: StorageStatisticsDto): TdApi.StorageStatistics {
        return TdApi.StorageStatistics(
            size = dto.size,
            count = dto.count,
            byChat = dto.byChat.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StorageStatisticsByChat): StorageStatisticsByChatDto {
        return StorageStatisticsByChatDto(
            chatId = dto.chatId,
            size = dto.size,
            count = dto.count,
            byFileType = dto.byFileType.mapArray { map(it) },
        )
    }

    fun map(dto: StorageStatisticsByChatDto): TdApi.StorageStatisticsByChat {
        return TdApi.StorageStatisticsByChat(
            chatId = dto.chatId,
            size = dto.size,
            count = dto.count,
            byFileType = dto.byFileType.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.StorageStatisticsByFileType): StorageStatisticsByFileTypeDto {
        return StorageStatisticsByFileTypeDto(
            fileType = map(dto.fileType),
            size = dto.size,
            count = dto.count,
        )
    }

    fun map(dto: StorageStatisticsByFileTypeDto): TdApi.StorageStatisticsByFileType {
        return TdApi.StorageStatisticsByFileType(
            fileType = map(dto.fileType),
            size = dto.size,
            count = dto.count,
        )
    }

    fun map(dto: TdApi.StorageStatisticsFast): StorageStatisticsFastDto {
        return StorageStatisticsFastDto(
            filesSize = dto.filesSize,
            fileCount = dto.fileCount,
            databaseSize = dto.databaseSize,
            languagePackDatabaseSize = dto.languagePackDatabaseSize,
            logSize = dto.logSize,
        )
    }

    fun map(dto: StorageStatisticsFastDto): TdApi.StorageStatisticsFast {
        return TdApi.StorageStatisticsFast(
            filesSize = dto.filesSize,
            fileCount = dto.fileCount,
            databaseSize = dto.databaseSize,
            languagePackDatabaseSize = dto.languagePackDatabaseSize,
            logSize = dto.logSize,
        )
    }

    fun map(dto: TdApi.Stories): StoriesDto {
        return StoriesDto(
            totalCount = dto.totalCount,
            stories = dto.stories.mapArray { map(it) },
            pinnedStoryIds = dto.pinnedStoryIds,
        )
    }

    fun map(dto: StoriesDto): TdApi.Stories {
        return TdApi.Stories(
            totalCount = dto.totalCount,
            stories = dto.stories.mapArray { map(it) },
            pinnedStoryIds = dto.pinnedStoryIds,
        )
    }

    fun map(dto: TdApi.Story): StoryDto {
        return StoryDto(
            id = dto.id,
            posterChatId = dto.posterChatId,
            posterId = dto.posterId?.let { map(it) },
            date = dto.date,
            isBeingPosted = dto.isBeingPosted,
            isBeingEdited = dto.isBeingEdited,
            isEdited = dto.isEdited,
            isPostedToChatPage = dto.isPostedToChatPage,
            isVisibleOnlyForSelf = dto.isVisibleOnlyForSelf,
            canBeDeleted = dto.canBeDeleted,
            canBeEdited = dto.canBeEdited,
            canBeForwarded = dto.canBeForwarded,
            canBeReplied = dto.canBeReplied,
            canToggleIsPostedToChatPage = dto.canToggleIsPostedToChatPage,
            canGetStatistics = dto.canGetStatistics,
            canGetInteractions = dto.canGetInteractions,
            hasExpiredViewers = dto.hasExpiredViewers,
            repostInfo = dto.repostInfo?.let { map(it) },
            interactionInfo = dto.interactionInfo?.let { map(it) },
            chosenReactionType = dto.chosenReactionType?.let { map(it) },
            privacySettings = map(dto.privacySettings),
            content = map(dto.content),
            areas = dto.areas.mapArray { map(it) },
            caption = map(dto.caption),
        )
    }

    fun map(dto: StoryDto): TdApi.Story {
        return TdApi.Story(
            id = dto.id,
            posterChatId = dto.posterChatId,
            posterId = dto.posterId?.let { map(it) },
            date = dto.date,
            isBeingPosted = dto.isBeingPosted,
            isBeingEdited = dto.isBeingEdited,
            isEdited = dto.isEdited,
            isPostedToChatPage = dto.isPostedToChatPage,
            isVisibleOnlyForSelf = dto.isVisibleOnlyForSelf,
            canBeDeleted = dto.canBeDeleted,
            canBeEdited = dto.canBeEdited,
            canBeForwarded = dto.canBeForwarded,
            canBeReplied = dto.canBeReplied,
            canToggleIsPostedToChatPage = dto.canToggleIsPostedToChatPage,
            canGetStatistics = dto.canGetStatistics,
            canGetInteractions = dto.canGetInteractions,
            hasExpiredViewers = dto.hasExpiredViewers,
            repostInfo = dto.repostInfo?.let { map(it) },
            interactionInfo = dto.interactionInfo?.let { map(it) },
            chosenReactionType = dto.chosenReactionType?.let { map(it) },
            privacySettings = map(dto.privacySettings),
            content = map(dto.content),
            areas = dto.areas.mapArray { map(it) },
            caption = map(dto.caption),
        )
    }

    fun map(dto: TdApi.StoryArea): StoryAreaDto {
        return StoryAreaDto(
            position = map(dto.position),
            type = map(dto.type),
        )
    }

    fun map(dto: StoryAreaDto): TdApi.StoryArea {
        return TdApi.StoryArea(
            position = map(dto.position),
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.StoryAreaPosition): StoryAreaPositionDto {
        return StoryAreaPositionDto(
            xPercentage = dto.xPercentage,
            yPercentage = dto.yPercentage,
            widthPercentage = dto.widthPercentage,
            heightPercentage = dto.heightPercentage,
            rotationAngle = dto.rotationAngle,
            cornerRadiusPercentage = dto.cornerRadiusPercentage,
        )
    }

    fun map(dto: StoryAreaPositionDto): TdApi.StoryAreaPosition {
        return TdApi.StoryAreaPosition(
            xPercentage = dto.xPercentage,
            yPercentage = dto.yPercentage,
            widthPercentage = dto.widthPercentage,
            heightPercentage = dto.heightPercentage,
            rotationAngle = dto.rotationAngle,
            cornerRadiusPercentage = dto.cornerRadiusPercentage,
        )
    }

    fun map(dto: TdApi.StoryFullId): StoryFullIdDto {
        return StoryFullIdDto(
            posterChatId = dto.posterChatId,
            storyId = dto.storyId,
        )
    }

    fun map(dto: StoryFullIdDto): TdApi.StoryFullId {
        return TdApi.StoryFullId(
            posterChatId = dto.posterChatId,
            storyId = dto.storyId,
        )
    }

    fun map(dto: TdApi.StoryInfo): StoryInfoDto {
        return StoryInfoDto(
            storyId = dto.storyId,
            date = dto.date,
            isForCloseFriends = dto.isForCloseFriends,
        )
    }

    fun map(dto: StoryInfoDto): TdApi.StoryInfo {
        return TdApi.StoryInfo(
            storyId = dto.storyId,
            date = dto.date,
            isForCloseFriends = dto.isForCloseFriends,
        )
    }

    fun map(dto: TdApi.StoryInteraction): StoryInteractionDto {
        return StoryInteractionDto(
            actorId = map(dto.actorId),
            interactionDate = dto.interactionDate,
            blockList = dto.blockList?.let { map(it) },
            type = map(dto.type),
        )
    }

    fun map(dto: StoryInteractionDto): TdApi.StoryInteraction {
        return TdApi.StoryInteraction(
            actorId = map(dto.actorId),
            interactionDate = dto.interactionDate,
            blockList = dto.blockList?.let { map(it) },
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.StoryInteractionInfo): StoryInteractionInfoDto {
        return StoryInteractionInfoDto(
            viewCount = dto.viewCount,
            forwardCount = dto.forwardCount,
            reactionCount = dto.reactionCount,
            recentViewerUserIds = dto.recentViewerUserIds,
        )
    }

    fun map(dto: StoryInteractionInfoDto): TdApi.StoryInteractionInfo {
        return TdApi.StoryInteractionInfo(
            viewCount = dto.viewCount,
            forwardCount = dto.forwardCount,
            reactionCount = dto.reactionCount,
            recentViewerUserIds = dto.recentViewerUserIds,
        )
    }

    fun map(dto: TdApi.StoryInteractions): StoryInteractionsDto {
        return StoryInteractionsDto(
            totalCount = dto.totalCount,
            totalForwardCount = dto.totalForwardCount,
            totalReactionCount = dto.totalReactionCount,
            interactions = dto.interactions.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: StoryInteractionsDto): TdApi.StoryInteractions {
        return TdApi.StoryInteractions(
            totalCount = dto.totalCount,
            totalForwardCount = dto.totalForwardCount,
            totalReactionCount = dto.totalReactionCount,
            interactions = dto.interactions.mapArray { map(it) },
            nextOffset = dto.nextOffset,
        )
    }

    fun map(dto: TdApi.StoryRepostInfo): StoryRepostInfoDto {
        return StoryRepostInfoDto(
            origin = map(dto.origin),
            isContentModified = dto.isContentModified,
        )
    }

    fun map(dto: StoryRepostInfoDto): TdApi.StoryRepostInfo {
        return TdApi.StoryRepostInfo(
            origin = map(dto.origin),
            isContentModified = dto.isContentModified,
        )
    }

    fun map(dto: TdApi.StoryStatistics): StoryStatisticsDto {
        return StoryStatisticsDto(
            storyInteractionGraph = map(dto.storyInteractionGraph),
            storyReactionGraph = map(dto.storyReactionGraph),
        )
    }

    fun map(dto: StoryStatisticsDto): TdApi.StoryStatistics {
        return TdApi.StoryStatistics(
            storyInteractionGraph = map(dto.storyInteractionGraph),
            storyReactionGraph = map(dto.storyReactionGraph),
        )
    }

    fun map(dto: TdApi.StoryVideo): StoryVideoDto {
        return StoryVideoDto(
            duration = dto.duration,
            width = dto.width,
            height = dto.height,
            hasStickers = dto.hasStickers,
            isAnimation = dto.isAnimation,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            preloadPrefixSize = dto.preloadPrefixSize,
            coverFrameTimestamp = dto.coverFrameTimestamp,
            video = map(dto.video),
        )
    }

    fun map(dto: StoryVideoDto): TdApi.StoryVideo {
        return TdApi.StoryVideo(
            duration = dto.duration,
            width = dto.width,
            height = dto.height,
            hasStickers = dto.hasStickers,
            isAnimation = dto.isAnimation,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            preloadPrefixSize = dto.preloadPrefixSize,
            coverFrameTimestamp = dto.coverFrameTimestamp,
            video = map(dto.video),
        )
    }

    fun map(dto: TdApi.Supergroup): SupergroupDto {
        return SupergroupDto(
            id = dto.id,
            usernames = dto.usernames?.let { map(it) },
            date = dto.date,
            status = map(dto.status),
            memberCount = dto.memberCount,
            boostLevel = dto.boostLevel,
            hasLinkedChat = dto.hasLinkedChat,
            hasLocation = dto.hasLocation,
            signMessages = dto.signMessages,
            showMessageSender = dto.showMessageSender,
            joinToSendMessages = dto.joinToSendMessages,
            joinByRequest = dto.joinByRequest,
            isSlowModeEnabled = dto.isSlowModeEnabled,
            isChannel = dto.isChannel,
            isBroadcastGroup = dto.isBroadcastGroup,
            isForum = dto.isForum,
            verificationStatus = dto.verificationStatus?.let { map(it) },
            hasSensitiveContent = dto.hasSensitiveContent,
            restrictionReason = dto.restrictionReason,
            paidMessageStarCount = dto.paidMessageStarCount,
            hasActiveStories = dto.hasActiveStories,
            hasUnreadActiveStories = dto.hasUnreadActiveStories,
        )
    }

    fun map(dto: SupergroupDto): TdApi.Supergroup {
        return TdApi.Supergroup(
            id = dto.id,
            usernames = dto.usernames?.let { map(it) },
            date = dto.date,
            status = map(dto.status),
            memberCount = dto.memberCount,
            boostLevel = dto.boostLevel,
            hasLinkedChat = dto.hasLinkedChat,
            hasLocation = dto.hasLocation,
            signMessages = dto.signMessages,
            showMessageSender = dto.showMessageSender,
            joinToSendMessages = dto.joinToSendMessages,
            joinByRequest = dto.joinByRequest,
            isSlowModeEnabled = dto.isSlowModeEnabled,
            isChannel = dto.isChannel,
            isBroadcastGroup = dto.isBroadcastGroup,
            isForum = dto.isForum,
            verificationStatus = dto.verificationStatus?.let { map(it) },
            hasSensitiveContent = dto.hasSensitiveContent,
            restrictionReason = dto.restrictionReason,
            paidMessageStarCount = dto.paidMessageStarCount,
            hasActiveStories = dto.hasActiveStories,
            hasUnreadActiveStories = dto.hasUnreadActiveStories,
        )
    }

    fun map(dto: TdApi.SupergroupFullInfo): SupergroupFullInfoDto {
        return SupergroupFullInfoDto(
            photo = dto.photo?.let { map(it) },
            description = dto.description,
            memberCount = dto.memberCount,
            administratorCount = dto.administratorCount,
            restrictedCount = dto.restrictedCount,
            bannedCount = dto.bannedCount,
            linkedChatId = dto.linkedChatId,
            slowModeDelay = dto.slowModeDelay,
            slowModeDelayExpiresIn = dto.slowModeDelayExpiresIn,
            canEnablePaidMessages = dto.canEnablePaidMessages,
            canEnablePaidReaction = dto.canEnablePaidReaction,
            canGetMembers = dto.canGetMembers,
            hasHiddenMembers = dto.hasHiddenMembers,
            canHideMembers = dto.canHideMembers,
            canSetStickerSet = dto.canSetStickerSet,
            canSetLocation = dto.canSetLocation,
            canGetStatistics = dto.canGetStatistics,
            canGetRevenueStatistics = dto.canGetRevenueStatistics,
            canGetStarRevenueStatistics = dto.canGetStarRevenueStatistics,
            canSendGift = dto.canSendGift,
            canToggleAggressiveAntiSpam = dto.canToggleAggressiveAntiSpam,
            isAllHistoryAvailable = dto.isAllHistoryAvailable,
            canHaveSponsoredMessages = dto.canHaveSponsoredMessages,
            hasAggressiveAntiSpamEnabled = dto.hasAggressiveAntiSpamEnabled,
            hasPaidMediaAllowed = dto.hasPaidMediaAllowed,
            hasPinnedStories = dto.hasPinnedStories,
            giftCount = dto.giftCount,
            myBoostCount = dto.myBoostCount,
            unrestrictBoostCount = dto.unrestrictBoostCount,
            stickerSetId = dto.stickerSetId,
            customEmojiStickerSetId = dto.customEmojiStickerSetId,
            location = dto.location?.let { map(it) },
            inviteLink = dto.inviteLink?.let { map(it) },
            botCommands = dto.botCommands.mapArray { map(it) },
            botVerification = dto.botVerification?.let { map(it) },
            upgradedFromBasicGroupId = dto.upgradedFromBasicGroupId,
            upgradedFromMaxMessageId = dto.upgradedFromMaxMessageId,
        )
    }

    fun map(dto: SupergroupFullInfoDto): TdApi.SupergroupFullInfo {
        return TdApi.SupergroupFullInfo(
            photo = dto.photo?.let { map(it) },
            description = dto.description,
            memberCount = dto.memberCount,
            administratorCount = dto.administratorCount,
            restrictedCount = dto.restrictedCount,
            bannedCount = dto.bannedCount,
            linkedChatId = dto.linkedChatId,
            slowModeDelay = dto.slowModeDelay,
            slowModeDelayExpiresIn = dto.slowModeDelayExpiresIn,
            canEnablePaidMessages = dto.canEnablePaidMessages,
            canEnablePaidReaction = dto.canEnablePaidReaction,
            canGetMembers = dto.canGetMembers,
            hasHiddenMembers = dto.hasHiddenMembers,
            canHideMembers = dto.canHideMembers,
            canSetStickerSet = dto.canSetStickerSet,
            canSetLocation = dto.canSetLocation,
            canGetStatistics = dto.canGetStatistics,
            canGetRevenueStatistics = dto.canGetRevenueStatistics,
            canGetStarRevenueStatistics = dto.canGetStarRevenueStatistics,
            canSendGift = dto.canSendGift,
            canToggleAggressiveAntiSpam = dto.canToggleAggressiveAntiSpam,
            isAllHistoryAvailable = dto.isAllHistoryAvailable,
            canHaveSponsoredMessages = dto.canHaveSponsoredMessages,
            hasAggressiveAntiSpamEnabled = dto.hasAggressiveAntiSpamEnabled,
            hasPaidMediaAllowed = dto.hasPaidMediaAllowed,
            hasPinnedStories = dto.hasPinnedStories,
            giftCount = dto.giftCount,
            myBoostCount = dto.myBoostCount,
            unrestrictBoostCount = dto.unrestrictBoostCount,
            stickerSetId = dto.stickerSetId,
            customEmojiStickerSetId = dto.customEmojiStickerSetId,
            location = dto.location?.let { map(it) },
            inviteLink = dto.inviteLink?.let { map(it) },
            botCommands = dto.botCommands.mapArray { map(it) },
            botVerification = dto.botVerification?.let { map(it) },
            upgradedFromBasicGroupId = dto.upgradedFromBasicGroupId,
            upgradedFromMaxMessageId = dto.upgradedFromMaxMessageId,
        )
    }

    fun map(dto: TdApi.TMeUrl): TMeUrlDto {
        return TMeUrlDto(
            url = dto.url,
            type = map(dto.type),
        )
    }

    fun map(dto: TMeUrlDto): TdApi.TMeUrl {
        return TdApi.TMeUrl(
            url = dto.url,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.TMeUrls): TMeUrlsDto {
        return TMeUrlsDto(
            urls = dto.urls.mapArray { map(it) },
        )
    }

    fun map(dto: TMeUrlsDto): TdApi.TMeUrls {
        return TdApi.TMeUrls(
            urls = dto.urls.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.TargetChatTypes): TargetChatTypesDto {
        return TargetChatTypesDto(
            allowUserChats = dto.allowUserChats,
            allowBotChats = dto.allowBotChats,
            allowGroupChats = dto.allowGroupChats,
            allowChannelChats = dto.allowChannelChats,
        )
    }

    fun map(dto: TargetChatTypesDto): TdApi.TargetChatTypes {
        return TdApi.TargetChatTypes(
            allowUserChats = dto.allowUserChats,
            allowBotChats = dto.allowBotChats,
            allowGroupChats = dto.allowGroupChats,
            allowChannelChats = dto.allowChannelChats,
        )
    }

    fun map(dto: TdApi.TemporaryPasswordState): TemporaryPasswordStateDto {
        return TemporaryPasswordStateDto(
            hasPassword = dto.hasPassword,
            validFor = dto.validFor,
        )
    }

    fun map(dto: TemporaryPasswordStateDto): TdApi.TemporaryPasswordState {
        return TdApi.TemporaryPasswordState(
            hasPassword = dto.hasPassword,
            validFor = dto.validFor,
        )
    }

    fun map(dto: TdApi.TermsOfService): TermsOfServiceDto {
        return TermsOfServiceDto(
            text = map(dto.text),
            minUserAge = dto.minUserAge,
            showPopup = dto.showPopup,
        )
    }

    fun map(dto: TermsOfServiceDto): TdApi.TermsOfService {
        return TdApi.TermsOfService(
            text = map(dto.text),
            minUserAge = dto.minUserAge,
            showPopup = dto.showPopup,
        )
    }

    fun map(dto: TdApi.TestBytes): TestBytesDto {
        return TestBytesDto(
            value = dto.value,
        )
    }

    fun map(dto: TestBytesDto): TdApi.TestBytes {
        return TdApi.TestBytes(
            value = dto.value,
        )
    }

    fun map(dto: TdApi.TestInt): TestIntDto {
        return TestIntDto(
            value = dto.value,
        )
    }

    fun map(dto: TestIntDto): TdApi.TestInt {
        return TdApi.TestInt(
            value = dto.value,
        )
    }

    fun map(dto: TdApi.TestString): TestStringDto {
        return TestStringDto(
            value = dto.value,
        )
    }

    fun map(dto: TestStringDto): TdApi.TestString {
        return TdApi.TestString(
            value = dto.value,
        )
    }

    fun map(dto: TdApi.TestVectorInt): TestVectorIntDto {
        return TestVectorIntDto(
            value = dto.value,
        )
    }

    fun map(dto: TestVectorIntDto): TdApi.TestVectorInt {
        return TdApi.TestVectorInt(
            value = dto.value,
        )
    }

    fun map(dto: TdApi.TestVectorIntObject): TestVectorIntObjectDto {
        return TestVectorIntObjectDto(
            value = dto.value.mapArray { map(it) },
        )
    }

    fun map(dto: TestVectorIntObjectDto): TdApi.TestVectorIntObject {
        return TdApi.TestVectorIntObject(
            value = dto.value.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.TestVectorString): TestVectorStringDto {
        return TestVectorStringDto(
            value = dto.value,
        )
    }

    fun map(dto: TestVectorStringDto): TdApi.TestVectorString {
        return TdApi.TestVectorString(
            value = dto.value,
        )
    }

    fun map(dto: TdApi.TestVectorStringObject): TestVectorStringObjectDto {
        return TestVectorStringObjectDto(
            value = dto.value.mapArray { map(it) },
        )
    }

    fun map(dto: TestVectorStringObjectDto): TdApi.TestVectorStringObject {
        return TdApi.TestVectorStringObject(
            value = dto.value.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Text): TextDto {
        return TextDto(
            text = dto.text,
        )
    }

    fun map(dto: TextDto): TdApi.Text {
        return TdApi.Text(
            text = dto.text,
        )
    }

    fun map(dto: TdApi.TextEntities): TextEntitiesDto {
        return TextEntitiesDto(
            entities = dto.entities.mapArray { map(it) },
        )
    }

    fun map(dto: TextEntitiesDto): TdApi.TextEntities {
        return TdApi.TextEntities(
            entities = dto.entities.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.TextEntity): TextEntityDto {
        return TextEntityDto(
            offset = dto.offset,
            length = dto.length,
            type = map(dto.type),
        )
    }

    fun map(dto: TextEntityDto): TdApi.TextEntity {
        return TdApi.TextEntity(
            offset = dto.offset,
            length = dto.length,
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.TextQuote): TextQuoteDto {
        return TextQuoteDto(
            text = map(dto.text),
            position = dto.position,
            isManual = dto.isManual,
        )
    }

    fun map(dto: TextQuoteDto): TdApi.TextQuote {
        return TdApi.TextQuote(
            text = map(dto.text),
            position = dto.position,
            isManual = dto.isManual,
        )
    }

    fun map(dto: TdApi.ThemeParameters): ThemeParametersDto {
        return ThemeParametersDto(
            backgroundColor = dto.backgroundColor,
            secondaryBackgroundColor = dto.secondaryBackgroundColor,
            headerBackgroundColor = dto.headerBackgroundColor,
            bottomBarBackgroundColor = dto.bottomBarBackgroundColor,
            sectionBackgroundColor = dto.sectionBackgroundColor,
            sectionSeparatorColor = dto.sectionSeparatorColor,
            textColor = dto.textColor,
            accentTextColor = dto.accentTextColor,
            sectionHeaderTextColor = dto.sectionHeaderTextColor,
            subtitleTextColor = dto.subtitleTextColor,
            destructiveTextColor = dto.destructiveTextColor,
            hintColor = dto.hintColor,
            linkColor = dto.linkColor,
            buttonColor = dto.buttonColor,
            buttonTextColor = dto.buttonTextColor,
        )
    }

    fun map(dto: ThemeParametersDto): TdApi.ThemeParameters {
        return TdApi.ThemeParameters(
            backgroundColor = dto.backgroundColor,
            secondaryBackgroundColor = dto.secondaryBackgroundColor,
            headerBackgroundColor = dto.headerBackgroundColor,
            bottomBarBackgroundColor = dto.bottomBarBackgroundColor,
            sectionBackgroundColor = dto.sectionBackgroundColor,
            sectionSeparatorColor = dto.sectionSeparatorColor,
            textColor = dto.textColor,
            accentTextColor = dto.accentTextColor,
            sectionHeaderTextColor = dto.sectionHeaderTextColor,
            subtitleTextColor = dto.subtitleTextColor,
            destructiveTextColor = dto.destructiveTextColor,
            hintColor = dto.hintColor,
            linkColor = dto.linkColor,
            buttonColor = dto.buttonColor,
            buttonTextColor = dto.buttonTextColor,
        )
    }

    fun map(dto: TdApi.ThemeSettings): ThemeSettingsDto {
        return ThemeSettingsDto(
            accentColor = dto.accentColor,
            background = dto.background?.let { map(it) },
            outgoingMessageFill = map(dto.outgoingMessageFill),
            animateOutgoingMessageFill = dto.animateOutgoingMessageFill,
            outgoingMessageAccentColor = dto.outgoingMessageAccentColor,
        )
    }

    fun map(dto: ThemeSettingsDto): TdApi.ThemeSettings {
        return TdApi.ThemeSettings(
            accentColor = dto.accentColor,
            background = dto.background?.let { map(it) },
            outgoingMessageFill = map(dto.outgoingMessageFill),
            animateOutgoingMessageFill = dto.animateOutgoingMessageFill,
            outgoingMessageAccentColor = dto.outgoingMessageAccentColor,
        )
    }

    fun map(dto: TdApi.Thumbnail): ThumbnailDto {
        return ThumbnailDto(
            format = map(dto.format),
            width = dto.width,
            height = dto.height,
            file = map(dto.file),
        )
    }

    fun map(dto: ThumbnailDto): TdApi.Thumbnail {
        return TdApi.Thumbnail(
            format = map(dto.format),
            width = dto.width,
            height = dto.height,
            file = map(dto.file),
        )
    }

    fun map(dto: TdApi.TimeZone): TimeZoneDto {
        return TimeZoneDto(
            id = dto.id,
            name = dto.name,
            utcTimeOffset = dto.utcTimeOffset,
        )
    }

    fun map(dto: TimeZoneDto): TdApi.TimeZone {
        return TdApi.TimeZone(
            id = dto.id,
            name = dto.name,
            utcTimeOffset = dto.utcTimeOffset,
        )
    }

    fun map(dto: TdApi.TimeZones): TimeZonesDto {
        return TimeZonesDto(
            timeZones = dto.timeZones.mapArray { map(it) },
        )
    }

    fun map(dto: TimeZonesDto): TdApi.TimeZones {
        return TdApi.TimeZones(
            timeZones = dto.timeZones.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.TrendingStickerSets): TrendingStickerSetsDto {
        return TrendingStickerSetsDto(
            totalCount = dto.totalCount,
            sets = dto.sets.mapArray { map(it) },
            isPremium = dto.isPremium,
        )
    }

    fun map(dto: TrendingStickerSetsDto): TdApi.TrendingStickerSets {
        return TdApi.TrendingStickerSets(
            totalCount = dto.totalCount,
            sets = dto.sets.mapArray { map(it) },
            isPremium = dto.isPremium,
        )
    }

    fun map(dto: TdApi.UnconfirmedSession): UnconfirmedSessionDto {
        return UnconfirmedSessionDto(
            id = dto.id,
            logInDate = dto.logInDate,
            deviceModel = dto.deviceModel,
            location = dto.location,
        )
    }

    fun map(dto: UnconfirmedSessionDto): TdApi.UnconfirmedSession {
        return TdApi.UnconfirmedSession(
            id = dto.id,
            logInDate = dto.logInDate,
            deviceModel = dto.deviceModel,
            location = dto.location,
        )
    }

    fun map(dto: TdApi.UnreadReaction): UnreadReactionDto {
        return UnreadReactionDto(
            type = map(dto.type),
            senderId = map(dto.senderId),
            isBig = dto.isBig,
        )
    }

    fun map(dto: UnreadReactionDto): TdApi.UnreadReaction {
        return TdApi.UnreadReaction(
            type = map(dto.type),
            senderId = map(dto.senderId),
            isBig = dto.isBig,
        )
    }

    fun map(dto: TdApi.Updates): UpdatesDto {
        return UpdatesDto(
            updates = dto.updates.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpgradeGiftResult): UpgradeGiftResultDto {
        return UpgradeGiftResultDto(
            gift = map(dto.gift),
            receivedGiftId = dto.receivedGiftId,
            isSaved = dto.isSaved,
            canBeTransferred = dto.canBeTransferred,
            transferStarCount = dto.transferStarCount,
            exportDate = dto.exportDate,
        )
    }

    fun map(dto: UpgradeGiftResultDto): TdApi.UpgradeGiftResult {
        return TdApi.UpgradeGiftResult(
            gift = map(dto.gift),
            receivedGiftId = dto.receivedGiftId,
            isSaved = dto.isSaved,
            canBeTransferred = dto.canBeTransferred,
            transferStarCount = dto.transferStarCount,
            exportDate = dto.exportDate,
        )
    }

    fun map(dto: TdApi.UpgradedGift): UpgradedGiftDto {
        return UpgradedGiftDto(
            id = dto.id,
            title = dto.title,
            name = dto.name,
            number = dto.number,
            totalUpgradedCount = dto.totalUpgradedCount,
            maxUpgradedCount = dto.maxUpgradedCount,
            ownerId = dto.ownerId?.let { map(it) },
            ownerAddress = dto.ownerAddress,
            ownerName = dto.ownerName,
            giftAddress = dto.giftAddress,
            model = map(dto.model),
            symbol = map(dto.symbol),
            backdrop = map(dto.backdrop),
            originalDetails = dto.originalDetails?.let { map(it) },
        )
    }

    fun map(dto: UpgradedGiftDto): TdApi.UpgradedGift {
        return TdApi.UpgradedGift(
            id = dto.id,
            title = dto.title,
            name = dto.name,
            number = dto.number,
            totalUpgradedCount = dto.totalUpgradedCount,
            maxUpgradedCount = dto.maxUpgradedCount,
            ownerId = dto.ownerId?.let { map(it) },
            ownerAddress = dto.ownerAddress,
            ownerName = dto.ownerName,
            giftAddress = dto.giftAddress,
            model = map(dto.model),
            symbol = map(dto.symbol),
            backdrop = map(dto.backdrop),
            originalDetails = dto.originalDetails?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpgradedGiftBackdrop): UpgradedGiftBackdropDto {
        return UpgradedGiftBackdropDto(
            name = dto.name,
            colors = map(dto.colors),
            rarityPerMille = dto.rarityPerMille,
        )
    }

    fun map(dto: UpgradedGiftBackdropDto): TdApi.UpgradedGiftBackdrop {
        return TdApi.UpgradedGiftBackdrop(
            name = dto.name,
            colors = map(dto.colors),
            rarityPerMille = dto.rarityPerMille,
        )
    }

    fun map(dto: TdApi.UpgradedGiftBackdropColors): UpgradedGiftBackdropColorsDto {
        return UpgradedGiftBackdropColorsDto(
            centerColor = dto.centerColor,
            edgeColor = dto.edgeColor,
            symbolColor = dto.symbolColor,
            textColor = dto.textColor,
        )
    }

    fun map(dto: UpgradedGiftBackdropColorsDto): TdApi.UpgradedGiftBackdropColors {
        return TdApi.UpgradedGiftBackdropColors(
            centerColor = dto.centerColor,
            edgeColor = dto.edgeColor,
            symbolColor = dto.symbolColor,
            textColor = dto.textColor,
        )
    }

    fun map(dto: TdApi.UpgradedGiftModel): UpgradedGiftModelDto {
        return UpgradedGiftModelDto(
            name = dto.name,
            sticker = map(dto.sticker),
            rarityPerMille = dto.rarityPerMille,
        )
    }

    fun map(dto: UpgradedGiftModelDto): TdApi.UpgradedGiftModel {
        return TdApi.UpgradedGiftModel(
            name = dto.name,
            sticker = map(dto.sticker),
            rarityPerMille = dto.rarityPerMille,
        )
    }

    fun map(dto: TdApi.UpgradedGiftOriginalDetails): UpgradedGiftOriginalDetailsDto {
        return UpgradedGiftOriginalDetailsDto(
            senderId = dto.senderId?.let { map(it) },
            receiverId = map(dto.receiverId),
            text = map(dto.text),
            date = dto.date,
        )
    }

    fun map(dto: UpgradedGiftOriginalDetailsDto): TdApi.UpgradedGiftOriginalDetails {
        return TdApi.UpgradedGiftOriginalDetails(
            senderId = dto.senderId?.let { map(it) },
            receiverId = map(dto.receiverId),
            text = map(dto.text),
            date = dto.date,
        )
    }

    fun map(dto: TdApi.UpgradedGiftSymbol): UpgradedGiftSymbolDto {
        return UpgradedGiftSymbolDto(
            name = dto.name,
            sticker = map(dto.sticker),
            rarityPerMille = dto.rarityPerMille,
        )
    }

    fun map(dto: UpgradedGiftSymbolDto): TdApi.UpgradedGiftSymbol {
        return TdApi.UpgradedGiftSymbol(
            name = dto.name,
            sticker = map(dto.sticker),
            rarityPerMille = dto.rarityPerMille,
        )
    }

    fun map(dto: TdApi.User): UserDto {
        return UserDto(
            id = dto.id,
            firstName = dto.firstName,
            lastName = dto.lastName,
            usernames = dto.usernames?.let { map(it) },
            phoneNumber = dto.phoneNumber,
            status = map(dto.status),
            profilePhoto = dto.profilePhoto?.let { map(it) },
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            profileAccentColorId = dto.profileAccentColorId,
            profileBackgroundCustomEmojiId = dto.profileBackgroundCustomEmojiId,
            emojiStatus = dto.emojiStatus?.let { map(it) },
            isContact = dto.isContact,
            isMutualContact = dto.isMutualContact,
            isCloseFriend = dto.isCloseFriend,
            verificationStatus = dto.verificationStatus?.let { map(it) },
            isPremium = dto.isPremium,
            isSupport = dto.isSupport,
            restrictionReason = dto.restrictionReason,
            hasActiveStories = dto.hasActiveStories,
            hasUnreadActiveStories = dto.hasUnreadActiveStories,
            restrictsNewChats = dto.restrictsNewChats,
            paidMessageStarCount = dto.paidMessageStarCount,
            haveAccess = dto.haveAccess,
            type = map(dto.type),
            languageCode = dto.languageCode,
            addedToAttachmentMenu = dto.addedToAttachmentMenu,
        )
    }

    fun map(dto: UserDto): TdApi.User {
        return TdApi.User(
            id = dto.id,
            firstName = dto.firstName,
            lastName = dto.lastName,
            usernames = dto.usernames?.let { map(it) },
            phoneNumber = dto.phoneNumber,
            status = map(dto.status),
            profilePhoto = dto.profilePhoto?.let { map(it) },
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            profileAccentColorId = dto.profileAccentColorId,
            profileBackgroundCustomEmojiId = dto.profileBackgroundCustomEmojiId,
            emojiStatus = dto.emojiStatus?.let { map(it) },
            isContact = dto.isContact,
            isMutualContact = dto.isMutualContact,
            isCloseFriend = dto.isCloseFriend,
            verificationStatus = dto.verificationStatus?.let { map(it) },
            isPremium = dto.isPremium,
            isSupport = dto.isSupport,
            restrictionReason = dto.restrictionReason,
            hasActiveStories = dto.hasActiveStories,
            hasUnreadActiveStories = dto.hasUnreadActiveStories,
            restrictsNewChats = dto.restrictsNewChats,
            paidMessageStarCount = dto.paidMessageStarCount,
            haveAccess = dto.haveAccess,
            type = map(dto.type),
            languageCode = dto.languageCode,
            addedToAttachmentMenu = dto.addedToAttachmentMenu,
        )
    }

    fun map(dto: TdApi.UserFullInfo): UserFullInfoDto {
        return UserFullInfoDto(
            personalPhoto = dto.personalPhoto?.let { map(it) },
            photo = dto.photo?.let { map(it) },
            publicPhoto = dto.publicPhoto?.let { map(it) },
            blockList = dto.blockList?.let { map(it) },
            canBeCalled = dto.canBeCalled,
            supportsVideoCalls = dto.supportsVideoCalls,
            hasPrivateCalls = dto.hasPrivateCalls,
            hasPrivateForwards = dto.hasPrivateForwards,
            hasRestrictedVoiceAndVideoNoteMessages = dto.hasRestrictedVoiceAndVideoNoteMessages,
            hasPostedToProfileStories = dto.hasPostedToProfileStories,
            hasSponsoredMessagesEnabled = dto.hasSponsoredMessagesEnabled,
            needPhoneNumberPrivacyException = dto.needPhoneNumberPrivacyException,
            setChatBackground = dto.setChatBackground,
            bio = dto.bio?.let { map(it) },
            birthdate = dto.birthdate?.let { map(it) },
            personalChatId = dto.personalChatId,
            giftCount = dto.giftCount,
            groupInCommonCount = dto.groupInCommonCount,
            incomingPaidMessageStarCount = dto.incomingPaidMessageStarCount,
            outgoingPaidMessageStarCount = dto.outgoingPaidMessageStarCount,
            giftSettings = map(dto.giftSettings),
            botVerification = dto.botVerification?.let { map(it) },
            businessInfo = dto.businessInfo?.let { map(it) },
            botInfo = dto.botInfo?.let { map(it) },
        )
    }

    fun map(dto: UserFullInfoDto): TdApi.UserFullInfo {
        return TdApi.UserFullInfo(
            personalPhoto = dto.personalPhoto?.let { map(it) },
            photo = dto.photo?.let { map(it) },
            publicPhoto = dto.publicPhoto?.let { map(it) },
            blockList = dto.blockList?.let { map(it) },
            canBeCalled = dto.canBeCalled,
            supportsVideoCalls = dto.supportsVideoCalls,
            hasPrivateCalls = dto.hasPrivateCalls,
            hasPrivateForwards = dto.hasPrivateForwards,
            hasRestrictedVoiceAndVideoNoteMessages = dto.hasRestrictedVoiceAndVideoNoteMessages,
            hasPostedToProfileStories = dto.hasPostedToProfileStories,
            hasSponsoredMessagesEnabled = dto.hasSponsoredMessagesEnabled,
            needPhoneNumberPrivacyException = dto.needPhoneNumberPrivacyException,
            setChatBackground = dto.setChatBackground,
            bio = dto.bio?.let { map(it) },
            birthdate = dto.birthdate?.let { map(it) },
            personalChatId = dto.personalChatId,
            giftCount = dto.giftCount,
            groupInCommonCount = dto.groupInCommonCount,
            incomingPaidMessageStarCount = dto.incomingPaidMessageStarCount,
            outgoingPaidMessageStarCount = dto.outgoingPaidMessageStarCount,
            giftSettings = map(dto.giftSettings),
            botVerification = dto.botVerification?.let { map(it) },
            businessInfo = dto.businessInfo?.let { map(it) },
            botInfo = dto.botInfo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UserLink): UserLinkDto {
        return UserLinkDto(
            url = dto.url,
            expiresIn = dto.expiresIn,
        )
    }

    fun map(dto: UserLinkDto): TdApi.UserLink {
        return TdApi.UserLink(
            url = dto.url,
            expiresIn = dto.expiresIn,
        )
    }

    fun map(dto: TdApi.UserPrivacySettingRules): UserPrivacySettingRulesDto {
        return UserPrivacySettingRulesDto(
            rules = dto.rules.mapArray { map(it) },
        )
    }

    fun map(dto: UserPrivacySettingRulesDto): TdApi.UserPrivacySettingRules {
        return TdApi.UserPrivacySettingRules(
            rules = dto.rules.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UserSupportInfo): UserSupportInfoDto {
        return UserSupportInfoDto(
            message = map(dto.message),
            author = dto.author,
            date = dto.date,
        )
    }

    fun map(dto: UserSupportInfoDto): TdApi.UserSupportInfo {
        return TdApi.UserSupportInfo(
            message = map(dto.message),
            author = dto.author,
            date = dto.date,
        )
    }

    fun map(dto: TdApi.Usernames): UsernamesDto {
        return UsernamesDto(
            activeUsernames = dto.activeUsernames,
            disabledUsernames = dto.disabledUsernames,
            editableUsername = dto.editableUsername,
        )
    }

    fun map(dto: UsernamesDto): TdApi.Usernames {
        return TdApi.Usernames(
            activeUsernames = dto.activeUsernames,
            disabledUsernames = dto.disabledUsernames,
            editableUsername = dto.editableUsername,
        )
    }

    fun map(dto: TdApi.Users): UsersDto {
        return UsersDto(
            totalCount = dto.totalCount,
            userIds = dto.userIds,
        )
    }

    fun map(dto: UsersDto): TdApi.Users {
        return TdApi.Users(
            totalCount = dto.totalCount,
            userIds = dto.userIds,
        )
    }

    fun map(dto: TdApi.ValidatedOrderInfo): ValidatedOrderInfoDto {
        return ValidatedOrderInfoDto(
            orderInfoId = dto.orderInfoId,
            shippingOptions = dto.shippingOptions.mapArray { map(it) },
        )
    }

    fun map(dto: ValidatedOrderInfoDto): TdApi.ValidatedOrderInfo {
        return TdApi.ValidatedOrderInfo(
            orderInfoId = dto.orderInfoId,
            shippingOptions = dto.shippingOptions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.Venue): VenueDto {
        return VenueDto(
            location = map(dto.location),
            title = dto.title,
            address = dto.address,
            provider = dto.provider,
            id = dto.id,
            type = dto.type,
        )
    }

    fun map(dto: VenueDto): TdApi.Venue {
        return TdApi.Venue(
            location = map(dto.location),
            title = dto.title,
            address = dto.address,
            provider = dto.provider,
            id = dto.id,
            type = dto.type,
        )
    }

    fun map(dto: TdApi.VerificationStatus): VerificationStatusDto {
        return VerificationStatusDto(
            isVerified = dto.isVerified,
            isScam = dto.isScam,
            isFake = dto.isFake,
            botVerificationIconCustomEmojiId = dto.botVerificationIconCustomEmojiId,
        )
    }

    fun map(dto: VerificationStatusDto): TdApi.VerificationStatus {
        return TdApi.VerificationStatus(
            isVerified = dto.isVerified,
            isScam = dto.isScam,
            isFake = dto.isFake,
            botVerificationIconCustomEmojiId = dto.botVerificationIconCustomEmojiId,
        )
    }

    fun map(dto: TdApi.Video): VideoDto {
        return VideoDto(
            duration = dto.duration,
            width = dto.width,
            height = dto.height,
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            hasStickers = dto.hasStickers,
            supportsStreaming = dto.supportsStreaming,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            video = map(dto.video),
        )
    }

    fun map(dto: VideoDto): TdApi.Video {
        return TdApi.Video(
            duration = dto.duration,
            width = dto.width,
            height = dto.height,
            fileName = dto.fileName,
            mimeType = dto.mimeType,
            hasStickers = dto.hasStickers,
            supportsStreaming = dto.supportsStreaming,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            video = map(dto.video),
        )
    }

    fun map(dto: TdApi.VideoChat): VideoChatDto {
        return VideoChatDto(
            groupCallId = dto.groupCallId,
            hasParticipants = dto.hasParticipants,
            defaultParticipantId = dto.defaultParticipantId?.let { map(it) },
        )
    }

    fun map(dto: VideoChatDto): TdApi.VideoChat {
        return TdApi.VideoChat(
            groupCallId = dto.groupCallId,
            hasParticipants = dto.hasParticipants,
            defaultParticipantId = dto.defaultParticipantId?.let { map(it) },
        )
    }

    fun map(dto: TdApi.VideoChatStream): VideoChatStreamDto {
        return VideoChatStreamDto(
            channelId = dto.channelId,
            scale = dto.scale,
            timeOffset = dto.timeOffset,
        )
    }

    fun map(dto: VideoChatStreamDto): TdApi.VideoChatStream {
        return TdApi.VideoChatStream(
            channelId = dto.channelId,
            scale = dto.scale,
            timeOffset = dto.timeOffset,
        )
    }

    fun map(dto: TdApi.VideoChatStreams): VideoChatStreamsDto {
        return VideoChatStreamsDto(
            streams = dto.streams.mapArray { map(it) },
        )
    }

    fun map(dto: VideoChatStreamsDto): TdApi.VideoChatStreams {
        return TdApi.VideoChatStreams(
            streams = dto.streams.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.VideoNote): VideoNoteDto {
        return VideoNoteDto(
            duration = dto.duration,
            waveform = dto.waveform,
            length = dto.length,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            speechRecognitionResult = dto.speechRecognitionResult?.let { map(it) },
            video = map(dto.video),
        )
    }

    fun map(dto: VideoNoteDto): TdApi.VideoNote {
        return TdApi.VideoNote(
            duration = dto.duration,
            waveform = dto.waveform,
            length = dto.length,
            minithumbnail = dto.minithumbnail?.let { map(it) },
            thumbnail = dto.thumbnail?.let { map(it) },
            speechRecognitionResult = dto.speechRecognitionResult?.let { map(it) },
            video = map(dto.video),
        )
    }

    fun map(dto: TdApi.VoiceNote): VoiceNoteDto {
        return VoiceNoteDto(
            duration = dto.duration,
            waveform = dto.waveform,
            mimeType = dto.mimeType,
            speechRecognitionResult = dto.speechRecognitionResult?.let { map(it) },
            voice = map(dto.voice),
        )
    }

    fun map(dto: VoiceNoteDto): TdApi.VoiceNote {
        return TdApi.VoiceNote(
            duration = dto.duration,
            waveform = dto.waveform,
            mimeType = dto.mimeType,
            speechRecognitionResult = dto.speechRecognitionResult?.let { map(it) },
            voice = map(dto.voice),
        )
    }

    fun map(dto: TdApi.WebApp): WebAppDto {
        return WebAppDto(
            shortName = dto.shortName,
            title = dto.title,
            description = dto.description,
            photo = map(dto.photo),
            animation = dto.animation?.let { map(it) },
        )
    }

    fun map(dto: WebAppDto): TdApi.WebApp {
        return TdApi.WebApp(
            shortName = dto.shortName,
            title = dto.title,
            description = dto.description,
            photo = map(dto.photo),
            animation = dto.animation?.let { map(it) },
        )
    }

    fun map(dto: TdApi.WebAppInfo): WebAppInfoDto {
        return WebAppInfoDto(
            launchId = dto.launchId,
            url = dto.url,
        )
    }

    fun map(dto: WebAppInfoDto): TdApi.WebAppInfo {
        return TdApi.WebAppInfo(
            launchId = dto.launchId,
            url = dto.url,
        )
    }

    fun map(dto: TdApi.WebAppOpenParameters): WebAppOpenParametersDto {
        return WebAppOpenParametersDto(
            theme = dto.theme?.let { map(it) },
            applicationName = dto.applicationName,
            mode = dto.mode?.let { map(it) },
        )
    }

    fun map(dto: WebAppOpenParametersDto): TdApi.WebAppOpenParameters {
        return TdApi.WebAppOpenParameters(
            theme = dto.theme?.let { map(it) },
            applicationName = dto.applicationName,
            mode = dto.mode?.let { map(it) },
        )
    }

    fun map(dto: TdApi.WebPageInstantView): WebPageInstantViewDto {
        return WebPageInstantViewDto(
            pageBlocks = dto.pageBlocks.mapArray { map(it) },
            viewCount = dto.viewCount,
            version = dto.version,
            isRtl = dto.isRtl,
            isFull = dto.isFull,
            feedbackLink = map(dto.feedbackLink),
        )
    }

    fun map(dto: WebPageInstantViewDto): TdApi.WebPageInstantView {
        return TdApi.WebPageInstantView(
            pageBlocks = dto.pageBlocks.mapArray { map(it) },
            viewCount = dto.viewCount,
            version = dto.version,
            isRtl = dto.isRtl,
            isFull = dto.isFull,
            feedbackLink = map(dto.feedbackLink),
        )
    }

    fun map(dto: TdApi.AffiliateProgramSortOrder): AffiliateProgramSortOrderDto {
        when(dto) {
            is TdApi.AffiliateProgramSortOrderProfitability -> {
                return AffiliateProgramSortOrderDto.Profitability(
                )
            }
            is TdApi.AffiliateProgramSortOrderCreationDate -> {
                return AffiliateProgramSortOrderDto.CreationDate(
                )
            }
            is TdApi.AffiliateProgramSortOrderRevenue -> {
                return AffiliateProgramSortOrderDto.Revenue(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: AffiliateProgramSortOrderDto): TdApi.AffiliateProgramSortOrder {
        when(dto) {
            is AffiliateProgramSortOrderDto.Profitability -> {
                return TdApi.AffiliateProgramSortOrderProfitability(
                )
            }
            is AffiliateProgramSortOrderDto.CreationDate -> {
                return TdApi.AffiliateProgramSortOrderCreationDate(
                )
            }
            is AffiliateProgramSortOrderDto.Revenue -> {
                return TdApi.AffiliateProgramSortOrderRevenue(
                )
            }
        }
    }

    fun map(dto: TdApi.AffiliateType): AffiliateTypeDto {
        when(dto) {
            is TdApi.AffiliateTypeCurrentUser -> {
                return AffiliateTypeDto.CurrentUser(
                )
            }
            is TdApi.AffiliateTypeBot -> {
                return AffiliateTypeDto.Bot(
                    userId = dto.userId,
                )
            }
            is TdApi.AffiliateTypeChannel -> {
                return AffiliateTypeDto.Channel(
                    chatId = dto.chatId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: AffiliateTypeDto): TdApi.AffiliateType {
        when(dto) {
            is AffiliateTypeDto.CurrentUser -> {
                return TdApi.AffiliateTypeCurrentUser(
                )
            }
            is AffiliateTypeDto.Bot -> {
                return TdApi.AffiliateTypeBot(
                    userId = dto.userId,
                )
            }
            is AffiliateTypeDto.Channel -> {
                return TdApi.AffiliateTypeChannel(
                    chatId = dto.chatId,
                )
            }
        }
    }

    fun map(dto: TdApi.AuthenticationCodeType): AuthenticationCodeTypeDto {
        when(dto) {
            is TdApi.AuthenticationCodeTypeTelegramMessage -> {
                return AuthenticationCodeTypeDto.TelegramMessage(
                    length = dto.length,
                )
            }
            is TdApi.AuthenticationCodeTypeSms -> {
                return AuthenticationCodeTypeDto.Sms(
                    length = dto.length,
                )
            }
            is TdApi.AuthenticationCodeTypeSmsWord -> {
                return AuthenticationCodeTypeDto.SmsWord(
                    firstLetter = dto.firstLetter,
                )
            }
            is TdApi.AuthenticationCodeTypeSmsPhrase -> {
                return AuthenticationCodeTypeDto.SmsPhrase(
                    firstWord = dto.firstWord,
                )
            }
            is TdApi.AuthenticationCodeTypeCall -> {
                return AuthenticationCodeTypeDto.Call(
                    length = dto.length,
                )
            }
            is TdApi.AuthenticationCodeTypeFlashCall -> {
                return AuthenticationCodeTypeDto.FlashCall(
                    pattern = dto.pattern,
                )
            }
            is TdApi.AuthenticationCodeTypeMissedCall -> {
                return AuthenticationCodeTypeDto.MissedCall(
                    phoneNumberPrefix = dto.phoneNumberPrefix,
                    length = dto.length,
                )
            }
            is TdApi.AuthenticationCodeTypeFragment -> {
                return AuthenticationCodeTypeDto.Fragment(
                    url = dto.url,
                    length = dto.length,
                )
            }
            is TdApi.AuthenticationCodeTypeFirebaseAndroid -> {
                return AuthenticationCodeTypeDto.FirebaseAndroid(
                    deviceVerificationParameters = map(dto.deviceVerificationParameters),
                    length = dto.length,
                )
            }
            is TdApi.AuthenticationCodeTypeFirebaseIos -> {
                return AuthenticationCodeTypeDto.FirebaseIos(
                    receipt = dto.receipt,
                    pushTimeout = dto.pushTimeout,
                    length = dto.length,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: AuthenticationCodeTypeDto): TdApi.AuthenticationCodeType {
        when(dto) {
            is AuthenticationCodeTypeDto.TelegramMessage -> {
                return TdApi.AuthenticationCodeTypeTelegramMessage(
                    length = dto.length,
                )
            }
            is AuthenticationCodeTypeDto.Sms -> {
                return TdApi.AuthenticationCodeTypeSms(
                    length = dto.length,
                )
            }
            is AuthenticationCodeTypeDto.SmsWord -> {
                return TdApi.AuthenticationCodeTypeSmsWord(
                    firstLetter = dto.firstLetter,
                )
            }
            is AuthenticationCodeTypeDto.SmsPhrase -> {
                return TdApi.AuthenticationCodeTypeSmsPhrase(
                    firstWord = dto.firstWord,
                )
            }
            is AuthenticationCodeTypeDto.Call -> {
                return TdApi.AuthenticationCodeTypeCall(
                    length = dto.length,
                )
            }
            is AuthenticationCodeTypeDto.FlashCall -> {
                return TdApi.AuthenticationCodeTypeFlashCall(
                    pattern = dto.pattern,
                )
            }
            is AuthenticationCodeTypeDto.MissedCall -> {
                return TdApi.AuthenticationCodeTypeMissedCall(
                    phoneNumberPrefix = dto.phoneNumberPrefix,
                    length = dto.length,
                )
            }
            is AuthenticationCodeTypeDto.Fragment -> {
                return TdApi.AuthenticationCodeTypeFragment(
                    url = dto.url,
                    length = dto.length,
                )
            }
            is AuthenticationCodeTypeDto.FirebaseAndroid -> {
                return TdApi.AuthenticationCodeTypeFirebaseAndroid(
                    deviceVerificationParameters = map(dto.deviceVerificationParameters),
                    length = dto.length,
                )
            }
            is AuthenticationCodeTypeDto.FirebaseIos -> {
                return TdApi.AuthenticationCodeTypeFirebaseIos(
                    receipt = dto.receipt,
                    pushTimeout = dto.pushTimeout,
                    length = dto.length,
                )
            }
        }
    }

    fun map(dto: TdApi.AuthorizationState): AuthorizationStateDto {
        when(dto) {
            is TdApi.AuthorizationStateWaitTdlibParameters -> {
                return AuthorizationStateDto.WaitTdlibParameters(
                )
            }
            is TdApi.AuthorizationStateWaitPhoneNumber -> {
                return AuthorizationStateDto.WaitPhoneNumber(
                )
            }
            is TdApi.AuthorizationStateWaitPremiumPurchase -> {
                return AuthorizationStateDto.WaitPremiumPurchase(
                    storeProductId = dto.storeProductId,
                )
            }
            is TdApi.AuthorizationStateWaitEmailAddress -> {
                return AuthorizationStateDto.WaitEmailAddress(
                    allowAppleId = dto.allowAppleId,
                    allowGoogleId = dto.allowGoogleId,
                )
            }
            is TdApi.AuthorizationStateWaitEmailCode -> {
                return AuthorizationStateDto.WaitEmailCode(
                    allowAppleId = dto.allowAppleId,
                    allowGoogleId = dto.allowGoogleId,
                    codeInfo = map(dto.codeInfo),
                    emailAddressResetState = dto.emailAddressResetState?.let { map(it) },
                )
            }
            is TdApi.AuthorizationStateWaitCode -> {
                return AuthorizationStateDto.WaitCode(
                    codeInfo = map(dto.codeInfo),
                )
            }
            is TdApi.AuthorizationStateWaitOtherDeviceConfirmation -> {
                return AuthorizationStateDto.WaitOtherDeviceConfirmation(
                    link = dto.link,
                )
            }
            is TdApi.AuthorizationStateWaitRegistration -> {
                return AuthorizationStateDto.WaitRegistration(
                    termsOfService = map(dto.termsOfService),
                )
            }
            is TdApi.AuthorizationStateWaitPassword -> {
                return AuthorizationStateDto.WaitPassword(
                    passwordHint = dto.passwordHint,
                    hasRecoveryEmailAddress = dto.hasRecoveryEmailAddress,
                    hasPassportData = dto.hasPassportData,
                    recoveryEmailAddressPattern = dto.recoveryEmailAddressPattern,
                )
            }
            is TdApi.AuthorizationStateReady -> {
                return AuthorizationStateDto.Ready(
                )
            }
            is TdApi.AuthorizationStateLoggingOut -> {
                return AuthorizationStateDto.LoggingOut(
                )
            }
            is TdApi.AuthorizationStateClosing -> {
                return AuthorizationStateDto.Closing(
                )
            }
            is TdApi.AuthorizationStateClosed -> {
                return AuthorizationStateDto.Closed(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: AuthorizationStateDto): TdApi.AuthorizationState {
        when(dto) {
            is AuthorizationStateDto.WaitTdlibParameters -> {
                return TdApi.AuthorizationStateWaitTdlibParameters(
                )
            }
            is AuthorizationStateDto.WaitPhoneNumber -> {
                return TdApi.AuthorizationStateWaitPhoneNumber(
                )
            }
            is AuthorizationStateDto.WaitPremiumPurchase -> {
                return TdApi.AuthorizationStateWaitPremiumPurchase(
                    storeProductId = dto.storeProductId,
                )
            }
            is AuthorizationStateDto.WaitEmailAddress -> {
                return TdApi.AuthorizationStateWaitEmailAddress(
                    allowAppleId = dto.allowAppleId,
                    allowGoogleId = dto.allowGoogleId,
                )
            }
            is AuthorizationStateDto.WaitEmailCode -> {
                return TdApi.AuthorizationStateWaitEmailCode(
                    allowAppleId = dto.allowAppleId,
                    allowGoogleId = dto.allowGoogleId,
                    codeInfo = map(dto.codeInfo),
                    emailAddressResetState = dto.emailAddressResetState?.let { map(it) },
                )
            }
            is AuthorizationStateDto.WaitCode -> {
                return TdApi.AuthorizationStateWaitCode(
                    codeInfo = map(dto.codeInfo),
                )
            }
            is AuthorizationStateDto.WaitOtherDeviceConfirmation -> {
                return TdApi.AuthorizationStateWaitOtherDeviceConfirmation(
                    link = dto.link,
                )
            }
            is AuthorizationStateDto.WaitRegistration -> {
                return TdApi.AuthorizationStateWaitRegistration(
                    termsOfService = map(dto.termsOfService),
                )
            }
            is AuthorizationStateDto.WaitPassword -> {
                return TdApi.AuthorizationStateWaitPassword(
                    passwordHint = dto.passwordHint,
                    hasRecoveryEmailAddress = dto.hasRecoveryEmailAddress,
                    hasPassportData = dto.hasPassportData,
                    recoveryEmailAddressPattern = dto.recoveryEmailAddressPattern,
                )
            }
            is AuthorizationStateDto.Ready -> {
                return TdApi.AuthorizationStateReady(
                )
            }
            is AuthorizationStateDto.LoggingOut -> {
                return TdApi.AuthorizationStateLoggingOut(
                )
            }
            is AuthorizationStateDto.Closing -> {
                return TdApi.AuthorizationStateClosing(
                )
            }
            is AuthorizationStateDto.Closed -> {
                return TdApi.AuthorizationStateClosed(
                )
            }
        }
    }

    fun map(dto: TdApi.AutosaveSettingsScope): AutosaveSettingsScopeDto {
        when(dto) {
            is TdApi.AutosaveSettingsScopePrivateChats -> {
                return AutosaveSettingsScopeDto.PrivateChats(
                )
            }
            is TdApi.AutosaveSettingsScopeGroupChats -> {
                return AutosaveSettingsScopeDto.GroupChats(
                )
            }
            is TdApi.AutosaveSettingsScopeChannelChats -> {
                return AutosaveSettingsScopeDto.ChannelChats(
                )
            }
            is TdApi.AutosaveSettingsScopeChat -> {
                return AutosaveSettingsScopeDto.Chat(
                    chatId = dto.chatId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: AutosaveSettingsScopeDto): TdApi.AutosaveSettingsScope {
        when(dto) {
            is AutosaveSettingsScopeDto.PrivateChats -> {
                return TdApi.AutosaveSettingsScopePrivateChats(
                )
            }
            is AutosaveSettingsScopeDto.GroupChats -> {
                return TdApi.AutosaveSettingsScopeGroupChats(
                )
            }
            is AutosaveSettingsScopeDto.ChannelChats -> {
                return TdApi.AutosaveSettingsScopeChannelChats(
                )
            }
            is AutosaveSettingsScopeDto.Chat -> {
                return TdApi.AutosaveSettingsScopeChat(
                    chatId = dto.chatId,
                )
            }
        }
    }

    fun map(dto: TdApi.BackgroundFill): BackgroundFillDto {
        when(dto) {
            is TdApi.BackgroundFillSolid -> {
                return BackgroundFillDto.Solid(
                    color = dto.color,
                )
            }
            is TdApi.BackgroundFillGradient -> {
                return BackgroundFillDto.Gradient(
                    topColor = dto.topColor,
                    bottomColor = dto.bottomColor,
                    rotationAngle = dto.rotationAngle,
                )
            }
            is TdApi.BackgroundFillFreeformGradient -> {
                return BackgroundFillDto.FreeformGradient(
                    colors = dto.colors,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BackgroundFillDto): TdApi.BackgroundFill {
        when(dto) {
            is BackgroundFillDto.Solid -> {
                return TdApi.BackgroundFillSolid(
                    color = dto.color,
                )
            }
            is BackgroundFillDto.Gradient -> {
                return TdApi.BackgroundFillGradient(
                    topColor = dto.topColor,
                    bottomColor = dto.bottomColor,
                    rotationAngle = dto.rotationAngle,
                )
            }
            is BackgroundFillDto.FreeformGradient -> {
                return TdApi.BackgroundFillFreeformGradient(
                    colors = dto.colors,
                )
            }
        }
    }

    fun map(dto: TdApi.BackgroundType): BackgroundTypeDto {
        when(dto) {
            is TdApi.BackgroundTypeWallpaper -> {
                return BackgroundTypeDto.Wallpaper(
                    isBlurred = dto.isBlurred,
                    isMoving = dto.isMoving,
                )
            }
            is TdApi.BackgroundTypePattern -> {
                return BackgroundTypeDto.Pattern(
                    fill = map(dto.fill),
                    intensity = dto.intensity,
                    isInverted = dto.isInverted,
                    isMoving = dto.isMoving,
                )
            }
            is TdApi.BackgroundTypeFill -> {
                return BackgroundTypeDto.Fill(
                    fill = map(dto.fill),
                )
            }
            is TdApi.BackgroundTypeChatTheme -> {
                return BackgroundTypeDto.ChatTheme(
                    themeName = dto.themeName,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BackgroundTypeDto): TdApi.BackgroundType {
        when(dto) {
            is BackgroundTypeDto.Wallpaper -> {
                return TdApi.BackgroundTypeWallpaper(
                    isBlurred = dto.isBlurred,
                    isMoving = dto.isMoving,
                )
            }
            is BackgroundTypeDto.Pattern -> {
                return TdApi.BackgroundTypePattern(
                    fill = map(dto.fill),
                    intensity = dto.intensity,
                    isInverted = dto.isInverted,
                    isMoving = dto.isMoving,
                )
            }
            is BackgroundTypeDto.Fill -> {
                return TdApi.BackgroundTypeFill(
                    fill = map(dto.fill),
                )
            }
            is BackgroundTypeDto.ChatTheme -> {
                return TdApi.BackgroundTypeChatTheme(
                    themeName = dto.themeName,
                )
            }
        }
    }

    fun map(dto: TdApi.BlockList): BlockListDto {
        when(dto) {
            is TdApi.BlockListMain -> {
                return BlockListDto.Main(
                )
            }
            is TdApi.BlockListStories -> {
                return BlockListDto.Stories(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BlockListDto): TdApi.BlockList {
        when(dto) {
            is BlockListDto.Main -> {
                return TdApi.BlockListMain(
                )
            }
            is BlockListDto.Stories -> {
                return TdApi.BlockListStories(
                )
            }
        }
    }

    fun map(dto: TdApi.BotCommandScope): BotCommandScopeDto {
        when(dto) {
            is TdApi.BotCommandScopeDefault -> {
                return BotCommandScopeDto.Default(
                )
            }
            is TdApi.BotCommandScopeAllPrivateChats -> {
                return BotCommandScopeDto.AllPrivateChats(
                )
            }
            is TdApi.BotCommandScopeAllGroupChats -> {
                return BotCommandScopeDto.AllGroupChats(
                )
            }
            is TdApi.BotCommandScopeAllChatAdministrators -> {
                return BotCommandScopeDto.AllChatAdministrators(
                )
            }
            is TdApi.BotCommandScopeChat -> {
                return BotCommandScopeDto.Chat(
                    chatId = dto.chatId,
                )
            }
            is TdApi.BotCommandScopeChatAdministrators -> {
                return BotCommandScopeDto.ChatAdministrators(
                    chatId = dto.chatId,
                )
            }
            is TdApi.BotCommandScopeChatMember -> {
                return BotCommandScopeDto.ChatMember(
                    chatId = dto.chatId,
                    userId = dto.userId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BotCommandScopeDto): TdApi.BotCommandScope {
        when(dto) {
            is BotCommandScopeDto.Default -> {
                return TdApi.BotCommandScopeDefault(
                )
            }
            is BotCommandScopeDto.AllPrivateChats -> {
                return TdApi.BotCommandScopeAllPrivateChats(
                )
            }
            is BotCommandScopeDto.AllGroupChats -> {
                return TdApi.BotCommandScopeAllGroupChats(
                )
            }
            is BotCommandScopeDto.AllChatAdministrators -> {
                return TdApi.BotCommandScopeAllChatAdministrators(
                )
            }
            is BotCommandScopeDto.Chat -> {
                return TdApi.BotCommandScopeChat(
                    chatId = dto.chatId,
                )
            }
            is BotCommandScopeDto.ChatAdministrators -> {
                return TdApi.BotCommandScopeChatAdministrators(
                    chatId = dto.chatId,
                )
            }
            is BotCommandScopeDto.ChatMember -> {
                return TdApi.BotCommandScopeChatMember(
                    chatId = dto.chatId,
                    userId = dto.userId,
                )
            }
        }
    }

    fun map(dto: TdApi.BotWriteAccessAllowReason): BotWriteAccessAllowReasonDto {
        when(dto) {
            is TdApi.BotWriteAccessAllowReasonConnectedWebsite -> {
                return BotWriteAccessAllowReasonDto.ConnectedWebsite(
                    domainName = dto.domainName,
                )
            }
            is TdApi.BotWriteAccessAllowReasonAddedToAttachmentMenu -> {
                return BotWriteAccessAllowReasonDto.AddedToAttachmentMenu(
                )
            }
            is TdApi.BotWriteAccessAllowReasonLaunchedWebApp -> {
                return BotWriteAccessAllowReasonDto.LaunchedWebApp(
                    webApp = map(dto.webApp),
                )
            }
            is TdApi.BotWriteAccessAllowReasonAcceptedRequest -> {
                return BotWriteAccessAllowReasonDto.AcceptedRequest(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BotWriteAccessAllowReasonDto): TdApi.BotWriteAccessAllowReason {
        when(dto) {
            is BotWriteAccessAllowReasonDto.ConnectedWebsite -> {
                return TdApi.BotWriteAccessAllowReasonConnectedWebsite(
                    domainName = dto.domainName,
                )
            }
            is BotWriteAccessAllowReasonDto.AddedToAttachmentMenu -> {
                return TdApi.BotWriteAccessAllowReasonAddedToAttachmentMenu(
                )
            }
            is BotWriteAccessAllowReasonDto.LaunchedWebApp -> {
                return TdApi.BotWriteAccessAllowReasonLaunchedWebApp(
                    webApp = map(dto.webApp),
                )
            }
            is BotWriteAccessAllowReasonDto.AcceptedRequest -> {
                return TdApi.BotWriteAccessAllowReasonAcceptedRequest(
                )
            }
        }
    }

    fun map(dto: TdApi.BusinessAwayMessageSchedule): BusinessAwayMessageScheduleDto {
        when(dto) {
            is TdApi.BusinessAwayMessageScheduleAlways -> {
                return BusinessAwayMessageScheduleDto.Always(
                )
            }
            is TdApi.BusinessAwayMessageScheduleOutsideOfOpeningHours -> {
                return BusinessAwayMessageScheduleDto.OutsideOfOpeningHours(
                )
            }
            is TdApi.BusinessAwayMessageScheduleCustom -> {
                return BusinessAwayMessageScheduleDto.Custom(
                    startDate = dto.startDate,
                    endDate = dto.endDate,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BusinessAwayMessageScheduleDto): TdApi.BusinessAwayMessageSchedule {
        when(dto) {
            is BusinessAwayMessageScheduleDto.Always -> {
                return TdApi.BusinessAwayMessageScheduleAlways(
                )
            }
            is BusinessAwayMessageScheduleDto.OutsideOfOpeningHours -> {
                return TdApi.BusinessAwayMessageScheduleOutsideOfOpeningHours(
                )
            }
            is BusinessAwayMessageScheduleDto.Custom -> {
                return TdApi.BusinessAwayMessageScheduleCustom(
                    startDate = dto.startDate,
                    endDate = dto.endDate,
                )
            }
        }
    }

    fun map(dto: TdApi.BusinessFeature): BusinessFeatureDto {
        when(dto) {
            is TdApi.BusinessFeatureLocation -> {
                return BusinessFeatureDto.Location(
                )
            }
            is TdApi.BusinessFeatureOpeningHours -> {
                return BusinessFeatureDto.OpeningHours(
                )
            }
            is TdApi.BusinessFeatureQuickReplies -> {
                return BusinessFeatureDto.QuickReplies(
                )
            }
            is TdApi.BusinessFeatureGreetingMessage -> {
                return BusinessFeatureDto.GreetingMessage(
                )
            }
            is TdApi.BusinessFeatureAwayMessage -> {
                return BusinessFeatureDto.AwayMessage(
                )
            }
            is TdApi.BusinessFeatureAccountLinks -> {
                return BusinessFeatureDto.AccountLinks(
                )
            }
            is TdApi.BusinessFeatureStartPage -> {
                return BusinessFeatureDto.StartPage(
                )
            }
            is TdApi.BusinessFeatureBots -> {
                return BusinessFeatureDto.Bots(
                )
            }
            is TdApi.BusinessFeatureEmojiStatus -> {
                return BusinessFeatureDto.EmojiStatus(
                )
            }
            is TdApi.BusinessFeatureChatFolderTags -> {
                return BusinessFeatureDto.ChatFolderTags(
                )
            }
            is TdApi.BusinessFeatureUpgradedStories -> {
                return BusinessFeatureDto.UpgradedStories(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: BusinessFeatureDto): TdApi.BusinessFeature {
        when(dto) {
            is BusinessFeatureDto.Location -> {
                return TdApi.BusinessFeatureLocation(
                )
            }
            is BusinessFeatureDto.OpeningHours -> {
                return TdApi.BusinessFeatureOpeningHours(
                )
            }
            is BusinessFeatureDto.QuickReplies -> {
                return TdApi.BusinessFeatureQuickReplies(
                )
            }
            is BusinessFeatureDto.GreetingMessage -> {
                return TdApi.BusinessFeatureGreetingMessage(
                )
            }
            is BusinessFeatureDto.AwayMessage -> {
                return TdApi.BusinessFeatureAwayMessage(
                )
            }
            is BusinessFeatureDto.AccountLinks -> {
                return TdApi.BusinessFeatureAccountLinks(
                )
            }
            is BusinessFeatureDto.StartPage -> {
                return TdApi.BusinessFeatureStartPage(
                )
            }
            is BusinessFeatureDto.Bots -> {
                return TdApi.BusinessFeatureBots(
                )
            }
            is BusinessFeatureDto.EmojiStatus -> {
                return TdApi.BusinessFeatureEmojiStatus(
                )
            }
            is BusinessFeatureDto.ChatFolderTags -> {
                return TdApi.BusinessFeatureChatFolderTags(
                )
            }
            is BusinessFeatureDto.UpgradedStories -> {
                return TdApi.BusinessFeatureUpgradedStories(
                )
            }
        }
    }

    fun map(dto: TdApi.CallDiscardReason): CallDiscardReasonDto {
        when(dto) {
            is TdApi.CallDiscardReasonEmpty -> {
                return CallDiscardReasonDto.Empty(
                )
            }
            is TdApi.CallDiscardReasonMissed -> {
                return CallDiscardReasonDto.Missed(
                )
            }
            is TdApi.CallDiscardReasonDeclined -> {
                return CallDiscardReasonDto.Declined(
                )
            }
            is TdApi.CallDiscardReasonDisconnected -> {
                return CallDiscardReasonDto.Disconnected(
                )
            }
            is TdApi.CallDiscardReasonHungUp -> {
                return CallDiscardReasonDto.HungUp(
                )
            }
            is TdApi.CallDiscardReasonUpgradeToGroupCall -> {
                return CallDiscardReasonDto.UpgradeToGroupCall(
                    inviteLink = dto.inviteLink,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CallDiscardReasonDto): TdApi.CallDiscardReason {
        when(dto) {
            is CallDiscardReasonDto.Empty -> {
                return TdApi.CallDiscardReasonEmpty(
                )
            }
            is CallDiscardReasonDto.Missed -> {
                return TdApi.CallDiscardReasonMissed(
                )
            }
            is CallDiscardReasonDto.Declined -> {
                return TdApi.CallDiscardReasonDeclined(
                )
            }
            is CallDiscardReasonDto.Disconnected -> {
                return TdApi.CallDiscardReasonDisconnected(
                )
            }
            is CallDiscardReasonDto.HungUp -> {
                return TdApi.CallDiscardReasonHungUp(
                )
            }
            is CallDiscardReasonDto.UpgradeToGroupCall -> {
                return TdApi.CallDiscardReasonUpgradeToGroupCall(
                    inviteLink = dto.inviteLink,
                )
            }
        }
    }

    fun map(dto: TdApi.CallProblem): CallProblemDto {
        when(dto) {
            is TdApi.CallProblemEcho -> {
                return CallProblemDto.Echo(
                )
            }
            is TdApi.CallProblemNoise -> {
                return CallProblemDto.Noise(
                )
            }
            is TdApi.CallProblemInterruptions -> {
                return CallProblemDto.Interruptions(
                )
            }
            is TdApi.CallProblemDistortedSpeech -> {
                return CallProblemDto.DistortedSpeech(
                )
            }
            is TdApi.CallProblemSilentLocal -> {
                return CallProblemDto.SilentLocal(
                )
            }
            is TdApi.CallProblemSilentRemote -> {
                return CallProblemDto.SilentRemote(
                )
            }
            is TdApi.CallProblemDropped -> {
                return CallProblemDto.Dropped(
                )
            }
            is TdApi.CallProblemDistortedVideo -> {
                return CallProblemDto.DistortedVideo(
                )
            }
            is TdApi.CallProblemPixelatedVideo -> {
                return CallProblemDto.PixelatedVideo(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CallProblemDto): TdApi.CallProblem {
        when(dto) {
            is CallProblemDto.Echo -> {
                return TdApi.CallProblemEcho(
                )
            }
            is CallProblemDto.Noise -> {
                return TdApi.CallProblemNoise(
                )
            }
            is CallProblemDto.Interruptions -> {
                return TdApi.CallProblemInterruptions(
                )
            }
            is CallProblemDto.DistortedSpeech -> {
                return TdApi.CallProblemDistortedSpeech(
                )
            }
            is CallProblemDto.SilentLocal -> {
                return TdApi.CallProblemSilentLocal(
                )
            }
            is CallProblemDto.SilentRemote -> {
                return TdApi.CallProblemSilentRemote(
                )
            }
            is CallProblemDto.Dropped -> {
                return TdApi.CallProblemDropped(
                )
            }
            is CallProblemDto.DistortedVideo -> {
                return TdApi.CallProblemDistortedVideo(
                )
            }
            is CallProblemDto.PixelatedVideo -> {
                return TdApi.CallProblemPixelatedVideo(
                )
            }
        }
    }

    fun map(dto: TdApi.CallServerType): CallServerTypeDto {
        when(dto) {
            is TdApi.CallServerTypeTelegramReflector -> {
                return CallServerTypeDto.TelegramReflector(
                    peerTag = dto.peerTag,
                    isTcp = dto.isTcp,
                )
            }
            is TdApi.CallServerTypeWebrtc -> {
                return CallServerTypeDto.Webrtc(
                    username = dto.username,
                    password = dto.password,
                    supportsTurn = dto.supportsTurn,
                    supportsStun = dto.supportsStun,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CallServerTypeDto): TdApi.CallServerType {
        when(dto) {
            is CallServerTypeDto.TelegramReflector -> {
                return TdApi.CallServerTypeTelegramReflector(
                    peerTag = dto.peerTag,
                    isTcp = dto.isTcp,
                )
            }
            is CallServerTypeDto.Webrtc -> {
                return TdApi.CallServerTypeWebrtc(
                    username = dto.username,
                    password = dto.password,
                    supportsTurn = dto.supportsTurn,
                    supportsStun = dto.supportsStun,
                )
            }
        }
    }

    fun map(dto: TdApi.CallState): CallStateDto {
        when(dto) {
            is TdApi.CallStatePending -> {
                return CallStateDto.Pending(
                    isCreated = dto.isCreated,
                    isReceived = dto.isReceived,
                )
            }
            is TdApi.CallStateExchangingKeys -> {
                return CallStateDto.ExchangingKeys(
                )
            }
            is TdApi.CallStateReady -> {
                return CallStateDto.Ready(
                    protocol = map(dto.protocol),
                    servers = dto.servers.mapArray { map(it) },
                    config = dto.config,
                    encryptionKey = dto.encryptionKey,
                    emojis = dto.emojis,
                    allowP2p = dto.allowP2p,
                    isGroupCallSupported = dto.isGroupCallSupported,
                    customParameters = dto.customParameters,
                )
            }
            is TdApi.CallStateHangingUp -> {
                return CallStateDto.HangingUp(
                )
            }
            is TdApi.CallStateDiscarded -> {
                return CallStateDto.Discarded(
                    reason = map(dto.reason),
                    needRating = dto.needRating,
                    needDebugInformation = dto.needDebugInformation,
                    needLog = dto.needLog,
                )
            }
            is TdApi.CallStateError -> {
                return CallStateDto.Error(
                    error = map(dto.error),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CallStateDto): TdApi.CallState {
        when(dto) {
            is CallStateDto.Pending -> {
                return TdApi.CallStatePending(
                    isCreated = dto.isCreated,
                    isReceived = dto.isReceived,
                )
            }
            is CallStateDto.ExchangingKeys -> {
                return TdApi.CallStateExchangingKeys(
                )
            }
            is CallStateDto.Ready -> {
                return TdApi.CallStateReady(
                    protocol = map(dto.protocol),
                    servers = dto.servers.mapArray { map(it) },
                    config = dto.config,
                    encryptionKey = dto.encryptionKey,
                    emojis = dto.emojis,
                    allowP2p = dto.allowP2p,
                    isGroupCallSupported = dto.isGroupCallSupported,
                    customParameters = dto.customParameters,
                )
            }
            is CallStateDto.HangingUp -> {
                return TdApi.CallStateHangingUp(
                )
            }
            is CallStateDto.Discarded -> {
                return TdApi.CallStateDiscarded(
                    reason = map(dto.reason),
                    needRating = dto.needRating,
                    needDebugInformation = dto.needDebugInformation,
                    needLog = dto.needLog,
                )
            }
            is CallStateDto.Error -> {
                return TdApi.CallStateError(
                    error = map(dto.error),
                )
            }
        }
    }

    fun map(dto: TdApi.CallbackQueryPayload): CallbackQueryPayloadDto {
        when(dto) {
            is TdApi.CallbackQueryPayloadData -> {
                return CallbackQueryPayloadDto.Data(
                    data = dto.data,
                )
            }
            is TdApi.CallbackQueryPayloadDataWithPassword -> {
                return CallbackQueryPayloadDto.DataWithPassword(
                    password = dto.password,
                    data = dto.data,
                )
            }
            is TdApi.CallbackQueryPayloadGame -> {
                return CallbackQueryPayloadDto.Game(
                    gameShortName = dto.gameShortName,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CallbackQueryPayloadDto): TdApi.CallbackQueryPayload {
        when(dto) {
            is CallbackQueryPayloadDto.Data -> {
                return TdApi.CallbackQueryPayloadData(
                    data = dto.data,
                )
            }
            is CallbackQueryPayloadDto.DataWithPassword -> {
                return TdApi.CallbackQueryPayloadDataWithPassword(
                    password = dto.password,
                    data = dto.data,
                )
            }
            is CallbackQueryPayloadDto.Game -> {
                return TdApi.CallbackQueryPayloadGame(
                    gameShortName = dto.gameShortName,
                )
            }
        }
    }

    fun map(dto: TdApi.CanPostStoryResult): CanPostStoryResultDto {
        when(dto) {
            is TdApi.CanPostStoryResultOk -> {
                return CanPostStoryResultDto.Ok(
                )
            }
            is TdApi.CanPostStoryResultPremiumNeeded -> {
                return CanPostStoryResultDto.PremiumNeeded(
                )
            }
            is TdApi.CanPostStoryResultBoostNeeded -> {
                return CanPostStoryResultDto.BoostNeeded(
                )
            }
            is TdApi.CanPostStoryResultActiveStoryLimitExceeded -> {
                return CanPostStoryResultDto.ActiveStoryLimitExceeded(
                )
            }
            is TdApi.CanPostStoryResultWeeklyLimitExceeded -> {
                return CanPostStoryResultDto.WeeklyLimitExceeded(
                    retryAfter = dto.retryAfter,
                )
            }
            is TdApi.CanPostStoryResultMonthlyLimitExceeded -> {
                return CanPostStoryResultDto.MonthlyLimitExceeded(
                    retryAfter = dto.retryAfter,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CanPostStoryResultDto): TdApi.CanPostStoryResult {
        when(dto) {
            is CanPostStoryResultDto.Ok -> {
                return TdApi.CanPostStoryResultOk(
                )
            }
            is CanPostStoryResultDto.PremiumNeeded -> {
                return TdApi.CanPostStoryResultPremiumNeeded(
                )
            }
            is CanPostStoryResultDto.BoostNeeded -> {
                return TdApi.CanPostStoryResultBoostNeeded(
                )
            }
            is CanPostStoryResultDto.ActiveStoryLimitExceeded -> {
                return TdApi.CanPostStoryResultActiveStoryLimitExceeded(
                )
            }
            is CanPostStoryResultDto.WeeklyLimitExceeded -> {
                return TdApi.CanPostStoryResultWeeklyLimitExceeded(
                    retryAfter = dto.retryAfter,
                )
            }
            is CanPostStoryResultDto.MonthlyLimitExceeded -> {
                return TdApi.CanPostStoryResultMonthlyLimitExceeded(
                    retryAfter = dto.retryAfter,
                )
            }
        }
    }

    fun map(dto: TdApi.CanSendMessageToUserResult): CanSendMessageToUserResultDto {
        when(dto) {
            is TdApi.CanSendMessageToUserResultOk -> {
                return CanSendMessageToUserResultDto.Ok(
                )
            }
            is TdApi.CanSendMessageToUserResultUserHasPaidMessages -> {
                return CanSendMessageToUserResultDto.UserHasPaidMessages(
                    outgoingPaidMessageStarCount = dto.outgoingPaidMessageStarCount,
                )
            }
            is TdApi.CanSendMessageToUserResultUserIsDeleted -> {
                return CanSendMessageToUserResultDto.UserIsDeleted(
                )
            }
            is TdApi.CanSendMessageToUserResultUserRestrictsNewChats -> {
                return CanSendMessageToUserResultDto.UserRestrictsNewChats(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CanSendMessageToUserResultDto): TdApi.CanSendMessageToUserResult {
        when(dto) {
            is CanSendMessageToUserResultDto.Ok -> {
                return TdApi.CanSendMessageToUserResultOk(
                )
            }
            is CanSendMessageToUserResultDto.UserHasPaidMessages -> {
                return TdApi.CanSendMessageToUserResultUserHasPaidMessages(
                    outgoingPaidMessageStarCount = dto.outgoingPaidMessageStarCount,
                )
            }
            is CanSendMessageToUserResultDto.UserIsDeleted -> {
                return TdApi.CanSendMessageToUserResultUserIsDeleted(
                )
            }
            is CanSendMessageToUserResultDto.UserRestrictsNewChats -> {
                return TdApi.CanSendMessageToUserResultUserRestrictsNewChats(
                )
            }
        }
    }

    fun map(dto: TdApi.CanTransferOwnershipResult): CanTransferOwnershipResultDto {
        when(dto) {
            is TdApi.CanTransferOwnershipResultOk -> {
                return CanTransferOwnershipResultDto.Ok(
                )
            }
            is TdApi.CanTransferOwnershipResultPasswordNeeded -> {
                return CanTransferOwnershipResultDto.PasswordNeeded(
                )
            }
            is TdApi.CanTransferOwnershipResultPasswordTooFresh -> {
                return CanTransferOwnershipResultDto.PasswordTooFresh(
                    retryAfter = dto.retryAfter,
                )
            }
            is TdApi.CanTransferOwnershipResultSessionTooFresh -> {
                return CanTransferOwnershipResultDto.SessionTooFresh(
                    retryAfter = dto.retryAfter,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CanTransferOwnershipResultDto): TdApi.CanTransferOwnershipResult {
        when(dto) {
            is CanTransferOwnershipResultDto.Ok -> {
                return TdApi.CanTransferOwnershipResultOk(
                )
            }
            is CanTransferOwnershipResultDto.PasswordNeeded -> {
                return TdApi.CanTransferOwnershipResultPasswordNeeded(
                )
            }
            is CanTransferOwnershipResultDto.PasswordTooFresh -> {
                return TdApi.CanTransferOwnershipResultPasswordTooFresh(
                    retryAfter = dto.retryAfter,
                )
            }
            is CanTransferOwnershipResultDto.SessionTooFresh -> {
                return TdApi.CanTransferOwnershipResultSessionTooFresh(
                    retryAfter = dto.retryAfter,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatAction): ChatActionDto {
        when(dto) {
            is TdApi.ChatActionTyping -> {
                return ChatActionDto.Typing(
                )
            }
            is TdApi.ChatActionRecordingVideo -> {
                return ChatActionDto.RecordingVideo(
                )
            }
            is TdApi.ChatActionUploadingVideo -> {
                return ChatActionDto.UploadingVideo(
                    progress = dto.progress,
                )
            }
            is TdApi.ChatActionRecordingVoiceNote -> {
                return ChatActionDto.RecordingVoiceNote(
                )
            }
            is TdApi.ChatActionUploadingVoiceNote -> {
                return ChatActionDto.UploadingVoiceNote(
                    progress = dto.progress,
                )
            }
            is TdApi.ChatActionUploadingPhoto -> {
                return ChatActionDto.UploadingPhoto(
                    progress = dto.progress,
                )
            }
            is TdApi.ChatActionUploadingDocument -> {
                return ChatActionDto.UploadingDocument(
                    progress = dto.progress,
                )
            }
            is TdApi.ChatActionChoosingSticker -> {
                return ChatActionDto.ChoosingSticker(
                )
            }
            is TdApi.ChatActionChoosingLocation -> {
                return ChatActionDto.ChoosingLocation(
                )
            }
            is TdApi.ChatActionChoosingContact -> {
                return ChatActionDto.ChoosingContact(
                )
            }
            is TdApi.ChatActionStartPlayingGame -> {
                return ChatActionDto.StartPlayingGame(
                )
            }
            is TdApi.ChatActionRecordingVideoNote -> {
                return ChatActionDto.RecordingVideoNote(
                )
            }
            is TdApi.ChatActionUploadingVideoNote -> {
                return ChatActionDto.UploadingVideoNote(
                    progress = dto.progress,
                )
            }
            is TdApi.ChatActionWatchingAnimations -> {
                return ChatActionDto.WatchingAnimations(
                    emoji = dto.emoji,
                )
            }
            is TdApi.ChatActionCancel -> {
                return ChatActionDto.Cancel(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatActionDto): TdApi.ChatAction {
        when(dto) {
            is ChatActionDto.Typing -> {
                return TdApi.ChatActionTyping(
                )
            }
            is ChatActionDto.RecordingVideo -> {
                return TdApi.ChatActionRecordingVideo(
                )
            }
            is ChatActionDto.UploadingVideo -> {
                return TdApi.ChatActionUploadingVideo(
                    progress = dto.progress,
                )
            }
            is ChatActionDto.RecordingVoiceNote -> {
                return TdApi.ChatActionRecordingVoiceNote(
                )
            }
            is ChatActionDto.UploadingVoiceNote -> {
                return TdApi.ChatActionUploadingVoiceNote(
                    progress = dto.progress,
                )
            }
            is ChatActionDto.UploadingPhoto -> {
                return TdApi.ChatActionUploadingPhoto(
                    progress = dto.progress,
                )
            }
            is ChatActionDto.UploadingDocument -> {
                return TdApi.ChatActionUploadingDocument(
                    progress = dto.progress,
                )
            }
            is ChatActionDto.ChoosingSticker -> {
                return TdApi.ChatActionChoosingSticker(
                )
            }
            is ChatActionDto.ChoosingLocation -> {
                return TdApi.ChatActionChoosingLocation(
                )
            }
            is ChatActionDto.ChoosingContact -> {
                return TdApi.ChatActionChoosingContact(
                )
            }
            is ChatActionDto.StartPlayingGame -> {
                return TdApi.ChatActionStartPlayingGame(
                )
            }
            is ChatActionDto.RecordingVideoNote -> {
                return TdApi.ChatActionRecordingVideoNote(
                )
            }
            is ChatActionDto.UploadingVideoNote -> {
                return TdApi.ChatActionUploadingVideoNote(
                    progress = dto.progress,
                )
            }
            is ChatActionDto.WatchingAnimations -> {
                return TdApi.ChatActionWatchingAnimations(
                    emoji = dto.emoji,
                )
            }
            is ChatActionDto.Cancel -> {
                return TdApi.ChatActionCancel(
                )
            }
        }
    }

    fun map(dto: TdApi.ChatActionBar): ChatActionBarDto {
        when(dto) {
            is TdApi.ChatActionBarReportSpam -> {
                return ChatActionBarDto.ReportSpam(
                    canUnarchive = dto.canUnarchive,
                )
            }
            is TdApi.ChatActionBarInviteMembers -> {
                return ChatActionBarDto.InviteMembers(
                )
            }
            is TdApi.ChatActionBarReportAddBlock -> {
                return ChatActionBarDto.ReportAddBlock(
                    canUnarchive = dto.canUnarchive,
                    accountInfo = dto.accountInfo?.let { map(it) },
                )
            }
            is TdApi.ChatActionBarAddContact -> {
                return ChatActionBarDto.AddContact(
                )
            }
            is TdApi.ChatActionBarSharePhoneNumber -> {
                return ChatActionBarDto.SharePhoneNumber(
                )
            }
            is TdApi.ChatActionBarJoinRequest -> {
                return ChatActionBarDto.JoinRequest(
                    title = dto.title,
                    isChannel = dto.isChannel,
                    requestDate = dto.requestDate,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatActionBarDto): TdApi.ChatActionBar {
        when(dto) {
            is ChatActionBarDto.ReportSpam -> {
                return TdApi.ChatActionBarReportSpam(
                    canUnarchive = dto.canUnarchive,
                )
            }
            is ChatActionBarDto.InviteMembers -> {
                return TdApi.ChatActionBarInviteMembers(
                )
            }
            is ChatActionBarDto.ReportAddBlock -> {
                return TdApi.ChatActionBarReportAddBlock(
                    canUnarchive = dto.canUnarchive,
                    accountInfo = dto.accountInfo?.let { map(it) },
                )
            }
            is ChatActionBarDto.AddContact -> {
                return TdApi.ChatActionBarAddContact(
                )
            }
            is ChatActionBarDto.SharePhoneNumber -> {
                return TdApi.ChatActionBarSharePhoneNumber(
                )
            }
            is ChatActionBarDto.JoinRequest -> {
                return TdApi.ChatActionBarJoinRequest(
                    title = dto.title,
                    isChannel = dto.isChannel,
                    requestDate = dto.requestDate,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatAvailableReactions): ChatAvailableReactionsDto {
        when(dto) {
            is TdApi.ChatAvailableReactionsAll -> {
                return ChatAvailableReactionsDto.All(
                    maxReactionCount = dto.maxReactionCount,
                )
            }
            is TdApi.ChatAvailableReactionsSome -> {
                return ChatAvailableReactionsDto.Some(
                    reactions = dto.reactions.mapArray { map(it) },
                    maxReactionCount = dto.maxReactionCount,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatAvailableReactionsDto): TdApi.ChatAvailableReactions {
        when(dto) {
            is ChatAvailableReactionsDto.All -> {
                return TdApi.ChatAvailableReactionsAll(
                    maxReactionCount = dto.maxReactionCount,
                )
            }
            is ChatAvailableReactionsDto.Some -> {
                return TdApi.ChatAvailableReactionsSome(
                    reactions = dto.reactions.mapArray { map(it) },
                    maxReactionCount = dto.maxReactionCount,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatBoostSource): ChatBoostSourceDto {
        when(dto) {
            is TdApi.ChatBoostSourceGiftCode -> {
                return ChatBoostSourceDto.GiftCode(
                    userId = dto.userId,
                    giftCode = dto.giftCode,
                )
            }
            is TdApi.ChatBoostSourceGiveaway -> {
                return ChatBoostSourceDto.Giveaway(
                    userId = dto.userId,
                    giftCode = dto.giftCode,
                    starCount = dto.starCount,
                    giveawayMessageId = dto.giveawayMessageId,
                    isUnclaimed = dto.isUnclaimed,
                )
            }
            is TdApi.ChatBoostSourcePremium -> {
                return ChatBoostSourceDto.Premium(
                    userId = dto.userId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatBoostSourceDto): TdApi.ChatBoostSource {
        when(dto) {
            is ChatBoostSourceDto.GiftCode -> {
                return TdApi.ChatBoostSourceGiftCode(
                    userId = dto.userId,
                    giftCode = dto.giftCode,
                )
            }
            is ChatBoostSourceDto.Giveaway -> {
                return TdApi.ChatBoostSourceGiveaway(
                    userId = dto.userId,
                    giftCode = dto.giftCode,
                    starCount = dto.starCount,
                    giveawayMessageId = dto.giveawayMessageId,
                    isUnclaimed = dto.isUnclaimed,
                )
            }
            is ChatBoostSourceDto.Premium -> {
                return TdApi.ChatBoostSourcePremium(
                    userId = dto.userId,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatEventAction): ChatEventActionDto {
        when(dto) {
            is TdApi.ChatEventMessageEdited -> {
                return ChatEventActionDto.MessageEdited(
                    oldMessage = map(dto.oldMessage),
                    newMessage = map(dto.newMessage),
                )
            }
            is TdApi.ChatEventMessageDeleted -> {
                return ChatEventActionDto.MessageDeleted(
                    message = map(dto.message),
                    canReportAntiSpamFalsePositive = dto.canReportAntiSpamFalsePositive,
                )
            }
            is TdApi.ChatEventMessagePinned -> {
                return ChatEventActionDto.MessagePinned(
                    message = map(dto.message),
                )
            }
            is TdApi.ChatEventMessageUnpinned -> {
                return ChatEventActionDto.MessageUnpinned(
                    message = map(dto.message),
                )
            }
            is TdApi.ChatEventPollStopped -> {
                return ChatEventActionDto.PollStopped(
                    message = map(dto.message),
                )
            }
            is TdApi.ChatEventMemberJoined -> {
                return ChatEventActionDto.MemberJoined(
                )
            }
            is TdApi.ChatEventMemberJoinedByInviteLink -> {
                return ChatEventActionDto.MemberJoinedByInviteLink(
                    inviteLink = map(dto.inviteLink),
                    viaChatFolderInviteLink = dto.viaChatFolderInviteLink,
                )
            }
            is TdApi.ChatEventMemberJoinedByRequest -> {
                return ChatEventActionDto.MemberJoinedByRequest(
                    approverUserId = dto.approverUserId,
                    inviteLink = dto.inviteLink?.let { map(it) },
                )
            }
            is TdApi.ChatEventMemberInvited -> {
                return ChatEventActionDto.MemberInvited(
                    userId = dto.userId,
                    status = map(dto.status),
                )
            }
            is TdApi.ChatEventMemberLeft -> {
                return ChatEventActionDto.MemberLeft(
                )
            }
            is TdApi.ChatEventMemberPromoted -> {
                return ChatEventActionDto.MemberPromoted(
                    userId = dto.userId,
                    oldStatus = map(dto.oldStatus),
                    newStatus = map(dto.newStatus),
                )
            }
            is TdApi.ChatEventMemberRestricted -> {
                return ChatEventActionDto.MemberRestricted(
                    memberId = map(dto.memberId),
                    oldStatus = map(dto.oldStatus),
                    newStatus = map(dto.newStatus),
                )
            }
            is TdApi.ChatEventMemberSubscriptionExtended -> {
                return ChatEventActionDto.MemberSubscriptionExtended(
                    userId = dto.userId,
                    oldStatus = map(dto.oldStatus),
                    newStatus = map(dto.newStatus),
                )
            }
            is TdApi.ChatEventAvailableReactionsChanged -> {
                return ChatEventActionDto.AvailableReactionsChanged(
                    oldAvailableReactions = map(dto.oldAvailableReactions),
                    newAvailableReactions = map(dto.newAvailableReactions),
                )
            }
            is TdApi.ChatEventBackgroundChanged -> {
                return ChatEventActionDto.BackgroundChanged(
                    oldBackground = dto.oldBackground?.let { map(it) },
                    newBackground = dto.newBackground?.let { map(it) },
                )
            }
            is TdApi.ChatEventDescriptionChanged -> {
                return ChatEventActionDto.DescriptionChanged(
                    oldDescription = dto.oldDescription,
                    newDescription = dto.newDescription,
                )
            }
            is TdApi.ChatEventEmojiStatusChanged -> {
                return ChatEventActionDto.EmojiStatusChanged(
                    oldEmojiStatus = dto.oldEmojiStatus?.let { map(it) },
                    newEmojiStatus = dto.newEmojiStatus?.let { map(it) },
                )
            }
            is TdApi.ChatEventLinkedChatChanged -> {
                return ChatEventActionDto.LinkedChatChanged(
                    oldLinkedChatId = dto.oldLinkedChatId,
                    newLinkedChatId = dto.newLinkedChatId,
                )
            }
            is TdApi.ChatEventLocationChanged -> {
                return ChatEventActionDto.LocationChanged(
                    oldLocation = dto.oldLocation?.let { map(it) },
                    newLocation = dto.newLocation?.let { map(it) },
                )
            }
            is TdApi.ChatEventMessageAutoDeleteTimeChanged -> {
                return ChatEventActionDto.MessageAutoDeleteTimeChanged(
                    oldMessageAutoDeleteTime = dto.oldMessageAutoDeleteTime,
                    newMessageAutoDeleteTime = dto.newMessageAutoDeleteTime,
                )
            }
            is TdApi.ChatEventPermissionsChanged -> {
                return ChatEventActionDto.PermissionsChanged(
                    oldPermissions = map(dto.oldPermissions),
                    newPermissions = map(dto.newPermissions),
                )
            }
            is TdApi.ChatEventPhotoChanged -> {
                return ChatEventActionDto.PhotoChanged(
                    oldPhoto = dto.oldPhoto?.let { map(it) },
                    newPhoto = dto.newPhoto?.let { map(it) },
                )
            }
            is TdApi.ChatEventSlowModeDelayChanged -> {
                return ChatEventActionDto.SlowModeDelayChanged(
                    oldSlowModeDelay = dto.oldSlowModeDelay,
                    newSlowModeDelay = dto.newSlowModeDelay,
                )
            }
            is TdApi.ChatEventStickerSetChanged -> {
                return ChatEventActionDto.StickerSetChanged(
                    oldStickerSetId = dto.oldStickerSetId,
                    newStickerSetId = dto.newStickerSetId,
                )
            }
            is TdApi.ChatEventCustomEmojiStickerSetChanged -> {
                return ChatEventActionDto.CustomEmojiStickerSetChanged(
                    oldStickerSetId = dto.oldStickerSetId,
                    newStickerSetId = dto.newStickerSetId,
                )
            }
            is TdApi.ChatEventTitleChanged -> {
                return ChatEventActionDto.TitleChanged(
                    oldTitle = dto.oldTitle,
                    newTitle = dto.newTitle,
                )
            }
            is TdApi.ChatEventUsernameChanged -> {
                return ChatEventActionDto.UsernameChanged(
                    oldUsername = dto.oldUsername,
                    newUsername = dto.newUsername,
                )
            }
            is TdApi.ChatEventActiveUsernamesChanged -> {
                return ChatEventActionDto.ActiveUsernamesChanged(
                    oldUsernames = dto.oldUsernames,
                    newUsernames = dto.newUsernames,
                )
            }
            is TdApi.ChatEventAccentColorChanged -> {
                return ChatEventActionDto.AccentColorChanged(
                    oldAccentColorId = dto.oldAccentColorId,
                    oldBackgroundCustomEmojiId = dto.oldBackgroundCustomEmojiId,
                    newAccentColorId = dto.newAccentColorId,
                    newBackgroundCustomEmojiId = dto.newBackgroundCustomEmojiId,
                )
            }
            is TdApi.ChatEventProfileAccentColorChanged -> {
                return ChatEventActionDto.ProfileAccentColorChanged(
                    oldProfileAccentColorId = dto.oldProfileAccentColorId,
                    oldProfileBackgroundCustomEmojiId = dto.oldProfileBackgroundCustomEmojiId,
                    newProfileAccentColorId = dto.newProfileAccentColorId,
                    newProfileBackgroundCustomEmojiId = dto.newProfileBackgroundCustomEmojiId,
                )
            }
            is TdApi.ChatEventHasProtectedContentToggled -> {
                return ChatEventActionDto.HasProtectedContentToggled(
                    hasProtectedContent = dto.hasProtectedContent,
                )
            }
            is TdApi.ChatEventInvitesToggled -> {
                return ChatEventActionDto.InvitesToggled(
                    canInviteUsers = dto.canInviteUsers,
                )
            }
            is TdApi.ChatEventIsAllHistoryAvailableToggled -> {
                return ChatEventActionDto.IsAllHistoryAvailableToggled(
                    isAllHistoryAvailable = dto.isAllHistoryAvailable,
                )
            }
            is TdApi.ChatEventHasAggressiveAntiSpamEnabledToggled -> {
                return ChatEventActionDto.HasAggressiveAntiSpamEnabledToggled(
                    hasAggressiveAntiSpamEnabled = dto.hasAggressiveAntiSpamEnabled,
                )
            }
            is TdApi.ChatEventSignMessagesToggled -> {
                return ChatEventActionDto.SignMessagesToggled(
                    signMessages = dto.signMessages,
                )
            }
            is TdApi.ChatEventShowMessageSenderToggled -> {
                return ChatEventActionDto.ShowMessageSenderToggled(
                    showMessageSender = dto.showMessageSender,
                )
            }
            is TdApi.ChatEventInviteLinkEdited -> {
                return ChatEventActionDto.InviteLinkEdited(
                    oldInviteLink = map(dto.oldInviteLink),
                    newInviteLink = map(dto.newInviteLink),
                )
            }
            is TdApi.ChatEventInviteLinkRevoked -> {
                return ChatEventActionDto.InviteLinkRevoked(
                    inviteLink = map(dto.inviteLink),
                )
            }
            is TdApi.ChatEventInviteLinkDeleted -> {
                return ChatEventActionDto.InviteLinkDeleted(
                    inviteLink = map(dto.inviteLink),
                )
            }
            is TdApi.ChatEventVideoChatCreated -> {
                return ChatEventActionDto.VideoChatCreated(
                    groupCallId = dto.groupCallId,
                )
            }
            is TdApi.ChatEventVideoChatEnded -> {
                return ChatEventActionDto.VideoChatEnded(
                    groupCallId = dto.groupCallId,
                )
            }
            is TdApi.ChatEventVideoChatMuteNewParticipantsToggled -> {
                return ChatEventActionDto.VideoChatMuteNewParticipantsToggled(
                    muteNewParticipants = dto.muteNewParticipants,
                )
            }
            is TdApi.ChatEventVideoChatParticipantIsMutedToggled -> {
                return ChatEventActionDto.VideoChatParticipantIsMutedToggled(
                    participantId = map(dto.participantId),
                    isMuted = dto.isMuted,
                )
            }
            is TdApi.ChatEventVideoChatParticipantVolumeLevelChanged -> {
                return ChatEventActionDto.VideoChatParticipantVolumeLevelChanged(
                    participantId = map(dto.participantId),
                    volumeLevel = dto.volumeLevel,
                )
            }
            is TdApi.ChatEventIsForumToggled -> {
                return ChatEventActionDto.IsForumToggled(
                    isForum = dto.isForum,
                )
            }
            is TdApi.ChatEventForumTopicCreated -> {
                return ChatEventActionDto.ForumTopicCreated(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is TdApi.ChatEventForumTopicEdited -> {
                return ChatEventActionDto.ForumTopicEdited(
                    oldTopicInfo = map(dto.oldTopicInfo),
                    newTopicInfo = map(dto.newTopicInfo),
                )
            }
            is TdApi.ChatEventForumTopicToggleIsClosed -> {
                return ChatEventActionDto.ForumTopicToggleIsClosed(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is TdApi.ChatEventForumTopicToggleIsHidden -> {
                return ChatEventActionDto.ForumTopicToggleIsHidden(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is TdApi.ChatEventForumTopicDeleted -> {
                return ChatEventActionDto.ForumTopicDeleted(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is TdApi.ChatEventForumTopicPinned -> {
                return ChatEventActionDto.ForumTopicPinned(
                    oldTopicInfo = dto.oldTopicInfo?.let { map(it) },
                    newTopicInfo = dto.newTopicInfo?.let { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatEventActionDto): TdApi.ChatEventAction {
        when(dto) {
            is ChatEventActionDto.MessageEdited -> {
                return TdApi.ChatEventMessageEdited(
                    oldMessage = map(dto.oldMessage),
                    newMessage = map(dto.newMessage),
                )
            }
            is ChatEventActionDto.MessageDeleted -> {
                return TdApi.ChatEventMessageDeleted(
                    message = map(dto.message),
                    canReportAntiSpamFalsePositive = dto.canReportAntiSpamFalsePositive,
                )
            }
            is ChatEventActionDto.MessagePinned -> {
                return TdApi.ChatEventMessagePinned(
                    message = map(dto.message),
                )
            }
            is ChatEventActionDto.MessageUnpinned -> {
                return TdApi.ChatEventMessageUnpinned(
                    message = map(dto.message),
                )
            }
            is ChatEventActionDto.PollStopped -> {
                return TdApi.ChatEventPollStopped(
                    message = map(dto.message),
                )
            }
            is ChatEventActionDto.MemberJoined -> {
                return TdApi.ChatEventMemberJoined(
                )
            }
            is ChatEventActionDto.MemberJoinedByInviteLink -> {
                return TdApi.ChatEventMemberJoinedByInviteLink(
                    inviteLink = map(dto.inviteLink),
                    viaChatFolderInviteLink = dto.viaChatFolderInviteLink,
                )
            }
            is ChatEventActionDto.MemberJoinedByRequest -> {
                return TdApi.ChatEventMemberJoinedByRequest(
                    approverUserId = dto.approverUserId,
                    inviteLink = dto.inviteLink?.let { map(it) },
                )
            }
            is ChatEventActionDto.MemberInvited -> {
                return TdApi.ChatEventMemberInvited(
                    userId = dto.userId,
                    status = map(dto.status),
                )
            }
            is ChatEventActionDto.MemberLeft -> {
                return TdApi.ChatEventMemberLeft(
                )
            }
            is ChatEventActionDto.MemberPromoted -> {
                return TdApi.ChatEventMemberPromoted(
                    userId = dto.userId,
                    oldStatus = map(dto.oldStatus),
                    newStatus = map(dto.newStatus),
                )
            }
            is ChatEventActionDto.MemberRestricted -> {
                return TdApi.ChatEventMemberRestricted(
                    memberId = map(dto.memberId),
                    oldStatus = map(dto.oldStatus),
                    newStatus = map(dto.newStatus),
                )
            }
            is ChatEventActionDto.MemberSubscriptionExtended -> {
                return TdApi.ChatEventMemberSubscriptionExtended(
                    userId = dto.userId,
                    oldStatus = map(dto.oldStatus),
                    newStatus = map(dto.newStatus),
                )
            }
            is ChatEventActionDto.AvailableReactionsChanged -> {
                return TdApi.ChatEventAvailableReactionsChanged(
                    oldAvailableReactions = map(dto.oldAvailableReactions),
                    newAvailableReactions = map(dto.newAvailableReactions),
                )
            }
            is ChatEventActionDto.BackgroundChanged -> {
                return TdApi.ChatEventBackgroundChanged(
                    oldBackground = dto.oldBackground?.let { map(it) },
                    newBackground = dto.newBackground?.let { map(it) },
                )
            }
            is ChatEventActionDto.DescriptionChanged -> {
                return TdApi.ChatEventDescriptionChanged(
                    oldDescription = dto.oldDescription,
                    newDescription = dto.newDescription,
                )
            }
            is ChatEventActionDto.EmojiStatusChanged -> {
                return TdApi.ChatEventEmojiStatusChanged(
                    oldEmojiStatus = dto.oldEmojiStatus?.let { map(it) },
                    newEmojiStatus = dto.newEmojiStatus?.let { map(it) },
                )
            }
            is ChatEventActionDto.LinkedChatChanged -> {
                return TdApi.ChatEventLinkedChatChanged(
                    oldLinkedChatId = dto.oldLinkedChatId,
                    newLinkedChatId = dto.newLinkedChatId,
                )
            }
            is ChatEventActionDto.LocationChanged -> {
                return TdApi.ChatEventLocationChanged(
                    oldLocation = dto.oldLocation?.let { map(it) },
                    newLocation = dto.newLocation?.let { map(it) },
                )
            }
            is ChatEventActionDto.MessageAutoDeleteTimeChanged -> {
                return TdApi.ChatEventMessageAutoDeleteTimeChanged(
                    oldMessageAutoDeleteTime = dto.oldMessageAutoDeleteTime,
                    newMessageAutoDeleteTime = dto.newMessageAutoDeleteTime,
                )
            }
            is ChatEventActionDto.PermissionsChanged -> {
                return TdApi.ChatEventPermissionsChanged(
                    oldPermissions = map(dto.oldPermissions),
                    newPermissions = map(dto.newPermissions),
                )
            }
            is ChatEventActionDto.PhotoChanged -> {
                return TdApi.ChatEventPhotoChanged(
                    oldPhoto = dto.oldPhoto?.let { map(it) },
                    newPhoto = dto.newPhoto?.let { map(it) },
                )
            }
            is ChatEventActionDto.SlowModeDelayChanged -> {
                return TdApi.ChatEventSlowModeDelayChanged(
                    oldSlowModeDelay = dto.oldSlowModeDelay,
                    newSlowModeDelay = dto.newSlowModeDelay,
                )
            }
            is ChatEventActionDto.StickerSetChanged -> {
                return TdApi.ChatEventStickerSetChanged(
                    oldStickerSetId = dto.oldStickerSetId,
                    newStickerSetId = dto.newStickerSetId,
                )
            }
            is ChatEventActionDto.CustomEmojiStickerSetChanged -> {
                return TdApi.ChatEventCustomEmojiStickerSetChanged(
                    oldStickerSetId = dto.oldStickerSetId,
                    newStickerSetId = dto.newStickerSetId,
                )
            }
            is ChatEventActionDto.TitleChanged -> {
                return TdApi.ChatEventTitleChanged(
                    oldTitle = dto.oldTitle,
                    newTitle = dto.newTitle,
                )
            }
            is ChatEventActionDto.UsernameChanged -> {
                return TdApi.ChatEventUsernameChanged(
                    oldUsername = dto.oldUsername,
                    newUsername = dto.newUsername,
                )
            }
            is ChatEventActionDto.ActiveUsernamesChanged -> {
                return TdApi.ChatEventActiveUsernamesChanged(
                    oldUsernames = dto.oldUsernames,
                    newUsernames = dto.newUsernames,
                )
            }
            is ChatEventActionDto.AccentColorChanged -> {
                return TdApi.ChatEventAccentColorChanged(
                    oldAccentColorId = dto.oldAccentColorId,
                    oldBackgroundCustomEmojiId = dto.oldBackgroundCustomEmojiId,
                    newAccentColorId = dto.newAccentColorId,
                    newBackgroundCustomEmojiId = dto.newBackgroundCustomEmojiId,
                )
            }
            is ChatEventActionDto.ProfileAccentColorChanged -> {
                return TdApi.ChatEventProfileAccentColorChanged(
                    oldProfileAccentColorId = dto.oldProfileAccentColorId,
                    oldProfileBackgroundCustomEmojiId = dto.oldProfileBackgroundCustomEmojiId,
                    newProfileAccentColorId = dto.newProfileAccentColorId,
                    newProfileBackgroundCustomEmojiId = dto.newProfileBackgroundCustomEmojiId,
                )
            }
            is ChatEventActionDto.HasProtectedContentToggled -> {
                return TdApi.ChatEventHasProtectedContentToggled(
                    hasProtectedContent = dto.hasProtectedContent,
                )
            }
            is ChatEventActionDto.InvitesToggled -> {
                return TdApi.ChatEventInvitesToggled(
                    canInviteUsers = dto.canInviteUsers,
                )
            }
            is ChatEventActionDto.IsAllHistoryAvailableToggled -> {
                return TdApi.ChatEventIsAllHistoryAvailableToggled(
                    isAllHistoryAvailable = dto.isAllHistoryAvailable,
                )
            }
            is ChatEventActionDto.HasAggressiveAntiSpamEnabledToggled -> {
                return TdApi.ChatEventHasAggressiveAntiSpamEnabledToggled(
                    hasAggressiveAntiSpamEnabled = dto.hasAggressiveAntiSpamEnabled,
                )
            }
            is ChatEventActionDto.SignMessagesToggled -> {
                return TdApi.ChatEventSignMessagesToggled(
                    signMessages = dto.signMessages,
                )
            }
            is ChatEventActionDto.ShowMessageSenderToggled -> {
                return TdApi.ChatEventShowMessageSenderToggled(
                    showMessageSender = dto.showMessageSender,
                )
            }
            is ChatEventActionDto.InviteLinkEdited -> {
                return TdApi.ChatEventInviteLinkEdited(
                    oldInviteLink = map(dto.oldInviteLink),
                    newInviteLink = map(dto.newInviteLink),
                )
            }
            is ChatEventActionDto.InviteLinkRevoked -> {
                return TdApi.ChatEventInviteLinkRevoked(
                    inviteLink = map(dto.inviteLink),
                )
            }
            is ChatEventActionDto.InviteLinkDeleted -> {
                return TdApi.ChatEventInviteLinkDeleted(
                    inviteLink = map(dto.inviteLink),
                )
            }
            is ChatEventActionDto.VideoChatCreated -> {
                return TdApi.ChatEventVideoChatCreated(
                    groupCallId = dto.groupCallId,
                )
            }
            is ChatEventActionDto.VideoChatEnded -> {
                return TdApi.ChatEventVideoChatEnded(
                    groupCallId = dto.groupCallId,
                )
            }
            is ChatEventActionDto.VideoChatMuteNewParticipantsToggled -> {
                return TdApi.ChatEventVideoChatMuteNewParticipantsToggled(
                    muteNewParticipants = dto.muteNewParticipants,
                )
            }
            is ChatEventActionDto.VideoChatParticipantIsMutedToggled -> {
                return TdApi.ChatEventVideoChatParticipantIsMutedToggled(
                    participantId = map(dto.participantId),
                    isMuted = dto.isMuted,
                )
            }
            is ChatEventActionDto.VideoChatParticipantVolumeLevelChanged -> {
                return TdApi.ChatEventVideoChatParticipantVolumeLevelChanged(
                    participantId = map(dto.participantId),
                    volumeLevel = dto.volumeLevel,
                )
            }
            is ChatEventActionDto.IsForumToggled -> {
                return TdApi.ChatEventIsForumToggled(
                    isForum = dto.isForum,
                )
            }
            is ChatEventActionDto.ForumTopicCreated -> {
                return TdApi.ChatEventForumTopicCreated(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is ChatEventActionDto.ForumTopicEdited -> {
                return TdApi.ChatEventForumTopicEdited(
                    oldTopicInfo = map(dto.oldTopicInfo),
                    newTopicInfo = map(dto.newTopicInfo),
                )
            }
            is ChatEventActionDto.ForumTopicToggleIsClosed -> {
                return TdApi.ChatEventForumTopicToggleIsClosed(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is ChatEventActionDto.ForumTopicToggleIsHidden -> {
                return TdApi.ChatEventForumTopicToggleIsHidden(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is ChatEventActionDto.ForumTopicDeleted -> {
                return TdApi.ChatEventForumTopicDeleted(
                    topicInfo = map(dto.topicInfo),
                )
            }
            is ChatEventActionDto.ForumTopicPinned -> {
                return TdApi.ChatEventForumTopicPinned(
                    oldTopicInfo = dto.oldTopicInfo?.let { map(it) },
                    newTopicInfo = dto.newTopicInfo?.let { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.ChatList): ChatListDto {
        when(dto) {
            is TdApi.ChatListMain -> {
                return ChatListDto.Main(
                )
            }
            is TdApi.ChatListArchive -> {
                return ChatListDto.Archive(
                )
            }
            is TdApi.ChatListFolder -> {
                return ChatListDto.Folder(
                    chatFolderId = dto.chatFolderId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatListDto): TdApi.ChatList {
        when(dto) {
            is ChatListDto.Main -> {
                return TdApi.ChatListMain(
                )
            }
            is ChatListDto.Archive -> {
                return TdApi.ChatListArchive(
                )
            }
            is ChatListDto.Folder -> {
                return TdApi.ChatListFolder(
                    chatFolderId = dto.chatFolderId,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatMemberStatus): ChatMemberStatusDto {
        when(dto) {
            is TdApi.ChatMemberStatusCreator -> {
                return ChatMemberStatusDto.Creator(
                    customTitle = dto.customTitle,
                    isAnonymous = dto.isAnonymous,
                    isMember = dto.isMember,
                )
            }
            is TdApi.ChatMemberStatusAdministrator -> {
                return ChatMemberStatusDto.Administrator(
                    customTitle = dto.customTitle,
                    canBeEdited = dto.canBeEdited,
                    rights = map(dto.rights),
                )
            }
            is TdApi.ChatMemberStatusMember -> {
                return ChatMemberStatusDto.Member(
                    memberUntilDate = dto.memberUntilDate,
                )
            }
            is TdApi.ChatMemberStatusRestricted -> {
                return ChatMemberStatusDto.Restricted(
                    isMember = dto.isMember,
                    restrictedUntilDate = dto.restrictedUntilDate,
                    permissions = map(dto.permissions),
                )
            }
            is TdApi.ChatMemberStatusLeft -> {
                return ChatMemberStatusDto.Left(
                )
            }
            is TdApi.ChatMemberStatusBanned -> {
                return ChatMemberStatusDto.Banned(
                    bannedUntilDate = dto.bannedUntilDate,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatMemberStatusDto): TdApi.ChatMemberStatus {
        when(dto) {
            is ChatMemberStatusDto.Creator -> {
                return TdApi.ChatMemberStatusCreator(
                    customTitle = dto.customTitle,
                    isAnonymous = dto.isAnonymous,
                    isMember = dto.isMember,
                )
            }
            is ChatMemberStatusDto.Administrator -> {
                return TdApi.ChatMemberStatusAdministrator(
                    customTitle = dto.customTitle,
                    canBeEdited = dto.canBeEdited,
                    rights = map(dto.rights),
                )
            }
            is ChatMemberStatusDto.Member -> {
                return TdApi.ChatMemberStatusMember(
                    memberUntilDate = dto.memberUntilDate,
                )
            }
            is ChatMemberStatusDto.Restricted -> {
                return TdApi.ChatMemberStatusRestricted(
                    isMember = dto.isMember,
                    restrictedUntilDate = dto.restrictedUntilDate,
                    permissions = map(dto.permissions),
                )
            }
            is ChatMemberStatusDto.Left -> {
                return TdApi.ChatMemberStatusLeft(
                )
            }
            is ChatMemberStatusDto.Banned -> {
                return TdApi.ChatMemberStatusBanned(
                    bannedUntilDate = dto.bannedUntilDate,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatMembersFilter): ChatMembersFilterDto {
        when(dto) {
            is TdApi.ChatMembersFilterContacts -> {
                return ChatMembersFilterDto.Contacts(
                )
            }
            is TdApi.ChatMembersFilterAdministrators -> {
                return ChatMembersFilterDto.Administrators(
                )
            }
            is TdApi.ChatMembersFilterMembers -> {
                return ChatMembersFilterDto.Members(
                )
            }
            is TdApi.ChatMembersFilterMention -> {
                return ChatMembersFilterDto.Mention(
                    messageThreadId = dto.messageThreadId,
                )
            }
            is TdApi.ChatMembersFilterRestricted -> {
                return ChatMembersFilterDto.Restricted(
                )
            }
            is TdApi.ChatMembersFilterBanned -> {
                return ChatMembersFilterDto.Banned(
                )
            }
            is TdApi.ChatMembersFilterBots -> {
                return ChatMembersFilterDto.Bots(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatMembersFilterDto): TdApi.ChatMembersFilter {
        when(dto) {
            is ChatMembersFilterDto.Contacts -> {
                return TdApi.ChatMembersFilterContacts(
                )
            }
            is ChatMembersFilterDto.Administrators -> {
                return TdApi.ChatMembersFilterAdministrators(
                )
            }
            is ChatMembersFilterDto.Members -> {
                return TdApi.ChatMembersFilterMembers(
                )
            }
            is ChatMembersFilterDto.Mention -> {
                return TdApi.ChatMembersFilterMention(
                    messageThreadId = dto.messageThreadId,
                )
            }
            is ChatMembersFilterDto.Restricted -> {
                return TdApi.ChatMembersFilterRestricted(
                )
            }
            is ChatMembersFilterDto.Banned -> {
                return TdApi.ChatMembersFilterBanned(
                )
            }
            is ChatMembersFilterDto.Bots -> {
                return TdApi.ChatMembersFilterBots(
                )
            }
        }
    }

    fun map(dto: TdApi.ChatPhotoStickerType): ChatPhotoStickerTypeDto {
        when(dto) {
            is TdApi.ChatPhotoStickerTypeRegularOrMask -> {
                return ChatPhotoStickerTypeDto.RegularOrMask(
                    stickerSetId = dto.stickerSetId,
                    stickerId = dto.stickerId,
                )
            }
            is TdApi.ChatPhotoStickerTypeCustomEmoji -> {
                return ChatPhotoStickerTypeDto.CustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatPhotoStickerTypeDto): TdApi.ChatPhotoStickerType {
        when(dto) {
            is ChatPhotoStickerTypeDto.RegularOrMask -> {
                return TdApi.ChatPhotoStickerTypeRegularOrMask(
                    stickerSetId = dto.stickerSetId,
                    stickerId = dto.stickerId,
                )
            }
            is ChatPhotoStickerTypeDto.CustomEmoji -> {
                return TdApi.ChatPhotoStickerTypeCustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatRevenueTransactionType): ChatRevenueTransactionTypeDto {
        when(dto) {
            is TdApi.ChatRevenueTransactionTypeEarnings -> {
                return ChatRevenueTransactionTypeDto.Earnings(
                    startDate = dto.startDate,
                    endDate = dto.endDate,
                )
            }
            is TdApi.ChatRevenueTransactionTypeWithdrawal -> {
                return ChatRevenueTransactionTypeDto.Withdrawal(
                    withdrawalDate = dto.withdrawalDate,
                    provider = dto.provider,
                    state = map(dto.state),
                )
            }
            is TdApi.ChatRevenueTransactionTypeRefund -> {
                return ChatRevenueTransactionTypeDto.Refund(
                    refundDate = dto.refundDate,
                    provider = dto.provider,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatRevenueTransactionTypeDto): TdApi.ChatRevenueTransactionType {
        when(dto) {
            is ChatRevenueTransactionTypeDto.Earnings -> {
                return TdApi.ChatRevenueTransactionTypeEarnings(
                    startDate = dto.startDate,
                    endDate = dto.endDate,
                )
            }
            is ChatRevenueTransactionTypeDto.Withdrawal -> {
                return TdApi.ChatRevenueTransactionTypeWithdrawal(
                    withdrawalDate = dto.withdrawalDate,
                    provider = dto.provider,
                    state = map(dto.state),
                )
            }
            is ChatRevenueTransactionTypeDto.Refund -> {
                return TdApi.ChatRevenueTransactionTypeRefund(
                    refundDate = dto.refundDate,
                    provider = dto.provider,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatSource): ChatSourceDto {
        when(dto) {
            is TdApi.ChatSourceMtprotoProxy -> {
                return ChatSourceDto.MtprotoProxy(
                )
            }
            is TdApi.ChatSourcePublicServiceAnnouncement -> {
                return ChatSourceDto.PublicServiceAnnouncement(
                    type = dto.type,
                    text = dto.text,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatSourceDto): TdApi.ChatSource {
        when(dto) {
            is ChatSourceDto.MtprotoProxy -> {
                return TdApi.ChatSourceMtprotoProxy(
                )
            }
            is ChatSourceDto.PublicServiceAnnouncement -> {
                return TdApi.ChatSourcePublicServiceAnnouncement(
                    type = dto.type,
                    text = dto.text,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatStatistics): ChatStatisticsDto {
        when(dto) {
            is TdApi.ChatStatisticsSupergroup -> {
                return ChatStatisticsDto.Supergroup(
                    period = map(dto.period),
                    memberCount = map(dto.memberCount),
                    messageCount = map(dto.messageCount),
                    viewerCount = map(dto.viewerCount),
                    senderCount = map(dto.senderCount),
                    memberCountGraph = map(dto.memberCountGraph),
                    joinGraph = map(dto.joinGraph),
                    joinBySourceGraph = map(dto.joinBySourceGraph),
                    languageGraph = map(dto.languageGraph),
                    messageContentGraph = map(dto.messageContentGraph),
                    actionGraph = map(dto.actionGraph),
                    dayGraph = map(dto.dayGraph),
                    weekGraph = map(dto.weekGraph),
                    topSenders = dto.topSenders.mapArray { map(it) },
                    topAdministrators = dto.topAdministrators.mapArray { map(it) },
                    topInviters = dto.topInviters.mapArray { map(it) },
                )
            }
            is TdApi.ChatStatisticsChannel -> {
                return ChatStatisticsDto.Channel(
                    period = map(dto.period),
                    memberCount = map(dto.memberCount),
                    meanMessageViewCount = map(dto.meanMessageViewCount),
                    meanMessageShareCount = map(dto.meanMessageShareCount),
                    meanMessageReactionCount = map(dto.meanMessageReactionCount),
                    meanStoryViewCount = map(dto.meanStoryViewCount),
                    meanStoryShareCount = map(dto.meanStoryShareCount),
                    meanStoryReactionCount = map(dto.meanStoryReactionCount),
                    enabledNotificationsPercentage = dto.enabledNotificationsPercentage,
                    memberCountGraph = map(dto.memberCountGraph),
                    joinGraph = map(dto.joinGraph),
                    muteGraph = map(dto.muteGraph),
                    viewCountByHourGraph = map(dto.viewCountByHourGraph),
                    viewCountBySourceGraph = map(dto.viewCountBySourceGraph),
                    joinBySourceGraph = map(dto.joinBySourceGraph),
                    languageGraph = map(dto.languageGraph),
                    messageInteractionGraph = map(dto.messageInteractionGraph),
                    messageReactionGraph = map(dto.messageReactionGraph),
                    storyInteractionGraph = map(dto.storyInteractionGraph),
                    storyReactionGraph = map(dto.storyReactionGraph),
                    instantViewInteractionGraph = map(dto.instantViewInteractionGraph),
                    recentInteractions = dto.recentInteractions.mapArray { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatStatisticsDto): TdApi.ChatStatistics {
        when(dto) {
            is ChatStatisticsDto.Supergroup -> {
                return TdApi.ChatStatisticsSupergroup(
                    period = map(dto.period),
                    memberCount = map(dto.memberCount),
                    messageCount = map(dto.messageCount),
                    viewerCount = map(dto.viewerCount),
                    senderCount = map(dto.senderCount),
                    memberCountGraph = map(dto.memberCountGraph),
                    joinGraph = map(dto.joinGraph),
                    joinBySourceGraph = map(dto.joinBySourceGraph),
                    languageGraph = map(dto.languageGraph),
                    messageContentGraph = map(dto.messageContentGraph),
                    actionGraph = map(dto.actionGraph),
                    dayGraph = map(dto.dayGraph),
                    weekGraph = map(dto.weekGraph),
                    topSenders = dto.topSenders.mapArray { map(it) },
                    topAdministrators = dto.topAdministrators.mapArray { map(it) },
                    topInviters = dto.topInviters.mapArray { map(it) },
                )
            }
            is ChatStatisticsDto.Channel -> {
                return TdApi.ChatStatisticsChannel(
                    period = map(dto.period),
                    memberCount = map(dto.memberCount),
                    meanMessageViewCount = map(dto.meanMessageViewCount),
                    meanMessageShareCount = map(dto.meanMessageShareCount),
                    meanMessageReactionCount = map(dto.meanMessageReactionCount),
                    meanStoryViewCount = map(dto.meanStoryViewCount),
                    meanStoryShareCount = map(dto.meanStoryShareCount),
                    meanStoryReactionCount = map(dto.meanStoryReactionCount),
                    enabledNotificationsPercentage = dto.enabledNotificationsPercentage,
                    memberCountGraph = map(dto.memberCountGraph),
                    joinGraph = map(dto.joinGraph),
                    muteGraph = map(dto.muteGraph),
                    viewCountByHourGraph = map(dto.viewCountByHourGraph),
                    viewCountBySourceGraph = map(dto.viewCountBySourceGraph),
                    joinBySourceGraph = map(dto.joinBySourceGraph),
                    languageGraph = map(dto.languageGraph),
                    messageInteractionGraph = map(dto.messageInteractionGraph),
                    messageReactionGraph = map(dto.messageReactionGraph),
                    storyInteractionGraph = map(dto.storyInteractionGraph),
                    storyReactionGraph = map(dto.storyReactionGraph),
                    instantViewInteractionGraph = map(dto.instantViewInteractionGraph),
                    recentInteractions = dto.recentInteractions.mapArray { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.ChatStatisticsObjectType): ChatStatisticsObjectTypeDto {
        when(dto) {
            is TdApi.ChatStatisticsObjectTypeMessage -> {
                return ChatStatisticsObjectTypeDto.Message(
                    messageId = dto.messageId,
                )
            }
            is TdApi.ChatStatisticsObjectTypeStory -> {
                return ChatStatisticsObjectTypeDto.Story(
                    storyId = dto.storyId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatStatisticsObjectTypeDto): TdApi.ChatStatisticsObjectType {
        when(dto) {
            is ChatStatisticsObjectTypeDto.Message -> {
                return TdApi.ChatStatisticsObjectTypeMessage(
                    messageId = dto.messageId,
                )
            }
            is ChatStatisticsObjectTypeDto.Story -> {
                return TdApi.ChatStatisticsObjectTypeStory(
                    storyId = dto.storyId,
                )
            }
        }
    }

    fun map(dto: TdApi.ChatType): ChatTypeDto {
        when(dto) {
            is TdApi.ChatTypePrivate -> {
                return ChatTypeDto.Private(
                    userId = dto.userId,
                )
            }
            is TdApi.ChatTypeBasicGroup -> {
                return ChatTypeDto.BasicGroup(
                    basicGroupId = dto.basicGroupId,
                )
            }
            is TdApi.ChatTypeSupergroup -> {
                return ChatTypeDto.Supergroup(
                    supergroupId = dto.supergroupId,
                    isChannel = dto.isChannel,
                )
            }
            is TdApi.ChatTypeSecret -> {
                return ChatTypeDto.Secret(
                    secretChatId = dto.secretChatId,
                    userId = dto.userId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ChatTypeDto): TdApi.ChatType {
        when(dto) {
            is ChatTypeDto.Private -> {
                return TdApi.ChatTypePrivate(
                    userId = dto.userId,
                )
            }
            is ChatTypeDto.BasicGroup -> {
                return TdApi.ChatTypeBasicGroup(
                    basicGroupId = dto.basicGroupId,
                )
            }
            is ChatTypeDto.Supergroup -> {
                return TdApi.ChatTypeSupergroup(
                    supergroupId = dto.supergroupId,
                    isChannel = dto.isChannel,
                )
            }
            is ChatTypeDto.Secret -> {
                return TdApi.ChatTypeSecret(
                    secretChatId = dto.secretChatId,
                    userId = dto.userId,
                )
            }
        }
    }

    fun map(dto: TdApi.CheckChatUsernameResult): CheckChatUsernameResultDto {
        when(dto) {
            is TdApi.CheckChatUsernameResultOk -> {
                return CheckChatUsernameResultDto.Ok(
                )
            }
            is TdApi.CheckChatUsernameResultUsernameInvalid -> {
                return CheckChatUsernameResultDto.UsernameInvalid(
                )
            }
            is TdApi.CheckChatUsernameResultUsernameOccupied -> {
                return CheckChatUsernameResultDto.UsernameOccupied(
                )
            }
            is TdApi.CheckChatUsernameResultUsernamePurchasable -> {
                return CheckChatUsernameResultDto.UsernamePurchasable(
                )
            }
            is TdApi.CheckChatUsernameResultPublicChatsTooMany -> {
                return CheckChatUsernameResultDto.PublicChatsTooMany(
                )
            }
            is TdApi.CheckChatUsernameResultPublicGroupsUnavailable -> {
                return CheckChatUsernameResultDto.PublicGroupsUnavailable(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CheckChatUsernameResultDto): TdApi.CheckChatUsernameResult {
        when(dto) {
            is CheckChatUsernameResultDto.Ok -> {
                return TdApi.CheckChatUsernameResultOk(
                )
            }
            is CheckChatUsernameResultDto.UsernameInvalid -> {
                return TdApi.CheckChatUsernameResultUsernameInvalid(
                )
            }
            is CheckChatUsernameResultDto.UsernameOccupied -> {
                return TdApi.CheckChatUsernameResultUsernameOccupied(
                )
            }
            is CheckChatUsernameResultDto.UsernamePurchasable -> {
                return TdApi.CheckChatUsernameResultUsernamePurchasable(
                )
            }
            is CheckChatUsernameResultDto.PublicChatsTooMany -> {
                return TdApi.CheckChatUsernameResultPublicChatsTooMany(
                )
            }
            is CheckChatUsernameResultDto.PublicGroupsUnavailable -> {
                return TdApi.CheckChatUsernameResultPublicGroupsUnavailable(
                )
            }
        }
    }

    fun map(dto: TdApi.CheckStickerSetNameResult): CheckStickerSetNameResultDto {
        when(dto) {
            is TdApi.CheckStickerSetNameResultOk -> {
                return CheckStickerSetNameResultDto.Ok(
                )
            }
            is TdApi.CheckStickerSetNameResultNameInvalid -> {
                return CheckStickerSetNameResultDto.NameInvalid(
                )
            }
            is TdApi.CheckStickerSetNameResultNameOccupied -> {
                return CheckStickerSetNameResultDto.NameOccupied(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CheckStickerSetNameResultDto): TdApi.CheckStickerSetNameResult {
        when(dto) {
            is CheckStickerSetNameResultDto.Ok -> {
                return TdApi.CheckStickerSetNameResultOk(
                )
            }
            is CheckStickerSetNameResultDto.NameInvalid -> {
                return TdApi.CheckStickerSetNameResultNameInvalid(
                )
            }
            is CheckStickerSetNameResultDto.NameOccupied -> {
                return TdApi.CheckStickerSetNameResultNameOccupied(
                )
            }
        }
    }

    fun map(dto: TdApi.CollectibleItemType): CollectibleItemTypeDto {
        when(dto) {
            is TdApi.CollectibleItemTypeUsername -> {
                return CollectibleItemTypeDto.Username(
                    username = dto.username,
                )
            }
            is TdApi.CollectibleItemTypePhoneNumber -> {
                return CollectibleItemTypeDto.PhoneNumber(
                    phoneNumber = dto.phoneNumber,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: CollectibleItemTypeDto): TdApi.CollectibleItemType {
        when(dto) {
            is CollectibleItemTypeDto.Username -> {
                return TdApi.CollectibleItemTypeUsername(
                    username = dto.username,
                )
            }
            is CollectibleItemTypeDto.PhoneNumber -> {
                return TdApi.CollectibleItemTypePhoneNumber(
                    phoneNumber = dto.phoneNumber,
                )
            }
        }
    }

    fun map(dto: TdApi.ConnectionState): ConnectionStateDto {
        when(dto) {
            is TdApi.ConnectionStateWaitingForNetwork -> {
                return ConnectionStateDto.WaitingForNetwork(
                )
            }
            is TdApi.ConnectionStateConnectingToProxy -> {
                return ConnectionStateDto.ConnectingToProxy(
                )
            }
            is TdApi.ConnectionStateConnecting -> {
                return ConnectionStateDto.Connecting(
                )
            }
            is TdApi.ConnectionStateUpdating -> {
                return ConnectionStateDto.Updating(
                )
            }
            is TdApi.ConnectionStateReady -> {
                return ConnectionStateDto.Ready(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ConnectionStateDto): TdApi.ConnectionState {
        when(dto) {
            is ConnectionStateDto.WaitingForNetwork -> {
                return TdApi.ConnectionStateWaitingForNetwork(
                )
            }
            is ConnectionStateDto.ConnectingToProxy -> {
                return TdApi.ConnectionStateConnectingToProxy(
                )
            }
            is ConnectionStateDto.Connecting -> {
                return TdApi.ConnectionStateConnecting(
                )
            }
            is ConnectionStateDto.Updating -> {
                return TdApi.ConnectionStateUpdating(
                )
            }
            is ConnectionStateDto.Ready -> {
                return TdApi.ConnectionStateReady(
                )
            }
        }
    }

    fun map(dto: TdApi.DeviceToken): DeviceTokenDto {
        when(dto) {
            is TdApi.DeviceTokenFirebaseCloudMessaging -> {
                return DeviceTokenDto.FirebaseCloudMessaging(
                    token = dto.token,
                    encrypt = dto.encrypt,
                )
            }
            is TdApi.DeviceTokenApplePush -> {
                return DeviceTokenDto.ApplePush(
                    deviceToken = dto.deviceToken,
                    isAppSandbox = dto.isAppSandbox,
                )
            }
            is TdApi.DeviceTokenApplePushVoIP -> {
                return DeviceTokenDto.ApplePushVoIP(
                    deviceToken = dto.deviceToken,
                    isAppSandbox = dto.isAppSandbox,
                    encrypt = dto.encrypt,
                )
            }
            is TdApi.DeviceTokenWindowsPush -> {
                return DeviceTokenDto.WindowsPush(
                    accessToken = dto.accessToken,
                )
            }
            is TdApi.DeviceTokenMicrosoftPush -> {
                return DeviceTokenDto.MicrosoftPush(
                    channelUri = dto.channelUri,
                )
            }
            is TdApi.DeviceTokenMicrosoftPushVoIP -> {
                return DeviceTokenDto.MicrosoftPushVoIP(
                    channelUri = dto.channelUri,
                )
            }
            is TdApi.DeviceTokenWebPush -> {
                return DeviceTokenDto.WebPush(
                    endpoint = dto.endpoint,
                    p256dhBase64url = dto.p256dhBase64url,
                    authBase64url = dto.authBase64url,
                )
            }
            is TdApi.DeviceTokenSimplePush -> {
                return DeviceTokenDto.SimplePush(
                    endpoint = dto.endpoint,
                )
            }
            is TdApi.DeviceTokenUbuntuPush -> {
                return DeviceTokenDto.UbuntuPush(
                    token = dto.token,
                )
            }
            is TdApi.DeviceTokenBlackBerryPush -> {
                return DeviceTokenDto.BlackBerryPush(
                    token = dto.token,
                )
            }
            is TdApi.DeviceTokenTizenPush -> {
                return DeviceTokenDto.TizenPush(
                    regId = dto.regId,
                )
            }
            is TdApi.DeviceTokenHuaweiPush -> {
                return DeviceTokenDto.HuaweiPush(
                    token = dto.token,
                    encrypt = dto.encrypt,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: DeviceTokenDto): TdApi.DeviceToken {
        when(dto) {
            is DeviceTokenDto.FirebaseCloudMessaging -> {
                return TdApi.DeviceTokenFirebaseCloudMessaging(
                    token = dto.token,
                    encrypt = dto.encrypt,
                )
            }
            is DeviceTokenDto.ApplePush -> {
                return TdApi.DeviceTokenApplePush(
                    deviceToken = dto.deviceToken,
                    isAppSandbox = dto.isAppSandbox,
                )
            }
            is DeviceTokenDto.ApplePushVoIP -> {
                return TdApi.DeviceTokenApplePushVoIP(
                    deviceToken = dto.deviceToken,
                    isAppSandbox = dto.isAppSandbox,
                    encrypt = dto.encrypt,
                )
            }
            is DeviceTokenDto.WindowsPush -> {
                return TdApi.DeviceTokenWindowsPush(
                    accessToken = dto.accessToken,
                )
            }
            is DeviceTokenDto.MicrosoftPush -> {
                return TdApi.DeviceTokenMicrosoftPush(
                    channelUri = dto.channelUri,
                )
            }
            is DeviceTokenDto.MicrosoftPushVoIP -> {
                return TdApi.DeviceTokenMicrosoftPushVoIP(
                    channelUri = dto.channelUri,
                )
            }
            is DeviceTokenDto.WebPush -> {
                return TdApi.DeviceTokenWebPush(
                    endpoint = dto.endpoint,
                    p256dhBase64url = dto.p256dhBase64url,
                    authBase64url = dto.authBase64url,
                )
            }
            is DeviceTokenDto.SimplePush -> {
                return TdApi.DeviceTokenSimplePush(
                    endpoint = dto.endpoint,
                )
            }
            is DeviceTokenDto.UbuntuPush -> {
                return TdApi.DeviceTokenUbuntuPush(
                    token = dto.token,
                )
            }
            is DeviceTokenDto.BlackBerryPush -> {
                return TdApi.DeviceTokenBlackBerryPush(
                    token = dto.token,
                )
            }
            is DeviceTokenDto.TizenPush -> {
                return TdApi.DeviceTokenTizenPush(
                    regId = dto.regId,
                )
            }
            is DeviceTokenDto.HuaweiPush -> {
                return TdApi.DeviceTokenHuaweiPush(
                    token = dto.token,
                    encrypt = dto.encrypt,
                )
            }
        }
    }

    fun map(dto: TdApi.DiceStickers): DiceStickersDto {
        when(dto) {
            is TdApi.DiceStickersRegular -> {
                return DiceStickersDto.Regular(
                    sticker = map(dto.sticker),
                )
            }
            is TdApi.DiceStickersSlotMachine -> {
                return DiceStickersDto.SlotMachine(
                    background = map(dto.background),
                    lever = map(dto.lever),
                    leftReel = map(dto.leftReel),
                    centerReel = map(dto.centerReel),
                    rightReel = map(dto.rightReel),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: DiceStickersDto): TdApi.DiceStickers {
        when(dto) {
            is DiceStickersDto.Regular -> {
                return TdApi.DiceStickersRegular(
                    sticker = map(dto.sticker),
                )
            }
            is DiceStickersDto.SlotMachine -> {
                return TdApi.DiceStickersSlotMachine(
                    background = map(dto.background),
                    lever = map(dto.lever),
                    leftReel = map(dto.leftReel),
                    centerReel = map(dto.centerReel),
                    rightReel = map(dto.rightReel),
                )
            }
        }
    }

    fun map(dto: TdApi.EmailAddressAuthentication): EmailAddressAuthenticationDto {
        when(dto) {
            is TdApi.EmailAddressAuthenticationCode -> {
                return EmailAddressAuthenticationDto.Code(
                    code = dto.code,
                )
            }
            is TdApi.EmailAddressAuthenticationAppleId -> {
                return EmailAddressAuthenticationDto.AppleId(
                    token = dto.token,
                )
            }
            is TdApi.EmailAddressAuthenticationGoogleId -> {
                return EmailAddressAuthenticationDto.GoogleId(
                    token = dto.token,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: EmailAddressAuthenticationDto): TdApi.EmailAddressAuthentication {
        when(dto) {
            is EmailAddressAuthenticationDto.Code -> {
                return TdApi.EmailAddressAuthenticationCode(
                    code = dto.code,
                )
            }
            is EmailAddressAuthenticationDto.AppleId -> {
                return TdApi.EmailAddressAuthenticationAppleId(
                    token = dto.token,
                )
            }
            is EmailAddressAuthenticationDto.GoogleId -> {
                return TdApi.EmailAddressAuthenticationGoogleId(
                    token = dto.token,
                )
            }
        }
    }

    fun map(dto: TdApi.EmailAddressResetState): EmailAddressResetStateDto {
        when(dto) {
            is TdApi.EmailAddressResetStateAvailable -> {
                return EmailAddressResetStateDto.Available(
                    waitPeriod = dto.waitPeriod,
                )
            }
            is TdApi.EmailAddressResetStatePending -> {
                return EmailAddressResetStateDto.Pending(
                    resetIn = dto.resetIn,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: EmailAddressResetStateDto): TdApi.EmailAddressResetState {
        when(dto) {
            is EmailAddressResetStateDto.Available -> {
                return TdApi.EmailAddressResetStateAvailable(
                    waitPeriod = dto.waitPeriod,
                )
            }
            is EmailAddressResetStateDto.Pending -> {
                return TdApi.EmailAddressResetStatePending(
                    resetIn = dto.resetIn,
                )
            }
        }
    }

    fun map(dto: TdApi.EmojiCategorySource): EmojiCategorySourceDto {
        when(dto) {
            is TdApi.EmojiCategorySourceSearch -> {
                return EmojiCategorySourceDto.Search(
                    emojis = dto.emojis,
                )
            }
            is TdApi.EmojiCategorySourcePremium -> {
                return EmojiCategorySourceDto.Premium(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: EmojiCategorySourceDto): TdApi.EmojiCategorySource {
        when(dto) {
            is EmojiCategorySourceDto.Search -> {
                return TdApi.EmojiCategorySourceSearch(
                    emojis = dto.emojis,
                )
            }
            is EmojiCategorySourceDto.Premium -> {
                return TdApi.EmojiCategorySourcePremium(
                )
            }
        }
    }

    fun map(dto: TdApi.EmojiCategoryType): EmojiCategoryTypeDto {
        when(dto) {
            is TdApi.EmojiCategoryTypeDefault -> {
                return EmojiCategoryTypeDto.Default(
                )
            }
            is TdApi.EmojiCategoryTypeRegularStickers -> {
                return EmojiCategoryTypeDto.RegularStickers(
                )
            }
            is TdApi.EmojiCategoryTypeEmojiStatus -> {
                return EmojiCategoryTypeDto.EmojiStatus(
                )
            }
            is TdApi.EmojiCategoryTypeChatPhoto -> {
                return EmojiCategoryTypeDto.ChatPhoto(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: EmojiCategoryTypeDto): TdApi.EmojiCategoryType {
        when(dto) {
            is EmojiCategoryTypeDto.Default -> {
                return TdApi.EmojiCategoryTypeDefault(
                )
            }
            is EmojiCategoryTypeDto.RegularStickers -> {
                return TdApi.EmojiCategoryTypeRegularStickers(
                )
            }
            is EmojiCategoryTypeDto.EmojiStatus -> {
                return TdApi.EmojiCategoryTypeEmojiStatus(
                )
            }
            is EmojiCategoryTypeDto.ChatPhoto -> {
                return TdApi.EmojiCategoryTypeChatPhoto(
                )
            }
        }
    }

    fun map(dto: TdApi.EmojiStatusType): EmojiStatusTypeDto {
        when(dto) {
            is TdApi.EmojiStatusTypeCustomEmoji -> {
                return EmojiStatusTypeDto.CustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            is TdApi.EmojiStatusTypeUpgradedGift -> {
                return EmojiStatusTypeDto.UpgradedGift(
                    upgradedGiftId = dto.upgradedGiftId,
                    giftTitle = dto.giftTitle,
                    giftName = dto.giftName,
                    modelCustomEmojiId = dto.modelCustomEmojiId,
                    symbolCustomEmojiId = dto.symbolCustomEmojiId,
                    backdropColors = map(dto.backdropColors),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: EmojiStatusTypeDto): TdApi.EmojiStatusType {
        when(dto) {
            is EmojiStatusTypeDto.CustomEmoji -> {
                return TdApi.EmojiStatusTypeCustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            is EmojiStatusTypeDto.UpgradedGift -> {
                return TdApi.EmojiStatusTypeUpgradedGift(
                    upgradedGiftId = dto.upgradedGiftId,
                    giftTitle = dto.giftTitle,
                    giftName = dto.giftName,
                    modelCustomEmojiId = dto.modelCustomEmojiId,
                    symbolCustomEmojiId = dto.symbolCustomEmojiId,
                    backdropColors = map(dto.backdropColors),
                )
            }
        }
    }

    fun map(dto: TdApi.FileType): FileTypeDto {
        when(dto) {
            is TdApi.FileTypeNone -> {
                return FileTypeDto.None(
                )
            }
            is TdApi.FileTypeAnimation -> {
                return FileTypeDto.Animation(
                )
            }
            is TdApi.FileTypeAudio -> {
                return FileTypeDto.Audio(
                )
            }
            is TdApi.FileTypeDocument -> {
                return FileTypeDto.Document(
                )
            }
            is TdApi.FileTypeNotificationSound -> {
                return FileTypeDto.NotificationSound(
                )
            }
            is TdApi.FileTypePhoto -> {
                return FileTypeDto.Photo(
                )
            }
            is TdApi.FileTypePhotoStory -> {
                return FileTypeDto.PhotoStory(
                )
            }
            is TdApi.FileTypeProfilePhoto -> {
                return FileTypeDto.ProfilePhoto(
                )
            }
            is TdApi.FileTypeSecret -> {
                return FileTypeDto.Secret(
                )
            }
            is TdApi.FileTypeSecretThumbnail -> {
                return FileTypeDto.SecretThumbnail(
                )
            }
            is TdApi.FileTypeSecure -> {
                return FileTypeDto.Secure(
                )
            }
            is TdApi.FileTypeSelfDestructingPhoto -> {
                return FileTypeDto.SelfDestructingPhoto(
                )
            }
            is TdApi.FileTypeSelfDestructingVideo -> {
                return FileTypeDto.SelfDestructingVideo(
                )
            }
            is TdApi.FileTypeSelfDestructingVideoNote -> {
                return FileTypeDto.SelfDestructingVideoNote(
                )
            }
            is TdApi.FileTypeSelfDestructingVoiceNote -> {
                return FileTypeDto.SelfDestructingVoiceNote(
                )
            }
            is TdApi.FileTypeSticker -> {
                return FileTypeDto.Sticker(
                )
            }
            is TdApi.FileTypeThumbnail -> {
                return FileTypeDto.Thumbnail(
                )
            }
            is TdApi.FileTypeUnknown -> {
                return FileTypeDto.Unknown(
                )
            }
            is TdApi.FileTypeVideo -> {
                return FileTypeDto.Video(
                )
            }
            is TdApi.FileTypeVideoNote -> {
                return FileTypeDto.VideoNote(
                )
            }
            is TdApi.FileTypeVideoStory -> {
                return FileTypeDto.VideoStory(
                )
            }
            is TdApi.FileTypeVoiceNote -> {
                return FileTypeDto.VoiceNote(
                )
            }
            is TdApi.FileTypeWallpaper -> {
                return FileTypeDto.Wallpaper(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: FileTypeDto): TdApi.FileType {
        when(dto) {
            is FileTypeDto.None -> {
                return TdApi.FileTypeNone(
                )
            }
            is FileTypeDto.Animation -> {
                return TdApi.FileTypeAnimation(
                )
            }
            is FileTypeDto.Audio -> {
                return TdApi.FileTypeAudio(
                )
            }
            is FileTypeDto.Document -> {
                return TdApi.FileTypeDocument(
                )
            }
            is FileTypeDto.NotificationSound -> {
                return TdApi.FileTypeNotificationSound(
                )
            }
            is FileTypeDto.Photo -> {
                return TdApi.FileTypePhoto(
                )
            }
            is FileTypeDto.PhotoStory -> {
                return TdApi.FileTypePhotoStory(
                )
            }
            is FileTypeDto.ProfilePhoto -> {
                return TdApi.FileTypeProfilePhoto(
                )
            }
            is FileTypeDto.Secret -> {
                return TdApi.FileTypeSecret(
                )
            }
            is FileTypeDto.SecretThumbnail -> {
                return TdApi.FileTypeSecretThumbnail(
                )
            }
            is FileTypeDto.Secure -> {
                return TdApi.FileTypeSecure(
                )
            }
            is FileTypeDto.SelfDestructingPhoto -> {
                return TdApi.FileTypeSelfDestructingPhoto(
                )
            }
            is FileTypeDto.SelfDestructingVideo -> {
                return TdApi.FileTypeSelfDestructingVideo(
                )
            }
            is FileTypeDto.SelfDestructingVideoNote -> {
                return TdApi.FileTypeSelfDestructingVideoNote(
                )
            }
            is FileTypeDto.SelfDestructingVoiceNote -> {
                return TdApi.FileTypeSelfDestructingVoiceNote(
                )
            }
            is FileTypeDto.Sticker -> {
                return TdApi.FileTypeSticker(
                )
            }
            is FileTypeDto.Thumbnail -> {
                return TdApi.FileTypeThumbnail(
                )
            }
            is FileTypeDto.Unknown -> {
                return TdApi.FileTypeUnknown(
                )
            }
            is FileTypeDto.Video -> {
                return TdApi.FileTypeVideo(
                )
            }
            is FileTypeDto.VideoNote -> {
                return TdApi.FileTypeVideoNote(
                )
            }
            is FileTypeDto.VideoStory -> {
                return TdApi.FileTypeVideoStory(
                )
            }
            is FileTypeDto.VoiceNote -> {
                return TdApi.FileTypeVoiceNote(
                )
            }
            is FileTypeDto.Wallpaper -> {
                return TdApi.FileTypeWallpaper(
                )
            }
        }
    }

    fun map(dto: TdApi.FirebaseAuthenticationSettings): FirebaseAuthenticationSettingsDto {
        when(dto) {
            is TdApi.FirebaseAuthenticationSettingsAndroid -> {
                return FirebaseAuthenticationSettingsDto.Android(
                )
            }
            is TdApi.FirebaseAuthenticationSettingsIos -> {
                return FirebaseAuthenticationSettingsDto.Ios(
                    deviceToken = dto.deviceToken,
                    isAppSandbox = dto.isAppSandbox,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: FirebaseAuthenticationSettingsDto): TdApi.FirebaseAuthenticationSettings {
        when(dto) {
            is FirebaseAuthenticationSettingsDto.Android -> {
                return TdApi.FirebaseAuthenticationSettingsAndroid(
                )
            }
            is FirebaseAuthenticationSettingsDto.Ios -> {
                return TdApi.FirebaseAuthenticationSettingsIos(
                    deviceToken = dto.deviceToken,
                    isAppSandbox = dto.isAppSandbox,
                )
            }
        }
    }

    fun map(dto: TdApi.FirebaseDeviceVerificationParameters): FirebaseDeviceVerificationParametersDto {
        when(dto) {
            is TdApi.FirebaseDeviceVerificationParametersSafetyNet -> {
                return FirebaseDeviceVerificationParametersDto.SafetyNet(
                    nonce = dto.nonce,
                )
            }
            is TdApi.FirebaseDeviceVerificationParametersPlayIntegrity -> {
                return FirebaseDeviceVerificationParametersDto.PlayIntegrity(
                    nonce = dto.nonce,
                    cloudProjectNumber = dto.cloudProjectNumber,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: FirebaseDeviceVerificationParametersDto): TdApi.FirebaseDeviceVerificationParameters {
        when(dto) {
            is FirebaseDeviceVerificationParametersDto.SafetyNet -> {
                return TdApi.FirebaseDeviceVerificationParametersSafetyNet(
                    nonce = dto.nonce,
                )
            }
            is FirebaseDeviceVerificationParametersDto.PlayIntegrity -> {
                return TdApi.FirebaseDeviceVerificationParametersPlayIntegrity(
                    nonce = dto.nonce,
                    cloudProjectNumber = dto.cloudProjectNumber,
                )
            }
        }
    }

    fun map(dto: TdApi.GiveawayInfo): GiveawayInfoDto {
        when(dto) {
            is TdApi.GiveawayInfoOngoing -> {
                return GiveawayInfoDto.Ongoing(
                    creationDate = dto.creationDate,
                    status = map(dto.status),
                    isEnded = dto.isEnded,
                )
            }
            is TdApi.GiveawayInfoCompleted -> {
                return GiveawayInfoDto.Completed(
                    creationDate = dto.creationDate,
                    actualWinnersSelectionDate = dto.actualWinnersSelectionDate,
                    wasRefunded = dto.wasRefunded,
                    isWinner = dto.isWinner,
                    winnerCount = dto.winnerCount,
                    activationCount = dto.activationCount,
                    giftCode = dto.giftCode,
                    wonStarCount = dto.wonStarCount,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: GiveawayInfoDto): TdApi.GiveawayInfo {
        when(dto) {
            is GiveawayInfoDto.Ongoing -> {
                return TdApi.GiveawayInfoOngoing(
                    creationDate = dto.creationDate,
                    status = map(dto.status),
                    isEnded = dto.isEnded,
                )
            }
            is GiveawayInfoDto.Completed -> {
                return TdApi.GiveawayInfoCompleted(
                    creationDate = dto.creationDate,
                    actualWinnersSelectionDate = dto.actualWinnersSelectionDate,
                    wasRefunded = dto.wasRefunded,
                    isWinner = dto.isWinner,
                    winnerCount = dto.winnerCount,
                    activationCount = dto.activationCount,
                    giftCode = dto.giftCode,
                    wonStarCount = dto.wonStarCount,
                )
            }
        }
    }

    fun map(dto: TdApi.GiveawayParticipantStatus): GiveawayParticipantStatusDto {
        when(dto) {
            is TdApi.GiveawayParticipantStatusEligible -> {
                return GiveawayParticipantStatusDto.Eligible(
                )
            }
            is TdApi.GiveawayParticipantStatusParticipating -> {
                return GiveawayParticipantStatusDto.Participating(
                )
            }
            is TdApi.GiveawayParticipantStatusAlreadyWasMember -> {
                return GiveawayParticipantStatusDto.AlreadyWasMember(
                    joinedChatDate = dto.joinedChatDate,
                )
            }
            is TdApi.GiveawayParticipantStatusAdministrator -> {
                return GiveawayParticipantStatusDto.Administrator(
                    chatId = dto.chatId,
                )
            }
            is TdApi.GiveawayParticipantStatusDisallowedCountry -> {
                return GiveawayParticipantStatusDto.DisallowedCountry(
                    userCountryCode = dto.userCountryCode,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: GiveawayParticipantStatusDto): TdApi.GiveawayParticipantStatus {
        when(dto) {
            is GiveawayParticipantStatusDto.Eligible -> {
                return TdApi.GiveawayParticipantStatusEligible(
                )
            }
            is GiveawayParticipantStatusDto.Participating -> {
                return TdApi.GiveawayParticipantStatusParticipating(
                )
            }
            is GiveawayParticipantStatusDto.AlreadyWasMember -> {
                return TdApi.GiveawayParticipantStatusAlreadyWasMember(
                    joinedChatDate = dto.joinedChatDate,
                )
            }
            is GiveawayParticipantStatusDto.Administrator -> {
                return TdApi.GiveawayParticipantStatusAdministrator(
                    chatId = dto.chatId,
                )
            }
            is GiveawayParticipantStatusDto.DisallowedCountry -> {
                return TdApi.GiveawayParticipantStatusDisallowedCountry(
                    userCountryCode = dto.userCountryCode,
                )
            }
        }
    }

    fun map(dto: TdApi.GiveawayPrize): GiveawayPrizeDto {
        when(dto) {
            is TdApi.GiveawayPrizePremium -> {
                return GiveawayPrizeDto.Premium(
                    monthCount = dto.monthCount,
                )
            }
            is TdApi.GiveawayPrizeStars -> {
                return GiveawayPrizeDto.Stars(
                    starCount = dto.starCount,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: GiveawayPrizeDto): TdApi.GiveawayPrize {
        when(dto) {
            is GiveawayPrizeDto.Premium -> {
                return TdApi.GiveawayPrizePremium(
                    monthCount = dto.monthCount,
                )
            }
            is GiveawayPrizeDto.Stars -> {
                return TdApi.GiveawayPrizeStars(
                    starCount = dto.starCount,
                )
            }
        }
    }

    fun map(dto: TdApi.GroupCallDataChannel): GroupCallDataChannelDto {
        when(dto) {
            is TdApi.GroupCallDataChannelMain -> {
                return GroupCallDataChannelDto.Main(
                )
            }
            is TdApi.GroupCallDataChannelScreenSharing -> {
                return GroupCallDataChannelDto.ScreenSharing(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: GroupCallDataChannelDto): TdApi.GroupCallDataChannel {
        when(dto) {
            is GroupCallDataChannelDto.Main -> {
                return TdApi.GroupCallDataChannelMain(
                )
            }
            is GroupCallDataChannelDto.ScreenSharing -> {
                return TdApi.GroupCallDataChannelScreenSharing(
                )
            }
        }
    }

    fun map(dto: TdApi.GroupCallVideoQuality): GroupCallVideoQualityDto {
        when(dto) {
            is TdApi.GroupCallVideoQualityThumbnail -> {
                return GroupCallVideoQualityDto.Thumbnail(
                )
            }
            is TdApi.GroupCallVideoQualityMedium -> {
                return GroupCallVideoQualityDto.Medium(
                )
            }
            is TdApi.GroupCallVideoQualityFull -> {
                return GroupCallVideoQualityDto.Full(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: GroupCallVideoQualityDto): TdApi.GroupCallVideoQuality {
        when(dto) {
            is GroupCallVideoQualityDto.Thumbnail -> {
                return TdApi.GroupCallVideoQualityThumbnail(
                )
            }
            is GroupCallVideoQualityDto.Medium -> {
                return TdApi.GroupCallVideoQualityMedium(
                )
            }
            is GroupCallVideoQualityDto.Full -> {
                return TdApi.GroupCallVideoQualityFull(
                )
            }
        }
    }

    fun map(dto: TdApi.InlineKeyboardButtonType): InlineKeyboardButtonTypeDto {
        when(dto) {
            is TdApi.InlineKeyboardButtonTypeUrl -> {
                return InlineKeyboardButtonTypeDto.Url(
                    url = dto.url,
                )
            }
            is TdApi.InlineKeyboardButtonTypeLoginUrl -> {
                return InlineKeyboardButtonTypeDto.LoginUrl(
                    url = dto.url,
                    id = dto.id,
                    forwardText = dto.forwardText,
                )
            }
            is TdApi.InlineKeyboardButtonTypeWebApp -> {
                return InlineKeyboardButtonTypeDto.WebApp(
                    url = dto.url,
                )
            }
            is TdApi.InlineKeyboardButtonTypeCallback -> {
                return InlineKeyboardButtonTypeDto.Callback(
                    data = dto.data,
                )
            }
            is TdApi.InlineKeyboardButtonTypeCallbackWithPassword -> {
                return InlineKeyboardButtonTypeDto.CallbackWithPassword(
                    data = dto.data,
                )
            }
            is TdApi.InlineKeyboardButtonTypeCallbackGame -> {
                return InlineKeyboardButtonTypeDto.CallbackGame(
                )
            }
            is TdApi.InlineKeyboardButtonTypeSwitchInline -> {
                return InlineKeyboardButtonTypeDto.SwitchInline(
                    query = dto.query,
                    targetChat = map(dto.targetChat),
                )
            }
            is TdApi.InlineKeyboardButtonTypeBuy -> {
                return InlineKeyboardButtonTypeDto.Buy(
                )
            }
            is TdApi.InlineKeyboardButtonTypeUser -> {
                return InlineKeyboardButtonTypeDto.User(
                    userId = dto.userId,
                )
            }
            is TdApi.InlineKeyboardButtonTypeCopyText -> {
                return InlineKeyboardButtonTypeDto.CopyText(
                    text = dto.text,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InlineKeyboardButtonTypeDto): TdApi.InlineKeyboardButtonType {
        when(dto) {
            is InlineKeyboardButtonTypeDto.Url -> {
                return TdApi.InlineKeyboardButtonTypeUrl(
                    url = dto.url,
                )
            }
            is InlineKeyboardButtonTypeDto.LoginUrl -> {
                return TdApi.InlineKeyboardButtonTypeLoginUrl(
                    url = dto.url,
                    id = dto.id,
                    forwardText = dto.forwardText,
                )
            }
            is InlineKeyboardButtonTypeDto.WebApp -> {
                return TdApi.InlineKeyboardButtonTypeWebApp(
                    url = dto.url,
                )
            }
            is InlineKeyboardButtonTypeDto.Callback -> {
                return TdApi.InlineKeyboardButtonTypeCallback(
                    data = dto.data,
                )
            }
            is InlineKeyboardButtonTypeDto.CallbackWithPassword -> {
                return TdApi.InlineKeyboardButtonTypeCallbackWithPassword(
                    data = dto.data,
                )
            }
            is InlineKeyboardButtonTypeDto.CallbackGame -> {
                return TdApi.InlineKeyboardButtonTypeCallbackGame(
                )
            }
            is InlineKeyboardButtonTypeDto.SwitchInline -> {
                return TdApi.InlineKeyboardButtonTypeSwitchInline(
                    query = dto.query,
                    targetChat = map(dto.targetChat),
                )
            }
            is InlineKeyboardButtonTypeDto.Buy -> {
                return TdApi.InlineKeyboardButtonTypeBuy(
                )
            }
            is InlineKeyboardButtonTypeDto.User -> {
                return TdApi.InlineKeyboardButtonTypeUser(
                    userId = dto.userId,
                )
            }
            is InlineKeyboardButtonTypeDto.CopyText -> {
                return TdApi.InlineKeyboardButtonTypeCopyText(
                    text = dto.text,
                )
            }
        }
    }

    fun map(dto: TdApi.InlineQueryResult): InlineQueryResultDto {
        when(dto) {
            is TdApi.InlineQueryResultArticle -> {
                return InlineQueryResultDto.Article(
                    id = dto.id,
                    url = dto.url,
                    title = dto.title,
                    description = dto.description,
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is TdApi.InlineQueryResultContact -> {
                return InlineQueryResultDto.Contact(
                    id = dto.id,
                    contact = map(dto.contact),
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is TdApi.InlineQueryResultLocation -> {
                return InlineQueryResultDto.Location(
                    id = dto.id,
                    location = map(dto.location),
                    title = dto.title,
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is TdApi.InlineQueryResultVenue -> {
                return InlineQueryResultDto.Venue(
                    id = dto.id,
                    venue = map(dto.venue),
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is TdApi.InlineQueryResultGame -> {
                return InlineQueryResultDto.Game(
                    id = dto.id,
                    game = map(dto.game),
                )
            }
            is TdApi.InlineQueryResultAnimation -> {
                return InlineQueryResultDto.Animation(
                    id = dto.id,
                    animation = map(dto.animation),
                    title = dto.title,
                )
            }
            is TdApi.InlineQueryResultAudio -> {
                return InlineQueryResultDto.Audio(
                    id = dto.id,
                    audio = map(dto.audio),
                )
            }
            is TdApi.InlineQueryResultDocument -> {
                return InlineQueryResultDto.Document(
                    id = dto.id,
                    document = map(dto.document),
                    title = dto.title,
                    description = dto.description,
                )
            }
            is TdApi.InlineQueryResultPhoto -> {
                return InlineQueryResultDto.Photo(
                    id = dto.id,
                    photo = map(dto.photo),
                    title = dto.title,
                    description = dto.description,
                )
            }
            is TdApi.InlineQueryResultSticker -> {
                return InlineQueryResultDto.Sticker(
                    id = dto.id,
                    sticker = map(dto.sticker),
                )
            }
            is TdApi.InlineQueryResultVideo -> {
                return InlineQueryResultDto.Video(
                    id = dto.id,
                    video = map(dto.video),
                    title = dto.title,
                    description = dto.description,
                )
            }
            is TdApi.InlineQueryResultVoiceNote -> {
                return InlineQueryResultDto.VoiceNote(
                    id = dto.id,
                    voiceNote = map(dto.voiceNote),
                    title = dto.title,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InlineQueryResultDto): TdApi.InlineQueryResult {
        when(dto) {
            is InlineQueryResultDto.Article -> {
                return TdApi.InlineQueryResultArticle(
                    id = dto.id,
                    url = dto.url,
                    title = dto.title,
                    description = dto.description,
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is InlineQueryResultDto.Contact -> {
                return TdApi.InlineQueryResultContact(
                    id = dto.id,
                    contact = map(dto.contact),
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is InlineQueryResultDto.Location -> {
                return TdApi.InlineQueryResultLocation(
                    id = dto.id,
                    location = map(dto.location),
                    title = dto.title,
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is InlineQueryResultDto.Venue -> {
                return TdApi.InlineQueryResultVenue(
                    id = dto.id,
                    venue = map(dto.venue),
                    thumbnail = dto.thumbnail?.let { map(it) },
                )
            }
            is InlineQueryResultDto.Game -> {
                return TdApi.InlineQueryResultGame(
                    id = dto.id,
                    game = map(dto.game),
                )
            }
            is InlineQueryResultDto.Animation -> {
                return TdApi.InlineQueryResultAnimation(
                    id = dto.id,
                    animation = map(dto.animation),
                    title = dto.title,
                )
            }
            is InlineQueryResultDto.Audio -> {
                return TdApi.InlineQueryResultAudio(
                    id = dto.id,
                    audio = map(dto.audio),
                )
            }
            is InlineQueryResultDto.Document -> {
                return TdApi.InlineQueryResultDocument(
                    id = dto.id,
                    document = map(dto.document),
                    title = dto.title,
                    description = dto.description,
                )
            }
            is InlineQueryResultDto.Photo -> {
                return TdApi.InlineQueryResultPhoto(
                    id = dto.id,
                    photo = map(dto.photo),
                    title = dto.title,
                    description = dto.description,
                )
            }
            is InlineQueryResultDto.Sticker -> {
                return TdApi.InlineQueryResultSticker(
                    id = dto.id,
                    sticker = map(dto.sticker),
                )
            }
            is InlineQueryResultDto.Video -> {
                return TdApi.InlineQueryResultVideo(
                    id = dto.id,
                    video = map(dto.video),
                    title = dto.title,
                    description = dto.description,
                )
            }
            is InlineQueryResultDto.VoiceNote -> {
                return TdApi.InlineQueryResultVoiceNote(
                    id = dto.id,
                    voiceNote = map(dto.voiceNote),
                    title = dto.title,
                )
            }
        }
    }

    fun map(dto: TdApi.InlineQueryResultsButtonType): InlineQueryResultsButtonTypeDto {
        when(dto) {
            is TdApi.InlineQueryResultsButtonTypeStartBot -> {
                return InlineQueryResultsButtonTypeDto.StartBot(
                    parameter = dto.parameter,
                )
            }
            is TdApi.InlineQueryResultsButtonTypeWebApp -> {
                return InlineQueryResultsButtonTypeDto.WebApp(
                    url = dto.url,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InlineQueryResultsButtonTypeDto): TdApi.InlineQueryResultsButtonType {
        when(dto) {
            is InlineQueryResultsButtonTypeDto.StartBot -> {
                return TdApi.InlineQueryResultsButtonTypeStartBot(
                    parameter = dto.parameter,
                )
            }
            is InlineQueryResultsButtonTypeDto.WebApp -> {
                return TdApi.InlineQueryResultsButtonTypeWebApp(
                    url = dto.url,
                )
            }
        }
    }

    fun map(dto: TdApi.InputBackground): InputBackgroundDto {
        when(dto) {
            is TdApi.InputBackgroundLocal -> {
                return InputBackgroundDto.Local(
                    background = map(dto.background),
                )
            }
            is TdApi.InputBackgroundRemote -> {
                return InputBackgroundDto.Remote(
                    backgroundId = dto.backgroundId,
                )
            }
            is TdApi.InputBackgroundPrevious -> {
                return InputBackgroundDto.Previous(
                    messageId = dto.messageId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputBackgroundDto): TdApi.InputBackground {
        when(dto) {
            is InputBackgroundDto.Local -> {
                return TdApi.InputBackgroundLocal(
                    background = map(dto.background),
                )
            }
            is InputBackgroundDto.Remote -> {
                return TdApi.InputBackgroundRemote(
                    backgroundId = dto.backgroundId,
                )
            }
            is InputBackgroundDto.Previous -> {
                return TdApi.InputBackgroundPrevious(
                    messageId = dto.messageId,
                )
            }
        }
    }

    fun map(dto: TdApi.InputChatPhoto): InputChatPhotoDto {
        when(dto) {
            is TdApi.InputChatPhotoPrevious -> {
                return InputChatPhotoDto.Previous(
                    chatPhotoId = dto.chatPhotoId,
                )
            }
            is TdApi.InputChatPhotoStatic -> {
                return InputChatPhotoDto.Static(
                    photo = map(dto.photo),
                )
            }
            is TdApi.InputChatPhotoAnimation -> {
                return InputChatPhotoDto.Animation(
                    animation = map(dto.animation),
                    mainFrameTimestamp = dto.mainFrameTimestamp,
                )
            }
            is TdApi.InputChatPhotoSticker -> {
                return InputChatPhotoDto.Sticker(
                    sticker = map(dto.sticker),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputChatPhotoDto): TdApi.InputChatPhoto {
        when(dto) {
            is InputChatPhotoDto.Previous -> {
                return TdApi.InputChatPhotoPrevious(
                    chatPhotoId = dto.chatPhotoId,
                )
            }
            is InputChatPhotoDto.Static -> {
                return TdApi.InputChatPhotoStatic(
                    photo = map(dto.photo),
                )
            }
            is InputChatPhotoDto.Animation -> {
                return TdApi.InputChatPhotoAnimation(
                    animation = map(dto.animation),
                    mainFrameTimestamp = dto.mainFrameTimestamp,
                )
            }
            is InputChatPhotoDto.Sticker -> {
                return TdApi.InputChatPhotoSticker(
                    sticker = map(dto.sticker),
                )
            }
        }
    }

    fun map(dto: TdApi.InputCredentials): InputCredentialsDto {
        when(dto) {
            is TdApi.InputCredentialsSaved -> {
                return InputCredentialsDto.Saved(
                    savedCredentialsId = dto.savedCredentialsId,
                )
            }
            is TdApi.InputCredentialsNew -> {
                return InputCredentialsDto.New(
                    data = dto.data,
                    allowSave = dto.allowSave,
                )
            }
            is TdApi.InputCredentialsApplePay -> {
                return InputCredentialsDto.ApplePay(
                    data = dto.data,
                )
            }
            is TdApi.InputCredentialsGooglePay -> {
                return InputCredentialsDto.GooglePay(
                    data = dto.data,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputCredentialsDto): TdApi.InputCredentials {
        when(dto) {
            is InputCredentialsDto.Saved -> {
                return TdApi.InputCredentialsSaved(
                    savedCredentialsId = dto.savedCredentialsId,
                )
            }
            is InputCredentialsDto.New -> {
                return TdApi.InputCredentialsNew(
                    data = dto.data,
                    allowSave = dto.allowSave,
                )
            }
            is InputCredentialsDto.ApplePay -> {
                return TdApi.InputCredentialsApplePay(
                    data = dto.data,
                )
            }
            is InputCredentialsDto.GooglePay -> {
                return TdApi.InputCredentialsGooglePay(
                    data = dto.data,
                )
            }
        }
    }

    fun map(dto: TdApi.InputFile): InputFileDto {
        when(dto) {
            is TdApi.InputFileId -> {
                return InputFileDto.Id(
                    id = dto.id,
                )
            }
            is TdApi.InputFileRemote -> {
                return InputFileDto.Remote(
                    id = dto.id,
                )
            }
            is TdApi.InputFileLocal -> {
                return InputFileDto.Local(
                    path = dto.path,
                )
            }
            is TdApi.InputFileGenerated -> {
                return InputFileDto.Generated(
                    originalPath = dto.originalPath,
                    conversion = dto.conversion,
                    expectedSize = dto.expectedSize,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputFileDto): TdApi.InputFile {
        when(dto) {
            is InputFileDto.Id -> {
                return TdApi.InputFileId(
                    id = dto.id,
                )
            }
            is InputFileDto.Remote -> {
                return TdApi.InputFileRemote(
                    id = dto.id,
                )
            }
            is InputFileDto.Local -> {
                return TdApi.InputFileLocal(
                    path = dto.path,
                )
            }
            is InputFileDto.Generated -> {
                return TdApi.InputFileGenerated(
                    originalPath = dto.originalPath,
                    conversion = dto.conversion,
                    expectedSize = dto.expectedSize,
                )
            }
        }
    }

    fun map(dto: TdApi.InputGroupCall): InputGroupCallDto {
        when(dto) {
            is TdApi.InputGroupCallLink -> {
                return InputGroupCallDto.Link(
                    link = dto.link,
                )
            }
            is TdApi.InputGroupCallMessage -> {
                return InputGroupCallDto.Message(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputGroupCallDto): TdApi.InputGroupCall {
        when(dto) {
            is InputGroupCallDto.Link -> {
                return TdApi.InputGroupCallLink(
                    link = dto.link,
                )
            }
            is InputGroupCallDto.Message -> {
                return TdApi.InputGroupCallMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
        }
    }

    fun map(dto: TdApi.InputInlineQueryResult): InputInlineQueryResultDto {
        when(dto) {
            is TdApi.InputInlineQueryResultAnimation -> {
                return InputInlineQueryResultDto.Animation(
                    id = dto.id,
                    title = dto.title,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailMimeType = dto.thumbnailMimeType,
                    videoUrl = dto.videoUrl,
                    videoMimeType = dto.videoMimeType,
                    videoDuration = dto.videoDuration,
                    videoWidth = dto.videoWidth,
                    videoHeight = dto.videoHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultArticle -> {
                return InputInlineQueryResultDto.Article(
                    id = dto.id,
                    url = dto.url,
                    title = dto.title,
                    description = dto.description,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultAudio -> {
                return InputInlineQueryResultDto.Audio(
                    id = dto.id,
                    title = dto.title,
                    performer = dto.performer,
                    audioUrl = dto.audioUrl,
                    audioDuration = dto.audioDuration,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultContact -> {
                return InputInlineQueryResultDto.Contact(
                    id = dto.id,
                    contact = map(dto.contact),
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultDocument -> {
                return InputInlineQueryResultDto.Document(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    documentUrl = dto.documentUrl,
                    mimeType = dto.mimeType,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultGame -> {
                return InputInlineQueryResultDto.Game(
                    id = dto.id,
                    gameShortName = dto.gameShortName,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                )
            }
            is TdApi.InputInlineQueryResultLocation -> {
                return InputInlineQueryResultDto.Location(
                    id = dto.id,
                    location = map(dto.location),
                    livePeriod = dto.livePeriod,
                    title = dto.title,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultPhoto -> {
                return InputInlineQueryResultDto.Photo(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    thumbnailUrl = dto.thumbnailUrl,
                    photoUrl = dto.photoUrl,
                    photoWidth = dto.photoWidth,
                    photoHeight = dto.photoHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultSticker -> {
                return InputInlineQueryResultDto.Sticker(
                    id = dto.id,
                    thumbnailUrl = dto.thumbnailUrl,
                    stickerUrl = dto.stickerUrl,
                    stickerWidth = dto.stickerWidth,
                    stickerHeight = dto.stickerHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultVenue -> {
                return InputInlineQueryResultDto.Venue(
                    id = dto.id,
                    venue = map(dto.venue),
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultVideo -> {
                return InputInlineQueryResultDto.Video(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    thumbnailUrl = dto.thumbnailUrl,
                    videoUrl = dto.videoUrl,
                    mimeType = dto.mimeType,
                    videoWidth = dto.videoWidth,
                    videoHeight = dto.videoHeight,
                    videoDuration = dto.videoDuration,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is TdApi.InputInlineQueryResultVoiceNote -> {
                return InputInlineQueryResultDto.VoiceNote(
                    id = dto.id,
                    title = dto.title,
                    voiceNoteUrl = dto.voiceNoteUrl,
                    voiceNoteDuration = dto.voiceNoteDuration,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputInlineQueryResultDto): TdApi.InputInlineQueryResult {
        when(dto) {
            is InputInlineQueryResultDto.Animation -> {
                return TdApi.InputInlineQueryResultAnimation(
                    id = dto.id,
                    title = dto.title,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailMimeType = dto.thumbnailMimeType,
                    videoUrl = dto.videoUrl,
                    videoMimeType = dto.videoMimeType,
                    videoDuration = dto.videoDuration,
                    videoWidth = dto.videoWidth,
                    videoHeight = dto.videoHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Article -> {
                return TdApi.InputInlineQueryResultArticle(
                    id = dto.id,
                    url = dto.url,
                    title = dto.title,
                    description = dto.description,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Audio -> {
                return TdApi.InputInlineQueryResultAudio(
                    id = dto.id,
                    title = dto.title,
                    performer = dto.performer,
                    audioUrl = dto.audioUrl,
                    audioDuration = dto.audioDuration,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Contact -> {
                return TdApi.InputInlineQueryResultContact(
                    id = dto.id,
                    contact = map(dto.contact),
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Document -> {
                return TdApi.InputInlineQueryResultDocument(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    documentUrl = dto.documentUrl,
                    mimeType = dto.mimeType,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Game -> {
                return TdApi.InputInlineQueryResultGame(
                    id = dto.id,
                    gameShortName = dto.gameShortName,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                )
            }
            is InputInlineQueryResultDto.Location -> {
                return TdApi.InputInlineQueryResultLocation(
                    id = dto.id,
                    location = map(dto.location),
                    livePeriod = dto.livePeriod,
                    title = dto.title,
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Photo -> {
                return TdApi.InputInlineQueryResultPhoto(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    thumbnailUrl = dto.thumbnailUrl,
                    photoUrl = dto.photoUrl,
                    photoWidth = dto.photoWidth,
                    photoHeight = dto.photoHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Sticker -> {
                return TdApi.InputInlineQueryResultSticker(
                    id = dto.id,
                    thumbnailUrl = dto.thumbnailUrl,
                    stickerUrl = dto.stickerUrl,
                    stickerWidth = dto.stickerWidth,
                    stickerHeight = dto.stickerHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Venue -> {
                return TdApi.InputInlineQueryResultVenue(
                    id = dto.id,
                    venue = map(dto.venue),
                    thumbnailUrl = dto.thumbnailUrl,
                    thumbnailWidth = dto.thumbnailWidth,
                    thumbnailHeight = dto.thumbnailHeight,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.Video -> {
                return TdApi.InputInlineQueryResultVideo(
                    id = dto.id,
                    title = dto.title,
                    description = dto.description,
                    thumbnailUrl = dto.thumbnailUrl,
                    videoUrl = dto.videoUrl,
                    mimeType = dto.mimeType,
                    videoWidth = dto.videoWidth,
                    videoHeight = dto.videoHeight,
                    videoDuration = dto.videoDuration,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
            is InputInlineQueryResultDto.VoiceNote -> {
                return TdApi.InputInlineQueryResultVoiceNote(
                    id = dto.id,
                    title = dto.title,
                    voiceNoteUrl = dto.voiceNoteUrl,
                    voiceNoteDuration = dto.voiceNoteDuration,
                    replyMarkup = dto.replyMarkup?.let { map(it) },
                    inputMessageContent = map(dto.inputMessageContent),
                )
            }
        }
    }

    fun map(dto: TdApi.InputInvoice): InputInvoiceDto {
        when(dto) {
            is TdApi.InputInvoiceMessage -> {
                return InputInvoiceDto.Message(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is TdApi.InputInvoiceName -> {
                return InputInvoiceDto.Name(
                    name = dto.name,
                )
            }
            is TdApi.InputInvoiceTelegram -> {
                return InputInvoiceDto.Telegram(
                    purpose = map(dto.purpose),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputInvoiceDto): TdApi.InputInvoice {
        when(dto) {
            is InputInvoiceDto.Message -> {
                return TdApi.InputInvoiceMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is InputInvoiceDto.Name -> {
                return TdApi.InputInvoiceName(
                    name = dto.name,
                )
            }
            is InputInvoiceDto.Telegram -> {
                return TdApi.InputInvoiceTelegram(
                    purpose = map(dto.purpose),
                )
            }
        }
    }

    fun map(dto: TdApi.InputMessageContent): InputMessageContentDto {
        when(dto) {
            is TdApi.InputMessageText -> {
                return InputMessageContentDto.Text(
                    text = map(dto.text),
                    linkPreviewOptions = dto.linkPreviewOptions?.let { map(it) },
                    clearDraft = dto.clearDraft,
                )
            }
            is TdApi.InputMessageAnimation -> {
                return InputMessageContentDto.Animation(
                    animation = map(dto.animation),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    addedStickerFileIds = dto.addedStickerFileIds,
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                )
            }
            is TdApi.InputMessageAudio -> {
                return InputMessageContentDto.Audio(
                    audio = map(dto.audio),
                    albumCoverThumbnail = dto.albumCoverThumbnail?.let { map(it) },
                    duration = dto.duration,
                    title = dto.title,
                    performer = dto.performer,
                    caption = dto.caption?.let { map(it) },
                )
            }
            is TdApi.InputMessageDocument -> {
                return InputMessageContentDto.Document(
                    document = map(dto.document),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    disableContentTypeDetection = dto.disableContentTypeDetection,
                    caption = dto.caption?.let { map(it) },
                )
            }
            is TdApi.InputMessagePaidMedia -> {
                return InputMessageContentDto.PaidMedia(
                    starCount = dto.starCount,
                    paidMedia = dto.paidMedia.mapArray { map(it) },
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    payload = dto.payload,
                )
            }
            is TdApi.InputMessagePhoto -> {
                return InputMessageContentDto.Photo(
                    photo = map(dto.photo),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    addedStickerFileIds = dto.addedStickerFileIds,
                    width = dto.width,
                    height = dto.height,
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                    hasSpoiler = dto.hasSpoiler,
                )
            }
            is TdApi.InputMessageSticker -> {
                return InputMessageContentDto.Sticker(
                    sticker = map(dto.sticker),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    width = dto.width,
                    height = dto.height,
                    emoji = dto.emoji,
                )
            }
            is TdApi.InputMessageVideo -> {
                return InputMessageContentDto.Video(
                    video = map(dto.video),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                    addedStickerFileIds = dto.addedStickerFileIds,
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                    supportsStreaming = dto.supportsStreaming,
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                    hasSpoiler = dto.hasSpoiler,
                )
            }
            is TdApi.InputMessageVideoNote -> {
                return InputMessageContentDto.VideoNote(
                    videoNote = map(dto.videoNote),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    length = dto.length,
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                )
            }
            is TdApi.InputMessageVoiceNote -> {
                return InputMessageContentDto.VoiceNote(
                    voiceNote = map(dto.voiceNote),
                    duration = dto.duration,
                    waveform = dto.waveform,
                    caption = dto.caption?.let { map(it) },
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                )
            }
            is TdApi.InputMessageLocation -> {
                return InputMessageContentDto.Location(
                    location = map(dto.location),
                    livePeriod = dto.livePeriod,
                    heading = dto.heading,
                    proximityAlertRadius = dto.proximityAlertRadius,
                )
            }
            is TdApi.InputMessageVenue -> {
                return InputMessageContentDto.Venue(
                    venue = map(dto.venue),
                )
            }
            is TdApi.InputMessageContact -> {
                return InputMessageContentDto.Contact(
                    contact = map(dto.contact),
                )
            }
            is TdApi.InputMessageDice -> {
                return InputMessageContentDto.Dice(
                    emoji = dto.emoji,
                    clearDraft = dto.clearDraft,
                )
            }
            is TdApi.InputMessageGame -> {
                return InputMessageContentDto.Game(
                    botUserId = dto.botUserId,
                    gameShortName = dto.gameShortName,
                )
            }
            is TdApi.InputMessageInvoice -> {
                return InputMessageContentDto.Invoice(
                    invoice = map(dto.invoice),
                    title = dto.title,
                    description = dto.description,
                    photoUrl = dto.photoUrl,
                    photoSize = dto.photoSize,
                    photoWidth = dto.photoWidth,
                    photoHeight = dto.photoHeight,
                    payload = dto.payload,
                    providerToken = dto.providerToken,
                    providerData = dto.providerData,
                    startParameter = dto.startParameter,
                    paidMedia = dto.paidMedia?.let { map(it) },
                    paidMediaCaption = dto.paidMediaCaption?.let { map(it) },
                )
            }
            is TdApi.InputMessagePoll -> {
                return InputMessageContentDto.Poll(
                    question = map(dto.question),
                    options = dto.options.mapArray { map(it) },
                    isAnonymous = dto.isAnonymous,
                    type = map(dto.type),
                    openPeriod = dto.openPeriod,
                    closeDate = dto.closeDate,
                    isClosed = dto.isClosed,
                )
            }
            is TdApi.InputMessageStory -> {
                return InputMessageContentDto.Story(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
            is TdApi.InputMessageForwarded -> {
                return InputMessageContentDto.Forwarded(
                    fromChatId = dto.fromChatId,
                    messageId = dto.messageId,
                    inGameShare = dto.inGameShare,
                    replaceVideoStartTimestamp = dto.replaceVideoStartTimestamp,
                    newVideoStartTimestamp = dto.newVideoStartTimestamp,
                    copyOptions = dto.copyOptions?.let { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputMessageContentDto): TdApi.InputMessageContent {
        when(dto) {
            is InputMessageContentDto.Text -> {
                return TdApi.InputMessageText(
                    text = map(dto.text),
                    linkPreviewOptions = dto.linkPreviewOptions?.let { map(it) },
                    clearDraft = dto.clearDraft,
                )
            }
            is InputMessageContentDto.Animation -> {
                return TdApi.InputMessageAnimation(
                    animation = map(dto.animation),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    addedStickerFileIds = dto.addedStickerFileIds,
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                )
            }
            is InputMessageContentDto.Audio -> {
                return TdApi.InputMessageAudio(
                    audio = map(dto.audio),
                    albumCoverThumbnail = dto.albumCoverThumbnail?.let { map(it) },
                    duration = dto.duration,
                    title = dto.title,
                    performer = dto.performer,
                    caption = dto.caption?.let { map(it) },
                )
            }
            is InputMessageContentDto.Document -> {
                return TdApi.InputMessageDocument(
                    document = map(dto.document),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    disableContentTypeDetection = dto.disableContentTypeDetection,
                    caption = dto.caption?.let { map(it) },
                )
            }
            is InputMessageContentDto.PaidMedia -> {
                return TdApi.InputMessagePaidMedia(
                    starCount = dto.starCount,
                    paidMedia = dto.paidMedia.mapArray { map(it) },
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    payload = dto.payload,
                )
            }
            is InputMessageContentDto.Photo -> {
                return TdApi.InputMessagePhoto(
                    photo = map(dto.photo),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    addedStickerFileIds = dto.addedStickerFileIds,
                    width = dto.width,
                    height = dto.height,
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                    hasSpoiler = dto.hasSpoiler,
                )
            }
            is InputMessageContentDto.Sticker -> {
                return TdApi.InputMessageSticker(
                    sticker = map(dto.sticker),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    width = dto.width,
                    height = dto.height,
                    emoji = dto.emoji,
                )
            }
            is InputMessageContentDto.Video -> {
                return TdApi.InputMessageVideo(
                    video = map(dto.video),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                    addedStickerFileIds = dto.addedStickerFileIds,
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                    supportsStreaming = dto.supportsStreaming,
                    caption = dto.caption?.let { map(it) },
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                    hasSpoiler = dto.hasSpoiler,
                )
            }
            is InputMessageContentDto.VideoNote -> {
                return TdApi.InputMessageVideoNote(
                    videoNote = map(dto.videoNote),
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    length = dto.length,
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                )
            }
            is InputMessageContentDto.VoiceNote -> {
                return TdApi.InputMessageVoiceNote(
                    voiceNote = map(dto.voiceNote),
                    duration = dto.duration,
                    waveform = dto.waveform,
                    caption = dto.caption?.let { map(it) },
                    selfDestructType = dto.selfDestructType?.let { map(it) },
                )
            }
            is InputMessageContentDto.Location -> {
                return TdApi.InputMessageLocation(
                    location = map(dto.location),
                    livePeriod = dto.livePeriod,
                    heading = dto.heading,
                    proximityAlertRadius = dto.proximityAlertRadius,
                )
            }
            is InputMessageContentDto.Venue -> {
                return TdApi.InputMessageVenue(
                    venue = map(dto.venue),
                )
            }
            is InputMessageContentDto.Contact -> {
                return TdApi.InputMessageContact(
                    contact = map(dto.contact),
                )
            }
            is InputMessageContentDto.Dice -> {
                return TdApi.InputMessageDice(
                    emoji = dto.emoji,
                    clearDraft = dto.clearDraft,
                )
            }
            is InputMessageContentDto.Game -> {
                return TdApi.InputMessageGame(
                    botUserId = dto.botUserId,
                    gameShortName = dto.gameShortName,
                )
            }
            is InputMessageContentDto.Invoice -> {
                return TdApi.InputMessageInvoice(
                    invoice = map(dto.invoice),
                    title = dto.title,
                    description = dto.description,
                    photoUrl = dto.photoUrl,
                    photoSize = dto.photoSize,
                    photoWidth = dto.photoWidth,
                    photoHeight = dto.photoHeight,
                    payload = dto.payload,
                    providerToken = dto.providerToken,
                    providerData = dto.providerData,
                    startParameter = dto.startParameter,
                    paidMedia = dto.paidMedia?.let { map(it) },
                    paidMediaCaption = dto.paidMediaCaption?.let { map(it) },
                )
            }
            is InputMessageContentDto.Poll -> {
                return TdApi.InputMessagePoll(
                    question = map(dto.question),
                    options = dto.options.mapArray { map(it) },
                    isAnonymous = dto.isAnonymous,
                    type = map(dto.type),
                    openPeriod = dto.openPeriod,
                    closeDate = dto.closeDate,
                    isClosed = dto.isClosed,
                )
            }
            is InputMessageContentDto.Story -> {
                return TdApi.InputMessageStory(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
            is InputMessageContentDto.Forwarded -> {
                return TdApi.InputMessageForwarded(
                    fromChatId = dto.fromChatId,
                    messageId = dto.messageId,
                    inGameShare = dto.inGameShare,
                    replaceVideoStartTimestamp = dto.replaceVideoStartTimestamp,
                    newVideoStartTimestamp = dto.newVideoStartTimestamp,
                    copyOptions = dto.copyOptions?.let { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.InputMessageReplyTo): InputMessageReplyToDto {
        when(dto) {
            is TdApi.InputMessageReplyToMessage -> {
                return InputMessageReplyToDto.Message(
                    messageId = dto.messageId,
                    quote = dto.quote?.let { map(it) },
                )
            }
            is TdApi.InputMessageReplyToExternalMessage -> {
                return InputMessageReplyToDto.ExternalMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    quote = dto.quote?.let { map(it) },
                )
            }
            is TdApi.InputMessageReplyToStory -> {
                return InputMessageReplyToDto.Story(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputMessageReplyToDto): TdApi.InputMessageReplyTo {
        when(dto) {
            is InputMessageReplyToDto.Message -> {
                return TdApi.InputMessageReplyToMessage(
                    messageId = dto.messageId,
                    quote = dto.quote?.let { map(it) },
                )
            }
            is InputMessageReplyToDto.ExternalMessage -> {
                return TdApi.InputMessageReplyToExternalMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    quote = dto.quote?.let { map(it) },
                )
            }
            is InputMessageReplyToDto.Story -> {
                return TdApi.InputMessageReplyToStory(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
        }
    }

    fun map(dto: TdApi.InputPaidMediaType): InputPaidMediaTypeDto {
        when(dto) {
            is TdApi.InputPaidMediaTypePhoto -> {
                return InputPaidMediaTypeDto.Photo(
                )
            }
            is TdApi.InputPaidMediaTypeVideo -> {
                return InputPaidMediaTypeDto.Video(
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                    duration = dto.duration,
                    supportsStreaming = dto.supportsStreaming,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputPaidMediaTypeDto): TdApi.InputPaidMediaType {
        when(dto) {
            is InputPaidMediaTypeDto.Photo -> {
                return TdApi.InputPaidMediaTypePhoto(
                )
            }
            is InputPaidMediaTypeDto.Video -> {
                return TdApi.InputPaidMediaTypeVideo(
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                    duration = dto.duration,
                    supportsStreaming = dto.supportsStreaming,
                )
            }
        }
    }

    fun map(dto: TdApi.InputPassportElement): InputPassportElementDto {
        when(dto) {
            is TdApi.InputPassportElementPersonalDetails -> {
                return InputPassportElementDto.PersonalDetails(
                    personalDetails = map(dto.personalDetails),
                )
            }
            is TdApi.InputPassportElementPassport -> {
                return InputPassportElementDto.Passport(
                    passport = map(dto.passport),
                )
            }
            is TdApi.InputPassportElementDriverLicense -> {
                return InputPassportElementDto.DriverLicense(
                    driverLicense = map(dto.driverLicense),
                )
            }
            is TdApi.InputPassportElementIdentityCard -> {
                return InputPassportElementDto.IdentityCard(
                    identityCard = map(dto.identityCard),
                )
            }
            is TdApi.InputPassportElementInternalPassport -> {
                return InputPassportElementDto.InternalPassport(
                    internalPassport = map(dto.internalPassport),
                )
            }
            is TdApi.InputPassportElementAddress -> {
                return InputPassportElementDto.Address(
                    address = map(dto.address),
                )
            }
            is TdApi.InputPassportElementUtilityBill -> {
                return InputPassportElementDto.UtilityBill(
                    utilityBill = map(dto.utilityBill),
                )
            }
            is TdApi.InputPassportElementBankStatement -> {
                return InputPassportElementDto.BankStatement(
                    bankStatement = map(dto.bankStatement),
                )
            }
            is TdApi.InputPassportElementRentalAgreement -> {
                return InputPassportElementDto.RentalAgreement(
                    rentalAgreement = map(dto.rentalAgreement),
                )
            }
            is TdApi.InputPassportElementPassportRegistration -> {
                return InputPassportElementDto.PassportRegistration(
                    passportRegistration = map(dto.passportRegistration),
                )
            }
            is TdApi.InputPassportElementTemporaryRegistration -> {
                return InputPassportElementDto.TemporaryRegistration(
                    temporaryRegistration = map(dto.temporaryRegistration),
                )
            }
            is TdApi.InputPassportElementPhoneNumber -> {
                return InputPassportElementDto.PhoneNumber(
                    phoneNumber = dto.phoneNumber,
                )
            }
            is TdApi.InputPassportElementEmailAddress -> {
                return InputPassportElementDto.EmailAddress(
                    emailAddress = dto.emailAddress,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputPassportElementDto): TdApi.InputPassportElement {
        when(dto) {
            is InputPassportElementDto.PersonalDetails -> {
                return TdApi.InputPassportElementPersonalDetails(
                    personalDetails = map(dto.personalDetails),
                )
            }
            is InputPassportElementDto.Passport -> {
                return TdApi.InputPassportElementPassport(
                    passport = map(dto.passport),
                )
            }
            is InputPassportElementDto.DriverLicense -> {
                return TdApi.InputPassportElementDriverLicense(
                    driverLicense = map(dto.driverLicense),
                )
            }
            is InputPassportElementDto.IdentityCard -> {
                return TdApi.InputPassportElementIdentityCard(
                    identityCard = map(dto.identityCard),
                )
            }
            is InputPassportElementDto.InternalPassport -> {
                return TdApi.InputPassportElementInternalPassport(
                    internalPassport = map(dto.internalPassport),
                )
            }
            is InputPassportElementDto.Address -> {
                return TdApi.InputPassportElementAddress(
                    address = map(dto.address),
                )
            }
            is InputPassportElementDto.UtilityBill -> {
                return TdApi.InputPassportElementUtilityBill(
                    utilityBill = map(dto.utilityBill),
                )
            }
            is InputPassportElementDto.BankStatement -> {
                return TdApi.InputPassportElementBankStatement(
                    bankStatement = map(dto.bankStatement),
                )
            }
            is InputPassportElementDto.RentalAgreement -> {
                return TdApi.InputPassportElementRentalAgreement(
                    rentalAgreement = map(dto.rentalAgreement),
                )
            }
            is InputPassportElementDto.PassportRegistration -> {
                return TdApi.InputPassportElementPassportRegistration(
                    passportRegistration = map(dto.passportRegistration),
                )
            }
            is InputPassportElementDto.TemporaryRegistration -> {
                return TdApi.InputPassportElementTemporaryRegistration(
                    temporaryRegistration = map(dto.temporaryRegistration),
                )
            }
            is InputPassportElementDto.PhoneNumber -> {
                return TdApi.InputPassportElementPhoneNumber(
                    phoneNumber = dto.phoneNumber,
                )
            }
            is InputPassportElementDto.EmailAddress -> {
                return TdApi.InputPassportElementEmailAddress(
                    emailAddress = dto.emailAddress,
                )
            }
        }
    }

    fun map(dto: TdApi.InputPassportElementErrorSource): InputPassportElementErrorSourceDto {
        when(dto) {
            is TdApi.InputPassportElementErrorSourceUnspecified -> {
                return InputPassportElementErrorSourceDto.Unspecified(
                    elementHash = dto.elementHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceDataField -> {
                return InputPassportElementErrorSourceDto.DataField(
                    fieldName = dto.fieldName,
                    dataHash = dto.dataHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceFrontSide -> {
                return InputPassportElementErrorSourceDto.FrontSide(
                    fileHash = dto.fileHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceReverseSide -> {
                return InputPassportElementErrorSourceDto.ReverseSide(
                    fileHash = dto.fileHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceSelfie -> {
                return InputPassportElementErrorSourceDto.Selfie(
                    fileHash = dto.fileHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceTranslationFile -> {
                return InputPassportElementErrorSourceDto.TranslationFile(
                    fileHash = dto.fileHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceTranslationFiles -> {
                return InputPassportElementErrorSourceDto.TranslationFiles(
                    fileHashes = dto.fileHashes,
                )
            }
            is TdApi.InputPassportElementErrorSourceFile -> {
                return InputPassportElementErrorSourceDto.File(
                    fileHash = dto.fileHash,
                )
            }
            is TdApi.InputPassportElementErrorSourceFiles -> {
                return InputPassportElementErrorSourceDto.Files(
                    fileHashes = dto.fileHashes,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputPassportElementErrorSourceDto): TdApi.InputPassportElementErrorSource {
        when(dto) {
            is InputPassportElementErrorSourceDto.Unspecified -> {
                return TdApi.InputPassportElementErrorSourceUnspecified(
                    elementHash = dto.elementHash,
                )
            }
            is InputPassportElementErrorSourceDto.DataField -> {
                return TdApi.InputPassportElementErrorSourceDataField(
                    fieldName = dto.fieldName,
                    dataHash = dto.dataHash,
                )
            }
            is InputPassportElementErrorSourceDto.FrontSide -> {
                return TdApi.InputPassportElementErrorSourceFrontSide(
                    fileHash = dto.fileHash,
                )
            }
            is InputPassportElementErrorSourceDto.ReverseSide -> {
                return TdApi.InputPassportElementErrorSourceReverseSide(
                    fileHash = dto.fileHash,
                )
            }
            is InputPassportElementErrorSourceDto.Selfie -> {
                return TdApi.InputPassportElementErrorSourceSelfie(
                    fileHash = dto.fileHash,
                )
            }
            is InputPassportElementErrorSourceDto.TranslationFile -> {
                return TdApi.InputPassportElementErrorSourceTranslationFile(
                    fileHash = dto.fileHash,
                )
            }
            is InputPassportElementErrorSourceDto.TranslationFiles -> {
                return TdApi.InputPassportElementErrorSourceTranslationFiles(
                    fileHashes = dto.fileHashes,
                )
            }
            is InputPassportElementErrorSourceDto.File -> {
                return TdApi.InputPassportElementErrorSourceFile(
                    fileHash = dto.fileHash,
                )
            }
            is InputPassportElementErrorSourceDto.Files -> {
                return TdApi.InputPassportElementErrorSourceFiles(
                    fileHashes = dto.fileHashes,
                )
            }
        }
    }

    fun map(dto: TdApi.InputStoryAreaType): InputStoryAreaTypeDto {
        when(dto) {
            is TdApi.InputStoryAreaTypeLocation -> {
                return InputStoryAreaTypeDto.Location(
                    location = map(dto.location),
                    address = dto.address?.let { map(it) },
                )
            }
            is TdApi.InputStoryAreaTypeFoundVenue -> {
                return InputStoryAreaTypeDto.FoundVenue(
                    queryId = dto.queryId,
                    resultId = dto.resultId,
                )
            }
            is TdApi.InputStoryAreaTypePreviousVenue -> {
                return InputStoryAreaTypeDto.PreviousVenue(
                    venueProvider = dto.venueProvider,
                    venueId = dto.venueId,
                )
            }
            is TdApi.InputStoryAreaTypeSuggestedReaction -> {
                return InputStoryAreaTypeDto.SuggestedReaction(
                    reactionType = map(dto.reactionType),
                    isDark = dto.isDark,
                    isFlipped = dto.isFlipped,
                )
            }
            is TdApi.InputStoryAreaTypeMessage -> {
                return InputStoryAreaTypeDto.Message(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is TdApi.InputStoryAreaTypeLink -> {
                return InputStoryAreaTypeDto.Link(
                    url = dto.url,
                )
            }
            is TdApi.InputStoryAreaTypeWeather -> {
                return InputStoryAreaTypeDto.Weather(
                    temperature = dto.temperature,
                    emoji = dto.emoji,
                    backgroundColor = dto.backgroundColor,
                )
            }
            is TdApi.InputStoryAreaTypeUpgradedGift -> {
                return InputStoryAreaTypeDto.UpgradedGift(
                    giftName = dto.giftName,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputStoryAreaTypeDto): TdApi.InputStoryAreaType {
        when(dto) {
            is InputStoryAreaTypeDto.Location -> {
                return TdApi.InputStoryAreaTypeLocation(
                    location = map(dto.location),
                    address = dto.address?.let { map(it) },
                )
            }
            is InputStoryAreaTypeDto.FoundVenue -> {
                return TdApi.InputStoryAreaTypeFoundVenue(
                    queryId = dto.queryId,
                    resultId = dto.resultId,
                )
            }
            is InputStoryAreaTypeDto.PreviousVenue -> {
                return TdApi.InputStoryAreaTypePreviousVenue(
                    venueProvider = dto.venueProvider,
                    venueId = dto.venueId,
                )
            }
            is InputStoryAreaTypeDto.SuggestedReaction -> {
                return TdApi.InputStoryAreaTypeSuggestedReaction(
                    reactionType = map(dto.reactionType),
                    isDark = dto.isDark,
                    isFlipped = dto.isFlipped,
                )
            }
            is InputStoryAreaTypeDto.Message -> {
                return TdApi.InputStoryAreaTypeMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is InputStoryAreaTypeDto.Link -> {
                return TdApi.InputStoryAreaTypeLink(
                    url = dto.url,
                )
            }
            is InputStoryAreaTypeDto.Weather -> {
                return TdApi.InputStoryAreaTypeWeather(
                    temperature = dto.temperature,
                    emoji = dto.emoji,
                    backgroundColor = dto.backgroundColor,
                )
            }
            is InputStoryAreaTypeDto.UpgradedGift -> {
                return TdApi.InputStoryAreaTypeUpgradedGift(
                    giftName = dto.giftName,
                )
            }
        }
    }

    fun map(dto: TdApi.InputStoryContent): InputStoryContentDto {
        when(dto) {
            is TdApi.InputStoryContentPhoto -> {
                return InputStoryContentDto.Photo(
                    photo = map(dto.photo),
                    addedStickerFileIds = dto.addedStickerFileIds,
                )
            }
            is TdApi.InputStoryContentVideo -> {
                return InputStoryContentDto.Video(
                    video = map(dto.video),
                    addedStickerFileIds = dto.addedStickerFileIds,
                    duration = dto.duration,
                    coverFrameTimestamp = dto.coverFrameTimestamp,
                    isAnimation = dto.isAnimation,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InputStoryContentDto): TdApi.InputStoryContent {
        when(dto) {
            is InputStoryContentDto.Photo -> {
                return TdApi.InputStoryContentPhoto(
                    photo = map(dto.photo),
                    addedStickerFileIds = dto.addedStickerFileIds,
                )
            }
            is InputStoryContentDto.Video -> {
                return TdApi.InputStoryContentVideo(
                    video = map(dto.video),
                    addedStickerFileIds = dto.addedStickerFileIds,
                    duration = dto.duration,
                    coverFrameTimestamp = dto.coverFrameTimestamp,
                    isAnimation = dto.isAnimation,
                )
            }
        }
    }

    fun map(dto: TdApi.InternalLinkType): InternalLinkTypeDto {
        when(dto) {
            is TdApi.InternalLinkTypeActiveSessions -> {
                return InternalLinkTypeDto.ActiveSessions(
                )
            }
            is TdApi.InternalLinkTypeAttachmentMenuBot -> {
                return InternalLinkTypeDto.AttachmentMenuBot(
                    targetChat = map(dto.targetChat),
                    botUsername = dto.botUsername,
                    url = dto.url,
                )
            }
            is TdApi.InternalLinkTypeAuthenticationCode -> {
                return InternalLinkTypeDto.AuthenticationCode(
                    code = dto.code,
                )
            }
            is TdApi.InternalLinkTypeBackground -> {
                return InternalLinkTypeDto.Background(
                    backgroundName = dto.backgroundName,
                )
            }
            is TdApi.InternalLinkTypeBotAddToChannel -> {
                return InternalLinkTypeDto.BotAddToChannel(
                    botUsername = dto.botUsername,
                    administratorRights = map(dto.administratorRights),
                )
            }
            is TdApi.InternalLinkTypeBotStart -> {
                return InternalLinkTypeDto.BotStart(
                    botUsername = dto.botUsername,
                    startParameter = dto.startParameter,
                    autostart = dto.autostart,
                )
            }
            is TdApi.InternalLinkTypeBotStartInGroup -> {
                return InternalLinkTypeDto.BotStartInGroup(
                    botUsername = dto.botUsername,
                    startParameter = dto.startParameter,
                    administratorRights = dto.administratorRights?.let { map(it) },
                )
            }
            is TdApi.InternalLinkTypeBusinessChat -> {
                return InternalLinkTypeDto.BusinessChat(
                    linkName = dto.linkName,
                )
            }
            is TdApi.InternalLinkTypeBuyStars -> {
                return InternalLinkTypeDto.BuyStars(
                    starCount = dto.starCount,
                    purpose = dto.purpose,
                )
            }
            is TdApi.InternalLinkTypeChangePhoneNumber -> {
                return InternalLinkTypeDto.ChangePhoneNumber(
                )
            }
            is TdApi.InternalLinkTypeChatAffiliateProgram -> {
                return InternalLinkTypeDto.ChatAffiliateProgram(
                    username = dto.username,
                    referrer = dto.referrer,
                )
            }
            is TdApi.InternalLinkTypeChatBoost -> {
                return InternalLinkTypeDto.ChatBoost(
                    url = dto.url,
                )
            }
            is TdApi.InternalLinkTypeChatFolderInvite -> {
                return InternalLinkTypeDto.ChatFolderInvite(
                    inviteLink = dto.inviteLink,
                )
            }
            is TdApi.InternalLinkTypeChatFolderSettings -> {
                return InternalLinkTypeDto.ChatFolderSettings(
                )
            }
            is TdApi.InternalLinkTypeChatInvite -> {
                return InternalLinkTypeDto.ChatInvite(
                    inviteLink = dto.inviteLink,
                )
            }
            is TdApi.InternalLinkTypeDefaultMessageAutoDeleteTimerSettings -> {
                return InternalLinkTypeDto.DefaultMessageAutoDeleteTimerSettings(
                )
            }
            is TdApi.InternalLinkTypeEditProfileSettings -> {
                return InternalLinkTypeDto.EditProfileSettings(
                )
            }
            is TdApi.InternalLinkTypeGame -> {
                return InternalLinkTypeDto.Game(
                    botUsername = dto.botUsername,
                    gameShortName = dto.gameShortName,
                )
            }
            is TdApi.InternalLinkTypeGroupCall -> {
                return InternalLinkTypeDto.GroupCall(
                    inviteLink = dto.inviteLink,
                )
            }
            is TdApi.InternalLinkTypeInstantView -> {
                return InternalLinkTypeDto.InstantView(
                    url = dto.url,
                    fallbackUrl = dto.fallbackUrl,
                )
            }
            is TdApi.InternalLinkTypeInvoice -> {
                return InternalLinkTypeDto.Invoice(
                    invoiceName = dto.invoiceName,
                )
            }
            is TdApi.InternalLinkTypeLanguagePack -> {
                return InternalLinkTypeDto.LanguagePack(
                    languagePackId = dto.languagePackId,
                )
            }
            is TdApi.InternalLinkTypeLanguageSettings -> {
                return InternalLinkTypeDto.LanguageSettings(
                )
            }
            is TdApi.InternalLinkTypeMainWebApp -> {
                return InternalLinkTypeDto.MainWebApp(
                    botUsername = dto.botUsername,
                    startParameter = dto.startParameter,
                    mode = map(dto.mode),
                )
            }
            is TdApi.InternalLinkTypeMessage -> {
                return InternalLinkTypeDto.Message(
                    url = dto.url,
                )
            }
            is TdApi.InternalLinkTypeMessageDraft -> {
                return InternalLinkTypeDto.MessageDraft(
                    text = map(dto.text),
                    containsLink = dto.containsLink,
                )
            }
            is TdApi.InternalLinkTypePassportDataRequest -> {
                return InternalLinkTypeDto.PassportDataRequest(
                    botUserId = dto.botUserId,
                    scope = dto.scope,
                    publicKey = dto.publicKey,
                    nonce = dto.nonce,
                    callbackUrl = dto.callbackUrl,
                )
            }
            is TdApi.InternalLinkTypePhoneNumberConfirmation -> {
                return InternalLinkTypeDto.PhoneNumberConfirmation(
                    hash = dto.hash,
                    phoneNumber = dto.phoneNumber,
                )
            }
            is TdApi.InternalLinkTypePremiumFeatures -> {
                return InternalLinkTypeDto.PremiumFeatures(
                    referrer = dto.referrer,
                )
            }
            is TdApi.InternalLinkTypePremiumGift -> {
                return InternalLinkTypeDto.PremiumGift(
                    referrer = dto.referrer,
                )
            }
            is TdApi.InternalLinkTypePremiumGiftCode -> {
                return InternalLinkTypeDto.PremiumGiftCode(
                    code = dto.code,
                )
            }
            is TdApi.InternalLinkTypePrivacyAndSecuritySettings -> {
                return InternalLinkTypeDto.PrivacyAndSecuritySettings(
                )
            }
            is TdApi.InternalLinkTypeProxy -> {
                return InternalLinkTypeDto.Proxy(
                    server = dto.server,
                    port = dto.port,
                    type = map(dto.type),
                )
            }
            is TdApi.InternalLinkTypePublicChat -> {
                return InternalLinkTypeDto.PublicChat(
                    chatUsername = dto.chatUsername,
                    draftText = dto.draftText,
                    openProfile = dto.openProfile,
                )
            }
            is TdApi.InternalLinkTypeQrCodeAuthentication -> {
                return InternalLinkTypeDto.QrCodeAuthentication(
                )
            }
            is TdApi.InternalLinkTypeRestorePurchases -> {
                return InternalLinkTypeDto.RestorePurchases(
                )
            }
            is TdApi.InternalLinkTypeSettings -> {
                return InternalLinkTypeDto.Settings(
                )
            }
            is TdApi.InternalLinkTypeStickerSet -> {
                return InternalLinkTypeDto.StickerSet(
                    stickerSetName = dto.stickerSetName,
                    expectCustomEmoji = dto.expectCustomEmoji,
                )
            }
            is TdApi.InternalLinkTypeStory -> {
                return InternalLinkTypeDto.Story(
                    storyPosterUsername = dto.storyPosterUsername,
                    storyId = dto.storyId,
                )
            }
            is TdApi.InternalLinkTypeTheme -> {
                return InternalLinkTypeDto.Theme(
                    themeName = dto.themeName,
                )
            }
            is TdApi.InternalLinkTypeThemeSettings -> {
                return InternalLinkTypeDto.ThemeSettings(
                )
            }
            is TdApi.InternalLinkTypeUnknownDeepLink -> {
                return InternalLinkTypeDto.UnknownDeepLink(
                    link = dto.link,
                )
            }
            is TdApi.InternalLinkTypeUnsupportedProxy -> {
                return InternalLinkTypeDto.UnsupportedProxy(
                )
            }
            is TdApi.InternalLinkTypeUpgradedGift -> {
                return InternalLinkTypeDto.UpgradedGift(
                    name = dto.name,
                )
            }
            is TdApi.InternalLinkTypeUserPhoneNumber -> {
                return InternalLinkTypeDto.UserPhoneNumber(
                    phoneNumber = dto.phoneNumber,
                    draftText = dto.draftText,
                    openProfile = dto.openProfile,
                )
            }
            is TdApi.InternalLinkTypeUserToken -> {
                return InternalLinkTypeDto.UserToken(
                    token = dto.token,
                )
            }
            is TdApi.InternalLinkTypeVideoChat -> {
                return InternalLinkTypeDto.VideoChat(
                    chatUsername = dto.chatUsername,
                    inviteHash = dto.inviteHash,
                    isLiveStream = dto.isLiveStream,
                )
            }
            is TdApi.InternalLinkTypeWebApp -> {
                return InternalLinkTypeDto.WebApp(
                    botUsername = dto.botUsername,
                    webAppShortName = dto.webAppShortName,
                    startParameter = dto.startParameter,
                    mode = map(dto.mode),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InternalLinkTypeDto): TdApi.InternalLinkType {
        when(dto) {
            is InternalLinkTypeDto.ActiveSessions -> {
                return TdApi.InternalLinkTypeActiveSessions(
                )
            }
            is InternalLinkTypeDto.AttachmentMenuBot -> {
                return TdApi.InternalLinkTypeAttachmentMenuBot(
                    targetChat = map(dto.targetChat),
                    botUsername = dto.botUsername,
                    url = dto.url,
                )
            }
            is InternalLinkTypeDto.AuthenticationCode -> {
                return TdApi.InternalLinkTypeAuthenticationCode(
                    code = dto.code,
                )
            }
            is InternalLinkTypeDto.Background -> {
                return TdApi.InternalLinkTypeBackground(
                    backgroundName = dto.backgroundName,
                )
            }
            is InternalLinkTypeDto.BotAddToChannel -> {
                return TdApi.InternalLinkTypeBotAddToChannel(
                    botUsername = dto.botUsername,
                    administratorRights = map(dto.administratorRights),
                )
            }
            is InternalLinkTypeDto.BotStart -> {
                return TdApi.InternalLinkTypeBotStart(
                    botUsername = dto.botUsername,
                    startParameter = dto.startParameter,
                    autostart = dto.autostart,
                )
            }
            is InternalLinkTypeDto.BotStartInGroup -> {
                return TdApi.InternalLinkTypeBotStartInGroup(
                    botUsername = dto.botUsername,
                    startParameter = dto.startParameter,
                    administratorRights = dto.administratorRights?.let { map(it) },
                )
            }
            is InternalLinkTypeDto.BusinessChat -> {
                return TdApi.InternalLinkTypeBusinessChat(
                    linkName = dto.linkName,
                )
            }
            is InternalLinkTypeDto.BuyStars -> {
                return TdApi.InternalLinkTypeBuyStars(
                    starCount = dto.starCount,
                    purpose = dto.purpose,
                )
            }
            is InternalLinkTypeDto.ChangePhoneNumber -> {
                return TdApi.InternalLinkTypeChangePhoneNumber(
                )
            }
            is InternalLinkTypeDto.ChatAffiliateProgram -> {
                return TdApi.InternalLinkTypeChatAffiliateProgram(
                    username = dto.username,
                    referrer = dto.referrer,
                )
            }
            is InternalLinkTypeDto.ChatBoost -> {
                return TdApi.InternalLinkTypeChatBoost(
                    url = dto.url,
                )
            }
            is InternalLinkTypeDto.ChatFolderInvite -> {
                return TdApi.InternalLinkTypeChatFolderInvite(
                    inviteLink = dto.inviteLink,
                )
            }
            is InternalLinkTypeDto.ChatFolderSettings -> {
                return TdApi.InternalLinkTypeChatFolderSettings(
                )
            }
            is InternalLinkTypeDto.ChatInvite -> {
                return TdApi.InternalLinkTypeChatInvite(
                    inviteLink = dto.inviteLink,
                )
            }
            is InternalLinkTypeDto.DefaultMessageAutoDeleteTimerSettings -> {
                return TdApi.InternalLinkTypeDefaultMessageAutoDeleteTimerSettings(
                )
            }
            is InternalLinkTypeDto.EditProfileSettings -> {
                return TdApi.InternalLinkTypeEditProfileSettings(
                )
            }
            is InternalLinkTypeDto.Game -> {
                return TdApi.InternalLinkTypeGame(
                    botUsername = dto.botUsername,
                    gameShortName = dto.gameShortName,
                )
            }
            is InternalLinkTypeDto.GroupCall -> {
                return TdApi.InternalLinkTypeGroupCall(
                    inviteLink = dto.inviteLink,
                )
            }
            is InternalLinkTypeDto.InstantView -> {
                return TdApi.InternalLinkTypeInstantView(
                    url = dto.url,
                    fallbackUrl = dto.fallbackUrl,
                )
            }
            is InternalLinkTypeDto.Invoice -> {
                return TdApi.InternalLinkTypeInvoice(
                    invoiceName = dto.invoiceName,
                )
            }
            is InternalLinkTypeDto.LanguagePack -> {
                return TdApi.InternalLinkTypeLanguagePack(
                    languagePackId = dto.languagePackId,
                )
            }
            is InternalLinkTypeDto.LanguageSettings -> {
                return TdApi.InternalLinkTypeLanguageSettings(
                )
            }
            is InternalLinkTypeDto.MainWebApp -> {
                return TdApi.InternalLinkTypeMainWebApp(
                    botUsername = dto.botUsername,
                    startParameter = dto.startParameter,
                    mode = map(dto.mode),
                )
            }
            is InternalLinkTypeDto.Message -> {
                return TdApi.InternalLinkTypeMessage(
                    url = dto.url,
                )
            }
            is InternalLinkTypeDto.MessageDraft -> {
                return TdApi.InternalLinkTypeMessageDraft(
                    text = map(dto.text),
                    containsLink = dto.containsLink,
                )
            }
            is InternalLinkTypeDto.PassportDataRequest -> {
                return TdApi.InternalLinkTypePassportDataRequest(
                    botUserId = dto.botUserId,
                    scope = dto.scope,
                    publicKey = dto.publicKey,
                    nonce = dto.nonce,
                    callbackUrl = dto.callbackUrl,
                )
            }
            is InternalLinkTypeDto.PhoneNumberConfirmation -> {
                return TdApi.InternalLinkTypePhoneNumberConfirmation(
                    hash = dto.hash,
                    phoneNumber = dto.phoneNumber,
                )
            }
            is InternalLinkTypeDto.PremiumFeatures -> {
                return TdApi.InternalLinkTypePremiumFeatures(
                    referrer = dto.referrer,
                )
            }
            is InternalLinkTypeDto.PremiumGift -> {
                return TdApi.InternalLinkTypePremiumGift(
                    referrer = dto.referrer,
                )
            }
            is InternalLinkTypeDto.PremiumGiftCode -> {
                return TdApi.InternalLinkTypePremiumGiftCode(
                    code = dto.code,
                )
            }
            is InternalLinkTypeDto.PrivacyAndSecuritySettings -> {
                return TdApi.InternalLinkTypePrivacyAndSecuritySettings(
                )
            }
            is InternalLinkTypeDto.Proxy -> {
                return TdApi.InternalLinkTypeProxy(
                    server = dto.server,
                    port = dto.port,
                    type = map(dto.type),
                )
            }
            is InternalLinkTypeDto.PublicChat -> {
                return TdApi.InternalLinkTypePublicChat(
                    chatUsername = dto.chatUsername,
                    draftText = dto.draftText,
                    openProfile = dto.openProfile,
                )
            }
            is InternalLinkTypeDto.QrCodeAuthentication -> {
                return TdApi.InternalLinkTypeQrCodeAuthentication(
                )
            }
            is InternalLinkTypeDto.RestorePurchases -> {
                return TdApi.InternalLinkTypeRestorePurchases(
                )
            }
            is InternalLinkTypeDto.Settings -> {
                return TdApi.InternalLinkTypeSettings(
                )
            }
            is InternalLinkTypeDto.StickerSet -> {
                return TdApi.InternalLinkTypeStickerSet(
                    stickerSetName = dto.stickerSetName,
                    expectCustomEmoji = dto.expectCustomEmoji,
                )
            }
            is InternalLinkTypeDto.Story -> {
                return TdApi.InternalLinkTypeStory(
                    storyPosterUsername = dto.storyPosterUsername,
                    storyId = dto.storyId,
                )
            }
            is InternalLinkTypeDto.Theme -> {
                return TdApi.InternalLinkTypeTheme(
                    themeName = dto.themeName,
                )
            }
            is InternalLinkTypeDto.ThemeSettings -> {
                return TdApi.InternalLinkTypeThemeSettings(
                )
            }
            is InternalLinkTypeDto.UnknownDeepLink -> {
                return TdApi.InternalLinkTypeUnknownDeepLink(
                    link = dto.link,
                )
            }
            is InternalLinkTypeDto.UnsupportedProxy -> {
                return TdApi.InternalLinkTypeUnsupportedProxy(
                )
            }
            is InternalLinkTypeDto.UpgradedGift -> {
                return TdApi.InternalLinkTypeUpgradedGift(
                    name = dto.name,
                )
            }
            is InternalLinkTypeDto.UserPhoneNumber -> {
                return TdApi.InternalLinkTypeUserPhoneNumber(
                    phoneNumber = dto.phoneNumber,
                    draftText = dto.draftText,
                    openProfile = dto.openProfile,
                )
            }
            is InternalLinkTypeDto.UserToken -> {
                return TdApi.InternalLinkTypeUserToken(
                    token = dto.token,
                )
            }
            is InternalLinkTypeDto.VideoChat -> {
                return TdApi.InternalLinkTypeVideoChat(
                    chatUsername = dto.chatUsername,
                    inviteHash = dto.inviteHash,
                    isLiveStream = dto.isLiveStream,
                )
            }
            is InternalLinkTypeDto.WebApp -> {
                return TdApi.InternalLinkTypeWebApp(
                    botUsername = dto.botUsername,
                    webAppShortName = dto.webAppShortName,
                    startParameter = dto.startParameter,
                    mode = map(dto.mode),
                )
            }
        }
    }

    fun map(dto: TdApi.InviteGroupCallParticipantResult): InviteGroupCallParticipantResultDto {
        when(dto) {
            is TdApi.InviteGroupCallParticipantResultUserPrivacyRestricted -> {
                return InviteGroupCallParticipantResultDto.UserPrivacyRestricted(
                )
            }
            is TdApi.InviteGroupCallParticipantResultUserAlreadyParticipant -> {
                return InviteGroupCallParticipantResultDto.UserAlreadyParticipant(
                )
            }
            is TdApi.InviteGroupCallParticipantResultUserWasBanned -> {
                return InviteGroupCallParticipantResultDto.UserWasBanned(
                )
            }
            is TdApi.InviteGroupCallParticipantResultSuccess -> {
                return InviteGroupCallParticipantResultDto.Success(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InviteGroupCallParticipantResultDto): TdApi.InviteGroupCallParticipantResult {
        when(dto) {
            is InviteGroupCallParticipantResultDto.UserPrivacyRestricted -> {
                return TdApi.InviteGroupCallParticipantResultUserPrivacyRestricted(
                )
            }
            is InviteGroupCallParticipantResultDto.UserAlreadyParticipant -> {
                return TdApi.InviteGroupCallParticipantResultUserAlreadyParticipant(
                )
            }
            is InviteGroupCallParticipantResultDto.UserWasBanned -> {
                return TdApi.InviteGroupCallParticipantResultUserWasBanned(
                )
            }
            is InviteGroupCallParticipantResultDto.Success -> {
                return TdApi.InviteGroupCallParticipantResultSuccess(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
        }
    }

    fun map(dto: TdApi.InviteLinkChatType): InviteLinkChatTypeDto {
        when(dto) {
            is TdApi.InviteLinkChatTypeBasicGroup -> {
                return InviteLinkChatTypeDto.BasicGroup(
                )
            }
            is TdApi.InviteLinkChatTypeSupergroup -> {
                return InviteLinkChatTypeDto.Supergroup(
                )
            }
            is TdApi.InviteLinkChatTypeChannel -> {
                return InviteLinkChatTypeDto.Channel(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: InviteLinkChatTypeDto): TdApi.InviteLinkChatType {
        when(dto) {
            is InviteLinkChatTypeDto.BasicGroup -> {
                return TdApi.InviteLinkChatTypeBasicGroup(
                )
            }
            is InviteLinkChatTypeDto.Supergroup -> {
                return TdApi.InviteLinkChatTypeSupergroup(
                )
            }
            is InviteLinkChatTypeDto.Channel -> {
                return TdApi.InviteLinkChatTypeChannel(
                )
            }
        }
    }

    fun map(dto: TdApi.JsonValue): JsonValueDto {
        when(dto) {
            is TdApi.JsonValueNull -> {
                return JsonValueDto.Null(
                )
            }
            is TdApi.JsonValueBoolean -> {
                return JsonValueDto.Boolean(
                    value = dto.value,
                )
            }
            is TdApi.JsonValueNumber -> {
                return JsonValueDto.Number(
                    value = dto.value,
                )
            }
            is TdApi.JsonValueString -> {
                return JsonValueDto.String(
                    value = dto.value,
                )
            }
            is TdApi.JsonValueArray -> {
                return JsonValueDto.Array(
                    values = dto.values.mapArray { map(it) },
                )
            }
            is TdApi.JsonValueObject -> {
                return JsonValueDto.Object(
                    members = dto.members.mapArray { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: JsonValueDto): TdApi.JsonValue {
        when(dto) {
            is JsonValueDto.Null -> {
                return TdApi.JsonValueNull(
                )
            }
            is JsonValueDto.Boolean -> {
                return TdApi.JsonValueBoolean(
                    value = dto.value,
                )
            }
            is JsonValueDto.Number -> {
                return TdApi.JsonValueNumber(
                    value = dto.value,
                )
            }
            is JsonValueDto.String -> {
                return TdApi.JsonValueString(
                    value = dto.value,
                )
            }
            is JsonValueDto.Array -> {
                return TdApi.JsonValueArray(
                    values = dto.values.mapArray { map(it) },
                )
            }
            is JsonValueDto.Object -> {
                return TdApi.JsonValueObject(
                    members = dto.members.mapArray { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.KeyboardButtonType): KeyboardButtonTypeDto {
        when(dto) {
            is TdApi.KeyboardButtonTypeText -> {
                return KeyboardButtonTypeDto.Text(
                )
            }
            is TdApi.KeyboardButtonTypeRequestPhoneNumber -> {
                return KeyboardButtonTypeDto.RequestPhoneNumber(
                )
            }
            is TdApi.KeyboardButtonTypeRequestLocation -> {
                return KeyboardButtonTypeDto.RequestLocation(
                )
            }
            is TdApi.KeyboardButtonTypeRequestPoll -> {
                return KeyboardButtonTypeDto.RequestPoll(
                    forceRegular = dto.forceRegular,
                    forceQuiz = dto.forceQuiz,
                )
            }
            is TdApi.KeyboardButtonTypeRequestUsers -> {
                return KeyboardButtonTypeDto.RequestUsers(
                    id = dto.id,
                    restrictUserIsBot = dto.restrictUserIsBot,
                    userIsBot = dto.userIsBot,
                    restrictUserIsPremium = dto.restrictUserIsPremium,
                    userIsPremium = dto.userIsPremium,
                    maxQuantity = dto.maxQuantity,
                    requestName = dto.requestName,
                    requestUsername = dto.requestUsername,
                    requestPhoto = dto.requestPhoto,
                )
            }
            is TdApi.KeyboardButtonTypeRequestChat -> {
                return KeyboardButtonTypeDto.RequestChat(
                    id = dto.id,
                    chatIsChannel = dto.chatIsChannel,
                    restrictChatIsForum = dto.restrictChatIsForum,
                    chatIsForum = dto.chatIsForum,
                    restrictChatHasUsername = dto.restrictChatHasUsername,
                    chatHasUsername = dto.chatHasUsername,
                    chatIsCreated = dto.chatIsCreated,
                    userAdministratorRights = dto.userAdministratorRights?.let { map(it) },
                    botAdministratorRights = dto.botAdministratorRights?.let { map(it) },
                    botIsMember = dto.botIsMember,
                    requestTitle = dto.requestTitle,
                    requestUsername = dto.requestUsername,
                    requestPhoto = dto.requestPhoto,
                )
            }
            is TdApi.KeyboardButtonTypeWebApp -> {
                return KeyboardButtonTypeDto.WebApp(
                    url = dto.url,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: KeyboardButtonTypeDto): TdApi.KeyboardButtonType {
        when(dto) {
            is KeyboardButtonTypeDto.Text -> {
                return TdApi.KeyboardButtonTypeText(
                )
            }
            is KeyboardButtonTypeDto.RequestPhoneNumber -> {
                return TdApi.KeyboardButtonTypeRequestPhoneNumber(
                )
            }
            is KeyboardButtonTypeDto.RequestLocation -> {
                return TdApi.KeyboardButtonTypeRequestLocation(
                )
            }
            is KeyboardButtonTypeDto.RequestPoll -> {
                return TdApi.KeyboardButtonTypeRequestPoll(
                    forceRegular = dto.forceRegular,
                    forceQuiz = dto.forceQuiz,
                )
            }
            is KeyboardButtonTypeDto.RequestUsers -> {
                return TdApi.KeyboardButtonTypeRequestUsers(
                    id = dto.id,
                    restrictUserIsBot = dto.restrictUserIsBot,
                    userIsBot = dto.userIsBot,
                    restrictUserIsPremium = dto.restrictUserIsPremium,
                    userIsPremium = dto.userIsPremium,
                    maxQuantity = dto.maxQuantity,
                    requestName = dto.requestName,
                    requestUsername = dto.requestUsername,
                    requestPhoto = dto.requestPhoto,
                )
            }
            is KeyboardButtonTypeDto.RequestChat -> {
                return TdApi.KeyboardButtonTypeRequestChat(
                    id = dto.id,
                    chatIsChannel = dto.chatIsChannel,
                    restrictChatIsForum = dto.restrictChatIsForum,
                    chatIsForum = dto.chatIsForum,
                    restrictChatHasUsername = dto.restrictChatHasUsername,
                    chatHasUsername = dto.chatHasUsername,
                    chatIsCreated = dto.chatIsCreated,
                    userAdministratorRights = dto.userAdministratorRights?.let { map(it) },
                    botAdministratorRights = dto.botAdministratorRights?.let { map(it) },
                    botIsMember = dto.botIsMember,
                    requestTitle = dto.requestTitle,
                    requestUsername = dto.requestUsername,
                    requestPhoto = dto.requestPhoto,
                )
            }
            is KeyboardButtonTypeDto.WebApp -> {
                return TdApi.KeyboardButtonTypeWebApp(
                    url = dto.url,
                )
            }
        }
    }

    fun map(dto: TdApi.LanguagePackStringValue): LanguagePackStringValueDto {
        when(dto) {
            is TdApi.LanguagePackStringValueOrdinary -> {
                return LanguagePackStringValueDto.Ordinary(
                    value = dto.value,
                )
            }
            is TdApi.LanguagePackStringValuePluralized -> {
                return LanguagePackStringValueDto.Pluralized(
                    zeroValue = dto.zeroValue,
                    oneValue = dto.oneValue,
                    twoValue = dto.twoValue,
                    fewValue = dto.fewValue,
                    manyValue = dto.manyValue,
                    otherValue = dto.otherValue,
                )
            }
            is TdApi.LanguagePackStringValueDeleted -> {
                return LanguagePackStringValueDto.Deleted(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: LanguagePackStringValueDto): TdApi.LanguagePackStringValue {
        when(dto) {
            is LanguagePackStringValueDto.Ordinary -> {
                return TdApi.LanguagePackStringValueOrdinary(
                    value = dto.value,
                )
            }
            is LanguagePackStringValueDto.Pluralized -> {
                return TdApi.LanguagePackStringValuePluralized(
                    zeroValue = dto.zeroValue,
                    oneValue = dto.oneValue,
                    twoValue = dto.twoValue,
                    fewValue = dto.fewValue,
                    manyValue = dto.manyValue,
                    otherValue = dto.otherValue,
                )
            }
            is LanguagePackStringValueDto.Deleted -> {
                return TdApi.LanguagePackStringValueDeleted(
                )
            }
        }
    }

    fun map(dto: TdApi.LinkPreviewAlbumMedia): LinkPreviewAlbumMediaDto {
        when(dto) {
            is TdApi.LinkPreviewAlbumMediaPhoto -> {
                return LinkPreviewAlbumMediaDto.Photo(
                    photo = map(dto.photo),
                )
            }
            is TdApi.LinkPreviewAlbumMediaVideo -> {
                return LinkPreviewAlbumMediaDto.Video(
                    video = map(dto.video),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: LinkPreviewAlbumMediaDto): TdApi.LinkPreviewAlbumMedia {
        when(dto) {
            is LinkPreviewAlbumMediaDto.Photo -> {
                return TdApi.LinkPreviewAlbumMediaPhoto(
                    photo = map(dto.photo),
                )
            }
            is LinkPreviewAlbumMediaDto.Video -> {
                return TdApi.LinkPreviewAlbumMediaVideo(
                    video = map(dto.video),
                )
            }
        }
    }

    fun map(dto: TdApi.LinkPreviewType): LinkPreviewTypeDto {
        when(dto) {
            is TdApi.LinkPreviewTypeAlbum -> {
                return LinkPreviewTypeDto.Album(
                    media = dto.media.mapArray { map(it) },
                    caption = dto.caption,
                )
            }
            is TdApi.LinkPreviewTypeAnimation -> {
                return LinkPreviewTypeDto.Animation(
                    animation = map(dto.animation),
                )
            }
            is TdApi.LinkPreviewTypeApp -> {
                return LinkPreviewTypeDto.App(
                    photo = map(dto.photo),
                )
            }
            is TdApi.LinkPreviewTypeArticle -> {
                return LinkPreviewTypeDto.Article(
                    photo = dto.photo?.let { map(it) },
                )
            }
            is TdApi.LinkPreviewTypeAudio -> {
                return LinkPreviewTypeDto.Audio(
                    audio = map(dto.audio),
                )
            }
            is TdApi.LinkPreviewTypeBackground -> {
                return LinkPreviewTypeDto.Background(
                    document = dto.document?.let { map(it) },
                    backgroundType = dto.backgroundType?.let { map(it) },
                )
            }
            is TdApi.LinkPreviewTypeChannelBoost -> {
                return LinkPreviewTypeDto.ChannelBoost(
                    photo = dto.photo?.let { map(it) },
                )
            }
            is TdApi.LinkPreviewTypeChat -> {
                return LinkPreviewTypeDto.Chat(
                    type = map(dto.type),
                    photo = dto.photo?.let { map(it) },
                    createsJoinRequest = dto.createsJoinRequest,
                )
            }
            is TdApi.LinkPreviewTypeDocument -> {
                return LinkPreviewTypeDto.Document(
                    document = map(dto.document),
                )
            }
            is TdApi.LinkPreviewTypeEmbeddedAnimationPlayer -> {
                return LinkPreviewTypeDto.EmbeddedAnimationPlayer(
                    url = dto.url,
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                )
            }
            is TdApi.LinkPreviewTypeEmbeddedAudioPlayer -> {
                return LinkPreviewTypeDto.EmbeddedAudioPlayer(
                    url = dto.url,
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                )
            }
            is TdApi.LinkPreviewTypeEmbeddedVideoPlayer -> {
                return LinkPreviewTypeDto.EmbeddedVideoPlayer(
                    url = dto.url,
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                )
            }
            is TdApi.LinkPreviewTypeExternalAudio -> {
                return LinkPreviewTypeDto.ExternalAudio(
                    url = dto.url,
                    mimeType = dto.mimeType,
                    duration = dto.duration,
                )
            }
            is TdApi.LinkPreviewTypeExternalVideo -> {
                return LinkPreviewTypeDto.ExternalVideo(
                    url = dto.url,
                    mimeType = dto.mimeType,
                    width = dto.width,
                    height = dto.height,
                    duration = dto.duration,
                )
            }
            is TdApi.LinkPreviewTypeGroupCall -> {
                return LinkPreviewTypeDto.GroupCall(
                )
            }
            is TdApi.LinkPreviewTypeInvoice -> {
                return LinkPreviewTypeDto.Invoice(
                )
            }
            is TdApi.LinkPreviewTypeMessage -> {
                return LinkPreviewTypeDto.Message(
                )
            }
            is TdApi.LinkPreviewTypePhoto -> {
                return LinkPreviewTypeDto.Photo(
                    photo = map(dto.photo),
                )
            }
            is TdApi.LinkPreviewTypePremiumGiftCode -> {
                return LinkPreviewTypeDto.PremiumGiftCode(
                )
            }
            is TdApi.LinkPreviewTypeShareableChatFolder -> {
                return LinkPreviewTypeDto.ShareableChatFolder(
                )
            }
            is TdApi.LinkPreviewTypeSticker -> {
                return LinkPreviewTypeDto.Sticker(
                    sticker = map(dto.sticker),
                )
            }
            is TdApi.LinkPreviewTypeStickerSet -> {
                return LinkPreviewTypeDto.StickerSet(
                    stickers = dto.stickers.mapArray { map(it) },
                )
            }
            is TdApi.LinkPreviewTypeStory -> {
                return LinkPreviewTypeDto.Story(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
            is TdApi.LinkPreviewTypeSupergroupBoost -> {
                return LinkPreviewTypeDto.SupergroupBoost(
                    photo = dto.photo?.let { map(it) },
                )
            }
            is TdApi.LinkPreviewTypeTheme -> {
                return LinkPreviewTypeDto.Theme(
                    documents = dto.documents.mapArray { map(it) },
                    settings = dto.settings?.let { map(it) },
                )
            }
            is TdApi.LinkPreviewTypeUnsupported -> {
                return LinkPreviewTypeDto.Unsupported(
                )
            }
            is TdApi.LinkPreviewTypeUpgradedGift -> {
                return LinkPreviewTypeDto.UpgradedGift(
                    gift = map(dto.gift),
                )
            }
            is TdApi.LinkPreviewTypeUser -> {
                return LinkPreviewTypeDto.User(
                    photo = dto.photo?.let { map(it) },
                    isBot = dto.isBot,
                )
            }
            is TdApi.LinkPreviewTypeVideo -> {
                return LinkPreviewTypeDto.Video(
                    video = map(dto.video),
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                )
            }
            is TdApi.LinkPreviewTypeVideoChat -> {
                return LinkPreviewTypeDto.VideoChat(
                    photo = dto.photo?.let { map(it) },
                    isLiveStream = dto.isLiveStream,
                )
            }
            is TdApi.LinkPreviewTypeVideoNote -> {
                return LinkPreviewTypeDto.VideoNote(
                    videoNote = map(dto.videoNote),
                )
            }
            is TdApi.LinkPreviewTypeVoiceNote -> {
                return LinkPreviewTypeDto.VoiceNote(
                    voiceNote = map(dto.voiceNote),
                )
            }
            is TdApi.LinkPreviewTypeWebApp -> {
                return LinkPreviewTypeDto.WebApp(
                    photo = dto.photo?.let { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: LinkPreviewTypeDto): TdApi.LinkPreviewType {
        when(dto) {
            is LinkPreviewTypeDto.Album -> {
                return TdApi.LinkPreviewTypeAlbum(
                    media = dto.media.mapArray { map(it) },
                    caption = dto.caption,
                )
            }
            is LinkPreviewTypeDto.Animation -> {
                return TdApi.LinkPreviewTypeAnimation(
                    animation = map(dto.animation),
                )
            }
            is LinkPreviewTypeDto.App -> {
                return TdApi.LinkPreviewTypeApp(
                    photo = map(dto.photo),
                )
            }
            is LinkPreviewTypeDto.Article -> {
                return TdApi.LinkPreviewTypeArticle(
                    photo = dto.photo?.let { map(it) },
                )
            }
            is LinkPreviewTypeDto.Audio -> {
                return TdApi.LinkPreviewTypeAudio(
                    audio = map(dto.audio),
                )
            }
            is LinkPreviewTypeDto.Background -> {
                return TdApi.LinkPreviewTypeBackground(
                    document = dto.document?.let { map(it) },
                    backgroundType = dto.backgroundType?.let { map(it) },
                )
            }
            is LinkPreviewTypeDto.ChannelBoost -> {
                return TdApi.LinkPreviewTypeChannelBoost(
                    photo = dto.photo?.let { map(it) },
                )
            }
            is LinkPreviewTypeDto.Chat -> {
                return TdApi.LinkPreviewTypeChat(
                    type = map(dto.type),
                    photo = dto.photo?.let { map(it) },
                    createsJoinRequest = dto.createsJoinRequest,
                )
            }
            is LinkPreviewTypeDto.Document -> {
                return TdApi.LinkPreviewTypeDocument(
                    document = map(dto.document),
                )
            }
            is LinkPreviewTypeDto.EmbeddedAnimationPlayer -> {
                return TdApi.LinkPreviewTypeEmbeddedAnimationPlayer(
                    url = dto.url,
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                )
            }
            is LinkPreviewTypeDto.EmbeddedAudioPlayer -> {
                return TdApi.LinkPreviewTypeEmbeddedAudioPlayer(
                    url = dto.url,
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                )
            }
            is LinkPreviewTypeDto.EmbeddedVideoPlayer -> {
                return TdApi.LinkPreviewTypeEmbeddedVideoPlayer(
                    url = dto.url,
                    thumbnail = dto.thumbnail?.let { map(it) },
                    duration = dto.duration,
                    width = dto.width,
                    height = dto.height,
                )
            }
            is LinkPreviewTypeDto.ExternalAudio -> {
                return TdApi.LinkPreviewTypeExternalAudio(
                    url = dto.url,
                    mimeType = dto.mimeType,
                    duration = dto.duration,
                )
            }
            is LinkPreviewTypeDto.ExternalVideo -> {
                return TdApi.LinkPreviewTypeExternalVideo(
                    url = dto.url,
                    mimeType = dto.mimeType,
                    width = dto.width,
                    height = dto.height,
                    duration = dto.duration,
                )
            }
            is LinkPreviewTypeDto.GroupCall -> {
                return TdApi.LinkPreviewTypeGroupCall(
                )
            }
            is LinkPreviewTypeDto.Invoice -> {
                return TdApi.LinkPreviewTypeInvoice(
                )
            }
            is LinkPreviewTypeDto.Message -> {
                return TdApi.LinkPreviewTypeMessage(
                )
            }
            is LinkPreviewTypeDto.Photo -> {
                return TdApi.LinkPreviewTypePhoto(
                    photo = map(dto.photo),
                )
            }
            is LinkPreviewTypeDto.PremiumGiftCode -> {
                return TdApi.LinkPreviewTypePremiumGiftCode(
                )
            }
            is LinkPreviewTypeDto.ShareableChatFolder -> {
                return TdApi.LinkPreviewTypeShareableChatFolder(
                )
            }
            is LinkPreviewTypeDto.Sticker -> {
                return TdApi.LinkPreviewTypeSticker(
                    sticker = map(dto.sticker),
                )
            }
            is LinkPreviewTypeDto.StickerSet -> {
                return TdApi.LinkPreviewTypeStickerSet(
                    stickers = dto.stickers.mapArray { map(it) },
                )
            }
            is LinkPreviewTypeDto.Story -> {
                return TdApi.LinkPreviewTypeStory(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
            is LinkPreviewTypeDto.SupergroupBoost -> {
                return TdApi.LinkPreviewTypeSupergroupBoost(
                    photo = dto.photo?.let { map(it) },
                )
            }
            is LinkPreviewTypeDto.Theme -> {
                return TdApi.LinkPreviewTypeTheme(
                    documents = dto.documents.mapArray { map(it) },
                    settings = dto.settings?.let { map(it) },
                )
            }
            is LinkPreviewTypeDto.Unsupported -> {
                return TdApi.LinkPreviewTypeUnsupported(
                )
            }
            is LinkPreviewTypeDto.UpgradedGift -> {
                return TdApi.LinkPreviewTypeUpgradedGift(
                    gift = map(dto.gift),
                )
            }
            is LinkPreviewTypeDto.User -> {
                return TdApi.LinkPreviewTypeUser(
                    photo = dto.photo?.let { map(it) },
                    isBot = dto.isBot,
                )
            }
            is LinkPreviewTypeDto.Video -> {
                return TdApi.LinkPreviewTypeVideo(
                    video = map(dto.video),
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                )
            }
            is LinkPreviewTypeDto.VideoChat -> {
                return TdApi.LinkPreviewTypeVideoChat(
                    photo = dto.photo?.let { map(it) },
                    isLiveStream = dto.isLiveStream,
                )
            }
            is LinkPreviewTypeDto.VideoNote -> {
                return TdApi.LinkPreviewTypeVideoNote(
                    videoNote = map(dto.videoNote),
                )
            }
            is LinkPreviewTypeDto.VoiceNote -> {
                return TdApi.LinkPreviewTypeVoiceNote(
                    voiceNote = map(dto.voiceNote),
                )
            }
            is LinkPreviewTypeDto.WebApp -> {
                return TdApi.LinkPreviewTypeWebApp(
                    photo = dto.photo?.let { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.LogStream): LogStreamDto {
        when(dto) {
            is TdApi.LogStreamDefault -> {
                return LogStreamDto.Default(
                )
            }
            is TdApi.LogStreamFile -> {
                return LogStreamDto.File(
                    path = dto.path,
                    maxFileSize = dto.maxFileSize,
                    redirectStderr = dto.redirectStderr,
                )
            }
            is TdApi.LogStreamEmpty -> {
                return LogStreamDto.Empty(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: LogStreamDto): TdApi.LogStream {
        when(dto) {
            is LogStreamDto.Default -> {
                return TdApi.LogStreamDefault(
                )
            }
            is LogStreamDto.File -> {
                return TdApi.LogStreamFile(
                    path = dto.path,
                    maxFileSize = dto.maxFileSize,
                    redirectStderr = dto.redirectStderr,
                )
            }
            is LogStreamDto.Empty -> {
                return TdApi.LogStreamEmpty(
                )
            }
        }
    }

    fun map(dto: TdApi.LoginUrlInfo): LoginUrlInfoDto {
        when(dto) {
            is TdApi.LoginUrlInfoOpen -> {
                return LoginUrlInfoDto.Open(
                    url = dto.url,
                    skipConfirmation = dto.skipConfirmation,
                )
            }
            is TdApi.LoginUrlInfoRequestConfirmation -> {
                return LoginUrlInfoDto.RequestConfirmation(
                    url = dto.url,
                    domain = dto.domain,
                    botUserId = dto.botUserId,
                    requestWriteAccess = dto.requestWriteAccess,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: LoginUrlInfoDto): TdApi.LoginUrlInfo {
        when(dto) {
            is LoginUrlInfoDto.Open -> {
                return TdApi.LoginUrlInfoOpen(
                    url = dto.url,
                    skipConfirmation = dto.skipConfirmation,
                )
            }
            is LoginUrlInfoDto.RequestConfirmation -> {
                return TdApi.LoginUrlInfoRequestConfirmation(
                    url = dto.url,
                    domain = dto.domain,
                    botUserId = dto.botUserId,
                    requestWriteAccess = dto.requestWriteAccess,
                )
            }
        }
    }

    fun map(dto: TdApi.MaskPoint): MaskPointDto {
        when(dto) {
            is TdApi.MaskPointForehead -> {
                return MaskPointDto.Forehead(
                )
            }
            is TdApi.MaskPointEyes -> {
                return MaskPointDto.Eyes(
                )
            }
            is TdApi.MaskPointMouth -> {
                return MaskPointDto.Mouth(
                )
            }
            is TdApi.MaskPointChin -> {
                return MaskPointDto.Chin(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MaskPointDto): TdApi.MaskPoint {
        when(dto) {
            is MaskPointDto.Forehead -> {
                return TdApi.MaskPointForehead(
                )
            }
            is MaskPointDto.Eyes -> {
                return TdApi.MaskPointEyes(
                )
            }
            is MaskPointDto.Mouth -> {
                return TdApi.MaskPointMouth(
                )
            }
            is MaskPointDto.Chin -> {
                return TdApi.MaskPointChin(
                )
            }
        }
    }

    fun map(dto: TdApi.MessageContent): MessageContentDto {
        when(dto) {
            is TdApi.MessageText -> {
                return MessageContentDto.Text(
                    text = map(dto.text),
                    linkPreview = dto.linkPreview?.let { map(it) },
                    linkPreviewOptions = dto.linkPreviewOptions?.let { map(it) },
                )
            }
            is TdApi.MessageAnimation -> {
                return MessageContentDto.Animation(
                    animation = map(dto.animation),
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                    isSecret = dto.isSecret,
                )
            }
            is TdApi.MessageAudio -> {
                return MessageContentDto.Audio(
                    audio = map(dto.audio),
                    caption = map(dto.caption),
                )
            }
            is TdApi.MessageDocument -> {
                return MessageContentDto.Document(
                    document = map(dto.document),
                    caption = map(dto.caption),
                )
            }
            is TdApi.MessagePaidMedia -> {
                return MessageContentDto.PaidMedia(
                    starCount = dto.starCount,
                    media = dto.media.mapArray { map(it) },
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                )
            }
            is TdApi.MessagePhoto -> {
                return MessageContentDto.Photo(
                    photo = map(dto.photo),
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                    isSecret = dto.isSecret,
                )
            }
            is TdApi.MessageSticker -> {
                return MessageContentDto.Sticker(
                    sticker = map(dto.sticker),
                    isPremium = dto.isPremium,
                )
            }
            is TdApi.MessageVideo -> {
                return MessageContentDto.Video(
                    video = map(dto.video),
                    alternativeVideos = dto.alternativeVideos.mapArray { map(it) },
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                    isSecret = dto.isSecret,
                )
            }
            is TdApi.MessageVideoNote -> {
                return MessageContentDto.VideoNote(
                    videoNote = map(dto.videoNote),
                    isViewed = dto.isViewed,
                    isSecret = dto.isSecret,
                )
            }
            is TdApi.MessageVoiceNote -> {
                return MessageContentDto.VoiceNote(
                    voiceNote = map(dto.voiceNote),
                    caption = map(dto.caption),
                    isListened = dto.isListened,
                )
            }
            is TdApi.MessageExpiredPhoto -> {
                return MessageContentDto.ExpiredPhoto(
                )
            }
            is TdApi.MessageExpiredVideo -> {
                return MessageContentDto.ExpiredVideo(
                )
            }
            is TdApi.MessageExpiredVideoNote -> {
                return MessageContentDto.ExpiredVideoNote(
                )
            }
            is TdApi.MessageExpiredVoiceNote -> {
                return MessageContentDto.ExpiredVoiceNote(
                )
            }
            is TdApi.MessageLocation -> {
                return MessageContentDto.Location(
                    location = map(dto.location),
                    livePeriod = dto.livePeriod,
                    expiresIn = dto.expiresIn,
                    heading = dto.heading,
                    proximityAlertRadius = dto.proximityAlertRadius,
                )
            }
            is TdApi.MessageVenue -> {
                return MessageContentDto.Venue(
                    venue = map(dto.venue),
                )
            }
            is TdApi.MessageContact -> {
                return MessageContentDto.Contact(
                    contact = map(dto.contact),
                )
            }
            is TdApi.MessageAnimatedEmoji -> {
                return MessageContentDto.AnimatedEmoji(
                    animatedEmoji = map(dto.animatedEmoji),
                    emoji = dto.emoji,
                )
            }
            is TdApi.MessageDice -> {
                return MessageContentDto.Dice(
                    initialState = dto.initialState?.let { map(it) },
                    finalState = dto.finalState?.let { map(it) },
                    emoji = dto.emoji,
                    value = dto.value,
                    successAnimationFrameNumber = dto.successAnimationFrameNumber,
                )
            }
            is TdApi.MessageGame -> {
                return MessageContentDto.Game(
                    game = map(dto.game),
                )
            }
            is TdApi.MessagePoll -> {
                return MessageContentDto.Poll(
                    poll = map(dto.poll),
                )
            }
            is TdApi.MessageStory -> {
                return MessageContentDto.Story(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                    viaMention = dto.viaMention,
                )
            }
            is TdApi.MessageInvoice -> {
                return MessageContentDto.Invoice(
                    productInfo = map(dto.productInfo),
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    startParameter = dto.startParameter,
                    isTest = dto.isTest,
                    needShippingAddress = dto.needShippingAddress,
                    receiptMessageId = dto.receiptMessageId,
                    paidMedia = dto.paidMedia?.let { map(it) },
                    paidMediaCaption = dto.paidMediaCaption?.let { map(it) },
                )
            }
            is TdApi.MessageCall -> {
                return MessageContentDto.Call(
                    isVideo = dto.isVideo,
                    discardReason = map(dto.discardReason),
                    duration = dto.duration,
                )
            }
            is TdApi.MessageGroupCall -> {
                return MessageContentDto.GroupCall(
                    isActive = dto.isActive,
                    wasMissed = dto.wasMissed,
                    isVideo = dto.isVideo,
                    duration = dto.duration,
                    otherParticipantIds = dto.otherParticipantIds.mapArray { map(it) },
                )
            }
            is TdApi.MessageVideoChatScheduled -> {
                return MessageContentDto.VideoChatScheduled(
                    groupCallId = dto.groupCallId,
                    startDate = dto.startDate,
                )
            }
            is TdApi.MessageVideoChatStarted -> {
                return MessageContentDto.VideoChatStarted(
                    groupCallId = dto.groupCallId,
                )
            }
            is TdApi.MessageVideoChatEnded -> {
                return MessageContentDto.VideoChatEnded(
                    duration = dto.duration,
                )
            }
            is TdApi.MessageInviteVideoChatParticipants -> {
                return MessageContentDto.InviteVideoChatParticipants(
                    groupCallId = dto.groupCallId,
                    userIds = dto.userIds,
                )
            }
            is TdApi.MessageBasicGroupChatCreate -> {
                return MessageContentDto.BasicGroupChatCreate(
                    title = dto.title,
                    memberUserIds = dto.memberUserIds,
                )
            }
            is TdApi.MessageSupergroupChatCreate -> {
                return MessageContentDto.SupergroupChatCreate(
                    title = dto.title,
                )
            }
            is TdApi.MessageChatChangeTitle -> {
                return MessageContentDto.ChatChangeTitle(
                    title = dto.title,
                )
            }
            is TdApi.MessageChatChangePhoto -> {
                return MessageContentDto.ChatChangePhoto(
                    photo = map(dto.photo),
                )
            }
            is TdApi.MessageChatDeletePhoto -> {
                return MessageContentDto.ChatDeletePhoto(
                )
            }
            is TdApi.MessageChatAddMembers -> {
                return MessageContentDto.ChatAddMembers(
                    memberUserIds = dto.memberUserIds,
                )
            }
            is TdApi.MessageChatJoinByLink -> {
                return MessageContentDto.ChatJoinByLink(
                )
            }
            is TdApi.MessageChatJoinByRequest -> {
                return MessageContentDto.ChatJoinByRequest(
                )
            }
            is TdApi.MessageChatDeleteMember -> {
                return MessageContentDto.ChatDeleteMember(
                    userId = dto.userId,
                )
            }
            is TdApi.MessageChatUpgradeTo -> {
                return MessageContentDto.ChatUpgradeTo(
                    supergroupId = dto.supergroupId,
                )
            }
            is TdApi.MessageChatUpgradeFrom -> {
                return MessageContentDto.ChatUpgradeFrom(
                    title = dto.title,
                    basicGroupId = dto.basicGroupId,
                )
            }
            is TdApi.MessagePinMessage -> {
                return MessageContentDto.PinMessage(
                    messageId = dto.messageId,
                )
            }
            is TdApi.MessageScreenshotTaken -> {
                return MessageContentDto.ScreenshotTaken(
                )
            }
            is TdApi.MessageChatSetBackground -> {
                return MessageContentDto.ChatSetBackground(
                    oldBackgroundMessageId = dto.oldBackgroundMessageId,
                    background = map(dto.background),
                    onlyForSelf = dto.onlyForSelf,
                )
            }
            is TdApi.MessageChatSetTheme -> {
                return MessageContentDto.ChatSetTheme(
                    themeName = dto.themeName,
                )
            }
            is TdApi.MessageChatSetMessageAutoDeleteTime -> {
                return MessageContentDto.ChatSetMessageAutoDeleteTime(
                    messageAutoDeleteTime = dto.messageAutoDeleteTime,
                    fromUserId = dto.fromUserId,
                )
            }
            is TdApi.MessageChatBoost -> {
                return MessageContentDto.ChatBoost(
                    boostCount = dto.boostCount,
                )
            }
            is TdApi.MessageForumTopicCreated -> {
                return MessageContentDto.ForumTopicCreated(
                    name = dto.name,
                    icon = map(dto.icon),
                )
            }
            is TdApi.MessageForumTopicEdited -> {
                return MessageContentDto.ForumTopicEdited(
                    name = dto.name,
                    editIconCustomEmojiId = dto.editIconCustomEmojiId,
                    iconCustomEmojiId = dto.iconCustomEmojiId,
                )
            }
            is TdApi.MessageForumTopicIsClosedToggled -> {
                return MessageContentDto.ForumTopicIsClosedToggled(
                    isClosed = dto.isClosed,
                )
            }
            is TdApi.MessageForumTopicIsHiddenToggled -> {
                return MessageContentDto.ForumTopicIsHiddenToggled(
                    isHidden = dto.isHidden,
                )
            }
            is TdApi.MessageSuggestProfilePhoto -> {
                return MessageContentDto.SuggestProfilePhoto(
                    photo = map(dto.photo),
                )
            }
            is TdApi.MessageCustomServiceAction -> {
                return MessageContentDto.CustomServiceAction(
                    text = dto.text,
                )
            }
            is TdApi.MessageGameScore -> {
                return MessageContentDto.GameScore(
                    gameMessageId = dto.gameMessageId,
                    gameId = dto.gameId,
                    score = dto.score,
                )
            }
            is TdApi.MessagePaymentSuccessful -> {
                return MessageContentDto.PaymentSuccessful(
                    invoiceChatId = dto.invoiceChatId,
                    invoiceMessageId = dto.invoiceMessageId,
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    subscriptionUntilDate = dto.subscriptionUntilDate,
                    isRecurring = dto.isRecurring,
                    isFirstRecurring = dto.isFirstRecurring,
                    invoiceName = dto.invoiceName,
                )
            }
            is TdApi.MessagePaymentSuccessfulBot -> {
                return MessageContentDto.PaymentSuccessfulBot(
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    subscriptionUntilDate = dto.subscriptionUntilDate,
                    isRecurring = dto.isRecurring,
                    isFirstRecurring = dto.isFirstRecurring,
                    invoicePayload = dto.invoicePayload,
                    shippingOptionId = dto.shippingOptionId,
                    orderInfo = dto.orderInfo?.let { map(it) },
                    telegramPaymentChargeId = dto.telegramPaymentChargeId,
                    providerPaymentChargeId = dto.providerPaymentChargeId,
                )
            }
            is TdApi.MessagePaymentRefunded -> {
                return MessageContentDto.PaymentRefunded(
                    ownerId = map(dto.ownerId),
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    invoicePayload = dto.invoicePayload,
                    telegramPaymentChargeId = dto.telegramPaymentChargeId,
                    providerPaymentChargeId = dto.providerPaymentChargeId,
                )
            }
            is TdApi.MessageGiftedPremium -> {
                return MessageContentDto.GiftedPremium(
                    gifterUserId = dto.gifterUserId,
                    receiverUserId = dto.receiverUserId,
                    text = map(dto.text),
                    currency = dto.currency,
                    amount = dto.amount,
                    cryptocurrency = dto.cryptocurrency,
                    cryptocurrencyAmount = dto.cryptocurrencyAmount,
                    monthCount = dto.monthCount,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is TdApi.MessagePremiumGiftCode -> {
                return MessageContentDto.PremiumGiftCode(
                    creatorId = dto.creatorId?.let { map(it) },
                    text = map(dto.text),
                    isFromGiveaway = dto.isFromGiveaway,
                    isUnclaimed = dto.isUnclaimed,
                    currency = dto.currency,
                    amount = dto.amount,
                    cryptocurrency = dto.cryptocurrency,
                    cryptocurrencyAmount = dto.cryptocurrencyAmount,
                    monthCount = dto.monthCount,
                    sticker = dto.sticker?.let { map(it) },
                    code = dto.code,
                )
            }
            is TdApi.MessageGiveawayCreated -> {
                return MessageContentDto.GiveawayCreated(
                    starCount = dto.starCount,
                )
            }
            is TdApi.MessageGiveaway -> {
                return MessageContentDto.Giveaway(
                    parameters = map(dto.parameters),
                    winnerCount = dto.winnerCount,
                    prize = map(dto.prize),
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is TdApi.MessageGiveawayCompleted -> {
                return MessageContentDto.GiveawayCompleted(
                    giveawayMessageId = dto.giveawayMessageId,
                    winnerCount = dto.winnerCount,
                    isStarGiveaway = dto.isStarGiveaway,
                    unclaimedPrizeCount = dto.unclaimedPrizeCount,
                )
            }
            is TdApi.MessageGiveawayWinners -> {
                return MessageContentDto.GiveawayWinners(
                    boostedChatId = dto.boostedChatId,
                    giveawayMessageId = dto.giveawayMessageId,
                    additionalChatCount = dto.additionalChatCount,
                    actualWinnersSelectionDate = dto.actualWinnersSelectionDate,
                    onlyNewMembers = dto.onlyNewMembers,
                    wasRefunded = dto.wasRefunded,
                    prize = map(dto.prize),
                    prizeDescription = dto.prizeDescription,
                    winnerCount = dto.winnerCount,
                    winnerUserIds = dto.winnerUserIds,
                    unclaimedPrizeCount = dto.unclaimedPrizeCount,
                )
            }
            is TdApi.MessageGiftedStars -> {
                return MessageContentDto.GiftedStars(
                    gifterUserId = dto.gifterUserId,
                    receiverUserId = dto.receiverUserId,
                    currency = dto.currency,
                    amount = dto.amount,
                    cryptocurrency = dto.cryptocurrency,
                    cryptocurrencyAmount = dto.cryptocurrencyAmount,
                    starCount = dto.starCount,
                    transactionId = dto.transactionId,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is TdApi.MessageGiveawayPrizeStars -> {
                return MessageContentDto.GiveawayPrizeStars(
                    starCount = dto.starCount,
                    transactionId = dto.transactionId,
                    boostedChatId = dto.boostedChatId,
                    giveawayMessageId = dto.giveawayMessageId,
                    isUnclaimed = dto.isUnclaimed,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is TdApi.MessageGift -> {
                return MessageContentDto.Gift(
                    gift = map(dto.gift),
                    senderId = map(dto.senderId),
                    receivedGiftId = dto.receivedGiftId,
                    text = map(dto.text),
                    sellStarCount = dto.sellStarCount,
                    prepaidUpgradeStarCount = dto.prepaidUpgradeStarCount,
                    isPrivate = dto.isPrivate,
                    isSaved = dto.isSaved,
                    canBeUpgraded = dto.canBeUpgraded,
                    wasConverted = dto.wasConverted,
                    wasUpgraded = dto.wasUpgraded,
                    wasRefunded = dto.wasRefunded,
                    upgradedReceivedGiftId = dto.upgradedReceivedGiftId,
                )
            }
            is TdApi.MessageUpgradedGift -> {
                return MessageContentDto.UpgradedGift(
                    gift = map(dto.gift),
                    senderId = dto.senderId?.let { map(it) },
                    receivedGiftId = dto.receivedGiftId,
                    isUpgrade = dto.isUpgrade,
                    isSaved = dto.isSaved,
                    canBeTransferred = dto.canBeTransferred,
                    wasTransferred = dto.wasTransferred,
                    transferStarCount = dto.transferStarCount,
                    exportDate = dto.exportDate,
                )
            }
            is TdApi.MessageRefundedUpgradedGift -> {
                return MessageContentDto.RefundedUpgradedGift(
                    gift = map(dto.gift),
                    senderId = map(dto.senderId),
                    isUpgrade = dto.isUpgrade,
                )
            }
            is TdApi.MessagePaidMessagesRefunded -> {
                return MessageContentDto.PaidMessagesRefunded(
                    messageCount = dto.messageCount,
                    starCount = dto.starCount,
                )
            }
            is TdApi.MessagePaidMessagePriceChanged -> {
                return MessageContentDto.PaidMessagePriceChanged(
                    paidMessageStarCount = dto.paidMessageStarCount,
                )
            }
            is TdApi.MessageContactRegistered -> {
                return MessageContentDto.ContactRegistered(
                )
            }
            is TdApi.MessageUsersShared -> {
                return MessageContentDto.UsersShared(
                    users = dto.users.mapArray { map(it) },
                    buttonId = dto.buttonId,
                )
            }
            is TdApi.MessageChatShared -> {
                return MessageContentDto.ChatShared(
                    chat = map(dto.chat),
                    buttonId = dto.buttonId,
                )
            }
            is TdApi.MessageBotWriteAccessAllowed -> {
                return MessageContentDto.BotWriteAccessAllowed(
                    reason = map(dto.reason),
                )
            }
            is TdApi.MessageWebAppDataSent -> {
                return MessageContentDto.WebAppDataSent(
                    buttonText = dto.buttonText,
                )
            }
            is TdApi.MessageWebAppDataReceived -> {
                return MessageContentDto.WebAppDataReceived(
                    buttonText = dto.buttonText,
                    data = dto.data,
                )
            }
            is TdApi.MessagePassportDataSent -> {
                return MessageContentDto.PassportDataSent(
                    types = dto.types.mapArray { map(it) },
                )
            }
            is TdApi.MessagePassportDataReceived -> {
                return MessageContentDto.PassportDataReceived(
                    elements = dto.elements.mapArray { map(it) },
                    credentials = map(dto.credentials),
                )
            }
            is TdApi.MessageProximityAlertTriggered -> {
                return MessageContentDto.ProximityAlertTriggered(
                    travelerId = map(dto.travelerId),
                    watcherId = map(dto.watcherId),
                    distance = dto.distance,
                )
            }
            is TdApi.MessageUnsupported -> {
                return MessageContentDto.Unsupported(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageContentDto): TdApi.MessageContent {
        when(dto) {
            is MessageContentDto.Text -> {
                return TdApi.MessageText(
                    text = map(dto.text),
                    linkPreview = dto.linkPreview?.let { map(it) },
                    linkPreviewOptions = dto.linkPreviewOptions?.let { map(it) },
                )
            }
            is MessageContentDto.Animation -> {
                return TdApi.MessageAnimation(
                    animation = map(dto.animation),
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                    isSecret = dto.isSecret,
                )
            }
            is MessageContentDto.Audio -> {
                return TdApi.MessageAudio(
                    audio = map(dto.audio),
                    caption = map(dto.caption),
                )
            }
            is MessageContentDto.Document -> {
                return TdApi.MessageDocument(
                    document = map(dto.document),
                    caption = map(dto.caption),
                )
            }
            is MessageContentDto.PaidMedia -> {
                return TdApi.MessagePaidMedia(
                    starCount = dto.starCount,
                    media = dto.media.mapArray { map(it) },
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                )
            }
            is MessageContentDto.Photo -> {
                return TdApi.MessagePhoto(
                    photo = map(dto.photo),
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                    isSecret = dto.isSecret,
                )
            }
            is MessageContentDto.Sticker -> {
                return TdApi.MessageSticker(
                    sticker = map(dto.sticker),
                    isPremium = dto.isPremium,
                )
            }
            is MessageContentDto.Video -> {
                return TdApi.MessageVideo(
                    video = map(dto.video),
                    alternativeVideos = dto.alternativeVideos.mapArray { map(it) },
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                    caption = map(dto.caption),
                    showCaptionAboveMedia = dto.showCaptionAboveMedia,
                    hasSpoiler = dto.hasSpoiler,
                    isSecret = dto.isSecret,
                )
            }
            is MessageContentDto.VideoNote -> {
                return TdApi.MessageVideoNote(
                    videoNote = map(dto.videoNote),
                    isViewed = dto.isViewed,
                    isSecret = dto.isSecret,
                )
            }
            is MessageContentDto.VoiceNote -> {
                return TdApi.MessageVoiceNote(
                    voiceNote = map(dto.voiceNote),
                    caption = map(dto.caption),
                    isListened = dto.isListened,
                )
            }
            is MessageContentDto.ExpiredPhoto -> {
                return TdApi.MessageExpiredPhoto(
                )
            }
            is MessageContentDto.ExpiredVideo -> {
                return TdApi.MessageExpiredVideo(
                )
            }
            is MessageContentDto.ExpiredVideoNote -> {
                return TdApi.MessageExpiredVideoNote(
                )
            }
            is MessageContentDto.ExpiredVoiceNote -> {
                return TdApi.MessageExpiredVoiceNote(
                )
            }
            is MessageContentDto.Location -> {
                return TdApi.MessageLocation(
                    location = map(dto.location),
                    livePeriod = dto.livePeriod,
                    expiresIn = dto.expiresIn,
                    heading = dto.heading,
                    proximityAlertRadius = dto.proximityAlertRadius,
                )
            }
            is MessageContentDto.Venue -> {
                return TdApi.MessageVenue(
                    venue = map(dto.venue),
                )
            }
            is MessageContentDto.Contact -> {
                return TdApi.MessageContact(
                    contact = map(dto.contact),
                )
            }
            is MessageContentDto.AnimatedEmoji -> {
                return TdApi.MessageAnimatedEmoji(
                    animatedEmoji = map(dto.animatedEmoji),
                    emoji = dto.emoji,
                )
            }
            is MessageContentDto.Dice -> {
                return TdApi.MessageDice(
                    initialState = dto.initialState?.let { map(it) },
                    finalState = dto.finalState?.let { map(it) },
                    emoji = dto.emoji,
                    value = dto.value,
                    successAnimationFrameNumber = dto.successAnimationFrameNumber,
                )
            }
            is MessageContentDto.Game -> {
                return TdApi.MessageGame(
                    game = map(dto.game),
                )
            }
            is MessageContentDto.Poll -> {
                return TdApi.MessagePoll(
                    poll = map(dto.poll),
                )
            }
            is MessageContentDto.Story -> {
                return TdApi.MessageStory(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                    viaMention = dto.viaMention,
                )
            }
            is MessageContentDto.Invoice -> {
                return TdApi.MessageInvoice(
                    productInfo = map(dto.productInfo),
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    startParameter = dto.startParameter,
                    isTest = dto.isTest,
                    needShippingAddress = dto.needShippingAddress,
                    receiptMessageId = dto.receiptMessageId,
                    paidMedia = dto.paidMedia?.let { map(it) },
                    paidMediaCaption = dto.paidMediaCaption?.let { map(it) },
                )
            }
            is MessageContentDto.Call -> {
                return TdApi.MessageCall(
                    isVideo = dto.isVideo,
                    discardReason = map(dto.discardReason),
                    duration = dto.duration,
                )
            }
            is MessageContentDto.GroupCall -> {
                return TdApi.MessageGroupCall(
                    isActive = dto.isActive,
                    wasMissed = dto.wasMissed,
                    isVideo = dto.isVideo,
                    duration = dto.duration,
                    otherParticipantIds = dto.otherParticipantIds.mapArray { map(it) },
                )
            }
            is MessageContentDto.VideoChatScheduled -> {
                return TdApi.MessageVideoChatScheduled(
                    groupCallId = dto.groupCallId,
                    startDate = dto.startDate,
                )
            }
            is MessageContentDto.VideoChatStarted -> {
                return TdApi.MessageVideoChatStarted(
                    groupCallId = dto.groupCallId,
                )
            }
            is MessageContentDto.VideoChatEnded -> {
                return TdApi.MessageVideoChatEnded(
                    duration = dto.duration,
                )
            }
            is MessageContentDto.InviteVideoChatParticipants -> {
                return TdApi.MessageInviteVideoChatParticipants(
                    groupCallId = dto.groupCallId,
                    userIds = dto.userIds,
                )
            }
            is MessageContentDto.BasicGroupChatCreate -> {
                return TdApi.MessageBasicGroupChatCreate(
                    title = dto.title,
                    memberUserIds = dto.memberUserIds,
                )
            }
            is MessageContentDto.SupergroupChatCreate -> {
                return TdApi.MessageSupergroupChatCreate(
                    title = dto.title,
                )
            }
            is MessageContentDto.ChatChangeTitle -> {
                return TdApi.MessageChatChangeTitle(
                    title = dto.title,
                )
            }
            is MessageContentDto.ChatChangePhoto -> {
                return TdApi.MessageChatChangePhoto(
                    photo = map(dto.photo),
                )
            }
            is MessageContentDto.ChatDeletePhoto -> {
                return TdApi.MessageChatDeletePhoto(
                )
            }
            is MessageContentDto.ChatAddMembers -> {
                return TdApi.MessageChatAddMembers(
                    memberUserIds = dto.memberUserIds,
                )
            }
            is MessageContentDto.ChatJoinByLink -> {
                return TdApi.MessageChatJoinByLink(
                )
            }
            is MessageContentDto.ChatJoinByRequest -> {
                return TdApi.MessageChatJoinByRequest(
                )
            }
            is MessageContentDto.ChatDeleteMember -> {
                return TdApi.MessageChatDeleteMember(
                    userId = dto.userId,
                )
            }
            is MessageContentDto.ChatUpgradeTo -> {
                return TdApi.MessageChatUpgradeTo(
                    supergroupId = dto.supergroupId,
                )
            }
            is MessageContentDto.ChatUpgradeFrom -> {
                return TdApi.MessageChatUpgradeFrom(
                    title = dto.title,
                    basicGroupId = dto.basicGroupId,
                )
            }
            is MessageContentDto.PinMessage -> {
                return TdApi.MessagePinMessage(
                    messageId = dto.messageId,
                )
            }
            is MessageContentDto.ScreenshotTaken -> {
                return TdApi.MessageScreenshotTaken(
                )
            }
            is MessageContentDto.ChatSetBackground -> {
                return TdApi.MessageChatSetBackground(
                    oldBackgroundMessageId = dto.oldBackgroundMessageId,
                    background = map(dto.background),
                    onlyForSelf = dto.onlyForSelf,
                )
            }
            is MessageContentDto.ChatSetTheme -> {
                return TdApi.MessageChatSetTheme(
                    themeName = dto.themeName,
                )
            }
            is MessageContentDto.ChatSetMessageAutoDeleteTime -> {
                return TdApi.MessageChatSetMessageAutoDeleteTime(
                    messageAutoDeleteTime = dto.messageAutoDeleteTime,
                    fromUserId = dto.fromUserId,
                )
            }
            is MessageContentDto.ChatBoost -> {
                return TdApi.MessageChatBoost(
                    boostCount = dto.boostCount,
                )
            }
            is MessageContentDto.ForumTopicCreated -> {
                return TdApi.MessageForumTopicCreated(
                    name = dto.name,
                    icon = map(dto.icon),
                )
            }
            is MessageContentDto.ForumTopicEdited -> {
                return TdApi.MessageForumTopicEdited(
                    name = dto.name,
                    editIconCustomEmojiId = dto.editIconCustomEmojiId,
                    iconCustomEmojiId = dto.iconCustomEmojiId,
                )
            }
            is MessageContentDto.ForumTopicIsClosedToggled -> {
                return TdApi.MessageForumTopicIsClosedToggled(
                    isClosed = dto.isClosed,
                )
            }
            is MessageContentDto.ForumTopicIsHiddenToggled -> {
                return TdApi.MessageForumTopicIsHiddenToggled(
                    isHidden = dto.isHidden,
                )
            }
            is MessageContentDto.SuggestProfilePhoto -> {
                return TdApi.MessageSuggestProfilePhoto(
                    photo = map(dto.photo),
                )
            }
            is MessageContentDto.CustomServiceAction -> {
                return TdApi.MessageCustomServiceAction(
                    text = dto.text,
                )
            }
            is MessageContentDto.GameScore -> {
                return TdApi.MessageGameScore(
                    gameMessageId = dto.gameMessageId,
                    gameId = dto.gameId,
                    score = dto.score,
                )
            }
            is MessageContentDto.PaymentSuccessful -> {
                return TdApi.MessagePaymentSuccessful(
                    invoiceChatId = dto.invoiceChatId,
                    invoiceMessageId = dto.invoiceMessageId,
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    subscriptionUntilDate = dto.subscriptionUntilDate,
                    isRecurring = dto.isRecurring,
                    isFirstRecurring = dto.isFirstRecurring,
                    invoiceName = dto.invoiceName,
                )
            }
            is MessageContentDto.PaymentSuccessfulBot -> {
                return TdApi.MessagePaymentSuccessfulBot(
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    subscriptionUntilDate = dto.subscriptionUntilDate,
                    isRecurring = dto.isRecurring,
                    isFirstRecurring = dto.isFirstRecurring,
                    invoicePayload = dto.invoicePayload,
                    shippingOptionId = dto.shippingOptionId,
                    orderInfo = dto.orderInfo?.let { map(it) },
                    telegramPaymentChargeId = dto.telegramPaymentChargeId,
                    providerPaymentChargeId = dto.providerPaymentChargeId,
                )
            }
            is MessageContentDto.PaymentRefunded -> {
                return TdApi.MessagePaymentRefunded(
                    ownerId = map(dto.ownerId),
                    currency = dto.currency,
                    totalAmount = dto.totalAmount,
                    invoicePayload = dto.invoicePayload,
                    telegramPaymentChargeId = dto.telegramPaymentChargeId,
                    providerPaymentChargeId = dto.providerPaymentChargeId,
                )
            }
            is MessageContentDto.GiftedPremium -> {
                return TdApi.MessageGiftedPremium(
                    gifterUserId = dto.gifterUserId,
                    receiverUserId = dto.receiverUserId,
                    text = map(dto.text),
                    currency = dto.currency,
                    amount = dto.amount,
                    cryptocurrency = dto.cryptocurrency,
                    cryptocurrencyAmount = dto.cryptocurrencyAmount,
                    monthCount = dto.monthCount,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is MessageContentDto.PremiumGiftCode -> {
                return TdApi.MessagePremiumGiftCode(
                    creatorId = dto.creatorId?.let { map(it) },
                    text = map(dto.text),
                    isFromGiveaway = dto.isFromGiveaway,
                    isUnclaimed = dto.isUnclaimed,
                    currency = dto.currency,
                    amount = dto.amount,
                    cryptocurrency = dto.cryptocurrency,
                    cryptocurrencyAmount = dto.cryptocurrencyAmount,
                    monthCount = dto.monthCount,
                    sticker = dto.sticker?.let { map(it) },
                    code = dto.code,
                )
            }
            is MessageContentDto.GiveawayCreated -> {
                return TdApi.MessageGiveawayCreated(
                    starCount = dto.starCount,
                )
            }
            is MessageContentDto.Giveaway -> {
                return TdApi.MessageGiveaway(
                    parameters = map(dto.parameters),
                    winnerCount = dto.winnerCount,
                    prize = map(dto.prize),
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is MessageContentDto.GiveawayCompleted -> {
                return TdApi.MessageGiveawayCompleted(
                    giveawayMessageId = dto.giveawayMessageId,
                    winnerCount = dto.winnerCount,
                    isStarGiveaway = dto.isStarGiveaway,
                    unclaimedPrizeCount = dto.unclaimedPrizeCount,
                )
            }
            is MessageContentDto.GiveawayWinners -> {
                return TdApi.MessageGiveawayWinners(
                    boostedChatId = dto.boostedChatId,
                    giveawayMessageId = dto.giveawayMessageId,
                    additionalChatCount = dto.additionalChatCount,
                    actualWinnersSelectionDate = dto.actualWinnersSelectionDate,
                    onlyNewMembers = dto.onlyNewMembers,
                    wasRefunded = dto.wasRefunded,
                    prize = map(dto.prize),
                    prizeDescription = dto.prizeDescription,
                    winnerCount = dto.winnerCount,
                    winnerUserIds = dto.winnerUserIds,
                    unclaimedPrizeCount = dto.unclaimedPrizeCount,
                )
            }
            is MessageContentDto.GiftedStars -> {
                return TdApi.MessageGiftedStars(
                    gifterUserId = dto.gifterUserId,
                    receiverUserId = dto.receiverUserId,
                    currency = dto.currency,
                    amount = dto.amount,
                    cryptocurrency = dto.cryptocurrency,
                    cryptocurrencyAmount = dto.cryptocurrencyAmount,
                    starCount = dto.starCount,
                    transactionId = dto.transactionId,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is MessageContentDto.GiveawayPrizeStars -> {
                return TdApi.MessageGiveawayPrizeStars(
                    starCount = dto.starCount,
                    transactionId = dto.transactionId,
                    boostedChatId = dto.boostedChatId,
                    giveawayMessageId = dto.giveawayMessageId,
                    isUnclaimed = dto.isUnclaimed,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is MessageContentDto.Gift -> {
                return TdApi.MessageGift(
                    gift = map(dto.gift),
                    senderId = map(dto.senderId),
                    receivedGiftId = dto.receivedGiftId,
                    text = map(dto.text),
                    sellStarCount = dto.sellStarCount,
                    prepaidUpgradeStarCount = dto.prepaidUpgradeStarCount,
                    isPrivate = dto.isPrivate,
                    isSaved = dto.isSaved,
                    canBeUpgraded = dto.canBeUpgraded,
                    wasConverted = dto.wasConverted,
                    wasUpgraded = dto.wasUpgraded,
                    wasRefunded = dto.wasRefunded,
                    upgradedReceivedGiftId = dto.upgradedReceivedGiftId,
                )
            }
            is MessageContentDto.UpgradedGift -> {
                return TdApi.MessageUpgradedGift(
                    gift = map(dto.gift),
                    senderId = dto.senderId?.let { map(it) },
                    receivedGiftId = dto.receivedGiftId,
                    isUpgrade = dto.isUpgrade,
                    isSaved = dto.isSaved,
                    canBeTransferred = dto.canBeTransferred,
                    wasTransferred = dto.wasTransferred,
                    transferStarCount = dto.transferStarCount,
                    exportDate = dto.exportDate,
                )
            }
            is MessageContentDto.RefundedUpgradedGift -> {
                return TdApi.MessageRefundedUpgradedGift(
                    gift = map(dto.gift),
                    senderId = map(dto.senderId),
                    isUpgrade = dto.isUpgrade,
                )
            }
            is MessageContentDto.PaidMessagesRefunded -> {
                return TdApi.MessagePaidMessagesRefunded(
                    messageCount = dto.messageCount,
                    starCount = dto.starCount,
                )
            }
            is MessageContentDto.PaidMessagePriceChanged -> {
                return TdApi.MessagePaidMessagePriceChanged(
                    paidMessageStarCount = dto.paidMessageStarCount,
                )
            }
            is MessageContentDto.ContactRegistered -> {
                return TdApi.MessageContactRegistered(
                )
            }
            is MessageContentDto.UsersShared -> {
                return TdApi.MessageUsersShared(
                    users = dto.users.mapArray { map(it) },
                    buttonId = dto.buttonId,
                )
            }
            is MessageContentDto.ChatShared -> {
                return TdApi.MessageChatShared(
                    chat = map(dto.chat),
                    buttonId = dto.buttonId,
                )
            }
            is MessageContentDto.BotWriteAccessAllowed -> {
                return TdApi.MessageBotWriteAccessAllowed(
                    reason = map(dto.reason),
                )
            }
            is MessageContentDto.WebAppDataSent -> {
                return TdApi.MessageWebAppDataSent(
                    buttonText = dto.buttonText,
                )
            }
            is MessageContentDto.WebAppDataReceived -> {
                return TdApi.MessageWebAppDataReceived(
                    buttonText = dto.buttonText,
                    data = dto.data,
                )
            }
            is MessageContentDto.PassportDataSent -> {
                return TdApi.MessagePassportDataSent(
                    types = dto.types.mapArray { map(it) },
                )
            }
            is MessageContentDto.PassportDataReceived -> {
                return TdApi.MessagePassportDataReceived(
                    elements = dto.elements.mapArray { map(it) },
                    credentials = map(dto.credentials),
                )
            }
            is MessageContentDto.ProximityAlertTriggered -> {
                return TdApi.MessageProximityAlertTriggered(
                    travelerId = map(dto.travelerId),
                    watcherId = map(dto.watcherId),
                    distance = dto.distance,
                )
            }
            is MessageContentDto.Unsupported -> {
                return TdApi.MessageUnsupported(
                )
            }
        }
    }

    fun map(dto: TdApi.MessageEffectType): MessageEffectTypeDto {
        when(dto) {
            is TdApi.MessageEffectTypeEmojiReaction -> {
                return MessageEffectTypeDto.EmojiReaction(
                    selectAnimation = map(dto.selectAnimation),
                    effectAnimation = map(dto.effectAnimation),
                )
            }
            is TdApi.MessageEffectTypePremiumSticker -> {
                return MessageEffectTypeDto.PremiumSticker(
                    sticker = map(dto.sticker),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageEffectTypeDto): TdApi.MessageEffectType {
        when(dto) {
            is MessageEffectTypeDto.EmojiReaction -> {
                return TdApi.MessageEffectTypeEmojiReaction(
                    selectAnimation = map(dto.selectAnimation),
                    effectAnimation = map(dto.effectAnimation),
                )
            }
            is MessageEffectTypeDto.PremiumSticker -> {
                return TdApi.MessageEffectTypePremiumSticker(
                    sticker = map(dto.sticker),
                )
            }
        }
    }

    fun map(dto: TdApi.MessageFileType): MessageFileTypeDto {
        when(dto) {
            is TdApi.MessageFileTypePrivate -> {
                return MessageFileTypeDto.Private(
                    name = dto.name,
                )
            }
            is TdApi.MessageFileTypeGroup -> {
                return MessageFileTypeDto.Group(
                    title = dto.title,
                )
            }
            is TdApi.MessageFileTypeUnknown -> {
                return MessageFileTypeDto.Unknown(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageFileTypeDto): TdApi.MessageFileType {
        when(dto) {
            is MessageFileTypeDto.Private -> {
                return TdApi.MessageFileTypePrivate(
                    name = dto.name,
                )
            }
            is MessageFileTypeDto.Group -> {
                return TdApi.MessageFileTypeGroup(
                    title = dto.title,
                )
            }
            is MessageFileTypeDto.Unknown -> {
                return TdApi.MessageFileTypeUnknown(
                )
            }
        }
    }

    fun map(dto: TdApi.MessageOrigin): MessageOriginDto {
        when(dto) {
            is TdApi.MessageOriginUser -> {
                return MessageOriginDto.User(
                    senderUserId = dto.senderUserId,
                )
            }
            is TdApi.MessageOriginHiddenUser -> {
                return MessageOriginDto.HiddenUser(
                    senderName = dto.senderName,
                )
            }
            is TdApi.MessageOriginChat -> {
                return MessageOriginDto.Chat(
                    senderChatId = dto.senderChatId,
                    authorSignature = dto.authorSignature,
                )
            }
            is TdApi.MessageOriginChannel -> {
                return MessageOriginDto.Channel(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    authorSignature = dto.authorSignature,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageOriginDto): TdApi.MessageOrigin {
        when(dto) {
            is MessageOriginDto.User -> {
                return TdApi.MessageOriginUser(
                    senderUserId = dto.senderUserId,
                )
            }
            is MessageOriginDto.HiddenUser -> {
                return TdApi.MessageOriginHiddenUser(
                    senderName = dto.senderName,
                )
            }
            is MessageOriginDto.Chat -> {
                return TdApi.MessageOriginChat(
                    senderChatId = dto.senderChatId,
                    authorSignature = dto.authorSignature,
                )
            }
            is MessageOriginDto.Channel -> {
                return TdApi.MessageOriginChannel(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    authorSignature = dto.authorSignature,
                )
            }
        }
    }

    fun map(dto: TdApi.MessageReadDate): MessageReadDateDto {
        when(dto) {
            is TdApi.MessageReadDateRead -> {
                return MessageReadDateDto.Read(
                    readDate = dto.readDate,
                )
            }
            is TdApi.MessageReadDateUnread -> {
                return MessageReadDateDto.Unread(
                )
            }
            is TdApi.MessageReadDateTooOld -> {
                return MessageReadDateDto.TooOld(
                )
            }
            is TdApi.MessageReadDateUserPrivacyRestricted -> {
                return MessageReadDateDto.UserPrivacyRestricted(
                )
            }
            is TdApi.MessageReadDateMyPrivacyRestricted -> {
                return MessageReadDateDto.MyPrivacyRestricted(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageReadDateDto): TdApi.MessageReadDate {
        when(dto) {
            is MessageReadDateDto.Read -> {
                return TdApi.MessageReadDateRead(
                    readDate = dto.readDate,
                )
            }
            is MessageReadDateDto.Unread -> {
                return TdApi.MessageReadDateUnread(
                )
            }
            is MessageReadDateDto.TooOld -> {
                return TdApi.MessageReadDateTooOld(
                )
            }
            is MessageReadDateDto.UserPrivacyRestricted -> {
                return TdApi.MessageReadDateUserPrivacyRestricted(
                )
            }
            is MessageReadDateDto.MyPrivacyRestricted -> {
                return TdApi.MessageReadDateMyPrivacyRestricted(
                )
            }
        }
    }

    fun map(dto: TdApi.MessageReplyTo): MessageReplyToDto {
        when(dto) {
            is TdApi.MessageReplyToMessage -> {
                return MessageReplyToDto.Message(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    quote = dto.quote?.let { map(it) },
                    origin = dto.origin?.let { map(it) },
                    originSendDate = dto.originSendDate,
                    content = dto.content?.let { map(it) },
                )
            }
            is TdApi.MessageReplyToStory -> {
                return MessageReplyToDto.Story(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageReplyToDto): TdApi.MessageReplyTo {
        when(dto) {
            is MessageReplyToDto.Message -> {
                return TdApi.MessageReplyToMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    quote = dto.quote?.let { map(it) },
                    origin = dto.origin?.let { map(it) },
                    originSendDate = dto.originSendDate,
                    content = dto.content?.let { map(it) },
                )
            }
            is MessageReplyToDto.Story -> {
                return TdApi.MessageReplyToStory(
                    storyPosterChatId = dto.storyPosterChatId,
                    storyId = dto.storyId,
                )
            }
        }
    }

    fun map(dto: TdApi.MessageSchedulingState): MessageSchedulingStateDto {
        when(dto) {
            is TdApi.MessageSchedulingStateSendAtDate -> {
                return MessageSchedulingStateDto.SendAtDate(
                    sendDate = dto.sendDate,
                )
            }
            is TdApi.MessageSchedulingStateSendWhenOnline -> {
                return MessageSchedulingStateDto.SendWhenOnline(
                )
            }
            is TdApi.MessageSchedulingStateSendWhenVideoProcessed -> {
                return MessageSchedulingStateDto.SendWhenVideoProcessed(
                    sendDate = dto.sendDate,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageSchedulingStateDto): TdApi.MessageSchedulingState {
        when(dto) {
            is MessageSchedulingStateDto.SendAtDate -> {
                return TdApi.MessageSchedulingStateSendAtDate(
                    sendDate = dto.sendDate,
                )
            }
            is MessageSchedulingStateDto.SendWhenOnline -> {
                return TdApi.MessageSchedulingStateSendWhenOnline(
                )
            }
            is MessageSchedulingStateDto.SendWhenVideoProcessed -> {
                return TdApi.MessageSchedulingStateSendWhenVideoProcessed(
                    sendDate = dto.sendDate,
                )
            }
        }
    }

    fun map(dto: TdApi.MessageSelfDestructType): MessageSelfDestructTypeDto {
        when(dto) {
            is TdApi.MessageSelfDestructTypeTimer -> {
                return MessageSelfDestructTypeDto.Timer(
                    selfDestructTime = dto.selfDestructTime,
                )
            }
            is TdApi.MessageSelfDestructTypeImmediately -> {
                return MessageSelfDestructTypeDto.Immediately(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageSelfDestructTypeDto): TdApi.MessageSelfDestructType {
        when(dto) {
            is MessageSelfDestructTypeDto.Timer -> {
                return TdApi.MessageSelfDestructTypeTimer(
                    selfDestructTime = dto.selfDestructTime,
                )
            }
            is MessageSelfDestructTypeDto.Immediately -> {
                return TdApi.MessageSelfDestructTypeImmediately(
                )
            }
        }
    }

    fun map(dto: TdApi.MessageSender): MessageSenderDto {
        when(dto) {
            is TdApi.MessageSenderUser -> {
                return MessageSenderDto.User(
                    userId = dto.userId,
                )
            }
            is TdApi.MessageSenderChat -> {
                return MessageSenderDto.Chat(
                    chatId = dto.chatId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageSenderDto): TdApi.MessageSender {
        when(dto) {
            is MessageSenderDto.User -> {
                return TdApi.MessageSenderUser(
                    userId = dto.userId,
                )
            }
            is MessageSenderDto.Chat -> {
                return TdApi.MessageSenderChat(
                    chatId = dto.chatId,
                )
            }
        }
    }

    fun map(dto: TdApi.MessageSendingState): MessageSendingStateDto {
        when(dto) {
            is TdApi.MessageSendingStatePending -> {
                return MessageSendingStateDto.Pending(
                    sendingId = dto.sendingId,
                )
            }
            is TdApi.MessageSendingStateFailed -> {
                return MessageSendingStateDto.Failed(
                    error = map(dto.error),
                    canRetry = dto.canRetry,
                    needAnotherSender = dto.needAnotherSender,
                    needAnotherReplyQuote = dto.needAnotherReplyQuote,
                    needDropReply = dto.needDropReply,
                    requiredPaidMessageStarCount = dto.requiredPaidMessageStarCount,
                    retryAfter = dto.retryAfter,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageSendingStateDto): TdApi.MessageSendingState {
        when(dto) {
            is MessageSendingStateDto.Pending -> {
                return TdApi.MessageSendingStatePending(
                    sendingId = dto.sendingId,
                )
            }
            is MessageSendingStateDto.Failed -> {
                return TdApi.MessageSendingStateFailed(
                    error = map(dto.error),
                    canRetry = dto.canRetry,
                    needAnotherSender = dto.needAnotherSender,
                    needAnotherReplyQuote = dto.needAnotherReplyQuote,
                    needDropReply = dto.needDropReply,
                    requiredPaidMessageStarCount = dto.requiredPaidMessageStarCount,
                    retryAfter = dto.retryAfter,
                )
            }
        }
    }

    fun map(dto: TdApi.MessageSource): MessageSourceDto {
        when(dto) {
            is TdApi.MessageSourceChatHistory -> {
                return MessageSourceDto.ChatHistory(
                )
            }
            is TdApi.MessageSourceMessageThreadHistory -> {
                return MessageSourceDto.MessageThreadHistory(
                )
            }
            is TdApi.MessageSourceForumTopicHistory -> {
                return MessageSourceDto.ForumTopicHistory(
                )
            }
            is TdApi.MessageSourceHistoryPreview -> {
                return MessageSourceDto.HistoryPreview(
                )
            }
            is TdApi.MessageSourceChatList -> {
                return MessageSourceDto.ChatList(
                )
            }
            is TdApi.MessageSourceSearch -> {
                return MessageSourceDto.Search(
                )
            }
            is TdApi.MessageSourceChatEventLog -> {
                return MessageSourceDto.ChatEventLog(
                )
            }
            is TdApi.MessageSourceNotification -> {
                return MessageSourceDto.Notification(
                )
            }
            is TdApi.MessageSourceScreenshot -> {
                return MessageSourceDto.Screenshot(
                )
            }
            is TdApi.MessageSourceOther -> {
                return MessageSourceDto.Other(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: MessageSourceDto): TdApi.MessageSource {
        when(dto) {
            is MessageSourceDto.ChatHistory -> {
                return TdApi.MessageSourceChatHistory(
                )
            }
            is MessageSourceDto.MessageThreadHistory -> {
                return TdApi.MessageSourceMessageThreadHistory(
                )
            }
            is MessageSourceDto.ForumTopicHistory -> {
                return TdApi.MessageSourceForumTopicHistory(
                )
            }
            is MessageSourceDto.HistoryPreview -> {
                return TdApi.MessageSourceHistoryPreview(
                )
            }
            is MessageSourceDto.ChatList -> {
                return TdApi.MessageSourceChatList(
                )
            }
            is MessageSourceDto.Search -> {
                return TdApi.MessageSourceSearch(
                )
            }
            is MessageSourceDto.ChatEventLog -> {
                return TdApi.MessageSourceChatEventLog(
                )
            }
            is MessageSourceDto.Notification -> {
                return TdApi.MessageSourceNotification(
                )
            }
            is MessageSourceDto.Screenshot -> {
                return TdApi.MessageSourceScreenshot(
                )
            }
            is MessageSourceDto.Other -> {
                return TdApi.MessageSourceOther(
                )
            }
        }
    }

    fun map(dto: TdApi.NetworkStatisticsEntry): NetworkStatisticsEntryDto {
        when(dto) {
            is TdApi.NetworkStatisticsEntryFile -> {
                return NetworkStatisticsEntryDto.File(
                    fileType = dto.fileType?.let { map(it) },
                    networkType = map(dto.networkType),
                    sentBytes = dto.sentBytes,
                    receivedBytes = dto.receivedBytes,
                )
            }
            is TdApi.NetworkStatisticsEntryCall -> {
                return NetworkStatisticsEntryDto.Call(
                    networkType = map(dto.networkType),
                    sentBytes = dto.sentBytes,
                    receivedBytes = dto.receivedBytes,
                    duration = dto.duration,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: NetworkStatisticsEntryDto): TdApi.NetworkStatisticsEntry {
        when(dto) {
            is NetworkStatisticsEntryDto.File -> {
                return TdApi.NetworkStatisticsEntryFile(
                    fileType = dto.fileType?.let { map(it) },
                    networkType = map(dto.networkType),
                    sentBytes = dto.sentBytes,
                    receivedBytes = dto.receivedBytes,
                )
            }
            is NetworkStatisticsEntryDto.Call -> {
                return TdApi.NetworkStatisticsEntryCall(
                    networkType = map(dto.networkType),
                    sentBytes = dto.sentBytes,
                    receivedBytes = dto.receivedBytes,
                    duration = dto.duration,
                )
            }
        }
    }

    fun map(dto: TdApi.NetworkType): NetworkTypeDto {
        when(dto) {
            is TdApi.NetworkTypeNone -> {
                return NetworkTypeDto.None(
                )
            }
            is TdApi.NetworkTypeMobile -> {
                return NetworkTypeDto.Mobile(
                )
            }
            is TdApi.NetworkTypeMobileRoaming -> {
                return NetworkTypeDto.MobileRoaming(
                )
            }
            is TdApi.NetworkTypeWiFi -> {
                return NetworkTypeDto.WiFi(
                )
            }
            is TdApi.NetworkTypeOther -> {
                return NetworkTypeDto.Other(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: NetworkTypeDto): TdApi.NetworkType {
        when(dto) {
            is NetworkTypeDto.None -> {
                return TdApi.NetworkTypeNone(
                )
            }
            is NetworkTypeDto.Mobile -> {
                return TdApi.NetworkTypeMobile(
                )
            }
            is NetworkTypeDto.MobileRoaming -> {
                return TdApi.NetworkTypeMobileRoaming(
                )
            }
            is NetworkTypeDto.WiFi -> {
                return TdApi.NetworkTypeWiFi(
                )
            }
            is NetworkTypeDto.Other -> {
                return TdApi.NetworkTypeOther(
                )
            }
        }
    }

    fun map(dto: TdApi.NotificationGroupType): NotificationGroupTypeDto {
        when(dto) {
            is TdApi.NotificationGroupTypeMessages -> {
                return NotificationGroupTypeDto.Messages(
                )
            }
            is TdApi.NotificationGroupTypeMentions -> {
                return NotificationGroupTypeDto.Mentions(
                )
            }
            is TdApi.NotificationGroupTypeSecretChat -> {
                return NotificationGroupTypeDto.SecretChat(
                )
            }
            is TdApi.NotificationGroupTypeCalls -> {
                return NotificationGroupTypeDto.Calls(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: NotificationGroupTypeDto): TdApi.NotificationGroupType {
        when(dto) {
            is NotificationGroupTypeDto.Messages -> {
                return TdApi.NotificationGroupTypeMessages(
                )
            }
            is NotificationGroupTypeDto.Mentions -> {
                return TdApi.NotificationGroupTypeMentions(
                )
            }
            is NotificationGroupTypeDto.SecretChat -> {
                return TdApi.NotificationGroupTypeSecretChat(
                )
            }
            is NotificationGroupTypeDto.Calls -> {
                return TdApi.NotificationGroupTypeCalls(
                )
            }
        }
    }

    fun map(dto: TdApi.NotificationSettingsScope): NotificationSettingsScopeDto {
        when(dto) {
            is TdApi.NotificationSettingsScopePrivateChats -> {
                return NotificationSettingsScopeDto.PrivateChats(
                )
            }
            is TdApi.NotificationSettingsScopeGroupChats -> {
                return NotificationSettingsScopeDto.GroupChats(
                )
            }
            is TdApi.NotificationSettingsScopeChannelChats -> {
                return NotificationSettingsScopeDto.ChannelChats(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: NotificationSettingsScopeDto): TdApi.NotificationSettingsScope {
        when(dto) {
            is NotificationSettingsScopeDto.PrivateChats -> {
                return TdApi.NotificationSettingsScopePrivateChats(
                )
            }
            is NotificationSettingsScopeDto.GroupChats -> {
                return TdApi.NotificationSettingsScopeGroupChats(
                )
            }
            is NotificationSettingsScopeDto.ChannelChats -> {
                return TdApi.NotificationSettingsScopeChannelChats(
                )
            }
        }
    }

    fun map(dto: TdApi.NotificationType): NotificationTypeDto {
        when(dto) {
            is TdApi.NotificationTypeNewMessage -> {
                return NotificationTypeDto.NewMessage(
                    message = map(dto.message),
                    showPreview = dto.showPreview,
                )
            }
            is TdApi.NotificationTypeNewSecretChat -> {
                return NotificationTypeDto.NewSecretChat(
                )
            }
            is TdApi.NotificationTypeNewCall -> {
                return NotificationTypeDto.NewCall(
                    callId = dto.callId,
                )
            }
            is TdApi.NotificationTypeNewPushMessage -> {
                return NotificationTypeDto.NewPushMessage(
                    messageId = dto.messageId,
                    senderId = map(dto.senderId),
                    senderName = dto.senderName,
                    isOutgoing = dto.isOutgoing,
                    content = map(dto.content),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: NotificationTypeDto): TdApi.NotificationType {
        when(dto) {
            is NotificationTypeDto.NewMessage -> {
                return TdApi.NotificationTypeNewMessage(
                    message = map(dto.message),
                    showPreview = dto.showPreview,
                )
            }
            is NotificationTypeDto.NewSecretChat -> {
                return TdApi.NotificationTypeNewSecretChat(
                )
            }
            is NotificationTypeDto.NewCall -> {
                return TdApi.NotificationTypeNewCall(
                    callId = dto.callId,
                )
            }
            is NotificationTypeDto.NewPushMessage -> {
                return TdApi.NotificationTypeNewPushMessage(
                    messageId = dto.messageId,
                    senderId = map(dto.senderId),
                    senderName = dto.senderName,
                    isOutgoing = dto.isOutgoing,
                    content = map(dto.content),
                )
            }
        }
    }

    fun map(dto: TdApi.OptionValue): OptionValueDto {
        when(dto) {
            is TdApi.OptionValueBoolean -> {
                return OptionValueDto.Boolean(
                    value = dto.value,
                )
            }
            is TdApi.OptionValueEmpty -> {
                return OptionValueDto.Empty(
                )
            }
            is TdApi.OptionValueInteger -> {
                return OptionValueDto.Integer(
                    value = dto.value,
                )
            }
            is TdApi.OptionValueString -> {
                return OptionValueDto.String(
                    value = dto.value,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: OptionValueDto): TdApi.OptionValue {
        when(dto) {
            is OptionValueDto.Boolean -> {
                return TdApi.OptionValueBoolean(
                    value = dto.value,
                )
            }
            is OptionValueDto.Empty -> {
                return TdApi.OptionValueEmpty(
                )
            }
            is OptionValueDto.Integer -> {
                return TdApi.OptionValueInteger(
                    value = dto.value,
                )
            }
            is OptionValueDto.String -> {
                return TdApi.OptionValueString(
                    value = dto.value,
                )
            }
        }
    }

    fun map(dto: TdApi.PageBlock): PageBlockDto {
        when(dto) {
            is TdApi.PageBlockTitle -> {
                return PageBlockDto.Title(
                    title = map(dto.title),
                )
            }
            is TdApi.PageBlockSubtitle -> {
                return PageBlockDto.Subtitle(
                    subtitle = map(dto.subtitle),
                )
            }
            is TdApi.PageBlockAuthorDate -> {
                return PageBlockDto.AuthorDate(
                    author = map(dto.author),
                    publishDate = dto.publishDate,
                )
            }
            is TdApi.PageBlockHeader -> {
                return PageBlockDto.Header(
                    header = map(dto.header),
                )
            }
            is TdApi.PageBlockSubheader -> {
                return PageBlockDto.Subheader(
                    subheader = map(dto.subheader),
                )
            }
            is TdApi.PageBlockKicker -> {
                return PageBlockDto.Kicker(
                    kicker = map(dto.kicker),
                )
            }
            is TdApi.PageBlockParagraph -> {
                return PageBlockDto.Paragraph(
                    text = map(dto.text),
                )
            }
            is TdApi.PageBlockPreformatted -> {
                return PageBlockDto.Preformatted(
                    text = map(dto.text),
                    language = dto.language,
                )
            }
            is TdApi.PageBlockFooter -> {
                return PageBlockDto.Footer(
                    footer = map(dto.footer),
                )
            }
            is TdApi.PageBlockDivider -> {
                return PageBlockDto.Divider(
                )
            }
            is TdApi.PageBlockAnchor -> {
                return PageBlockDto.Anchor(
                    name = dto.name,
                )
            }
            is TdApi.PageBlockList -> {
                return PageBlockDto.List(
                    items = dto.items.mapArray { map(it) },
                )
            }
            is TdApi.PageBlockBlockQuote -> {
                return PageBlockDto.BlockQuote(
                    text = map(dto.text),
                    credit = map(dto.credit),
                )
            }
            is TdApi.PageBlockPullQuote -> {
                return PageBlockDto.PullQuote(
                    text = map(dto.text),
                    credit = map(dto.credit),
                )
            }
            is TdApi.PageBlockAnimation -> {
                return PageBlockDto.Animation(
                    animation = dto.animation?.let { map(it) },
                    caption = map(dto.caption),
                    needAutoplay = dto.needAutoplay,
                )
            }
            is TdApi.PageBlockAudio -> {
                return PageBlockDto.Audio(
                    audio = dto.audio?.let { map(it) },
                    caption = map(dto.caption),
                )
            }
            is TdApi.PageBlockPhoto -> {
                return PageBlockDto.Photo(
                    photo = dto.photo?.let { map(it) },
                    caption = map(dto.caption),
                    url = dto.url,
                )
            }
            is TdApi.PageBlockVideo -> {
                return PageBlockDto.Video(
                    video = dto.video?.let { map(it) },
                    caption = map(dto.caption),
                    needAutoplay = dto.needAutoplay,
                    isLooped = dto.isLooped,
                )
            }
            is TdApi.PageBlockVoiceNote -> {
                return PageBlockDto.VoiceNote(
                    voiceNote = dto.voiceNote?.let { map(it) },
                    caption = map(dto.caption),
                )
            }
            is TdApi.PageBlockCover -> {
                return PageBlockDto.Cover(
                    cover = map(dto.cover),
                )
            }
            is TdApi.PageBlockEmbedded -> {
                return PageBlockDto.Embedded(
                    url = dto.url,
                    html = dto.html,
                    posterPhoto = dto.posterPhoto?.let { map(it) },
                    width = dto.width,
                    height = dto.height,
                    caption = map(dto.caption),
                    isFullWidth = dto.isFullWidth,
                    allowScrolling = dto.allowScrolling,
                )
            }
            is TdApi.PageBlockEmbeddedPost -> {
                return PageBlockDto.EmbeddedPost(
                    url = dto.url,
                    author = dto.author,
                    authorPhoto = dto.authorPhoto?.let { map(it) },
                    date = dto.date,
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    caption = map(dto.caption),
                )
            }
            is TdApi.PageBlockCollage -> {
                return PageBlockDto.Collage(
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    caption = map(dto.caption),
                )
            }
            is TdApi.PageBlockSlideshow -> {
                return PageBlockDto.Slideshow(
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    caption = map(dto.caption),
                )
            }
            is TdApi.PageBlockChatLink -> {
                return PageBlockDto.ChatLink(
                    title = dto.title,
                    photo = dto.photo?.let { map(it) },
                    accentColorId = dto.accentColorId,
                    username = dto.username,
                )
            }
            is TdApi.PageBlockTable -> {
                return PageBlockDto.Table(
                    caption = map(dto.caption),
                    cells = dto.cells.mapArrayOfArrays { map(it) },
                    isBordered = dto.isBordered,
                    isStriped = dto.isStriped,
                )
            }
            is TdApi.PageBlockDetails -> {
                return PageBlockDto.Details(
                    header = map(dto.header),
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    isOpen = dto.isOpen,
                )
            }
            is TdApi.PageBlockRelatedArticles -> {
                return PageBlockDto.RelatedArticles(
                    header = map(dto.header),
                    articles = dto.articles.mapArray { map(it) },
                )
            }
            is TdApi.PageBlockMap -> {
                return PageBlockDto.Map(
                    location = map(dto.location),
                    zoom = dto.zoom,
                    width = dto.width,
                    height = dto.height,
                    caption = map(dto.caption),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PageBlockDto): TdApi.PageBlock {
        when(dto) {
            is PageBlockDto.Title -> {
                return TdApi.PageBlockTitle(
                    title = map(dto.title),
                )
            }
            is PageBlockDto.Subtitle -> {
                return TdApi.PageBlockSubtitle(
                    subtitle = map(dto.subtitle),
                )
            }
            is PageBlockDto.AuthorDate -> {
                return TdApi.PageBlockAuthorDate(
                    author = map(dto.author),
                    publishDate = dto.publishDate,
                )
            }
            is PageBlockDto.Header -> {
                return TdApi.PageBlockHeader(
                    header = map(dto.header),
                )
            }
            is PageBlockDto.Subheader -> {
                return TdApi.PageBlockSubheader(
                    subheader = map(dto.subheader),
                )
            }
            is PageBlockDto.Kicker -> {
                return TdApi.PageBlockKicker(
                    kicker = map(dto.kicker),
                )
            }
            is PageBlockDto.Paragraph -> {
                return TdApi.PageBlockParagraph(
                    text = map(dto.text),
                )
            }
            is PageBlockDto.Preformatted -> {
                return TdApi.PageBlockPreformatted(
                    text = map(dto.text),
                    language = dto.language,
                )
            }
            is PageBlockDto.Footer -> {
                return TdApi.PageBlockFooter(
                    footer = map(dto.footer),
                )
            }
            is PageBlockDto.Divider -> {
                return TdApi.PageBlockDivider(
                )
            }
            is PageBlockDto.Anchor -> {
                return TdApi.PageBlockAnchor(
                    name = dto.name,
                )
            }
            is PageBlockDto.List -> {
                return TdApi.PageBlockList(
                    items = dto.items.mapArray { map(it) },
                )
            }
            is PageBlockDto.BlockQuote -> {
                return TdApi.PageBlockBlockQuote(
                    text = map(dto.text),
                    credit = map(dto.credit),
                )
            }
            is PageBlockDto.PullQuote -> {
                return TdApi.PageBlockPullQuote(
                    text = map(dto.text),
                    credit = map(dto.credit),
                )
            }
            is PageBlockDto.Animation -> {
                return TdApi.PageBlockAnimation(
                    animation = dto.animation?.let { map(it) },
                    caption = map(dto.caption),
                    needAutoplay = dto.needAutoplay,
                )
            }
            is PageBlockDto.Audio -> {
                return TdApi.PageBlockAudio(
                    audio = dto.audio?.let { map(it) },
                    caption = map(dto.caption),
                )
            }
            is PageBlockDto.Photo -> {
                return TdApi.PageBlockPhoto(
                    photo = dto.photo?.let { map(it) },
                    caption = map(dto.caption),
                    url = dto.url,
                )
            }
            is PageBlockDto.Video -> {
                return TdApi.PageBlockVideo(
                    video = dto.video?.let { map(it) },
                    caption = map(dto.caption),
                    needAutoplay = dto.needAutoplay,
                    isLooped = dto.isLooped,
                )
            }
            is PageBlockDto.VoiceNote -> {
                return TdApi.PageBlockVoiceNote(
                    voiceNote = dto.voiceNote?.let { map(it) },
                    caption = map(dto.caption),
                )
            }
            is PageBlockDto.Cover -> {
                return TdApi.PageBlockCover(
                    cover = map(dto.cover),
                )
            }
            is PageBlockDto.Embedded -> {
                return TdApi.PageBlockEmbedded(
                    url = dto.url,
                    html = dto.html,
                    posterPhoto = dto.posterPhoto?.let { map(it) },
                    width = dto.width,
                    height = dto.height,
                    caption = map(dto.caption),
                    isFullWidth = dto.isFullWidth,
                    allowScrolling = dto.allowScrolling,
                )
            }
            is PageBlockDto.EmbeddedPost -> {
                return TdApi.PageBlockEmbeddedPost(
                    url = dto.url,
                    author = dto.author,
                    authorPhoto = dto.authorPhoto?.let { map(it) },
                    date = dto.date,
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    caption = map(dto.caption),
                )
            }
            is PageBlockDto.Collage -> {
                return TdApi.PageBlockCollage(
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    caption = map(dto.caption),
                )
            }
            is PageBlockDto.Slideshow -> {
                return TdApi.PageBlockSlideshow(
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    caption = map(dto.caption),
                )
            }
            is PageBlockDto.ChatLink -> {
                return TdApi.PageBlockChatLink(
                    title = dto.title,
                    photo = dto.photo?.let { map(it) },
                    accentColorId = dto.accentColorId,
                    username = dto.username,
                )
            }
            is PageBlockDto.Table -> {
                return TdApi.PageBlockTable(
                    caption = map(dto.caption),
                    cells = dto.cells.mapArrayOfArrays { map(it) },
                    isBordered = dto.isBordered,
                    isStriped = dto.isStriped,
                )
            }
            is PageBlockDto.Details -> {
                return TdApi.PageBlockDetails(
                    header = map(dto.header),
                    pageBlocks = dto.pageBlocks.mapArray { map(it) },
                    isOpen = dto.isOpen,
                )
            }
            is PageBlockDto.RelatedArticles -> {
                return TdApi.PageBlockRelatedArticles(
                    header = map(dto.header),
                    articles = dto.articles.mapArray { map(it) },
                )
            }
            is PageBlockDto.Map -> {
                return TdApi.PageBlockMap(
                    location = map(dto.location),
                    zoom = dto.zoom,
                    width = dto.width,
                    height = dto.height,
                    caption = map(dto.caption),
                )
            }
        }
    }

    fun map(dto: TdApi.PageBlockHorizontalAlignment): PageBlockHorizontalAlignmentDto {
        when(dto) {
            is TdApi.PageBlockHorizontalAlignmentLeft -> {
                return PageBlockHorizontalAlignmentDto.Left(
                )
            }
            is TdApi.PageBlockHorizontalAlignmentCenter -> {
                return PageBlockHorizontalAlignmentDto.Center(
                )
            }
            is TdApi.PageBlockHorizontalAlignmentRight -> {
                return PageBlockHorizontalAlignmentDto.Right(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PageBlockHorizontalAlignmentDto): TdApi.PageBlockHorizontalAlignment {
        when(dto) {
            is PageBlockHorizontalAlignmentDto.Left -> {
                return TdApi.PageBlockHorizontalAlignmentLeft(
                )
            }
            is PageBlockHorizontalAlignmentDto.Center -> {
                return TdApi.PageBlockHorizontalAlignmentCenter(
                )
            }
            is PageBlockHorizontalAlignmentDto.Right -> {
                return TdApi.PageBlockHorizontalAlignmentRight(
                )
            }
        }
    }

    fun map(dto: TdApi.PageBlockVerticalAlignment): PageBlockVerticalAlignmentDto {
        when(dto) {
            is TdApi.PageBlockVerticalAlignmentTop -> {
                return PageBlockVerticalAlignmentDto.Top(
                )
            }
            is TdApi.PageBlockVerticalAlignmentMiddle -> {
                return PageBlockVerticalAlignmentDto.Middle(
                )
            }
            is TdApi.PageBlockVerticalAlignmentBottom -> {
                return PageBlockVerticalAlignmentDto.Bottom(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PageBlockVerticalAlignmentDto): TdApi.PageBlockVerticalAlignment {
        when(dto) {
            is PageBlockVerticalAlignmentDto.Top -> {
                return TdApi.PageBlockVerticalAlignmentTop(
                )
            }
            is PageBlockVerticalAlignmentDto.Middle -> {
                return TdApi.PageBlockVerticalAlignmentMiddle(
                )
            }
            is PageBlockVerticalAlignmentDto.Bottom -> {
                return TdApi.PageBlockVerticalAlignmentBottom(
                )
            }
        }
    }

    fun map(dto: TdApi.PaidMedia): PaidMediaDto {
        when(dto) {
            is TdApi.PaidMediaPreview -> {
                return PaidMediaDto.Preview(
                    width = dto.width,
                    height = dto.height,
                    duration = dto.duration,
                    minithumbnail = dto.minithumbnail?.let { map(it) },
                )
            }
            is TdApi.PaidMediaPhoto -> {
                return PaidMediaDto.Photo(
                    photo = map(dto.photo),
                )
            }
            is TdApi.PaidMediaVideo -> {
                return PaidMediaDto.Video(
                    video = map(dto.video),
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                )
            }
            is TdApi.PaidMediaUnsupported -> {
                return PaidMediaDto.Unsupported(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PaidMediaDto): TdApi.PaidMedia {
        when(dto) {
            is PaidMediaDto.Preview -> {
                return TdApi.PaidMediaPreview(
                    width = dto.width,
                    height = dto.height,
                    duration = dto.duration,
                    minithumbnail = dto.minithumbnail?.let { map(it) },
                )
            }
            is PaidMediaDto.Photo -> {
                return TdApi.PaidMediaPhoto(
                    photo = map(dto.photo),
                )
            }
            is PaidMediaDto.Video -> {
                return TdApi.PaidMediaVideo(
                    video = map(dto.video),
                    cover = dto.cover?.let { map(it) },
                    startTimestamp = dto.startTimestamp,
                )
            }
            is PaidMediaDto.Unsupported -> {
                return TdApi.PaidMediaUnsupported(
                )
            }
        }
    }

    fun map(dto: TdApi.PaidReactionType): PaidReactionTypeDto {
        when(dto) {
            is TdApi.PaidReactionTypeRegular -> {
                return PaidReactionTypeDto.Regular(
                )
            }
            is TdApi.PaidReactionTypeAnonymous -> {
                return PaidReactionTypeDto.Anonymous(
                )
            }
            is TdApi.PaidReactionTypeChat -> {
                return PaidReactionTypeDto.Chat(
                    chatId = dto.chatId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PaidReactionTypeDto): TdApi.PaidReactionType {
        when(dto) {
            is PaidReactionTypeDto.Regular -> {
                return TdApi.PaidReactionTypeRegular(
                )
            }
            is PaidReactionTypeDto.Anonymous -> {
                return TdApi.PaidReactionTypeAnonymous(
                )
            }
            is PaidReactionTypeDto.Chat -> {
                return TdApi.PaidReactionTypeChat(
                    chatId = dto.chatId,
                )
            }
        }
    }

    fun map(dto: TdApi.PassportElement): PassportElementDto {
        when(dto) {
            is TdApi.PassportElementPersonalDetails -> {
                return PassportElementDto.PersonalDetails(
                    personalDetails = map(dto.personalDetails),
                )
            }
            is TdApi.PassportElementPassport -> {
                return PassportElementDto.Passport(
                    passport = map(dto.passport),
                )
            }
            is TdApi.PassportElementDriverLicense -> {
                return PassportElementDto.DriverLicense(
                    driverLicense = map(dto.driverLicense),
                )
            }
            is TdApi.PassportElementIdentityCard -> {
                return PassportElementDto.IdentityCard(
                    identityCard = map(dto.identityCard),
                )
            }
            is TdApi.PassportElementInternalPassport -> {
                return PassportElementDto.InternalPassport(
                    internalPassport = map(dto.internalPassport),
                )
            }
            is TdApi.PassportElementAddress -> {
                return PassportElementDto.Address(
                    address = map(dto.address),
                )
            }
            is TdApi.PassportElementUtilityBill -> {
                return PassportElementDto.UtilityBill(
                    utilityBill = map(dto.utilityBill),
                )
            }
            is TdApi.PassportElementBankStatement -> {
                return PassportElementDto.BankStatement(
                    bankStatement = map(dto.bankStatement),
                )
            }
            is TdApi.PassportElementRentalAgreement -> {
                return PassportElementDto.RentalAgreement(
                    rentalAgreement = map(dto.rentalAgreement),
                )
            }
            is TdApi.PassportElementPassportRegistration -> {
                return PassportElementDto.PassportRegistration(
                    passportRegistration = map(dto.passportRegistration),
                )
            }
            is TdApi.PassportElementTemporaryRegistration -> {
                return PassportElementDto.TemporaryRegistration(
                    temporaryRegistration = map(dto.temporaryRegistration),
                )
            }
            is TdApi.PassportElementPhoneNumber -> {
                return PassportElementDto.PhoneNumber(
                    phoneNumber = dto.phoneNumber,
                )
            }
            is TdApi.PassportElementEmailAddress -> {
                return PassportElementDto.EmailAddress(
                    emailAddress = dto.emailAddress,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PassportElementDto): TdApi.PassportElement {
        when(dto) {
            is PassportElementDto.PersonalDetails -> {
                return TdApi.PassportElementPersonalDetails(
                    personalDetails = map(dto.personalDetails),
                )
            }
            is PassportElementDto.Passport -> {
                return TdApi.PassportElementPassport(
                    passport = map(dto.passport),
                )
            }
            is PassportElementDto.DriverLicense -> {
                return TdApi.PassportElementDriverLicense(
                    driverLicense = map(dto.driverLicense),
                )
            }
            is PassportElementDto.IdentityCard -> {
                return TdApi.PassportElementIdentityCard(
                    identityCard = map(dto.identityCard),
                )
            }
            is PassportElementDto.InternalPassport -> {
                return TdApi.PassportElementInternalPassport(
                    internalPassport = map(dto.internalPassport),
                )
            }
            is PassportElementDto.Address -> {
                return TdApi.PassportElementAddress(
                    address = map(dto.address),
                )
            }
            is PassportElementDto.UtilityBill -> {
                return TdApi.PassportElementUtilityBill(
                    utilityBill = map(dto.utilityBill),
                )
            }
            is PassportElementDto.BankStatement -> {
                return TdApi.PassportElementBankStatement(
                    bankStatement = map(dto.bankStatement),
                )
            }
            is PassportElementDto.RentalAgreement -> {
                return TdApi.PassportElementRentalAgreement(
                    rentalAgreement = map(dto.rentalAgreement),
                )
            }
            is PassportElementDto.PassportRegistration -> {
                return TdApi.PassportElementPassportRegistration(
                    passportRegistration = map(dto.passportRegistration),
                )
            }
            is PassportElementDto.TemporaryRegistration -> {
                return TdApi.PassportElementTemporaryRegistration(
                    temporaryRegistration = map(dto.temporaryRegistration),
                )
            }
            is PassportElementDto.PhoneNumber -> {
                return TdApi.PassportElementPhoneNumber(
                    phoneNumber = dto.phoneNumber,
                )
            }
            is PassportElementDto.EmailAddress -> {
                return TdApi.PassportElementEmailAddress(
                    emailAddress = dto.emailAddress,
                )
            }
        }
    }

    fun map(dto: TdApi.PassportElementErrorSource): PassportElementErrorSourceDto {
        when(dto) {
            is TdApi.PassportElementErrorSourceUnspecified -> {
                return PassportElementErrorSourceDto.Unspecified(
                )
            }
            is TdApi.PassportElementErrorSourceDataField -> {
                return PassportElementErrorSourceDto.DataField(
                    fieldName = dto.fieldName,
                )
            }
            is TdApi.PassportElementErrorSourceFrontSide -> {
                return PassportElementErrorSourceDto.FrontSide(
                )
            }
            is TdApi.PassportElementErrorSourceReverseSide -> {
                return PassportElementErrorSourceDto.ReverseSide(
                )
            }
            is TdApi.PassportElementErrorSourceSelfie -> {
                return PassportElementErrorSourceDto.Selfie(
                )
            }
            is TdApi.PassportElementErrorSourceTranslationFile -> {
                return PassportElementErrorSourceDto.TranslationFile(
                    fileIndex = dto.fileIndex,
                )
            }
            is TdApi.PassportElementErrorSourceTranslationFiles -> {
                return PassportElementErrorSourceDto.TranslationFiles(
                )
            }
            is TdApi.PassportElementErrorSourceFile -> {
                return PassportElementErrorSourceDto.File(
                    fileIndex = dto.fileIndex,
                )
            }
            is TdApi.PassportElementErrorSourceFiles -> {
                return PassportElementErrorSourceDto.Files(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PassportElementErrorSourceDto): TdApi.PassportElementErrorSource {
        when(dto) {
            is PassportElementErrorSourceDto.Unspecified -> {
                return TdApi.PassportElementErrorSourceUnspecified(
                )
            }
            is PassportElementErrorSourceDto.DataField -> {
                return TdApi.PassportElementErrorSourceDataField(
                    fieldName = dto.fieldName,
                )
            }
            is PassportElementErrorSourceDto.FrontSide -> {
                return TdApi.PassportElementErrorSourceFrontSide(
                )
            }
            is PassportElementErrorSourceDto.ReverseSide -> {
                return TdApi.PassportElementErrorSourceReverseSide(
                )
            }
            is PassportElementErrorSourceDto.Selfie -> {
                return TdApi.PassportElementErrorSourceSelfie(
                )
            }
            is PassportElementErrorSourceDto.TranslationFile -> {
                return TdApi.PassportElementErrorSourceTranslationFile(
                    fileIndex = dto.fileIndex,
                )
            }
            is PassportElementErrorSourceDto.TranslationFiles -> {
                return TdApi.PassportElementErrorSourceTranslationFiles(
                )
            }
            is PassportElementErrorSourceDto.File -> {
                return TdApi.PassportElementErrorSourceFile(
                    fileIndex = dto.fileIndex,
                )
            }
            is PassportElementErrorSourceDto.Files -> {
                return TdApi.PassportElementErrorSourceFiles(
                )
            }
        }
    }

    fun map(dto: TdApi.PassportElementType): PassportElementTypeDto {
        when(dto) {
            is TdApi.PassportElementTypePersonalDetails -> {
                return PassportElementTypeDto.PersonalDetails(
                )
            }
            is TdApi.PassportElementTypePassport -> {
                return PassportElementTypeDto.Passport(
                )
            }
            is TdApi.PassportElementTypeDriverLicense -> {
                return PassportElementTypeDto.DriverLicense(
                )
            }
            is TdApi.PassportElementTypeIdentityCard -> {
                return PassportElementTypeDto.IdentityCard(
                )
            }
            is TdApi.PassportElementTypeInternalPassport -> {
                return PassportElementTypeDto.InternalPassport(
                )
            }
            is TdApi.PassportElementTypeAddress -> {
                return PassportElementTypeDto.Address(
                )
            }
            is TdApi.PassportElementTypeUtilityBill -> {
                return PassportElementTypeDto.UtilityBill(
                )
            }
            is TdApi.PassportElementTypeBankStatement -> {
                return PassportElementTypeDto.BankStatement(
                )
            }
            is TdApi.PassportElementTypeRentalAgreement -> {
                return PassportElementTypeDto.RentalAgreement(
                )
            }
            is TdApi.PassportElementTypePassportRegistration -> {
                return PassportElementTypeDto.PassportRegistration(
                )
            }
            is TdApi.PassportElementTypeTemporaryRegistration -> {
                return PassportElementTypeDto.TemporaryRegistration(
                )
            }
            is TdApi.PassportElementTypePhoneNumber -> {
                return PassportElementTypeDto.PhoneNumber(
                )
            }
            is TdApi.PassportElementTypeEmailAddress -> {
                return PassportElementTypeDto.EmailAddress(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PassportElementTypeDto): TdApi.PassportElementType {
        when(dto) {
            is PassportElementTypeDto.PersonalDetails -> {
                return TdApi.PassportElementTypePersonalDetails(
                )
            }
            is PassportElementTypeDto.Passport -> {
                return TdApi.PassportElementTypePassport(
                )
            }
            is PassportElementTypeDto.DriverLicense -> {
                return TdApi.PassportElementTypeDriverLicense(
                )
            }
            is PassportElementTypeDto.IdentityCard -> {
                return TdApi.PassportElementTypeIdentityCard(
                )
            }
            is PassportElementTypeDto.InternalPassport -> {
                return TdApi.PassportElementTypeInternalPassport(
                )
            }
            is PassportElementTypeDto.Address -> {
                return TdApi.PassportElementTypeAddress(
                )
            }
            is PassportElementTypeDto.UtilityBill -> {
                return TdApi.PassportElementTypeUtilityBill(
                )
            }
            is PassportElementTypeDto.BankStatement -> {
                return TdApi.PassportElementTypeBankStatement(
                )
            }
            is PassportElementTypeDto.RentalAgreement -> {
                return TdApi.PassportElementTypeRentalAgreement(
                )
            }
            is PassportElementTypeDto.PassportRegistration -> {
                return TdApi.PassportElementTypePassportRegistration(
                )
            }
            is PassportElementTypeDto.TemporaryRegistration -> {
                return TdApi.PassportElementTypeTemporaryRegistration(
                )
            }
            is PassportElementTypeDto.PhoneNumber -> {
                return TdApi.PassportElementTypePhoneNumber(
                )
            }
            is PassportElementTypeDto.EmailAddress -> {
                return TdApi.PassportElementTypeEmailAddress(
                )
            }
        }
    }

    fun map(dto: TdApi.PaymentFormType): PaymentFormTypeDto {
        when(dto) {
            is TdApi.PaymentFormTypeRegular -> {
                return PaymentFormTypeDto.Regular(
                    invoice = map(dto.invoice),
                    paymentProviderUserId = dto.paymentProviderUserId,
                    paymentProvider = map(dto.paymentProvider),
                    additionalPaymentOptions = dto.additionalPaymentOptions.mapArray { map(it) },
                    savedOrderInfo = dto.savedOrderInfo?.let { map(it) },
                    savedCredentials = dto.savedCredentials.mapArray { map(it) },
                    canSaveCredentials = dto.canSaveCredentials,
                    needPassword = dto.needPassword,
                )
            }
            is TdApi.PaymentFormTypeStars -> {
                return PaymentFormTypeDto.Stars(
                    starCount = dto.starCount,
                )
            }
            is TdApi.PaymentFormTypeStarSubscription -> {
                return PaymentFormTypeDto.StarSubscription(
                    pricing = map(dto.pricing),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PaymentFormTypeDto): TdApi.PaymentFormType {
        when(dto) {
            is PaymentFormTypeDto.Regular -> {
                return TdApi.PaymentFormTypeRegular(
                    invoice = map(dto.invoice),
                    paymentProviderUserId = dto.paymentProviderUserId,
                    paymentProvider = map(dto.paymentProvider),
                    additionalPaymentOptions = dto.additionalPaymentOptions.mapArray { map(it) },
                    savedOrderInfo = dto.savedOrderInfo?.let { map(it) },
                    savedCredentials = dto.savedCredentials.mapArray { map(it) },
                    canSaveCredentials = dto.canSaveCredentials,
                    needPassword = dto.needPassword,
                )
            }
            is PaymentFormTypeDto.Stars -> {
                return TdApi.PaymentFormTypeStars(
                    starCount = dto.starCount,
                )
            }
            is PaymentFormTypeDto.StarSubscription -> {
                return TdApi.PaymentFormTypeStarSubscription(
                    pricing = map(dto.pricing),
                )
            }
        }
    }

    fun map(dto: TdApi.PaymentProvider): PaymentProviderDto {
        when(dto) {
            is TdApi.PaymentProviderSmartGlocal -> {
                return PaymentProviderDto.SmartGlocal(
                    publicToken = dto.publicToken,
                    tokenizeUrl = dto.tokenizeUrl,
                )
            }
            is TdApi.PaymentProviderStripe -> {
                return PaymentProviderDto.Stripe(
                    publishableKey = dto.publishableKey,
                    needCountry = dto.needCountry,
                    needPostalCode = dto.needPostalCode,
                    needCardholderName = dto.needCardholderName,
                )
            }
            is TdApi.PaymentProviderOther -> {
                return PaymentProviderDto.Other(
                    url = dto.url,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PaymentProviderDto): TdApi.PaymentProvider {
        when(dto) {
            is PaymentProviderDto.SmartGlocal -> {
                return TdApi.PaymentProviderSmartGlocal(
                    publicToken = dto.publicToken,
                    tokenizeUrl = dto.tokenizeUrl,
                )
            }
            is PaymentProviderDto.Stripe -> {
                return TdApi.PaymentProviderStripe(
                    publishableKey = dto.publishableKey,
                    needCountry = dto.needCountry,
                    needPostalCode = dto.needPostalCode,
                    needCardholderName = dto.needCardholderName,
                )
            }
            is PaymentProviderDto.Other -> {
                return TdApi.PaymentProviderOther(
                    url = dto.url,
                )
            }
        }
    }

    fun map(dto: TdApi.PaymentReceiptType): PaymentReceiptTypeDto {
        when(dto) {
            is TdApi.PaymentReceiptTypeRegular -> {
                return PaymentReceiptTypeDto.Regular(
                    paymentProviderUserId = dto.paymentProviderUserId,
                    invoice = map(dto.invoice),
                    orderInfo = dto.orderInfo?.let { map(it) },
                    shippingOption = dto.shippingOption?.let { map(it) },
                    credentialsTitle = dto.credentialsTitle,
                    tipAmount = dto.tipAmount,
                )
            }
            is TdApi.PaymentReceiptTypeStars -> {
                return PaymentReceiptTypeDto.Stars(
                    starCount = dto.starCount,
                    transactionId = dto.transactionId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PaymentReceiptTypeDto): TdApi.PaymentReceiptType {
        when(dto) {
            is PaymentReceiptTypeDto.Regular -> {
                return TdApi.PaymentReceiptTypeRegular(
                    paymentProviderUserId = dto.paymentProviderUserId,
                    invoice = map(dto.invoice),
                    orderInfo = dto.orderInfo?.let { map(it) },
                    shippingOption = dto.shippingOption?.let { map(it) },
                    credentialsTitle = dto.credentialsTitle,
                    tipAmount = dto.tipAmount,
                )
            }
            is PaymentReceiptTypeDto.Stars -> {
                return TdApi.PaymentReceiptTypeStars(
                    starCount = dto.starCount,
                    transactionId = dto.transactionId,
                )
            }
        }
    }

    fun map(dto: TdApi.PhoneNumberCodeType): PhoneNumberCodeTypeDto {
        when(dto) {
            is TdApi.PhoneNumberCodeTypeChange -> {
                return PhoneNumberCodeTypeDto.Change(
                )
            }
            is TdApi.PhoneNumberCodeTypeVerify -> {
                return PhoneNumberCodeTypeDto.Verify(
                )
            }
            is TdApi.PhoneNumberCodeTypeConfirmOwnership -> {
                return PhoneNumberCodeTypeDto.ConfirmOwnership(
                    hash = dto.hash,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PhoneNumberCodeTypeDto): TdApi.PhoneNumberCodeType {
        when(dto) {
            is PhoneNumberCodeTypeDto.Change -> {
                return TdApi.PhoneNumberCodeTypeChange(
                )
            }
            is PhoneNumberCodeTypeDto.Verify -> {
                return TdApi.PhoneNumberCodeTypeVerify(
                )
            }
            is PhoneNumberCodeTypeDto.ConfirmOwnership -> {
                return TdApi.PhoneNumberCodeTypeConfirmOwnership(
                    hash = dto.hash,
                )
            }
        }
    }

    fun map(dto: TdApi.PollType): PollTypeDto {
        when(dto) {
            is TdApi.PollTypeRegular -> {
                return PollTypeDto.Regular(
                    allowMultipleAnswers = dto.allowMultipleAnswers,
                )
            }
            is TdApi.PollTypeQuiz -> {
                return PollTypeDto.Quiz(
                    correctOptionId = dto.correctOptionId,
                    explanation = map(dto.explanation),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PollTypeDto): TdApi.PollType {
        when(dto) {
            is PollTypeDto.Regular -> {
                return TdApi.PollTypeRegular(
                    allowMultipleAnswers = dto.allowMultipleAnswers,
                )
            }
            is PollTypeDto.Quiz -> {
                return TdApi.PollTypeQuiz(
                    correctOptionId = dto.correctOptionId,
                    explanation = map(dto.explanation),
                )
            }
        }
    }

    fun map(dto: TdApi.PremiumFeature): PremiumFeatureDto {
        when(dto) {
            is TdApi.PremiumFeatureIncreasedLimits -> {
                return PremiumFeatureDto.IncreasedLimits(
                )
            }
            is TdApi.PremiumFeatureIncreasedUploadFileSize -> {
                return PremiumFeatureDto.IncreasedUploadFileSize(
                )
            }
            is TdApi.PremiumFeatureImprovedDownloadSpeed -> {
                return PremiumFeatureDto.ImprovedDownloadSpeed(
                )
            }
            is TdApi.PremiumFeatureVoiceRecognition -> {
                return PremiumFeatureDto.VoiceRecognition(
                )
            }
            is TdApi.PremiumFeatureDisabledAds -> {
                return PremiumFeatureDto.DisabledAds(
                )
            }
            is TdApi.PremiumFeatureUniqueReactions -> {
                return PremiumFeatureDto.UniqueReactions(
                )
            }
            is TdApi.PremiumFeatureUniqueStickers -> {
                return PremiumFeatureDto.UniqueStickers(
                )
            }
            is TdApi.PremiumFeatureCustomEmoji -> {
                return PremiumFeatureDto.CustomEmoji(
                )
            }
            is TdApi.PremiumFeatureAdvancedChatManagement -> {
                return PremiumFeatureDto.AdvancedChatManagement(
                )
            }
            is TdApi.PremiumFeatureProfileBadge -> {
                return PremiumFeatureDto.ProfileBadge(
                )
            }
            is TdApi.PremiumFeatureEmojiStatus -> {
                return PremiumFeatureDto.EmojiStatus(
                )
            }
            is TdApi.PremiumFeatureAnimatedProfilePhoto -> {
                return PremiumFeatureDto.AnimatedProfilePhoto(
                )
            }
            is TdApi.PremiumFeatureForumTopicIcon -> {
                return PremiumFeatureDto.ForumTopicIcon(
                )
            }
            is TdApi.PremiumFeatureAppIcons -> {
                return PremiumFeatureDto.AppIcons(
                )
            }
            is TdApi.PremiumFeatureRealTimeChatTranslation -> {
                return PremiumFeatureDto.RealTimeChatTranslation(
                )
            }
            is TdApi.PremiumFeatureUpgradedStories -> {
                return PremiumFeatureDto.UpgradedStories(
                )
            }
            is TdApi.PremiumFeatureChatBoost -> {
                return PremiumFeatureDto.ChatBoost(
                )
            }
            is TdApi.PremiumFeatureAccentColor -> {
                return PremiumFeatureDto.AccentColor(
                )
            }
            is TdApi.PremiumFeatureBackgroundForBoth -> {
                return PremiumFeatureDto.BackgroundForBoth(
                )
            }
            is TdApi.PremiumFeatureSavedMessagesTags -> {
                return PremiumFeatureDto.SavedMessagesTags(
                )
            }
            is TdApi.PremiumFeatureMessagePrivacy -> {
                return PremiumFeatureDto.MessagePrivacy(
                )
            }
            is TdApi.PremiumFeatureLastSeenTimes -> {
                return PremiumFeatureDto.LastSeenTimes(
                )
            }
            is TdApi.PremiumFeatureBusiness -> {
                return PremiumFeatureDto.Business(
                )
            }
            is TdApi.PremiumFeatureMessageEffects -> {
                return PremiumFeatureDto.MessageEffects(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PremiumFeatureDto): TdApi.PremiumFeature {
        when(dto) {
            is PremiumFeatureDto.IncreasedLimits -> {
                return TdApi.PremiumFeatureIncreasedLimits(
                )
            }
            is PremiumFeatureDto.IncreasedUploadFileSize -> {
                return TdApi.PremiumFeatureIncreasedUploadFileSize(
                )
            }
            is PremiumFeatureDto.ImprovedDownloadSpeed -> {
                return TdApi.PremiumFeatureImprovedDownloadSpeed(
                )
            }
            is PremiumFeatureDto.VoiceRecognition -> {
                return TdApi.PremiumFeatureVoiceRecognition(
                )
            }
            is PremiumFeatureDto.DisabledAds -> {
                return TdApi.PremiumFeatureDisabledAds(
                )
            }
            is PremiumFeatureDto.UniqueReactions -> {
                return TdApi.PremiumFeatureUniqueReactions(
                )
            }
            is PremiumFeatureDto.UniqueStickers -> {
                return TdApi.PremiumFeatureUniqueStickers(
                )
            }
            is PremiumFeatureDto.CustomEmoji -> {
                return TdApi.PremiumFeatureCustomEmoji(
                )
            }
            is PremiumFeatureDto.AdvancedChatManagement -> {
                return TdApi.PremiumFeatureAdvancedChatManagement(
                )
            }
            is PremiumFeatureDto.ProfileBadge -> {
                return TdApi.PremiumFeatureProfileBadge(
                )
            }
            is PremiumFeatureDto.EmojiStatus -> {
                return TdApi.PremiumFeatureEmojiStatus(
                )
            }
            is PremiumFeatureDto.AnimatedProfilePhoto -> {
                return TdApi.PremiumFeatureAnimatedProfilePhoto(
                )
            }
            is PremiumFeatureDto.ForumTopicIcon -> {
                return TdApi.PremiumFeatureForumTopicIcon(
                )
            }
            is PremiumFeatureDto.AppIcons -> {
                return TdApi.PremiumFeatureAppIcons(
                )
            }
            is PremiumFeatureDto.RealTimeChatTranslation -> {
                return TdApi.PremiumFeatureRealTimeChatTranslation(
                )
            }
            is PremiumFeatureDto.UpgradedStories -> {
                return TdApi.PremiumFeatureUpgradedStories(
                )
            }
            is PremiumFeatureDto.ChatBoost -> {
                return TdApi.PremiumFeatureChatBoost(
                )
            }
            is PremiumFeatureDto.AccentColor -> {
                return TdApi.PremiumFeatureAccentColor(
                )
            }
            is PremiumFeatureDto.BackgroundForBoth -> {
                return TdApi.PremiumFeatureBackgroundForBoth(
                )
            }
            is PremiumFeatureDto.SavedMessagesTags -> {
                return TdApi.PremiumFeatureSavedMessagesTags(
                )
            }
            is PremiumFeatureDto.MessagePrivacy -> {
                return TdApi.PremiumFeatureMessagePrivacy(
                )
            }
            is PremiumFeatureDto.LastSeenTimes -> {
                return TdApi.PremiumFeatureLastSeenTimes(
                )
            }
            is PremiumFeatureDto.Business -> {
                return TdApi.PremiumFeatureBusiness(
                )
            }
            is PremiumFeatureDto.MessageEffects -> {
                return TdApi.PremiumFeatureMessageEffects(
                )
            }
        }
    }

    fun map(dto: TdApi.PremiumLimitType): PremiumLimitTypeDto {
        when(dto) {
            is TdApi.PremiumLimitTypeSupergroupCount -> {
                return PremiumLimitTypeDto.SupergroupCount(
                )
            }
            is TdApi.PremiumLimitTypePinnedChatCount -> {
                return PremiumLimitTypeDto.PinnedChatCount(
                )
            }
            is TdApi.PremiumLimitTypeCreatedPublicChatCount -> {
                return PremiumLimitTypeDto.CreatedPublicChatCount(
                )
            }
            is TdApi.PremiumLimitTypeSavedAnimationCount -> {
                return PremiumLimitTypeDto.SavedAnimationCount(
                )
            }
            is TdApi.PremiumLimitTypeFavoriteStickerCount -> {
                return PremiumLimitTypeDto.FavoriteStickerCount(
                )
            }
            is TdApi.PremiumLimitTypeChatFolderCount -> {
                return PremiumLimitTypeDto.ChatFolderCount(
                )
            }
            is TdApi.PremiumLimitTypeChatFolderChosenChatCount -> {
                return PremiumLimitTypeDto.ChatFolderChosenChatCount(
                )
            }
            is TdApi.PremiumLimitTypePinnedArchivedChatCount -> {
                return PremiumLimitTypeDto.PinnedArchivedChatCount(
                )
            }
            is TdApi.PremiumLimitTypePinnedSavedMessagesTopicCount -> {
                return PremiumLimitTypeDto.PinnedSavedMessagesTopicCount(
                )
            }
            is TdApi.PremiumLimitTypeCaptionLength -> {
                return PremiumLimitTypeDto.CaptionLength(
                )
            }
            is TdApi.PremiumLimitTypeBioLength -> {
                return PremiumLimitTypeDto.BioLength(
                )
            }
            is TdApi.PremiumLimitTypeChatFolderInviteLinkCount -> {
                return PremiumLimitTypeDto.ChatFolderInviteLinkCount(
                )
            }
            is TdApi.PremiumLimitTypeShareableChatFolderCount -> {
                return PremiumLimitTypeDto.ShareableChatFolderCount(
                )
            }
            is TdApi.PremiumLimitTypeActiveStoryCount -> {
                return PremiumLimitTypeDto.ActiveStoryCount(
                )
            }
            is TdApi.PremiumLimitTypeWeeklyPostedStoryCount -> {
                return PremiumLimitTypeDto.WeeklyPostedStoryCount(
                )
            }
            is TdApi.PremiumLimitTypeMonthlyPostedStoryCount -> {
                return PremiumLimitTypeDto.MonthlyPostedStoryCount(
                )
            }
            is TdApi.PremiumLimitTypeStoryCaptionLength -> {
                return PremiumLimitTypeDto.StoryCaptionLength(
                )
            }
            is TdApi.PremiumLimitTypeStorySuggestedReactionAreaCount -> {
                return PremiumLimitTypeDto.StorySuggestedReactionAreaCount(
                )
            }
            is TdApi.PremiumLimitTypeSimilarChatCount -> {
                return PremiumLimitTypeDto.SimilarChatCount(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PremiumLimitTypeDto): TdApi.PremiumLimitType {
        when(dto) {
            is PremiumLimitTypeDto.SupergroupCount -> {
                return TdApi.PremiumLimitTypeSupergroupCount(
                )
            }
            is PremiumLimitTypeDto.PinnedChatCount -> {
                return TdApi.PremiumLimitTypePinnedChatCount(
                )
            }
            is PremiumLimitTypeDto.CreatedPublicChatCount -> {
                return TdApi.PremiumLimitTypeCreatedPublicChatCount(
                )
            }
            is PremiumLimitTypeDto.SavedAnimationCount -> {
                return TdApi.PremiumLimitTypeSavedAnimationCount(
                )
            }
            is PremiumLimitTypeDto.FavoriteStickerCount -> {
                return TdApi.PremiumLimitTypeFavoriteStickerCount(
                )
            }
            is PremiumLimitTypeDto.ChatFolderCount -> {
                return TdApi.PremiumLimitTypeChatFolderCount(
                )
            }
            is PremiumLimitTypeDto.ChatFolderChosenChatCount -> {
                return TdApi.PremiumLimitTypeChatFolderChosenChatCount(
                )
            }
            is PremiumLimitTypeDto.PinnedArchivedChatCount -> {
                return TdApi.PremiumLimitTypePinnedArchivedChatCount(
                )
            }
            is PremiumLimitTypeDto.PinnedSavedMessagesTopicCount -> {
                return TdApi.PremiumLimitTypePinnedSavedMessagesTopicCount(
                )
            }
            is PremiumLimitTypeDto.CaptionLength -> {
                return TdApi.PremiumLimitTypeCaptionLength(
                )
            }
            is PremiumLimitTypeDto.BioLength -> {
                return TdApi.PremiumLimitTypeBioLength(
                )
            }
            is PremiumLimitTypeDto.ChatFolderInviteLinkCount -> {
                return TdApi.PremiumLimitTypeChatFolderInviteLinkCount(
                )
            }
            is PremiumLimitTypeDto.ShareableChatFolderCount -> {
                return TdApi.PremiumLimitTypeShareableChatFolderCount(
                )
            }
            is PremiumLimitTypeDto.ActiveStoryCount -> {
                return TdApi.PremiumLimitTypeActiveStoryCount(
                )
            }
            is PremiumLimitTypeDto.WeeklyPostedStoryCount -> {
                return TdApi.PremiumLimitTypeWeeklyPostedStoryCount(
                )
            }
            is PremiumLimitTypeDto.MonthlyPostedStoryCount -> {
                return TdApi.PremiumLimitTypeMonthlyPostedStoryCount(
                )
            }
            is PremiumLimitTypeDto.StoryCaptionLength -> {
                return TdApi.PremiumLimitTypeStoryCaptionLength(
                )
            }
            is PremiumLimitTypeDto.StorySuggestedReactionAreaCount -> {
                return TdApi.PremiumLimitTypeStorySuggestedReactionAreaCount(
                )
            }
            is PremiumLimitTypeDto.SimilarChatCount -> {
                return TdApi.PremiumLimitTypeSimilarChatCount(
                )
            }
        }
    }

    fun map(dto: TdApi.PremiumSource): PremiumSourceDto {
        when(dto) {
            is TdApi.PremiumSourceLimitExceeded -> {
                return PremiumSourceDto.LimitExceeded(
                    limitType = map(dto.limitType),
                )
            }
            is TdApi.PremiumSourceFeature -> {
                return PremiumSourceDto.Feature(
                    feature = map(dto.feature),
                )
            }
            is TdApi.PremiumSourceBusinessFeature -> {
                return PremiumSourceDto.BusinessFeature(
                    feature = dto.feature?.let { map(it) },
                )
            }
            is TdApi.PremiumSourceStoryFeature -> {
                return PremiumSourceDto.StoryFeature(
                    feature = map(dto.feature),
                )
            }
            is TdApi.PremiumSourceLink -> {
                return PremiumSourceDto.Link(
                    referrer = dto.referrer,
                )
            }
            is TdApi.PremiumSourceSettings -> {
                return PremiumSourceDto.Settings(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PremiumSourceDto): TdApi.PremiumSource {
        when(dto) {
            is PremiumSourceDto.LimitExceeded -> {
                return TdApi.PremiumSourceLimitExceeded(
                    limitType = map(dto.limitType),
                )
            }
            is PremiumSourceDto.Feature -> {
                return TdApi.PremiumSourceFeature(
                    feature = map(dto.feature),
                )
            }
            is PremiumSourceDto.BusinessFeature -> {
                return TdApi.PremiumSourceBusinessFeature(
                    feature = dto.feature?.let { map(it) },
                )
            }
            is PremiumSourceDto.StoryFeature -> {
                return TdApi.PremiumSourceStoryFeature(
                    feature = map(dto.feature),
                )
            }
            is PremiumSourceDto.Link -> {
                return TdApi.PremiumSourceLink(
                    referrer = dto.referrer,
                )
            }
            is PremiumSourceDto.Settings -> {
                return TdApi.PremiumSourceSettings(
                )
            }
        }
    }

    fun map(dto: TdApi.PremiumStoryFeature): PremiumStoryFeatureDto {
        when(dto) {
            is TdApi.PremiumStoryFeaturePriorityOrder -> {
                return PremiumStoryFeatureDto.PriorityOrder(
                )
            }
            is TdApi.PremiumStoryFeatureStealthMode -> {
                return PremiumStoryFeatureDto.StealthMode(
                )
            }
            is TdApi.PremiumStoryFeaturePermanentViewsHistory -> {
                return PremiumStoryFeatureDto.PermanentViewsHistory(
                )
            }
            is TdApi.PremiumStoryFeatureCustomExpirationDuration -> {
                return PremiumStoryFeatureDto.CustomExpirationDuration(
                )
            }
            is TdApi.PremiumStoryFeatureSaveStories -> {
                return PremiumStoryFeatureDto.SaveStories(
                )
            }
            is TdApi.PremiumStoryFeatureLinksAndFormatting -> {
                return PremiumStoryFeatureDto.LinksAndFormatting(
                )
            }
            is TdApi.PremiumStoryFeatureVideoQuality -> {
                return PremiumStoryFeatureDto.VideoQuality(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PremiumStoryFeatureDto): TdApi.PremiumStoryFeature {
        when(dto) {
            is PremiumStoryFeatureDto.PriorityOrder -> {
                return TdApi.PremiumStoryFeaturePriorityOrder(
                )
            }
            is PremiumStoryFeatureDto.StealthMode -> {
                return TdApi.PremiumStoryFeatureStealthMode(
                )
            }
            is PremiumStoryFeatureDto.PermanentViewsHistory -> {
                return TdApi.PremiumStoryFeaturePermanentViewsHistory(
                )
            }
            is PremiumStoryFeatureDto.CustomExpirationDuration -> {
                return TdApi.PremiumStoryFeatureCustomExpirationDuration(
                )
            }
            is PremiumStoryFeatureDto.SaveStories -> {
                return TdApi.PremiumStoryFeatureSaveStories(
                )
            }
            is PremiumStoryFeatureDto.LinksAndFormatting -> {
                return TdApi.PremiumStoryFeatureLinksAndFormatting(
                )
            }
            is PremiumStoryFeatureDto.VideoQuality -> {
                return TdApi.PremiumStoryFeatureVideoQuality(
                )
            }
        }
    }

    fun map(dto: TdApi.ProxyType): ProxyTypeDto {
        when(dto) {
            is TdApi.ProxyTypeSocks5 -> {
                return ProxyTypeDto.Socks5(
                    username = dto.username,
                    password = dto.password,
                )
            }
            is TdApi.ProxyTypeHttp -> {
                return ProxyTypeDto.Http(
                    username = dto.username,
                    password = dto.password,
                    httpOnly = dto.httpOnly,
                )
            }
            is TdApi.ProxyTypeMtproto -> {
                return ProxyTypeDto.Mtproto(
                    secret = dto.secret,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ProxyTypeDto): TdApi.ProxyType {
        when(dto) {
            is ProxyTypeDto.Socks5 -> {
                return TdApi.ProxyTypeSocks5(
                    username = dto.username,
                    password = dto.password,
                )
            }
            is ProxyTypeDto.Http -> {
                return TdApi.ProxyTypeHttp(
                    username = dto.username,
                    password = dto.password,
                    httpOnly = dto.httpOnly,
                )
            }
            is ProxyTypeDto.Mtproto -> {
                return TdApi.ProxyTypeMtproto(
                    secret = dto.secret,
                )
            }
        }
    }

    fun map(dto: TdApi.PublicChatType): PublicChatTypeDto {
        when(dto) {
            is TdApi.PublicChatTypeHasUsername -> {
                return PublicChatTypeDto.HasUsername(
                )
            }
            is TdApi.PublicChatTypeIsLocationBased -> {
                return PublicChatTypeDto.IsLocationBased(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PublicChatTypeDto): TdApi.PublicChatType {
        when(dto) {
            is PublicChatTypeDto.HasUsername -> {
                return TdApi.PublicChatTypeHasUsername(
                )
            }
            is PublicChatTypeDto.IsLocationBased -> {
                return TdApi.PublicChatTypeIsLocationBased(
                )
            }
        }
    }

    fun map(dto: TdApi.PublicForward): PublicForwardDto {
        when(dto) {
            is TdApi.PublicForwardMessage -> {
                return PublicForwardDto.Message(
                    message = map(dto.message),
                )
            }
            is TdApi.PublicForwardStory -> {
                return PublicForwardDto.Story(
                    story = map(dto.story),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PublicForwardDto): TdApi.PublicForward {
        when(dto) {
            is PublicForwardDto.Message -> {
                return TdApi.PublicForwardMessage(
                    message = map(dto.message),
                )
            }
            is PublicForwardDto.Story -> {
                return TdApi.PublicForwardStory(
                    story = map(dto.story),
                )
            }
        }
    }

    fun map(dto: TdApi.PushMessageContent): PushMessageContentDto {
        when(dto) {
            is TdApi.PushMessageContentHidden -> {
                return PushMessageContentDto.Hidden(
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentAnimation -> {
                return PushMessageContentDto.Animation(
                    animation = dto.animation?.let { map(it) },
                    caption = dto.caption,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentAudio -> {
                return PushMessageContentDto.Audio(
                    audio = dto.audio?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentContact -> {
                return PushMessageContentDto.Contact(
                    name = dto.name,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentContactRegistered -> {
                return PushMessageContentDto.ContactRegistered(
                )
            }
            is TdApi.PushMessageContentDocument -> {
                return PushMessageContentDto.Document(
                    document = dto.document?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentGame -> {
                return PushMessageContentDto.Game(
                    title = dto.title,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentGameScore -> {
                return PushMessageContentDto.GameScore(
                    title = dto.title,
                    score = dto.score,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentInvoice -> {
                return PushMessageContentDto.Invoice(
                    price = dto.price,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentLocation -> {
                return PushMessageContentDto.Location(
                    isLive = dto.isLive,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentPaidMedia -> {
                return PushMessageContentDto.PaidMedia(
                    starCount = dto.starCount,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentPhoto -> {
                return PushMessageContentDto.Photo(
                    photo = dto.photo?.let { map(it) },
                    caption = dto.caption,
                    isSecret = dto.isSecret,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentPoll -> {
                return PushMessageContentDto.Poll(
                    question = dto.question,
                    isRegular = dto.isRegular,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentPremiumGiftCode -> {
                return PushMessageContentDto.PremiumGiftCode(
                    monthCount = dto.monthCount,
                )
            }
            is TdApi.PushMessageContentGiveaway -> {
                return PushMessageContentDto.Giveaway(
                    winnerCount = dto.winnerCount,
                    prize = dto.prize?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentGift -> {
                return PushMessageContentDto.Gift(
                    starCount = dto.starCount,
                )
            }
            is TdApi.PushMessageContentUpgradedGift -> {
                return PushMessageContentDto.UpgradedGift(
                    isUpgrade = dto.isUpgrade,
                )
            }
            is TdApi.PushMessageContentScreenshotTaken -> {
                return PushMessageContentDto.ScreenshotTaken(
                )
            }
            is TdApi.PushMessageContentSticker -> {
                return PushMessageContentDto.Sticker(
                    sticker = dto.sticker?.let { map(it) },
                    emoji = dto.emoji,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentStory -> {
                return PushMessageContentDto.Story(
                    isMention = dto.isMention,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentText -> {
                return PushMessageContentDto.Text(
                    text = dto.text,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentVideo -> {
                return PushMessageContentDto.Video(
                    video = dto.video?.let { map(it) },
                    caption = dto.caption,
                    isSecret = dto.isSecret,
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentVideoNote -> {
                return PushMessageContentDto.VideoNote(
                    videoNote = dto.videoNote?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentVoiceNote -> {
                return PushMessageContentDto.VoiceNote(
                    voiceNote = dto.voiceNote?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is TdApi.PushMessageContentBasicGroupChatCreate -> {
                return PushMessageContentDto.BasicGroupChatCreate(
                )
            }
            is TdApi.PushMessageContentVideoChatStarted -> {
                return PushMessageContentDto.VideoChatStarted(
                )
            }
            is TdApi.PushMessageContentVideoChatEnded -> {
                return PushMessageContentDto.VideoChatEnded(
                )
            }
            is TdApi.PushMessageContentInviteVideoChatParticipants -> {
                return PushMessageContentDto.InviteVideoChatParticipants(
                    isCurrentUser = dto.isCurrentUser,
                )
            }
            is TdApi.PushMessageContentChatAddMembers -> {
                return PushMessageContentDto.ChatAddMembers(
                    memberName = dto.memberName,
                    isCurrentUser = dto.isCurrentUser,
                    isReturned = dto.isReturned,
                )
            }
            is TdApi.PushMessageContentChatChangePhoto -> {
                return PushMessageContentDto.ChatChangePhoto(
                )
            }
            is TdApi.PushMessageContentChatChangeTitle -> {
                return PushMessageContentDto.ChatChangeTitle(
                    title = dto.title,
                )
            }
            is TdApi.PushMessageContentChatSetBackground -> {
                return PushMessageContentDto.ChatSetBackground(
                    isSame = dto.isSame,
                )
            }
            is TdApi.PushMessageContentChatSetTheme -> {
                return PushMessageContentDto.ChatSetTheme(
                    themeName = dto.themeName,
                )
            }
            is TdApi.PushMessageContentChatDeleteMember -> {
                return PushMessageContentDto.ChatDeleteMember(
                    memberName = dto.memberName,
                    isCurrentUser = dto.isCurrentUser,
                    isLeft = dto.isLeft,
                )
            }
            is TdApi.PushMessageContentChatJoinByLink -> {
                return PushMessageContentDto.ChatJoinByLink(
                )
            }
            is TdApi.PushMessageContentChatJoinByRequest -> {
                return PushMessageContentDto.ChatJoinByRequest(
                )
            }
            is TdApi.PushMessageContentRecurringPayment -> {
                return PushMessageContentDto.RecurringPayment(
                    amount = dto.amount,
                )
            }
            is TdApi.PushMessageContentSuggestProfilePhoto -> {
                return PushMessageContentDto.SuggestProfilePhoto(
                )
            }
            is TdApi.PushMessageContentProximityAlertTriggered -> {
                return PushMessageContentDto.ProximityAlertTriggered(
                    distance = dto.distance,
                )
            }
            is TdApi.PushMessageContentMessageForwards -> {
                return PushMessageContentDto.MessageForwards(
                    totalCount = dto.totalCount,
                )
            }
            is TdApi.PushMessageContentMediaAlbum -> {
                return PushMessageContentDto.MediaAlbum(
                    totalCount = dto.totalCount,
                    hasPhotos = dto.hasPhotos,
                    hasVideos = dto.hasVideos,
                    hasAudios = dto.hasAudios,
                    hasDocuments = dto.hasDocuments,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: PushMessageContentDto): TdApi.PushMessageContent {
        when(dto) {
            is PushMessageContentDto.Hidden -> {
                return TdApi.PushMessageContentHidden(
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Animation -> {
                return TdApi.PushMessageContentAnimation(
                    animation = dto.animation?.let { map(it) },
                    caption = dto.caption,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Audio -> {
                return TdApi.PushMessageContentAudio(
                    audio = dto.audio?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Contact -> {
                return TdApi.PushMessageContentContact(
                    name = dto.name,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.ContactRegistered -> {
                return TdApi.PushMessageContentContactRegistered(
                )
            }
            is PushMessageContentDto.Document -> {
                return TdApi.PushMessageContentDocument(
                    document = dto.document?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Game -> {
                return TdApi.PushMessageContentGame(
                    title = dto.title,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.GameScore -> {
                return TdApi.PushMessageContentGameScore(
                    title = dto.title,
                    score = dto.score,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Invoice -> {
                return TdApi.PushMessageContentInvoice(
                    price = dto.price,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Location -> {
                return TdApi.PushMessageContentLocation(
                    isLive = dto.isLive,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.PaidMedia -> {
                return TdApi.PushMessageContentPaidMedia(
                    starCount = dto.starCount,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Photo -> {
                return TdApi.PushMessageContentPhoto(
                    photo = dto.photo?.let { map(it) },
                    caption = dto.caption,
                    isSecret = dto.isSecret,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Poll -> {
                return TdApi.PushMessageContentPoll(
                    question = dto.question,
                    isRegular = dto.isRegular,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.PremiumGiftCode -> {
                return TdApi.PushMessageContentPremiumGiftCode(
                    monthCount = dto.monthCount,
                )
            }
            is PushMessageContentDto.Giveaway -> {
                return TdApi.PushMessageContentGiveaway(
                    winnerCount = dto.winnerCount,
                    prize = dto.prize?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Gift -> {
                return TdApi.PushMessageContentGift(
                    starCount = dto.starCount,
                )
            }
            is PushMessageContentDto.UpgradedGift -> {
                return TdApi.PushMessageContentUpgradedGift(
                    isUpgrade = dto.isUpgrade,
                )
            }
            is PushMessageContentDto.ScreenshotTaken -> {
                return TdApi.PushMessageContentScreenshotTaken(
                )
            }
            is PushMessageContentDto.Sticker -> {
                return TdApi.PushMessageContentSticker(
                    sticker = dto.sticker?.let { map(it) },
                    emoji = dto.emoji,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Story -> {
                return TdApi.PushMessageContentStory(
                    isMention = dto.isMention,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Text -> {
                return TdApi.PushMessageContentText(
                    text = dto.text,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.Video -> {
                return TdApi.PushMessageContentVideo(
                    video = dto.video?.let { map(it) },
                    caption = dto.caption,
                    isSecret = dto.isSecret,
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.VideoNote -> {
                return TdApi.PushMessageContentVideoNote(
                    videoNote = dto.videoNote?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.VoiceNote -> {
                return TdApi.PushMessageContentVoiceNote(
                    voiceNote = dto.voiceNote?.let { map(it) },
                    isPinned = dto.isPinned,
                )
            }
            is PushMessageContentDto.BasicGroupChatCreate -> {
                return TdApi.PushMessageContentBasicGroupChatCreate(
                )
            }
            is PushMessageContentDto.VideoChatStarted -> {
                return TdApi.PushMessageContentVideoChatStarted(
                )
            }
            is PushMessageContentDto.VideoChatEnded -> {
                return TdApi.PushMessageContentVideoChatEnded(
                )
            }
            is PushMessageContentDto.InviteVideoChatParticipants -> {
                return TdApi.PushMessageContentInviteVideoChatParticipants(
                    isCurrentUser = dto.isCurrentUser,
                )
            }
            is PushMessageContentDto.ChatAddMembers -> {
                return TdApi.PushMessageContentChatAddMembers(
                    memberName = dto.memberName,
                    isCurrentUser = dto.isCurrentUser,
                    isReturned = dto.isReturned,
                )
            }
            is PushMessageContentDto.ChatChangePhoto -> {
                return TdApi.PushMessageContentChatChangePhoto(
                )
            }
            is PushMessageContentDto.ChatChangeTitle -> {
                return TdApi.PushMessageContentChatChangeTitle(
                    title = dto.title,
                )
            }
            is PushMessageContentDto.ChatSetBackground -> {
                return TdApi.PushMessageContentChatSetBackground(
                    isSame = dto.isSame,
                )
            }
            is PushMessageContentDto.ChatSetTheme -> {
                return TdApi.PushMessageContentChatSetTheme(
                    themeName = dto.themeName,
                )
            }
            is PushMessageContentDto.ChatDeleteMember -> {
                return TdApi.PushMessageContentChatDeleteMember(
                    memberName = dto.memberName,
                    isCurrentUser = dto.isCurrentUser,
                    isLeft = dto.isLeft,
                )
            }
            is PushMessageContentDto.ChatJoinByLink -> {
                return TdApi.PushMessageContentChatJoinByLink(
                )
            }
            is PushMessageContentDto.ChatJoinByRequest -> {
                return TdApi.PushMessageContentChatJoinByRequest(
                )
            }
            is PushMessageContentDto.RecurringPayment -> {
                return TdApi.PushMessageContentRecurringPayment(
                    amount = dto.amount,
                )
            }
            is PushMessageContentDto.SuggestProfilePhoto -> {
                return TdApi.PushMessageContentSuggestProfilePhoto(
                )
            }
            is PushMessageContentDto.ProximityAlertTriggered -> {
                return TdApi.PushMessageContentProximityAlertTriggered(
                    distance = dto.distance,
                )
            }
            is PushMessageContentDto.MessageForwards -> {
                return TdApi.PushMessageContentMessageForwards(
                    totalCount = dto.totalCount,
                )
            }
            is PushMessageContentDto.MediaAlbum -> {
                return TdApi.PushMessageContentMediaAlbum(
                    totalCount = dto.totalCount,
                    hasPhotos = dto.hasPhotos,
                    hasVideos = dto.hasVideos,
                    hasAudios = dto.hasAudios,
                    hasDocuments = dto.hasDocuments,
                )
            }
        }
    }

    fun map(dto: TdApi.ReactionNotificationSource): ReactionNotificationSourceDto {
        when(dto) {
            is TdApi.ReactionNotificationSourceNone -> {
                return ReactionNotificationSourceDto.None(
                )
            }
            is TdApi.ReactionNotificationSourceContacts -> {
                return ReactionNotificationSourceDto.Contacts(
                )
            }
            is TdApi.ReactionNotificationSourceAll -> {
                return ReactionNotificationSourceDto.All(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReactionNotificationSourceDto): TdApi.ReactionNotificationSource {
        when(dto) {
            is ReactionNotificationSourceDto.None -> {
                return TdApi.ReactionNotificationSourceNone(
                )
            }
            is ReactionNotificationSourceDto.Contacts -> {
                return TdApi.ReactionNotificationSourceContacts(
                )
            }
            is ReactionNotificationSourceDto.All -> {
                return TdApi.ReactionNotificationSourceAll(
                )
            }
        }
    }

    fun map(dto: TdApi.ReactionType): ReactionTypeDto {
        when(dto) {
            is TdApi.ReactionTypeEmoji -> {
                return ReactionTypeDto.Emoji(
                    emoji = dto.emoji,
                )
            }
            is TdApi.ReactionTypeCustomEmoji -> {
                return ReactionTypeDto.CustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            is TdApi.ReactionTypePaid -> {
                return ReactionTypeDto.Paid(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReactionTypeDto): TdApi.ReactionType {
        when(dto) {
            is ReactionTypeDto.Emoji -> {
                return TdApi.ReactionTypeEmoji(
                    emoji = dto.emoji,
                )
            }
            is ReactionTypeDto.CustomEmoji -> {
                return TdApi.ReactionTypeCustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            is ReactionTypeDto.Paid -> {
                return TdApi.ReactionTypePaid(
                )
            }
        }
    }

    fun map(dto: TdApi.ReactionUnavailabilityReason): ReactionUnavailabilityReasonDto {
        when(dto) {
            is TdApi.ReactionUnavailabilityReasonAnonymousAdministrator -> {
                return ReactionUnavailabilityReasonDto.AnonymousAdministrator(
                )
            }
            is TdApi.ReactionUnavailabilityReasonGuest -> {
                return ReactionUnavailabilityReasonDto.Guest(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReactionUnavailabilityReasonDto): TdApi.ReactionUnavailabilityReason {
        when(dto) {
            is ReactionUnavailabilityReasonDto.AnonymousAdministrator -> {
                return TdApi.ReactionUnavailabilityReasonAnonymousAdministrator(
                )
            }
            is ReactionUnavailabilityReasonDto.Guest -> {
                return TdApi.ReactionUnavailabilityReasonGuest(
                )
            }
        }
    }

    fun map(dto: TdApi.ReplyMarkup): ReplyMarkupDto {
        when(dto) {
            is TdApi.ReplyMarkupRemoveKeyboard -> {
                return ReplyMarkupDto.RemoveKeyboard(
                    isPersonal = dto.isPersonal,
                )
            }
            is TdApi.ReplyMarkupForceReply -> {
                return ReplyMarkupDto.ForceReply(
                    isPersonal = dto.isPersonal,
                    inputFieldPlaceholder = dto.inputFieldPlaceholder,
                )
            }
            is TdApi.ReplyMarkupShowKeyboard -> {
                return ReplyMarkupDto.ShowKeyboard(
                    rows = dto.rows.mapArrayOfArrays { map(it) },
                    isPersistent = dto.isPersistent,
                    resizeKeyboard = dto.resizeKeyboard,
                    oneTime = dto.oneTime,
                    isPersonal = dto.isPersonal,
                    inputFieldPlaceholder = dto.inputFieldPlaceholder,
                )
            }
            is TdApi.ReplyMarkupInlineKeyboard -> {
                return ReplyMarkupDto.InlineKeyboard(
                    rows = dto.rows.mapArrayOfArrays { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReplyMarkupDto): TdApi.ReplyMarkup {
        when(dto) {
            is ReplyMarkupDto.RemoveKeyboard -> {
                return TdApi.ReplyMarkupRemoveKeyboard(
                    isPersonal = dto.isPersonal,
                )
            }
            is ReplyMarkupDto.ForceReply -> {
                return TdApi.ReplyMarkupForceReply(
                    isPersonal = dto.isPersonal,
                    inputFieldPlaceholder = dto.inputFieldPlaceholder,
                )
            }
            is ReplyMarkupDto.ShowKeyboard -> {
                return TdApi.ReplyMarkupShowKeyboard(
                    rows = dto.rows.mapArrayOfArrays { map(it) },
                    isPersistent = dto.isPersistent,
                    resizeKeyboard = dto.resizeKeyboard,
                    oneTime = dto.oneTime,
                    isPersonal = dto.isPersonal,
                    inputFieldPlaceholder = dto.inputFieldPlaceholder,
                )
            }
            is ReplyMarkupDto.InlineKeyboard -> {
                return TdApi.ReplyMarkupInlineKeyboard(
                    rows = dto.rows.mapArrayOfArrays { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.ReportChatResult): ReportChatResultDto {
        when(dto) {
            is TdApi.ReportChatResultOk -> {
                return ReportChatResultDto.Ok(
                )
            }
            is TdApi.ReportChatResultOptionRequired -> {
                return ReportChatResultDto.OptionRequired(
                    title = dto.title,
                    options = dto.options.mapArray { map(it) },
                )
            }
            is TdApi.ReportChatResultTextRequired -> {
                return ReportChatResultDto.TextRequired(
                    optionId = dto.optionId,
                    isOptional = dto.isOptional,
                )
            }
            is TdApi.ReportChatResultMessagesRequired -> {
                return ReportChatResultDto.MessagesRequired(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReportChatResultDto): TdApi.ReportChatResult {
        when(dto) {
            is ReportChatResultDto.Ok -> {
                return TdApi.ReportChatResultOk(
                )
            }
            is ReportChatResultDto.OptionRequired -> {
                return TdApi.ReportChatResultOptionRequired(
                    title = dto.title,
                    options = dto.options.mapArray { map(it) },
                )
            }
            is ReportChatResultDto.TextRequired -> {
                return TdApi.ReportChatResultTextRequired(
                    optionId = dto.optionId,
                    isOptional = dto.isOptional,
                )
            }
            is ReportChatResultDto.MessagesRequired -> {
                return TdApi.ReportChatResultMessagesRequired(
                )
            }
        }
    }

    fun map(dto: TdApi.ReportReason): ReportReasonDto {
        when(dto) {
            is TdApi.ReportReasonSpam -> {
                return ReportReasonDto.Spam(
                )
            }
            is TdApi.ReportReasonViolence -> {
                return ReportReasonDto.Violence(
                )
            }
            is TdApi.ReportReasonPornography -> {
                return ReportReasonDto.Pornography(
                )
            }
            is TdApi.ReportReasonChildAbuse -> {
                return ReportReasonDto.ChildAbuse(
                )
            }
            is TdApi.ReportReasonCopyright -> {
                return ReportReasonDto.Copyright(
                )
            }
            is TdApi.ReportReasonUnrelatedLocation -> {
                return ReportReasonDto.UnrelatedLocation(
                )
            }
            is TdApi.ReportReasonFake -> {
                return ReportReasonDto.Fake(
                )
            }
            is TdApi.ReportReasonIllegalDrugs -> {
                return ReportReasonDto.IllegalDrugs(
                )
            }
            is TdApi.ReportReasonPersonalDetails -> {
                return ReportReasonDto.PersonalDetails(
                )
            }
            is TdApi.ReportReasonCustom -> {
                return ReportReasonDto.Custom(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReportReasonDto): TdApi.ReportReason {
        when(dto) {
            is ReportReasonDto.Spam -> {
                return TdApi.ReportReasonSpam(
                )
            }
            is ReportReasonDto.Violence -> {
                return TdApi.ReportReasonViolence(
                )
            }
            is ReportReasonDto.Pornography -> {
                return TdApi.ReportReasonPornography(
                )
            }
            is ReportReasonDto.ChildAbuse -> {
                return TdApi.ReportReasonChildAbuse(
                )
            }
            is ReportReasonDto.Copyright -> {
                return TdApi.ReportReasonCopyright(
                )
            }
            is ReportReasonDto.UnrelatedLocation -> {
                return TdApi.ReportReasonUnrelatedLocation(
                )
            }
            is ReportReasonDto.Fake -> {
                return TdApi.ReportReasonFake(
                )
            }
            is ReportReasonDto.IllegalDrugs -> {
                return TdApi.ReportReasonIllegalDrugs(
                )
            }
            is ReportReasonDto.PersonalDetails -> {
                return TdApi.ReportReasonPersonalDetails(
                )
            }
            is ReportReasonDto.Custom -> {
                return TdApi.ReportReasonCustom(
                )
            }
        }
    }

    fun map(dto: TdApi.ReportSponsoredResult): ReportSponsoredResultDto {
        when(dto) {
            is TdApi.ReportSponsoredResultOk -> {
                return ReportSponsoredResultDto.Ok(
                )
            }
            is TdApi.ReportSponsoredResultFailed -> {
                return ReportSponsoredResultDto.Failed(
                )
            }
            is TdApi.ReportSponsoredResultOptionRequired -> {
                return ReportSponsoredResultDto.OptionRequired(
                    title = dto.title,
                    options = dto.options.mapArray { map(it) },
                )
            }
            is TdApi.ReportSponsoredResultAdsHidden -> {
                return ReportSponsoredResultDto.AdsHidden(
                )
            }
            is TdApi.ReportSponsoredResultPremiumRequired -> {
                return ReportSponsoredResultDto.PremiumRequired(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReportSponsoredResultDto): TdApi.ReportSponsoredResult {
        when(dto) {
            is ReportSponsoredResultDto.Ok -> {
                return TdApi.ReportSponsoredResultOk(
                )
            }
            is ReportSponsoredResultDto.Failed -> {
                return TdApi.ReportSponsoredResultFailed(
                )
            }
            is ReportSponsoredResultDto.OptionRequired -> {
                return TdApi.ReportSponsoredResultOptionRequired(
                    title = dto.title,
                    options = dto.options.mapArray { map(it) },
                )
            }
            is ReportSponsoredResultDto.AdsHidden -> {
                return TdApi.ReportSponsoredResultAdsHidden(
                )
            }
            is ReportSponsoredResultDto.PremiumRequired -> {
                return TdApi.ReportSponsoredResultPremiumRequired(
                )
            }
        }
    }

    fun map(dto: TdApi.ReportStoryResult): ReportStoryResultDto {
        when(dto) {
            is TdApi.ReportStoryResultOk -> {
                return ReportStoryResultDto.Ok(
                )
            }
            is TdApi.ReportStoryResultOptionRequired -> {
                return ReportStoryResultDto.OptionRequired(
                    title = dto.title,
                    options = dto.options.mapArray { map(it) },
                )
            }
            is TdApi.ReportStoryResultTextRequired -> {
                return ReportStoryResultDto.TextRequired(
                    optionId = dto.optionId,
                    isOptional = dto.isOptional,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ReportStoryResultDto): TdApi.ReportStoryResult {
        when(dto) {
            is ReportStoryResultDto.Ok -> {
                return TdApi.ReportStoryResultOk(
                )
            }
            is ReportStoryResultDto.OptionRequired -> {
                return TdApi.ReportStoryResultOptionRequired(
                    title = dto.title,
                    options = dto.options.mapArray { map(it) },
                )
            }
            is ReportStoryResultDto.TextRequired -> {
                return TdApi.ReportStoryResultTextRequired(
                    optionId = dto.optionId,
                    isOptional = dto.isOptional,
                )
            }
        }
    }

    fun map(dto: TdApi.ResendCodeReason): ResendCodeReasonDto {
        when(dto) {
            is TdApi.ResendCodeReasonUserRequest -> {
                return ResendCodeReasonDto.UserRequest(
                )
            }
            is TdApi.ResendCodeReasonVerificationFailed -> {
                return ResendCodeReasonDto.VerificationFailed(
                    errorMessage = dto.errorMessage,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ResendCodeReasonDto): TdApi.ResendCodeReason {
        when(dto) {
            is ResendCodeReasonDto.UserRequest -> {
                return TdApi.ResendCodeReasonUserRequest(
                )
            }
            is ResendCodeReasonDto.VerificationFailed -> {
                return TdApi.ResendCodeReasonVerificationFailed(
                    errorMessage = dto.errorMessage,
                )
            }
        }
    }

    fun map(dto: TdApi.ResetPasswordResult): ResetPasswordResultDto {
        when(dto) {
            is TdApi.ResetPasswordResultOk -> {
                return ResetPasswordResultDto.Ok(
                )
            }
            is TdApi.ResetPasswordResultPending -> {
                return ResetPasswordResultDto.Pending(
                    pendingResetDate = dto.pendingResetDate,
                )
            }
            is TdApi.ResetPasswordResultDeclined -> {
                return ResetPasswordResultDto.Declined(
                    retryDate = dto.retryDate,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ResetPasswordResultDto): TdApi.ResetPasswordResult {
        when(dto) {
            is ResetPasswordResultDto.Ok -> {
                return TdApi.ResetPasswordResultOk(
                )
            }
            is ResetPasswordResultDto.Pending -> {
                return TdApi.ResetPasswordResultPending(
                    pendingResetDate = dto.pendingResetDate,
                )
            }
            is ResetPasswordResultDto.Declined -> {
                return TdApi.ResetPasswordResultDeclined(
                    retryDate = dto.retryDate,
                )
            }
        }
    }

    fun map(dto: TdApi.RevenueWithdrawalState): RevenueWithdrawalStateDto {
        when(dto) {
            is TdApi.RevenueWithdrawalStatePending -> {
                return RevenueWithdrawalStateDto.Pending(
                )
            }
            is TdApi.RevenueWithdrawalStateSucceeded -> {
                return RevenueWithdrawalStateDto.Succeeded(
                    date = dto.date,
                    url = dto.url,
                )
            }
            is TdApi.RevenueWithdrawalStateFailed -> {
                return RevenueWithdrawalStateDto.Failed(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: RevenueWithdrawalStateDto): TdApi.RevenueWithdrawalState {
        when(dto) {
            is RevenueWithdrawalStateDto.Pending -> {
                return TdApi.RevenueWithdrawalStatePending(
                )
            }
            is RevenueWithdrawalStateDto.Succeeded -> {
                return TdApi.RevenueWithdrawalStateSucceeded(
                    date = dto.date,
                    url = dto.url,
                )
            }
            is RevenueWithdrawalStateDto.Failed -> {
                return TdApi.RevenueWithdrawalStateFailed(
                )
            }
        }
    }

    fun map(dto: TdApi.RichText): RichTextDto {
        when(dto) {
            is TdApi.RichTextPlain -> {
                return RichTextDto.Plain(
                    text = dto.text,
                )
            }
            is TdApi.RichTextBold -> {
                return RichTextDto.Bold(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextItalic -> {
                return RichTextDto.Italic(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextUnderline -> {
                return RichTextDto.Underline(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextStrikethrough -> {
                return RichTextDto.Strikethrough(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextFixed -> {
                return RichTextDto.Fixed(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextUrl -> {
                return RichTextDto.Url(
                    text = map(dto.text),
                    url = dto.url,
                    isCached = dto.isCached,
                )
            }
            is TdApi.RichTextEmailAddress -> {
                return RichTextDto.EmailAddress(
                    text = map(dto.text),
                    emailAddress = dto.emailAddress,
                )
            }
            is TdApi.RichTextSubscript -> {
                return RichTextDto.Subscript(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextSuperscript -> {
                return RichTextDto.Superscript(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextMarked -> {
                return RichTextDto.Marked(
                    text = map(dto.text),
                )
            }
            is TdApi.RichTextPhoneNumber -> {
                return RichTextDto.PhoneNumber(
                    text = map(dto.text),
                    phoneNumber = dto.phoneNumber,
                )
            }
            is TdApi.RichTextIcon -> {
                return RichTextDto.Icon(
                    document = map(dto.document),
                    width = dto.width,
                    height = dto.height,
                )
            }
            is TdApi.RichTextReference -> {
                return RichTextDto.Reference(
                    text = map(dto.text),
                    anchorName = dto.anchorName,
                    url = dto.url,
                )
            }
            is TdApi.RichTextAnchor -> {
                return RichTextDto.Anchor(
                    name = dto.name,
                )
            }
            is TdApi.RichTextAnchorLink -> {
                return RichTextDto.AnchorLink(
                    text = map(dto.text),
                    anchorName = dto.anchorName,
                    url = dto.url,
                )
            }
            is TdApi.RichTexts -> {
                return RichTextDto.Texts(
                    texts = dto.texts.mapArray { map(it) },
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: RichTextDto): TdApi.RichText {
        when(dto) {
            is RichTextDto.Plain -> {
                return TdApi.RichTextPlain(
                    text = dto.text,
                )
            }
            is RichTextDto.Bold -> {
                return TdApi.RichTextBold(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Italic -> {
                return TdApi.RichTextItalic(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Underline -> {
                return TdApi.RichTextUnderline(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Strikethrough -> {
                return TdApi.RichTextStrikethrough(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Fixed -> {
                return TdApi.RichTextFixed(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Url -> {
                return TdApi.RichTextUrl(
                    text = map(dto.text),
                    url = dto.url,
                    isCached = dto.isCached,
                )
            }
            is RichTextDto.EmailAddress -> {
                return TdApi.RichTextEmailAddress(
                    text = map(dto.text),
                    emailAddress = dto.emailAddress,
                )
            }
            is RichTextDto.Subscript -> {
                return TdApi.RichTextSubscript(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Superscript -> {
                return TdApi.RichTextSuperscript(
                    text = map(dto.text),
                )
            }
            is RichTextDto.Marked -> {
                return TdApi.RichTextMarked(
                    text = map(dto.text),
                )
            }
            is RichTextDto.PhoneNumber -> {
                return TdApi.RichTextPhoneNumber(
                    text = map(dto.text),
                    phoneNumber = dto.phoneNumber,
                )
            }
            is RichTextDto.Icon -> {
                return TdApi.RichTextIcon(
                    document = map(dto.document),
                    width = dto.width,
                    height = dto.height,
                )
            }
            is RichTextDto.Reference -> {
                return TdApi.RichTextReference(
                    text = map(dto.text),
                    anchorName = dto.anchorName,
                    url = dto.url,
                )
            }
            is RichTextDto.Anchor -> {
                return TdApi.RichTextAnchor(
                    name = dto.name,
                )
            }
            is RichTextDto.AnchorLink -> {
                return TdApi.RichTextAnchorLink(
                    text = map(dto.text),
                    anchorName = dto.anchorName,
                    url = dto.url,
                )
            }
            is RichTextDto.Texts -> {
                return TdApi.RichTexts(
                    texts = dto.texts.mapArray { map(it) },
                )
            }
        }
    }

    fun map(dto: TdApi.SavedMessagesTopicType): SavedMessagesTopicTypeDto {
        when(dto) {
            is TdApi.SavedMessagesTopicTypeMyNotes -> {
                return SavedMessagesTopicTypeDto.MyNotes(
                )
            }
            is TdApi.SavedMessagesTopicTypeAuthorHidden -> {
                return SavedMessagesTopicTypeDto.AuthorHidden(
                )
            }
            is TdApi.SavedMessagesTopicTypeSavedFromChat -> {
                return SavedMessagesTopicTypeDto.SavedFromChat(
                    chatId = dto.chatId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SavedMessagesTopicTypeDto): TdApi.SavedMessagesTopicType {
        when(dto) {
            is SavedMessagesTopicTypeDto.MyNotes -> {
                return TdApi.SavedMessagesTopicTypeMyNotes(
                )
            }
            is SavedMessagesTopicTypeDto.AuthorHidden -> {
                return TdApi.SavedMessagesTopicTypeAuthorHidden(
                )
            }
            is SavedMessagesTopicTypeDto.SavedFromChat -> {
                return TdApi.SavedMessagesTopicTypeSavedFromChat(
                    chatId = dto.chatId,
                )
            }
        }
    }

    fun map(dto: TdApi.SearchMessagesChatTypeFilter): SearchMessagesChatTypeFilterDto {
        when(dto) {
            is TdApi.SearchMessagesChatTypeFilterPrivate -> {
                return SearchMessagesChatTypeFilterDto.Private(
                )
            }
            is TdApi.SearchMessagesChatTypeFilterGroup -> {
                return SearchMessagesChatTypeFilterDto.Group(
                )
            }
            is TdApi.SearchMessagesChatTypeFilterChannel -> {
                return SearchMessagesChatTypeFilterDto.Channel(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SearchMessagesChatTypeFilterDto): TdApi.SearchMessagesChatTypeFilter {
        when(dto) {
            is SearchMessagesChatTypeFilterDto.Private -> {
                return TdApi.SearchMessagesChatTypeFilterPrivate(
                )
            }
            is SearchMessagesChatTypeFilterDto.Group -> {
                return TdApi.SearchMessagesChatTypeFilterGroup(
                )
            }
            is SearchMessagesChatTypeFilterDto.Channel -> {
                return TdApi.SearchMessagesChatTypeFilterChannel(
                )
            }
        }
    }

    fun map(dto: TdApi.SearchMessagesFilter): SearchMessagesFilterDto {
        when(dto) {
            is TdApi.SearchMessagesFilterEmpty -> {
                return SearchMessagesFilterDto.Empty(
                )
            }
            is TdApi.SearchMessagesFilterAnimation -> {
                return SearchMessagesFilterDto.Animation(
                )
            }
            is TdApi.SearchMessagesFilterAudio -> {
                return SearchMessagesFilterDto.Audio(
                )
            }
            is TdApi.SearchMessagesFilterDocument -> {
                return SearchMessagesFilterDto.Document(
                )
            }
            is TdApi.SearchMessagesFilterPhoto -> {
                return SearchMessagesFilterDto.Photo(
                )
            }
            is TdApi.SearchMessagesFilterVideo -> {
                return SearchMessagesFilterDto.Video(
                )
            }
            is TdApi.SearchMessagesFilterVoiceNote -> {
                return SearchMessagesFilterDto.VoiceNote(
                )
            }
            is TdApi.SearchMessagesFilterPhotoAndVideo -> {
                return SearchMessagesFilterDto.PhotoAndVideo(
                )
            }
            is TdApi.SearchMessagesFilterUrl -> {
                return SearchMessagesFilterDto.Url(
                )
            }
            is TdApi.SearchMessagesFilterChatPhoto -> {
                return SearchMessagesFilterDto.ChatPhoto(
                )
            }
            is TdApi.SearchMessagesFilterVideoNote -> {
                return SearchMessagesFilterDto.VideoNote(
                )
            }
            is TdApi.SearchMessagesFilterVoiceAndVideoNote -> {
                return SearchMessagesFilterDto.VoiceAndVideoNote(
                )
            }
            is TdApi.SearchMessagesFilterMention -> {
                return SearchMessagesFilterDto.Mention(
                )
            }
            is TdApi.SearchMessagesFilterUnreadMention -> {
                return SearchMessagesFilterDto.UnreadMention(
                )
            }
            is TdApi.SearchMessagesFilterUnreadReaction -> {
                return SearchMessagesFilterDto.UnreadReaction(
                )
            }
            is TdApi.SearchMessagesFilterFailedToSend -> {
                return SearchMessagesFilterDto.FailedToSend(
                )
            }
            is TdApi.SearchMessagesFilterPinned -> {
                return SearchMessagesFilterDto.Pinned(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SearchMessagesFilterDto): TdApi.SearchMessagesFilter {
        when(dto) {
            is SearchMessagesFilterDto.Empty -> {
                return TdApi.SearchMessagesFilterEmpty(
                )
            }
            is SearchMessagesFilterDto.Animation -> {
                return TdApi.SearchMessagesFilterAnimation(
                )
            }
            is SearchMessagesFilterDto.Audio -> {
                return TdApi.SearchMessagesFilterAudio(
                )
            }
            is SearchMessagesFilterDto.Document -> {
                return TdApi.SearchMessagesFilterDocument(
                )
            }
            is SearchMessagesFilterDto.Photo -> {
                return TdApi.SearchMessagesFilterPhoto(
                )
            }
            is SearchMessagesFilterDto.Video -> {
                return TdApi.SearchMessagesFilterVideo(
                )
            }
            is SearchMessagesFilterDto.VoiceNote -> {
                return TdApi.SearchMessagesFilterVoiceNote(
                )
            }
            is SearchMessagesFilterDto.PhotoAndVideo -> {
                return TdApi.SearchMessagesFilterPhotoAndVideo(
                )
            }
            is SearchMessagesFilterDto.Url -> {
                return TdApi.SearchMessagesFilterUrl(
                )
            }
            is SearchMessagesFilterDto.ChatPhoto -> {
                return TdApi.SearchMessagesFilterChatPhoto(
                )
            }
            is SearchMessagesFilterDto.VideoNote -> {
                return TdApi.SearchMessagesFilterVideoNote(
                )
            }
            is SearchMessagesFilterDto.VoiceAndVideoNote -> {
                return TdApi.SearchMessagesFilterVoiceAndVideoNote(
                )
            }
            is SearchMessagesFilterDto.Mention -> {
                return TdApi.SearchMessagesFilterMention(
                )
            }
            is SearchMessagesFilterDto.UnreadMention -> {
                return TdApi.SearchMessagesFilterUnreadMention(
                )
            }
            is SearchMessagesFilterDto.UnreadReaction -> {
                return TdApi.SearchMessagesFilterUnreadReaction(
                )
            }
            is SearchMessagesFilterDto.FailedToSend -> {
                return TdApi.SearchMessagesFilterFailedToSend(
                )
            }
            is SearchMessagesFilterDto.Pinned -> {
                return TdApi.SearchMessagesFilterPinned(
                )
            }
        }
    }

    fun map(dto: TdApi.SecretChatState): SecretChatStateDto {
        when(dto) {
            is TdApi.SecretChatStatePending -> {
                return SecretChatStateDto.Pending(
                )
            }
            is TdApi.SecretChatStateReady -> {
                return SecretChatStateDto.Ready(
                )
            }
            is TdApi.SecretChatStateClosed -> {
                return SecretChatStateDto.Closed(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SecretChatStateDto): TdApi.SecretChatState {
        when(dto) {
            is SecretChatStateDto.Pending -> {
                return TdApi.SecretChatStatePending(
                )
            }
            is SecretChatStateDto.Ready -> {
                return TdApi.SecretChatStateReady(
                )
            }
            is SecretChatStateDto.Closed -> {
                return TdApi.SecretChatStateClosed(
                )
            }
        }
    }

    fun map(dto: TdApi.SentGift): SentGiftDto {
        when(dto) {
            is TdApi.SentGiftRegular -> {
                return SentGiftDto.Regular(
                    gift = map(dto.gift),
                )
            }
            is TdApi.SentGiftUpgraded -> {
                return SentGiftDto.Upgraded(
                    gift = map(dto.gift),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SentGiftDto): TdApi.SentGift {
        when(dto) {
            is SentGiftDto.Regular -> {
                return TdApi.SentGiftRegular(
                    gift = map(dto.gift),
                )
            }
            is SentGiftDto.Upgraded -> {
                return TdApi.SentGiftUpgraded(
                    gift = map(dto.gift),
                )
            }
        }
    }

    fun map(dto: TdApi.SessionType): SessionTypeDto {
        when(dto) {
            is TdApi.SessionTypeAndroid -> {
                return SessionTypeDto.Android(
                )
            }
            is TdApi.SessionTypeApple -> {
                return SessionTypeDto.Apple(
                )
            }
            is TdApi.SessionTypeBrave -> {
                return SessionTypeDto.Brave(
                )
            }
            is TdApi.SessionTypeChrome -> {
                return SessionTypeDto.Chrome(
                )
            }
            is TdApi.SessionTypeEdge -> {
                return SessionTypeDto.Edge(
                )
            }
            is TdApi.SessionTypeFirefox -> {
                return SessionTypeDto.Firefox(
                )
            }
            is TdApi.SessionTypeIpad -> {
                return SessionTypeDto.Ipad(
                )
            }
            is TdApi.SessionTypeIphone -> {
                return SessionTypeDto.Iphone(
                )
            }
            is TdApi.SessionTypeLinux -> {
                return SessionTypeDto.Linux(
                )
            }
            is TdApi.SessionTypeMac -> {
                return SessionTypeDto.Mac(
                )
            }
            is TdApi.SessionTypeOpera -> {
                return SessionTypeDto.Opera(
                )
            }
            is TdApi.SessionTypeSafari -> {
                return SessionTypeDto.Safari(
                )
            }
            is TdApi.SessionTypeUbuntu -> {
                return SessionTypeDto.Ubuntu(
                )
            }
            is TdApi.SessionTypeUnknown -> {
                return SessionTypeDto.Unknown(
                )
            }
            is TdApi.SessionTypeVivaldi -> {
                return SessionTypeDto.Vivaldi(
                )
            }
            is TdApi.SessionTypeWindows -> {
                return SessionTypeDto.Windows(
                )
            }
            is TdApi.SessionTypeXbox -> {
                return SessionTypeDto.Xbox(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SessionTypeDto): TdApi.SessionType {
        when(dto) {
            is SessionTypeDto.Android -> {
                return TdApi.SessionTypeAndroid(
                )
            }
            is SessionTypeDto.Apple -> {
                return TdApi.SessionTypeApple(
                )
            }
            is SessionTypeDto.Brave -> {
                return TdApi.SessionTypeBrave(
                )
            }
            is SessionTypeDto.Chrome -> {
                return TdApi.SessionTypeChrome(
                )
            }
            is SessionTypeDto.Edge -> {
                return TdApi.SessionTypeEdge(
                )
            }
            is SessionTypeDto.Firefox -> {
                return TdApi.SessionTypeFirefox(
                )
            }
            is SessionTypeDto.Ipad -> {
                return TdApi.SessionTypeIpad(
                )
            }
            is SessionTypeDto.Iphone -> {
                return TdApi.SessionTypeIphone(
                )
            }
            is SessionTypeDto.Linux -> {
                return TdApi.SessionTypeLinux(
                )
            }
            is SessionTypeDto.Mac -> {
                return TdApi.SessionTypeMac(
                )
            }
            is SessionTypeDto.Opera -> {
                return TdApi.SessionTypeOpera(
                )
            }
            is SessionTypeDto.Safari -> {
                return TdApi.SessionTypeSafari(
                )
            }
            is SessionTypeDto.Ubuntu -> {
                return TdApi.SessionTypeUbuntu(
                )
            }
            is SessionTypeDto.Unknown -> {
                return TdApi.SessionTypeUnknown(
                )
            }
            is SessionTypeDto.Vivaldi -> {
                return TdApi.SessionTypeVivaldi(
                )
            }
            is SessionTypeDto.Windows -> {
                return TdApi.SessionTypeWindows(
                )
            }
            is SessionTypeDto.Xbox -> {
                return TdApi.SessionTypeXbox(
                )
            }
        }
    }

    fun map(dto: TdApi.SpeechRecognitionResult): SpeechRecognitionResultDto {
        when(dto) {
            is TdApi.SpeechRecognitionResultPending -> {
                return SpeechRecognitionResultDto.Pending(
                    partialText = dto.partialText,
                )
            }
            is TdApi.SpeechRecognitionResultText -> {
                return SpeechRecognitionResultDto.Text(
                    text = dto.text,
                )
            }
            is TdApi.SpeechRecognitionResultError -> {
                return SpeechRecognitionResultDto.Error(
                    error = map(dto.error),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SpeechRecognitionResultDto): TdApi.SpeechRecognitionResult {
        when(dto) {
            is SpeechRecognitionResultDto.Pending -> {
                return TdApi.SpeechRecognitionResultPending(
                    partialText = dto.partialText,
                )
            }
            is SpeechRecognitionResultDto.Text -> {
                return TdApi.SpeechRecognitionResultText(
                    text = dto.text,
                )
            }
            is SpeechRecognitionResultDto.Error -> {
                return TdApi.SpeechRecognitionResultError(
                    error = map(dto.error),
                )
            }
        }
    }

    fun map(dto: TdApi.StarSubscriptionType): StarSubscriptionTypeDto {
        when(dto) {
            is TdApi.StarSubscriptionTypeChannel -> {
                return StarSubscriptionTypeDto.Channel(
                    canReuse = dto.canReuse,
                    inviteLink = dto.inviteLink,
                )
            }
            is TdApi.StarSubscriptionTypeBot -> {
                return StarSubscriptionTypeDto.Bot(
                    isCanceledByBot = dto.isCanceledByBot,
                    title = dto.title,
                    photo = map(dto.photo),
                    invoiceLink = dto.invoiceLink,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StarSubscriptionTypeDto): TdApi.StarSubscriptionType {
        when(dto) {
            is StarSubscriptionTypeDto.Channel -> {
                return TdApi.StarSubscriptionTypeChannel(
                    canReuse = dto.canReuse,
                    inviteLink = dto.inviteLink,
                )
            }
            is StarSubscriptionTypeDto.Bot -> {
                return TdApi.StarSubscriptionTypeBot(
                    isCanceledByBot = dto.isCanceledByBot,
                    title = dto.title,
                    photo = map(dto.photo),
                    invoiceLink = dto.invoiceLink,
                )
            }
        }
    }

    fun map(dto: TdApi.StarTransactionDirection): StarTransactionDirectionDto {
        when(dto) {
            is TdApi.StarTransactionDirectionIncoming -> {
                return StarTransactionDirectionDto.Incoming(
                )
            }
            is TdApi.StarTransactionDirectionOutgoing -> {
                return StarTransactionDirectionDto.Outgoing(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StarTransactionDirectionDto): TdApi.StarTransactionDirection {
        when(dto) {
            is StarTransactionDirectionDto.Incoming -> {
                return TdApi.StarTransactionDirectionIncoming(
                )
            }
            is StarTransactionDirectionDto.Outgoing -> {
                return TdApi.StarTransactionDirectionOutgoing(
                )
            }
        }
    }

    fun map(dto: TdApi.StarTransactionType): StarTransactionTypeDto {
        when(dto) {
            is TdApi.StarTransactionTypePremiumBotDeposit -> {
                return StarTransactionTypeDto.PremiumBotDeposit(
                )
            }
            is TdApi.StarTransactionTypeAppStoreDeposit -> {
                return StarTransactionTypeDto.AppStoreDeposit(
                )
            }
            is TdApi.StarTransactionTypeGooglePlayDeposit -> {
                return StarTransactionTypeDto.GooglePlayDeposit(
                )
            }
            is TdApi.StarTransactionTypeFragmentDeposit -> {
                return StarTransactionTypeDto.FragmentDeposit(
                )
            }
            is TdApi.StarTransactionTypeUserDeposit -> {
                return StarTransactionTypeDto.UserDeposit(
                    userId = dto.userId,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is TdApi.StarTransactionTypeGiveawayDeposit -> {
                return StarTransactionTypeDto.GiveawayDeposit(
                    chatId = dto.chatId,
                    giveawayMessageId = dto.giveawayMessageId,
                )
            }
            is TdApi.StarTransactionTypeFragmentWithdrawal -> {
                return StarTransactionTypeDto.FragmentWithdrawal(
                    withdrawalState = dto.withdrawalState?.let { map(it) },
                )
            }
            is TdApi.StarTransactionTypeTelegramAdsWithdrawal -> {
                return StarTransactionTypeDto.TelegramAdsWithdrawal(
                )
            }
            is TdApi.StarTransactionTypeTelegramApiUsage -> {
                return StarTransactionTypeDto.TelegramApiUsage(
                    requestCount = dto.requestCount,
                )
            }
            is TdApi.StarTransactionTypeBotPaidMediaPurchase -> {
                return StarTransactionTypeDto.BotPaidMediaPurchase(
                    userId = dto.userId,
                    media = dto.media.mapArray { map(it) },
                )
            }
            is TdApi.StarTransactionTypeBotPaidMediaSale -> {
                return StarTransactionTypeDto.BotPaidMediaSale(
                    userId = dto.userId,
                    media = dto.media.mapArray { map(it) },
                    payload = dto.payload,
                    affiliate = dto.affiliate?.let { map(it) },
                )
            }
            is TdApi.StarTransactionTypeChannelPaidMediaPurchase -> {
                return StarTransactionTypeDto.ChannelPaidMediaPurchase(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    media = dto.media.mapArray { map(it) },
                )
            }
            is TdApi.StarTransactionTypeChannelPaidMediaSale -> {
                return StarTransactionTypeDto.ChannelPaidMediaSale(
                    userId = dto.userId,
                    messageId = dto.messageId,
                    media = dto.media.mapArray { map(it) },
                )
            }
            is TdApi.StarTransactionTypeBotInvoicePurchase -> {
                return StarTransactionTypeDto.BotInvoicePurchase(
                    userId = dto.userId,
                    productInfo = map(dto.productInfo),
                )
            }
            is TdApi.StarTransactionTypeBotInvoiceSale -> {
                return StarTransactionTypeDto.BotInvoiceSale(
                    userId = dto.userId,
                    productInfo = map(dto.productInfo),
                    invoicePayload = dto.invoicePayload,
                    affiliate = dto.affiliate?.let { map(it) },
                )
            }
            is TdApi.StarTransactionTypeBotSubscriptionPurchase -> {
                return StarTransactionTypeDto.BotSubscriptionPurchase(
                    userId = dto.userId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                    productInfo = map(dto.productInfo),
                )
            }
            is TdApi.StarTransactionTypeBotSubscriptionSale -> {
                return StarTransactionTypeDto.BotSubscriptionSale(
                    userId = dto.userId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                    productInfo = map(dto.productInfo),
                    invoicePayload = dto.invoicePayload,
                    affiliate = dto.affiliate?.let { map(it) },
                )
            }
            is TdApi.StarTransactionTypeChannelSubscriptionPurchase -> {
                return StarTransactionTypeDto.ChannelSubscriptionPurchase(
                    chatId = dto.chatId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                )
            }
            is TdApi.StarTransactionTypeChannelSubscriptionSale -> {
                return StarTransactionTypeDto.ChannelSubscriptionSale(
                    userId = dto.userId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                )
            }
            is TdApi.StarTransactionTypeGiftPurchase -> {
                return StarTransactionTypeDto.GiftPurchase(
                    ownerId = map(dto.ownerId),
                    gift = map(dto.gift),
                )
            }
            is TdApi.StarTransactionTypeGiftTransfer -> {
                return StarTransactionTypeDto.GiftTransfer(
                    ownerId = map(dto.ownerId),
                    gift = map(dto.gift),
                )
            }
            is TdApi.StarTransactionTypeGiftSale -> {
                return StarTransactionTypeDto.GiftSale(
                    userId = dto.userId,
                    gift = map(dto.gift),
                )
            }
            is TdApi.StarTransactionTypeGiftUpgrade -> {
                return StarTransactionTypeDto.GiftUpgrade(
                    userId = dto.userId,
                    gift = map(dto.gift),
                )
            }
            is TdApi.StarTransactionTypeChannelPaidReactionSend -> {
                return StarTransactionTypeDto.ChannelPaidReactionSend(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is TdApi.StarTransactionTypeChannelPaidReactionReceive -> {
                return StarTransactionTypeDto.ChannelPaidReactionReceive(
                    userId = dto.userId,
                    messageId = dto.messageId,
                )
            }
            is TdApi.StarTransactionTypeAffiliateProgramCommission -> {
                return StarTransactionTypeDto.AffiliateProgramCommission(
                    chatId = dto.chatId,
                    commissionPerMille = dto.commissionPerMille,
                )
            }
            is TdApi.StarTransactionTypePaidMessageSend -> {
                return StarTransactionTypeDto.PaidMessageSend(
                    chatId = dto.chatId,
                    messageCount = dto.messageCount,
                )
            }
            is TdApi.StarTransactionTypePaidMessageReceive -> {
                return StarTransactionTypeDto.PaidMessageReceive(
                    senderId = map(dto.senderId),
                    messageCount = dto.messageCount,
                    commissionPerMille = dto.commissionPerMille,
                    commissionStarAmount = map(dto.commissionStarAmount),
                )
            }
            is TdApi.StarTransactionTypePremiumPurchase -> {
                return StarTransactionTypeDto.PremiumPurchase(
                    userId = dto.userId,
                    monthCount = dto.monthCount,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is TdApi.StarTransactionTypeBusinessBotTransferSend -> {
                return StarTransactionTypeDto.BusinessBotTransferSend(
                    userId = dto.userId,
                )
            }
            is TdApi.StarTransactionTypeBusinessBotTransferReceive -> {
                return StarTransactionTypeDto.BusinessBotTransferReceive(
                    userId = dto.userId,
                )
            }
            is TdApi.StarTransactionTypeUnsupported -> {
                return StarTransactionTypeDto.Unsupported(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StarTransactionTypeDto): TdApi.StarTransactionType {
        when(dto) {
            is StarTransactionTypeDto.PremiumBotDeposit -> {
                return TdApi.StarTransactionTypePremiumBotDeposit(
                )
            }
            is StarTransactionTypeDto.AppStoreDeposit -> {
                return TdApi.StarTransactionTypeAppStoreDeposit(
                )
            }
            is StarTransactionTypeDto.GooglePlayDeposit -> {
                return TdApi.StarTransactionTypeGooglePlayDeposit(
                )
            }
            is StarTransactionTypeDto.FragmentDeposit -> {
                return TdApi.StarTransactionTypeFragmentDeposit(
                )
            }
            is StarTransactionTypeDto.UserDeposit -> {
                return TdApi.StarTransactionTypeUserDeposit(
                    userId = dto.userId,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is StarTransactionTypeDto.GiveawayDeposit -> {
                return TdApi.StarTransactionTypeGiveawayDeposit(
                    chatId = dto.chatId,
                    giveawayMessageId = dto.giveawayMessageId,
                )
            }
            is StarTransactionTypeDto.FragmentWithdrawal -> {
                return TdApi.StarTransactionTypeFragmentWithdrawal(
                    withdrawalState = dto.withdrawalState?.let { map(it) },
                )
            }
            is StarTransactionTypeDto.TelegramAdsWithdrawal -> {
                return TdApi.StarTransactionTypeTelegramAdsWithdrawal(
                )
            }
            is StarTransactionTypeDto.TelegramApiUsage -> {
                return TdApi.StarTransactionTypeTelegramApiUsage(
                    requestCount = dto.requestCount,
                )
            }
            is StarTransactionTypeDto.BotPaidMediaPurchase -> {
                return TdApi.StarTransactionTypeBotPaidMediaPurchase(
                    userId = dto.userId,
                    media = dto.media.mapArray { map(it) },
                )
            }
            is StarTransactionTypeDto.BotPaidMediaSale -> {
                return TdApi.StarTransactionTypeBotPaidMediaSale(
                    userId = dto.userId,
                    media = dto.media.mapArray { map(it) },
                    payload = dto.payload,
                    affiliate = dto.affiliate?.let { map(it) },
                )
            }
            is StarTransactionTypeDto.ChannelPaidMediaPurchase -> {
                return TdApi.StarTransactionTypeChannelPaidMediaPurchase(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                    media = dto.media.mapArray { map(it) },
                )
            }
            is StarTransactionTypeDto.ChannelPaidMediaSale -> {
                return TdApi.StarTransactionTypeChannelPaidMediaSale(
                    userId = dto.userId,
                    messageId = dto.messageId,
                    media = dto.media.mapArray { map(it) },
                )
            }
            is StarTransactionTypeDto.BotInvoicePurchase -> {
                return TdApi.StarTransactionTypeBotInvoicePurchase(
                    userId = dto.userId,
                    productInfo = map(dto.productInfo),
                )
            }
            is StarTransactionTypeDto.BotInvoiceSale -> {
                return TdApi.StarTransactionTypeBotInvoiceSale(
                    userId = dto.userId,
                    productInfo = map(dto.productInfo),
                    invoicePayload = dto.invoicePayload,
                    affiliate = dto.affiliate?.let { map(it) },
                )
            }
            is StarTransactionTypeDto.BotSubscriptionPurchase -> {
                return TdApi.StarTransactionTypeBotSubscriptionPurchase(
                    userId = dto.userId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                    productInfo = map(dto.productInfo),
                )
            }
            is StarTransactionTypeDto.BotSubscriptionSale -> {
                return TdApi.StarTransactionTypeBotSubscriptionSale(
                    userId = dto.userId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                    productInfo = map(dto.productInfo),
                    invoicePayload = dto.invoicePayload,
                    affiliate = dto.affiliate?.let { map(it) },
                )
            }
            is StarTransactionTypeDto.ChannelSubscriptionPurchase -> {
                return TdApi.StarTransactionTypeChannelSubscriptionPurchase(
                    chatId = dto.chatId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                )
            }
            is StarTransactionTypeDto.ChannelSubscriptionSale -> {
                return TdApi.StarTransactionTypeChannelSubscriptionSale(
                    userId = dto.userId,
                    subscriptionPeriod = dto.subscriptionPeriod,
                )
            }
            is StarTransactionTypeDto.GiftPurchase -> {
                return TdApi.StarTransactionTypeGiftPurchase(
                    ownerId = map(dto.ownerId),
                    gift = map(dto.gift),
                )
            }
            is StarTransactionTypeDto.GiftTransfer -> {
                return TdApi.StarTransactionTypeGiftTransfer(
                    ownerId = map(dto.ownerId),
                    gift = map(dto.gift),
                )
            }
            is StarTransactionTypeDto.GiftSale -> {
                return TdApi.StarTransactionTypeGiftSale(
                    userId = dto.userId,
                    gift = map(dto.gift),
                )
            }
            is StarTransactionTypeDto.GiftUpgrade -> {
                return TdApi.StarTransactionTypeGiftUpgrade(
                    userId = dto.userId,
                    gift = map(dto.gift),
                )
            }
            is StarTransactionTypeDto.ChannelPaidReactionSend -> {
                return TdApi.StarTransactionTypeChannelPaidReactionSend(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is StarTransactionTypeDto.ChannelPaidReactionReceive -> {
                return TdApi.StarTransactionTypeChannelPaidReactionReceive(
                    userId = dto.userId,
                    messageId = dto.messageId,
                )
            }
            is StarTransactionTypeDto.AffiliateProgramCommission -> {
                return TdApi.StarTransactionTypeAffiliateProgramCommission(
                    chatId = dto.chatId,
                    commissionPerMille = dto.commissionPerMille,
                )
            }
            is StarTransactionTypeDto.PaidMessageSend -> {
                return TdApi.StarTransactionTypePaidMessageSend(
                    chatId = dto.chatId,
                    messageCount = dto.messageCount,
                )
            }
            is StarTransactionTypeDto.PaidMessageReceive -> {
                return TdApi.StarTransactionTypePaidMessageReceive(
                    senderId = map(dto.senderId),
                    messageCount = dto.messageCount,
                    commissionPerMille = dto.commissionPerMille,
                    commissionStarAmount = map(dto.commissionStarAmount),
                )
            }
            is StarTransactionTypeDto.PremiumPurchase -> {
                return TdApi.StarTransactionTypePremiumPurchase(
                    userId = dto.userId,
                    monthCount = dto.monthCount,
                    sticker = dto.sticker?.let { map(it) },
                )
            }
            is StarTransactionTypeDto.BusinessBotTransferSend -> {
                return TdApi.StarTransactionTypeBusinessBotTransferSend(
                    userId = dto.userId,
                )
            }
            is StarTransactionTypeDto.BusinessBotTransferReceive -> {
                return TdApi.StarTransactionTypeBusinessBotTransferReceive(
                    userId = dto.userId,
                )
            }
            is StarTransactionTypeDto.Unsupported -> {
                return TdApi.StarTransactionTypeUnsupported(
                )
            }
        }
    }

    fun map(dto: TdApi.StatisticalGraph): StatisticalGraphDto {
        when(dto) {
            is TdApi.StatisticalGraphData -> {
                return StatisticalGraphDto.Data(
                    jsonData = dto.jsonData,
                    zoomToken = dto.zoomToken,
                )
            }
            is TdApi.StatisticalGraphAsync -> {
                return StatisticalGraphDto.Async(
                    token = dto.token,
                )
            }
            is TdApi.StatisticalGraphError -> {
                return StatisticalGraphDto.Error(
                    errorMessage = dto.errorMessage,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StatisticalGraphDto): TdApi.StatisticalGraph {
        when(dto) {
            is StatisticalGraphDto.Data -> {
                return TdApi.StatisticalGraphData(
                    jsonData = dto.jsonData,
                    zoomToken = dto.zoomToken,
                )
            }
            is StatisticalGraphDto.Async -> {
                return TdApi.StatisticalGraphAsync(
                    token = dto.token,
                )
            }
            is StatisticalGraphDto.Error -> {
                return TdApi.StatisticalGraphError(
                    errorMessage = dto.errorMessage,
                )
            }
        }
    }

    fun map(dto: TdApi.StickerFormat): StickerFormatDto {
        when(dto) {
            is TdApi.StickerFormatWebp -> {
                return StickerFormatDto.Webp(
                )
            }
            is TdApi.StickerFormatTgs -> {
                return StickerFormatDto.Tgs(
                )
            }
            is TdApi.StickerFormatWebm -> {
                return StickerFormatDto.Webm(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StickerFormatDto): TdApi.StickerFormat {
        when(dto) {
            is StickerFormatDto.Webp -> {
                return TdApi.StickerFormatWebp(
                )
            }
            is StickerFormatDto.Tgs -> {
                return TdApi.StickerFormatTgs(
                )
            }
            is StickerFormatDto.Webm -> {
                return TdApi.StickerFormatWebm(
                )
            }
        }
    }

    fun map(dto: TdApi.StickerFullType): StickerFullTypeDto {
        when(dto) {
            is TdApi.StickerFullTypeRegular -> {
                return StickerFullTypeDto.Regular(
                    premiumAnimation = dto.premiumAnimation?.let { map(it) },
                )
            }
            is TdApi.StickerFullTypeMask -> {
                return StickerFullTypeDto.Mask(
                    maskPosition = dto.maskPosition?.let { map(it) },
                )
            }
            is TdApi.StickerFullTypeCustomEmoji -> {
                return StickerFullTypeDto.CustomEmoji(
                    customEmojiId = dto.customEmojiId,
                    needsRepainting = dto.needsRepainting,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StickerFullTypeDto): TdApi.StickerFullType {
        when(dto) {
            is StickerFullTypeDto.Regular -> {
                return TdApi.StickerFullTypeRegular(
                    premiumAnimation = dto.premiumAnimation?.let { map(it) },
                )
            }
            is StickerFullTypeDto.Mask -> {
                return TdApi.StickerFullTypeMask(
                    maskPosition = dto.maskPosition?.let { map(it) },
                )
            }
            is StickerFullTypeDto.CustomEmoji -> {
                return TdApi.StickerFullTypeCustomEmoji(
                    customEmojiId = dto.customEmojiId,
                    needsRepainting = dto.needsRepainting,
                )
            }
        }
    }

    fun map(dto: TdApi.StickerType): StickerTypeDto {
        when(dto) {
            is TdApi.StickerTypeRegular -> {
                return StickerTypeDto.Regular(
                )
            }
            is TdApi.StickerTypeMask -> {
                return StickerTypeDto.Mask(
                )
            }
            is TdApi.StickerTypeCustomEmoji -> {
                return StickerTypeDto.CustomEmoji(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StickerTypeDto): TdApi.StickerType {
        when(dto) {
            is StickerTypeDto.Regular -> {
                return TdApi.StickerTypeRegular(
                )
            }
            is StickerTypeDto.Mask -> {
                return TdApi.StickerTypeMask(
                )
            }
            is StickerTypeDto.CustomEmoji -> {
                return TdApi.StickerTypeCustomEmoji(
                )
            }
        }
    }

    fun map(dto: TdApi.StorePaymentPurpose): StorePaymentPurposeDto {
        when(dto) {
            is TdApi.StorePaymentPurposePremiumSubscription -> {
                return StorePaymentPurposeDto.PremiumSubscription(
                    isRestore = dto.isRestore,
                    isUpgrade = dto.isUpgrade,
                )
            }
            is TdApi.StorePaymentPurposePremiumGift -> {
                return StorePaymentPurposeDto.PremiumGift(
                    currency = dto.currency,
                    amount = dto.amount,
                    userId = dto.userId,
                    text = map(dto.text),
                )
            }
            is TdApi.StorePaymentPurposePremiumGiftCodes -> {
                return StorePaymentPurposeDto.PremiumGiftCodes(
                    boostedChatId = dto.boostedChatId,
                    currency = dto.currency,
                    amount = dto.amount,
                    userIds = dto.userIds,
                    text = map(dto.text),
                )
            }
            is TdApi.StorePaymentPurposePremiumGiveaway -> {
                return StorePaymentPurposeDto.PremiumGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                )
            }
            is TdApi.StorePaymentPurposeStarGiveaway -> {
                return StorePaymentPurposeDto.StarGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                    winnerCount = dto.winnerCount,
                    starCount = dto.starCount,
                )
            }
            is TdApi.StorePaymentPurposeStars -> {
                return StorePaymentPurposeDto.Stars(
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            is TdApi.StorePaymentPurposeGiftedStars -> {
                return StorePaymentPurposeDto.GiftedStars(
                    userId = dto.userId,
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StorePaymentPurposeDto): TdApi.StorePaymentPurpose {
        when(dto) {
            is StorePaymentPurposeDto.PremiumSubscription -> {
                return TdApi.StorePaymentPurposePremiumSubscription(
                    isRestore = dto.isRestore,
                    isUpgrade = dto.isUpgrade,
                )
            }
            is StorePaymentPurposeDto.PremiumGift -> {
                return TdApi.StorePaymentPurposePremiumGift(
                    currency = dto.currency,
                    amount = dto.amount,
                    userId = dto.userId,
                    text = map(dto.text),
                )
            }
            is StorePaymentPurposeDto.PremiumGiftCodes -> {
                return TdApi.StorePaymentPurposePremiumGiftCodes(
                    boostedChatId = dto.boostedChatId,
                    currency = dto.currency,
                    amount = dto.amount,
                    userIds = dto.userIds,
                    text = map(dto.text),
                )
            }
            is StorePaymentPurposeDto.PremiumGiveaway -> {
                return TdApi.StorePaymentPurposePremiumGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                )
            }
            is StorePaymentPurposeDto.StarGiveaway -> {
                return TdApi.StorePaymentPurposeStarGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                    winnerCount = dto.winnerCount,
                    starCount = dto.starCount,
                )
            }
            is StorePaymentPurposeDto.Stars -> {
                return TdApi.StorePaymentPurposeStars(
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            is StorePaymentPurposeDto.GiftedStars -> {
                return TdApi.StorePaymentPurposeGiftedStars(
                    userId = dto.userId,
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
        }
    }

    fun map(dto: TdApi.StoreTransaction): StoreTransactionDto {
        when(dto) {
            is TdApi.StoreTransactionAppStore -> {
                return StoreTransactionDto.AppStore(
                    receipt = dto.receipt,
                )
            }
            is TdApi.StoreTransactionGooglePlay -> {
                return StoreTransactionDto.GooglePlay(
                    packageName = dto.packageName,
                    storeProductId = dto.storeProductId,
                    purchaseToken = dto.purchaseToken,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoreTransactionDto): TdApi.StoreTransaction {
        when(dto) {
            is StoreTransactionDto.AppStore -> {
                return TdApi.StoreTransactionAppStore(
                    receipt = dto.receipt,
                )
            }
            is StoreTransactionDto.GooglePlay -> {
                return TdApi.StoreTransactionGooglePlay(
                    packageName = dto.packageName,
                    storeProductId = dto.storeProductId,
                    purchaseToken = dto.purchaseToken,
                )
            }
        }
    }

    fun map(dto: TdApi.StoryAreaType): StoryAreaTypeDto {
        when(dto) {
            is TdApi.StoryAreaTypeLocation -> {
                return StoryAreaTypeDto.Location(
                    location = map(dto.location),
                    address = dto.address?.let { map(it) },
                )
            }
            is TdApi.StoryAreaTypeVenue -> {
                return StoryAreaTypeDto.Venue(
                    venue = map(dto.venue),
                )
            }
            is TdApi.StoryAreaTypeSuggestedReaction -> {
                return StoryAreaTypeDto.SuggestedReaction(
                    reactionType = map(dto.reactionType),
                    totalCount = dto.totalCount,
                    isDark = dto.isDark,
                    isFlipped = dto.isFlipped,
                )
            }
            is TdApi.StoryAreaTypeMessage -> {
                return StoryAreaTypeDto.Message(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is TdApi.StoryAreaTypeLink -> {
                return StoryAreaTypeDto.Link(
                    url = dto.url,
                )
            }
            is TdApi.StoryAreaTypeWeather -> {
                return StoryAreaTypeDto.Weather(
                    temperature = dto.temperature,
                    emoji = dto.emoji,
                    backgroundColor = dto.backgroundColor,
                )
            }
            is TdApi.StoryAreaTypeUpgradedGift -> {
                return StoryAreaTypeDto.UpgradedGift(
                    giftName = dto.giftName,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoryAreaTypeDto): TdApi.StoryAreaType {
        when(dto) {
            is StoryAreaTypeDto.Location -> {
                return TdApi.StoryAreaTypeLocation(
                    location = map(dto.location),
                    address = dto.address?.let { map(it) },
                )
            }
            is StoryAreaTypeDto.Venue -> {
                return TdApi.StoryAreaTypeVenue(
                    venue = map(dto.venue),
                )
            }
            is StoryAreaTypeDto.SuggestedReaction -> {
                return TdApi.StoryAreaTypeSuggestedReaction(
                    reactionType = map(dto.reactionType),
                    totalCount = dto.totalCount,
                    isDark = dto.isDark,
                    isFlipped = dto.isFlipped,
                )
            }
            is StoryAreaTypeDto.Message -> {
                return TdApi.StoryAreaTypeMessage(
                    chatId = dto.chatId,
                    messageId = dto.messageId,
                )
            }
            is StoryAreaTypeDto.Link -> {
                return TdApi.StoryAreaTypeLink(
                    url = dto.url,
                )
            }
            is StoryAreaTypeDto.Weather -> {
                return TdApi.StoryAreaTypeWeather(
                    temperature = dto.temperature,
                    emoji = dto.emoji,
                    backgroundColor = dto.backgroundColor,
                )
            }
            is StoryAreaTypeDto.UpgradedGift -> {
                return TdApi.StoryAreaTypeUpgradedGift(
                    giftName = dto.giftName,
                )
            }
        }
    }

    fun map(dto: TdApi.StoryContent): StoryContentDto {
        when(dto) {
            is TdApi.StoryContentPhoto -> {
                return StoryContentDto.Photo(
                    photo = map(dto.photo),
                )
            }
            is TdApi.StoryContentVideo -> {
                return StoryContentDto.Video(
                    video = map(dto.video),
                    alternativeVideo = dto.alternativeVideo?.let { map(it) },
                )
            }
            is TdApi.StoryContentUnsupported -> {
                return StoryContentDto.Unsupported(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoryContentDto): TdApi.StoryContent {
        when(dto) {
            is StoryContentDto.Photo -> {
                return TdApi.StoryContentPhoto(
                    photo = map(dto.photo),
                )
            }
            is StoryContentDto.Video -> {
                return TdApi.StoryContentVideo(
                    video = map(dto.video),
                    alternativeVideo = dto.alternativeVideo?.let { map(it) },
                )
            }
            is StoryContentDto.Unsupported -> {
                return TdApi.StoryContentUnsupported(
                )
            }
        }
    }

    fun map(dto: TdApi.StoryInteractionType): StoryInteractionTypeDto {
        when(dto) {
            is TdApi.StoryInteractionTypeView -> {
                return StoryInteractionTypeDto.View(
                    chosenReactionType = dto.chosenReactionType?.let { map(it) },
                )
            }
            is TdApi.StoryInteractionTypeForward -> {
                return StoryInteractionTypeDto.Forward(
                    message = map(dto.message),
                )
            }
            is TdApi.StoryInteractionTypeRepost -> {
                return StoryInteractionTypeDto.Repost(
                    story = map(dto.story),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoryInteractionTypeDto): TdApi.StoryInteractionType {
        when(dto) {
            is StoryInteractionTypeDto.View -> {
                return TdApi.StoryInteractionTypeView(
                    chosenReactionType = dto.chosenReactionType?.let { map(it) },
                )
            }
            is StoryInteractionTypeDto.Forward -> {
                return TdApi.StoryInteractionTypeForward(
                    message = map(dto.message),
                )
            }
            is StoryInteractionTypeDto.Repost -> {
                return TdApi.StoryInteractionTypeRepost(
                    story = map(dto.story),
                )
            }
        }
    }

    fun map(dto: TdApi.StoryList): StoryListDto {
        when(dto) {
            is TdApi.StoryListMain -> {
                return StoryListDto.Main(
                )
            }
            is TdApi.StoryListArchive -> {
                return StoryListDto.Archive(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoryListDto): TdApi.StoryList {
        when(dto) {
            is StoryListDto.Main -> {
                return TdApi.StoryListMain(
                )
            }
            is StoryListDto.Archive -> {
                return TdApi.StoryListArchive(
                )
            }
        }
    }

    fun map(dto: TdApi.StoryOrigin): StoryOriginDto {
        when(dto) {
            is TdApi.StoryOriginPublicStory -> {
                return StoryOriginDto.PublicStory(
                    chatId = dto.chatId,
                    storyId = dto.storyId,
                )
            }
            is TdApi.StoryOriginHiddenUser -> {
                return StoryOriginDto.HiddenUser(
                    posterName = dto.posterName,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoryOriginDto): TdApi.StoryOrigin {
        when(dto) {
            is StoryOriginDto.PublicStory -> {
                return TdApi.StoryOriginPublicStory(
                    chatId = dto.chatId,
                    storyId = dto.storyId,
                )
            }
            is StoryOriginDto.HiddenUser -> {
                return TdApi.StoryOriginHiddenUser(
                    posterName = dto.posterName,
                )
            }
        }
    }

    fun map(dto: TdApi.StoryPrivacySettings): StoryPrivacySettingsDto {
        when(dto) {
            is TdApi.StoryPrivacySettingsEveryone -> {
                return StoryPrivacySettingsDto.Everyone(
                    exceptUserIds = dto.exceptUserIds,
                )
            }
            is TdApi.StoryPrivacySettingsContacts -> {
                return StoryPrivacySettingsDto.Contacts(
                    exceptUserIds = dto.exceptUserIds,
                )
            }
            is TdApi.StoryPrivacySettingsCloseFriends -> {
                return StoryPrivacySettingsDto.CloseFriends(
                )
            }
            is TdApi.StoryPrivacySettingsSelectedUsers -> {
                return StoryPrivacySettingsDto.SelectedUsers(
                    userIds = dto.userIds,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: StoryPrivacySettingsDto): TdApi.StoryPrivacySettings {
        when(dto) {
            is StoryPrivacySettingsDto.Everyone -> {
                return TdApi.StoryPrivacySettingsEveryone(
                    exceptUserIds = dto.exceptUserIds,
                )
            }
            is StoryPrivacySettingsDto.Contacts -> {
                return TdApi.StoryPrivacySettingsContacts(
                    exceptUserIds = dto.exceptUserIds,
                )
            }
            is StoryPrivacySettingsDto.CloseFriends -> {
                return TdApi.StoryPrivacySettingsCloseFriends(
                )
            }
            is StoryPrivacySettingsDto.SelectedUsers -> {
                return TdApi.StoryPrivacySettingsSelectedUsers(
                    userIds = dto.userIds,
                )
            }
        }
    }

    fun map(dto: TdApi.SuggestedAction): SuggestedActionDto {
        when(dto) {
            is TdApi.SuggestedActionEnableArchiveAndMuteNewChats -> {
                return SuggestedActionDto.EnableArchiveAndMuteNewChats(
                )
            }
            is TdApi.SuggestedActionCheckPassword -> {
                return SuggestedActionDto.CheckPassword(
                )
            }
            is TdApi.SuggestedActionCheckPhoneNumber -> {
                return SuggestedActionDto.CheckPhoneNumber(
                )
            }
            is TdApi.SuggestedActionViewChecksHint -> {
                return SuggestedActionDto.ViewChecksHint(
                )
            }
            is TdApi.SuggestedActionConvertToBroadcastGroup -> {
                return SuggestedActionDto.ConvertToBroadcastGroup(
                    supergroupId = dto.supergroupId,
                )
            }
            is TdApi.SuggestedActionSetPassword -> {
                return SuggestedActionDto.SetPassword(
                    authorizationDelay = dto.authorizationDelay,
                )
            }
            is TdApi.SuggestedActionUpgradePremium -> {
                return SuggestedActionDto.UpgradePremium(
                )
            }
            is TdApi.SuggestedActionRestorePremium -> {
                return SuggestedActionDto.RestorePremium(
                )
            }
            is TdApi.SuggestedActionSubscribeToAnnualPremium -> {
                return SuggestedActionDto.SubscribeToAnnualPremium(
                )
            }
            is TdApi.SuggestedActionGiftPremiumForChristmas -> {
                return SuggestedActionDto.GiftPremiumForChristmas(
                )
            }
            is TdApi.SuggestedActionSetBirthdate -> {
                return SuggestedActionDto.SetBirthdate(
                )
            }
            is TdApi.SuggestedActionSetProfilePhoto -> {
                return SuggestedActionDto.SetProfilePhoto(
                )
            }
            is TdApi.SuggestedActionExtendPremium -> {
                return SuggestedActionDto.ExtendPremium(
                    managePremiumSubscriptionUrl = dto.managePremiumSubscriptionUrl,
                )
            }
            is TdApi.SuggestedActionExtendStarSubscriptions -> {
                return SuggestedActionDto.ExtendStarSubscriptions(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SuggestedActionDto): TdApi.SuggestedAction {
        when(dto) {
            is SuggestedActionDto.EnableArchiveAndMuteNewChats -> {
                return TdApi.SuggestedActionEnableArchiveAndMuteNewChats(
                )
            }
            is SuggestedActionDto.CheckPassword -> {
                return TdApi.SuggestedActionCheckPassword(
                )
            }
            is SuggestedActionDto.CheckPhoneNumber -> {
                return TdApi.SuggestedActionCheckPhoneNumber(
                )
            }
            is SuggestedActionDto.ViewChecksHint -> {
                return TdApi.SuggestedActionViewChecksHint(
                )
            }
            is SuggestedActionDto.ConvertToBroadcastGroup -> {
                return TdApi.SuggestedActionConvertToBroadcastGroup(
                    supergroupId = dto.supergroupId,
                )
            }
            is SuggestedActionDto.SetPassword -> {
                return TdApi.SuggestedActionSetPassword(
                    authorizationDelay = dto.authorizationDelay,
                )
            }
            is SuggestedActionDto.UpgradePremium -> {
                return TdApi.SuggestedActionUpgradePremium(
                )
            }
            is SuggestedActionDto.RestorePremium -> {
                return TdApi.SuggestedActionRestorePremium(
                )
            }
            is SuggestedActionDto.SubscribeToAnnualPremium -> {
                return TdApi.SuggestedActionSubscribeToAnnualPremium(
                )
            }
            is SuggestedActionDto.GiftPremiumForChristmas -> {
                return TdApi.SuggestedActionGiftPremiumForChristmas(
                )
            }
            is SuggestedActionDto.SetBirthdate -> {
                return TdApi.SuggestedActionSetBirthdate(
                )
            }
            is SuggestedActionDto.SetProfilePhoto -> {
                return TdApi.SuggestedActionSetProfilePhoto(
                )
            }
            is SuggestedActionDto.ExtendPremium -> {
                return TdApi.SuggestedActionExtendPremium(
                    managePremiumSubscriptionUrl = dto.managePremiumSubscriptionUrl,
                )
            }
            is SuggestedActionDto.ExtendStarSubscriptions -> {
                return TdApi.SuggestedActionExtendStarSubscriptions(
                )
            }
        }
    }

    fun map(dto: TdApi.SupergroupMembersFilter): SupergroupMembersFilterDto {
        when(dto) {
            is TdApi.SupergroupMembersFilterRecent -> {
                return SupergroupMembersFilterDto.Recent(
                )
            }
            is TdApi.SupergroupMembersFilterContacts -> {
                return SupergroupMembersFilterDto.Contacts(
                    query = dto.query,
                )
            }
            is TdApi.SupergroupMembersFilterAdministrators -> {
                return SupergroupMembersFilterDto.Administrators(
                )
            }
            is TdApi.SupergroupMembersFilterSearch -> {
                return SupergroupMembersFilterDto.Search(
                    query = dto.query,
                )
            }
            is TdApi.SupergroupMembersFilterRestricted -> {
                return SupergroupMembersFilterDto.Restricted(
                    query = dto.query,
                )
            }
            is TdApi.SupergroupMembersFilterBanned -> {
                return SupergroupMembersFilterDto.Banned(
                    query = dto.query,
                )
            }
            is TdApi.SupergroupMembersFilterMention -> {
                return SupergroupMembersFilterDto.Mention(
                    query = dto.query,
                    messageThreadId = dto.messageThreadId,
                )
            }
            is TdApi.SupergroupMembersFilterBots -> {
                return SupergroupMembersFilterDto.Bots(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: SupergroupMembersFilterDto): TdApi.SupergroupMembersFilter {
        when(dto) {
            is SupergroupMembersFilterDto.Recent -> {
                return TdApi.SupergroupMembersFilterRecent(
                )
            }
            is SupergroupMembersFilterDto.Contacts -> {
                return TdApi.SupergroupMembersFilterContacts(
                    query = dto.query,
                )
            }
            is SupergroupMembersFilterDto.Administrators -> {
                return TdApi.SupergroupMembersFilterAdministrators(
                )
            }
            is SupergroupMembersFilterDto.Search -> {
                return TdApi.SupergroupMembersFilterSearch(
                    query = dto.query,
                )
            }
            is SupergroupMembersFilterDto.Restricted -> {
                return TdApi.SupergroupMembersFilterRestricted(
                    query = dto.query,
                )
            }
            is SupergroupMembersFilterDto.Banned -> {
                return TdApi.SupergroupMembersFilterBanned(
                    query = dto.query,
                )
            }
            is SupergroupMembersFilterDto.Mention -> {
                return TdApi.SupergroupMembersFilterMention(
                    query = dto.query,
                    messageThreadId = dto.messageThreadId,
                )
            }
            is SupergroupMembersFilterDto.Bots -> {
                return TdApi.SupergroupMembersFilterBots(
                )
            }
        }
    }

    fun map(dto: TdApi.TMeUrlType): TMeUrlTypeDto {
        when(dto) {
            is TdApi.TMeUrlTypeUser -> {
                return TMeUrlTypeDto.User(
                    userId = dto.userId,
                )
            }
            is TdApi.TMeUrlTypeSupergroup -> {
                return TMeUrlTypeDto.Supergroup(
                    supergroupId = dto.supergroupId,
                )
            }
            is TdApi.TMeUrlTypeChatInvite -> {
                return TMeUrlTypeDto.ChatInvite(
                    info = map(dto.info),
                )
            }
            is TdApi.TMeUrlTypeStickerSet -> {
                return TMeUrlTypeDto.StickerSet(
                    stickerSetId = dto.stickerSetId,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: TMeUrlTypeDto): TdApi.TMeUrlType {
        when(dto) {
            is TMeUrlTypeDto.User -> {
                return TdApi.TMeUrlTypeUser(
                    userId = dto.userId,
                )
            }
            is TMeUrlTypeDto.Supergroup -> {
                return TdApi.TMeUrlTypeSupergroup(
                    supergroupId = dto.supergroupId,
                )
            }
            is TMeUrlTypeDto.ChatInvite -> {
                return TdApi.TMeUrlTypeChatInvite(
                    info = map(dto.info),
                )
            }
            is TMeUrlTypeDto.StickerSet -> {
                return TdApi.TMeUrlTypeStickerSet(
                    stickerSetId = dto.stickerSetId,
                )
            }
        }
    }

    fun map(dto: TdApi.TargetChat): TargetChatDto {
        when(dto) {
            is TdApi.TargetChatCurrent -> {
                return TargetChatDto.Current(
                )
            }
            is TdApi.TargetChatChosen -> {
                return TargetChatDto.Chosen(
                    types = map(dto.types),
                )
            }
            is TdApi.TargetChatInternalLink -> {
                return TargetChatDto.InternalLink(
                    link = map(dto.link),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: TargetChatDto): TdApi.TargetChat {
        when(dto) {
            is TargetChatDto.Current -> {
                return TdApi.TargetChatCurrent(
                )
            }
            is TargetChatDto.Chosen -> {
                return TdApi.TargetChatChosen(
                    types = map(dto.types),
                )
            }
            is TargetChatDto.InternalLink -> {
                return TdApi.TargetChatInternalLink(
                    link = map(dto.link),
                )
            }
        }
    }

    fun map(dto: TdApi.TelegramPaymentPurpose): TelegramPaymentPurposeDto {
        when(dto) {
            is TdApi.TelegramPaymentPurposePremiumGift -> {
                return TelegramPaymentPurposeDto.PremiumGift(
                    currency = dto.currency,
                    amount = dto.amount,
                    userId = dto.userId,
                    monthCount = dto.monthCount,
                    text = map(dto.text),
                )
            }
            is TdApi.TelegramPaymentPurposePremiumGiftCodes -> {
                return TelegramPaymentPurposeDto.PremiumGiftCodes(
                    boostedChatId = dto.boostedChatId,
                    currency = dto.currency,
                    amount = dto.amount,
                    userIds = dto.userIds,
                    monthCount = dto.monthCount,
                    text = map(dto.text),
                )
            }
            is TdApi.TelegramPaymentPurposePremiumGiveaway -> {
                return TelegramPaymentPurposeDto.PremiumGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                    winnerCount = dto.winnerCount,
                    monthCount = dto.monthCount,
                )
            }
            is TdApi.TelegramPaymentPurposeStars -> {
                return TelegramPaymentPurposeDto.Stars(
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            is TdApi.TelegramPaymentPurposeGiftedStars -> {
                return TelegramPaymentPurposeDto.GiftedStars(
                    userId = dto.userId,
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            is TdApi.TelegramPaymentPurposeStarGiveaway -> {
                return TelegramPaymentPurposeDto.StarGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                    winnerCount = dto.winnerCount,
                    starCount = dto.starCount,
                )
            }
            is TdApi.TelegramPaymentPurposeJoinChat -> {
                return TelegramPaymentPurposeDto.JoinChat(
                    inviteLink = dto.inviteLink,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: TelegramPaymentPurposeDto): TdApi.TelegramPaymentPurpose {
        when(dto) {
            is TelegramPaymentPurposeDto.PremiumGift -> {
                return TdApi.TelegramPaymentPurposePremiumGift(
                    currency = dto.currency,
                    amount = dto.amount,
                    userId = dto.userId,
                    monthCount = dto.monthCount,
                    text = map(dto.text),
                )
            }
            is TelegramPaymentPurposeDto.PremiumGiftCodes -> {
                return TdApi.TelegramPaymentPurposePremiumGiftCodes(
                    boostedChatId = dto.boostedChatId,
                    currency = dto.currency,
                    amount = dto.amount,
                    userIds = dto.userIds,
                    monthCount = dto.monthCount,
                    text = map(dto.text),
                )
            }
            is TelegramPaymentPurposeDto.PremiumGiveaway -> {
                return TdApi.TelegramPaymentPurposePremiumGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                    winnerCount = dto.winnerCount,
                    monthCount = dto.monthCount,
                )
            }
            is TelegramPaymentPurposeDto.Stars -> {
                return TdApi.TelegramPaymentPurposeStars(
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            is TelegramPaymentPurposeDto.GiftedStars -> {
                return TdApi.TelegramPaymentPurposeGiftedStars(
                    userId = dto.userId,
                    currency = dto.currency,
                    amount = dto.amount,
                    starCount = dto.starCount,
                )
            }
            is TelegramPaymentPurposeDto.StarGiveaway -> {
                return TdApi.TelegramPaymentPurposeStarGiveaway(
                    parameters = map(dto.parameters),
                    currency = dto.currency,
                    amount = dto.amount,
                    winnerCount = dto.winnerCount,
                    starCount = dto.starCount,
                )
            }
            is TelegramPaymentPurposeDto.JoinChat -> {
                return TdApi.TelegramPaymentPurposeJoinChat(
                    inviteLink = dto.inviteLink,
                )
            }
        }
    }

    fun map(dto: TdApi.TextEntityType): TextEntityTypeDto {
        when(dto) {
            is TdApi.TextEntityTypeMention -> {
                return TextEntityTypeDto.Mention(
                )
            }
            is TdApi.TextEntityTypeHashtag -> {
                return TextEntityTypeDto.Hashtag(
                )
            }
            is TdApi.TextEntityTypeCashtag -> {
                return TextEntityTypeDto.Cashtag(
                )
            }
            is TdApi.TextEntityTypeBotCommand -> {
                return TextEntityTypeDto.BotCommand(
                )
            }
            is TdApi.TextEntityTypeUrl -> {
                return TextEntityTypeDto.Url(
                )
            }
            is TdApi.TextEntityTypeEmailAddress -> {
                return TextEntityTypeDto.EmailAddress(
                )
            }
            is TdApi.TextEntityTypePhoneNumber -> {
                return TextEntityTypeDto.PhoneNumber(
                )
            }
            is TdApi.TextEntityTypeBankCardNumber -> {
                return TextEntityTypeDto.BankCardNumber(
                )
            }
            is TdApi.TextEntityTypeBold -> {
                return TextEntityTypeDto.Bold(
                )
            }
            is TdApi.TextEntityTypeItalic -> {
                return TextEntityTypeDto.Italic(
                )
            }
            is TdApi.TextEntityTypeUnderline -> {
                return TextEntityTypeDto.Underline(
                )
            }
            is TdApi.TextEntityTypeStrikethrough -> {
                return TextEntityTypeDto.Strikethrough(
                )
            }
            is TdApi.TextEntityTypeSpoiler -> {
                return TextEntityTypeDto.Spoiler(
                )
            }
            is TdApi.TextEntityTypeCode -> {
                return TextEntityTypeDto.Code(
                )
            }
            is TdApi.TextEntityTypePre -> {
                return TextEntityTypeDto.Pre(
                )
            }
            is TdApi.TextEntityTypePreCode -> {
                return TextEntityTypeDto.PreCode(
                    language = dto.language,
                )
            }
            is TdApi.TextEntityTypeBlockQuote -> {
                return TextEntityTypeDto.BlockQuote(
                )
            }
            is TdApi.TextEntityTypeExpandableBlockQuote -> {
                return TextEntityTypeDto.ExpandableBlockQuote(
                )
            }
            is TdApi.TextEntityTypeTextUrl -> {
                return TextEntityTypeDto.TextUrl(
                    url = dto.url,
                )
            }
            is TdApi.TextEntityTypeMentionName -> {
                return TextEntityTypeDto.MentionName(
                    userId = dto.userId,
                )
            }
            is TdApi.TextEntityTypeCustomEmoji -> {
                return TextEntityTypeDto.CustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            is TdApi.TextEntityTypeMediaTimestamp -> {
                return TextEntityTypeDto.MediaTimestamp(
                    mediaTimestamp = dto.mediaTimestamp,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: TextEntityTypeDto): TdApi.TextEntityType {
        when(dto) {
            is TextEntityTypeDto.Mention -> {
                return TdApi.TextEntityTypeMention(
                )
            }
            is TextEntityTypeDto.Hashtag -> {
                return TdApi.TextEntityTypeHashtag(
                )
            }
            is TextEntityTypeDto.Cashtag -> {
                return TdApi.TextEntityTypeCashtag(
                )
            }
            is TextEntityTypeDto.BotCommand -> {
                return TdApi.TextEntityTypeBotCommand(
                )
            }
            is TextEntityTypeDto.Url -> {
                return TdApi.TextEntityTypeUrl(
                )
            }
            is TextEntityTypeDto.EmailAddress -> {
                return TdApi.TextEntityTypeEmailAddress(
                )
            }
            is TextEntityTypeDto.PhoneNumber -> {
                return TdApi.TextEntityTypePhoneNumber(
                )
            }
            is TextEntityTypeDto.BankCardNumber -> {
                return TdApi.TextEntityTypeBankCardNumber(
                )
            }
            is TextEntityTypeDto.Bold -> {
                return TdApi.TextEntityTypeBold(
                )
            }
            is TextEntityTypeDto.Italic -> {
                return TdApi.TextEntityTypeItalic(
                )
            }
            is TextEntityTypeDto.Underline -> {
                return TdApi.TextEntityTypeUnderline(
                )
            }
            is TextEntityTypeDto.Strikethrough -> {
                return TdApi.TextEntityTypeStrikethrough(
                )
            }
            is TextEntityTypeDto.Spoiler -> {
                return TdApi.TextEntityTypeSpoiler(
                )
            }
            is TextEntityTypeDto.Code -> {
                return TdApi.TextEntityTypeCode(
                )
            }
            is TextEntityTypeDto.Pre -> {
                return TdApi.TextEntityTypePre(
                )
            }
            is TextEntityTypeDto.PreCode -> {
                return TdApi.TextEntityTypePreCode(
                    language = dto.language,
                )
            }
            is TextEntityTypeDto.BlockQuote -> {
                return TdApi.TextEntityTypeBlockQuote(
                )
            }
            is TextEntityTypeDto.ExpandableBlockQuote -> {
                return TdApi.TextEntityTypeExpandableBlockQuote(
                )
            }
            is TextEntityTypeDto.TextUrl -> {
                return TdApi.TextEntityTypeTextUrl(
                    url = dto.url,
                )
            }
            is TextEntityTypeDto.MentionName -> {
                return TdApi.TextEntityTypeMentionName(
                    userId = dto.userId,
                )
            }
            is TextEntityTypeDto.CustomEmoji -> {
                return TdApi.TextEntityTypeCustomEmoji(
                    customEmojiId = dto.customEmojiId,
                )
            }
            is TextEntityTypeDto.MediaTimestamp -> {
                return TdApi.TextEntityTypeMediaTimestamp(
                    mediaTimestamp = dto.mediaTimestamp,
                )
            }
        }
    }

    fun map(dto: TdApi.TextParseMode): TextParseModeDto {
        when(dto) {
            is TdApi.TextParseModeMarkdown -> {
                return TextParseModeDto.Markdown(
                    version = dto.version,
                )
            }
            is TdApi.TextParseModeHTML -> {
                return TextParseModeDto.HTML(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: TextParseModeDto): TdApi.TextParseMode {
        when(dto) {
            is TextParseModeDto.Markdown -> {
                return TdApi.TextParseModeMarkdown(
                    version = dto.version,
                )
            }
            is TextParseModeDto.HTML -> {
                return TdApi.TextParseModeHTML(
                )
            }
        }
    }

    fun map(dto: TdApi.ThumbnailFormat): ThumbnailFormatDto {
        when(dto) {
            is TdApi.ThumbnailFormatJpeg -> {
                return ThumbnailFormatDto.Jpeg(
                )
            }
            is TdApi.ThumbnailFormatGif -> {
                return ThumbnailFormatDto.Gif(
                )
            }
            is TdApi.ThumbnailFormatMpeg4 -> {
                return ThumbnailFormatDto.Mpeg4(
                )
            }
            is TdApi.ThumbnailFormatPng -> {
                return ThumbnailFormatDto.Png(
                )
            }
            is TdApi.ThumbnailFormatTgs -> {
                return ThumbnailFormatDto.Tgs(
                )
            }
            is TdApi.ThumbnailFormatWebm -> {
                return ThumbnailFormatDto.Webm(
                )
            }
            is TdApi.ThumbnailFormatWebp -> {
                return ThumbnailFormatDto.Webp(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: ThumbnailFormatDto): TdApi.ThumbnailFormat {
        when(dto) {
            is ThumbnailFormatDto.Jpeg -> {
                return TdApi.ThumbnailFormatJpeg(
                )
            }
            is ThumbnailFormatDto.Gif -> {
                return TdApi.ThumbnailFormatGif(
                )
            }
            is ThumbnailFormatDto.Mpeg4 -> {
                return TdApi.ThumbnailFormatMpeg4(
                )
            }
            is ThumbnailFormatDto.Png -> {
                return TdApi.ThumbnailFormatPng(
                )
            }
            is ThumbnailFormatDto.Tgs -> {
                return TdApi.ThumbnailFormatTgs(
                )
            }
            is ThumbnailFormatDto.Webm -> {
                return TdApi.ThumbnailFormatWebm(
                )
            }
            is ThumbnailFormatDto.Webp -> {
                return TdApi.ThumbnailFormatWebp(
                )
            }
        }
    }

    fun map(dto: TdApi.TopChatCategory): TopChatCategoryDto {
        when(dto) {
            is TdApi.TopChatCategoryUsers -> {
                return TopChatCategoryDto.Users(
                )
            }
            is TdApi.TopChatCategoryBots -> {
                return TopChatCategoryDto.Bots(
                )
            }
            is TdApi.TopChatCategoryGroups -> {
                return TopChatCategoryDto.Groups(
                )
            }
            is TdApi.TopChatCategoryChannels -> {
                return TopChatCategoryDto.Channels(
                )
            }
            is TdApi.TopChatCategoryInlineBots -> {
                return TopChatCategoryDto.InlineBots(
                )
            }
            is TdApi.TopChatCategoryWebAppBots -> {
                return TopChatCategoryDto.WebAppBots(
                )
            }
            is TdApi.TopChatCategoryCalls -> {
                return TopChatCategoryDto.Calls(
                )
            }
            is TdApi.TopChatCategoryForwardChats -> {
                return TopChatCategoryDto.ForwardChats(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: TopChatCategoryDto): TdApi.TopChatCategory {
        when(dto) {
            is TopChatCategoryDto.Users -> {
                return TdApi.TopChatCategoryUsers(
                )
            }
            is TopChatCategoryDto.Bots -> {
                return TdApi.TopChatCategoryBots(
                )
            }
            is TopChatCategoryDto.Groups -> {
                return TdApi.TopChatCategoryGroups(
                )
            }
            is TopChatCategoryDto.Channels -> {
                return TdApi.TopChatCategoryChannels(
                )
            }
            is TopChatCategoryDto.InlineBots -> {
                return TdApi.TopChatCategoryInlineBots(
                )
            }
            is TopChatCategoryDto.WebAppBots -> {
                return TdApi.TopChatCategoryWebAppBots(
                )
            }
            is TopChatCategoryDto.Calls -> {
                return TdApi.TopChatCategoryCalls(
                )
            }
            is TopChatCategoryDto.ForwardChats -> {
                return TdApi.TopChatCategoryForwardChats(
                )
            }
        }
    }

    fun map(dto: TdApi.UserPrivacySetting): UserPrivacySettingDto {
        when(dto) {
            is TdApi.UserPrivacySettingShowStatus -> {
                return UserPrivacySettingDto.ShowStatus(
                )
            }
            is TdApi.UserPrivacySettingShowProfilePhoto -> {
                return UserPrivacySettingDto.ShowProfilePhoto(
                )
            }
            is TdApi.UserPrivacySettingShowLinkInForwardedMessages -> {
                return UserPrivacySettingDto.ShowLinkInForwardedMessages(
                )
            }
            is TdApi.UserPrivacySettingShowPhoneNumber -> {
                return UserPrivacySettingDto.ShowPhoneNumber(
                )
            }
            is TdApi.UserPrivacySettingShowBio -> {
                return UserPrivacySettingDto.ShowBio(
                )
            }
            is TdApi.UserPrivacySettingShowBirthdate -> {
                return UserPrivacySettingDto.ShowBirthdate(
                )
            }
            is TdApi.UserPrivacySettingAllowChatInvites -> {
                return UserPrivacySettingDto.AllowChatInvites(
                )
            }
            is TdApi.UserPrivacySettingAllowCalls -> {
                return UserPrivacySettingDto.AllowCalls(
                )
            }
            is TdApi.UserPrivacySettingAllowPeerToPeerCalls -> {
                return UserPrivacySettingDto.AllowPeerToPeerCalls(
                )
            }
            is TdApi.UserPrivacySettingAllowFindingByPhoneNumber -> {
                return UserPrivacySettingDto.AllowFindingByPhoneNumber(
                )
            }
            is TdApi.UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages -> {
                return UserPrivacySettingDto.AllowPrivateVoiceAndVideoNoteMessages(
                )
            }
            is TdApi.UserPrivacySettingAutosaveGifts -> {
                return UserPrivacySettingDto.AutosaveGifts(
                )
            }
            is TdApi.UserPrivacySettingAllowUnpaidMessages -> {
                return UserPrivacySettingDto.AllowUnpaidMessages(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: UserPrivacySettingDto): TdApi.UserPrivacySetting {
        when(dto) {
            is UserPrivacySettingDto.ShowStatus -> {
                return TdApi.UserPrivacySettingShowStatus(
                )
            }
            is UserPrivacySettingDto.ShowProfilePhoto -> {
                return TdApi.UserPrivacySettingShowProfilePhoto(
                )
            }
            is UserPrivacySettingDto.ShowLinkInForwardedMessages -> {
                return TdApi.UserPrivacySettingShowLinkInForwardedMessages(
                )
            }
            is UserPrivacySettingDto.ShowPhoneNumber -> {
                return TdApi.UserPrivacySettingShowPhoneNumber(
                )
            }
            is UserPrivacySettingDto.ShowBio -> {
                return TdApi.UserPrivacySettingShowBio(
                )
            }
            is UserPrivacySettingDto.ShowBirthdate -> {
                return TdApi.UserPrivacySettingShowBirthdate(
                )
            }
            is UserPrivacySettingDto.AllowChatInvites -> {
                return TdApi.UserPrivacySettingAllowChatInvites(
                )
            }
            is UserPrivacySettingDto.AllowCalls -> {
                return TdApi.UserPrivacySettingAllowCalls(
                )
            }
            is UserPrivacySettingDto.AllowPeerToPeerCalls -> {
                return TdApi.UserPrivacySettingAllowPeerToPeerCalls(
                )
            }
            is UserPrivacySettingDto.AllowFindingByPhoneNumber -> {
                return TdApi.UserPrivacySettingAllowFindingByPhoneNumber(
                )
            }
            is UserPrivacySettingDto.AllowPrivateVoiceAndVideoNoteMessages -> {
                return TdApi.UserPrivacySettingAllowPrivateVoiceAndVideoNoteMessages(
                )
            }
            is UserPrivacySettingDto.AutosaveGifts -> {
                return TdApi.UserPrivacySettingAutosaveGifts(
                )
            }
            is UserPrivacySettingDto.AllowUnpaidMessages -> {
                return TdApi.UserPrivacySettingAllowUnpaidMessages(
                )
            }
        }
    }

    fun map(dto: TdApi.UserPrivacySettingRule): UserPrivacySettingRuleDto {
        when(dto) {
            is TdApi.UserPrivacySettingRuleAllowAll -> {
                return UserPrivacySettingRuleDto.AllowAll(
                )
            }
            is TdApi.UserPrivacySettingRuleAllowContacts -> {
                return UserPrivacySettingRuleDto.AllowContacts(
                )
            }
            is TdApi.UserPrivacySettingRuleAllowBots -> {
                return UserPrivacySettingRuleDto.AllowBots(
                )
            }
            is TdApi.UserPrivacySettingRuleAllowPremiumUsers -> {
                return UserPrivacySettingRuleDto.AllowPremiumUsers(
                )
            }
            is TdApi.UserPrivacySettingRuleAllowUsers -> {
                return UserPrivacySettingRuleDto.AllowUsers(
                    userIds = dto.userIds,
                )
            }
            is TdApi.UserPrivacySettingRuleAllowChatMembers -> {
                return UserPrivacySettingRuleDto.AllowChatMembers(
                    chatIds = dto.chatIds,
                )
            }
            is TdApi.UserPrivacySettingRuleRestrictAll -> {
                return UserPrivacySettingRuleDto.RestrictAll(
                )
            }
            is TdApi.UserPrivacySettingRuleRestrictContacts -> {
                return UserPrivacySettingRuleDto.RestrictContacts(
                )
            }
            is TdApi.UserPrivacySettingRuleRestrictBots -> {
                return UserPrivacySettingRuleDto.RestrictBots(
                )
            }
            is TdApi.UserPrivacySettingRuleRestrictUsers -> {
                return UserPrivacySettingRuleDto.RestrictUsers(
                    userIds = dto.userIds,
                )
            }
            is TdApi.UserPrivacySettingRuleRestrictChatMembers -> {
                return UserPrivacySettingRuleDto.RestrictChatMembers(
                    chatIds = dto.chatIds,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: UserPrivacySettingRuleDto): TdApi.UserPrivacySettingRule {
        when(dto) {
            is UserPrivacySettingRuleDto.AllowAll -> {
                return TdApi.UserPrivacySettingRuleAllowAll(
                )
            }
            is UserPrivacySettingRuleDto.AllowContacts -> {
                return TdApi.UserPrivacySettingRuleAllowContacts(
                )
            }
            is UserPrivacySettingRuleDto.AllowBots -> {
                return TdApi.UserPrivacySettingRuleAllowBots(
                )
            }
            is UserPrivacySettingRuleDto.AllowPremiumUsers -> {
                return TdApi.UserPrivacySettingRuleAllowPremiumUsers(
                )
            }
            is UserPrivacySettingRuleDto.AllowUsers -> {
                return TdApi.UserPrivacySettingRuleAllowUsers(
                    userIds = dto.userIds,
                )
            }
            is UserPrivacySettingRuleDto.AllowChatMembers -> {
                return TdApi.UserPrivacySettingRuleAllowChatMembers(
                    chatIds = dto.chatIds,
                )
            }
            is UserPrivacySettingRuleDto.RestrictAll -> {
                return TdApi.UserPrivacySettingRuleRestrictAll(
                )
            }
            is UserPrivacySettingRuleDto.RestrictContacts -> {
                return TdApi.UserPrivacySettingRuleRestrictContacts(
                )
            }
            is UserPrivacySettingRuleDto.RestrictBots -> {
                return TdApi.UserPrivacySettingRuleRestrictBots(
                )
            }
            is UserPrivacySettingRuleDto.RestrictUsers -> {
                return TdApi.UserPrivacySettingRuleRestrictUsers(
                    userIds = dto.userIds,
                )
            }
            is UserPrivacySettingRuleDto.RestrictChatMembers -> {
                return TdApi.UserPrivacySettingRuleRestrictChatMembers(
                    chatIds = dto.chatIds,
                )
            }
        }
    }

    fun map(dto: TdApi.UserStatus): UserStatusDto {
        when(dto) {
            is TdApi.UserStatusEmpty -> {
                return UserStatusDto.Empty(
                )
            }
            is TdApi.UserStatusOnline -> {
                return UserStatusDto.Online(
                    expires = dto.expires,
                )
            }
            is TdApi.UserStatusOffline -> {
                return UserStatusDto.Offline(
                    wasOnline = dto.wasOnline,
                )
            }
            is TdApi.UserStatusRecently -> {
                return UserStatusDto.Recently(
                    byMyPrivacySettings = dto.byMyPrivacySettings,
                )
            }
            is TdApi.UserStatusLastWeek -> {
                return UserStatusDto.LastWeek(
                    byMyPrivacySettings = dto.byMyPrivacySettings,
                )
            }
            is TdApi.UserStatusLastMonth -> {
                return UserStatusDto.LastMonth(
                    byMyPrivacySettings = dto.byMyPrivacySettings,
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: UserStatusDto): TdApi.UserStatus {
        when(dto) {
            is UserStatusDto.Empty -> {
                return TdApi.UserStatusEmpty(
                )
            }
            is UserStatusDto.Online -> {
                return TdApi.UserStatusOnline(
                    expires = dto.expires,
                )
            }
            is UserStatusDto.Offline -> {
                return TdApi.UserStatusOffline(
                    wasOnline = dto.wasOnline,
                )
            }
            is UserStatusDto.Recently -> {
                return TdApi.UserStatusRecently(
                    byMyPrivacySettings = dto.byMyPrivacySettings,
                )
            }
            is UserStatusDto.LastWeek -> {
                return TdApi.UserStatusLastWeek(
                    byMyPrivacySettings = dto.byMyPrivacySettings,
                )
            }
            is UserStatusDto.LastMonth -> {
                return TdApi.UserStatusLastMonth(
                    byMyPrivacySettings = dto.byMyPrivacySettings,
                )
            }
        }
    }

    fun map(dto: TdApi.UserType): UserTypeDto {
        when(dto) {
            is TdApi.UserTypeRegular -> {
                return UserTypeDto.Regular(
                )
            }
            is TdApi.UserTypeDeleted -> {
                return UserTypeDto.Deleted(
                )
            }
            is TdApi.UserTypeBot -> {
                return UserTypeDto.Bot(
                    canBeEdited = dto.canBeEdited,
                    canJoinGroups = dto.canJoinGroups,
                    canReadAllGroupMessages = dto.canReadAllGroupMessages,
                    hasMainWebApp = dto.hasMainWebApp,
                    isInline = dto.isInline,
                    inlineQueryPlaceholder = dto.inlineQueryPlaceholder,
                    needLocation = dto.needLocation,
                    canConnectToBusiness = dto.canConnectToBusiness,
                    canBeAddedToAttachmentMenu = dto.canBeAddedToAttachmentMenu,
                    activeUserCount = dto.activeUserCount,
                )
            }
            is TdApi.UserTypeUnknown -> {
                return UserTypeDto.Unknown(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: UserTypeDto): TdApi.UserType {
        when(dto) {
            is UserTypeDto.Regular -> {
                return TdApi.UserTypeRegular(
                )
            }
            is UserTypeDto.Deleted -> {
                return TdApi.UserTypeDeleted(
                )
            }
            is UserTypeDto.Bot -> {
                return TdApi.UserTypeBot(
                    canBeEdited = dto.canBeEdited,
                    canJoinGroups = dto.canJoinGroups,
                    canReadAllGroupMessages = dto.canReadAllGroupMessages,
                    hasMainWebApp = dto.hasMainWebApp,
                    isInline = dto.isInline,
                    inlineQueryPlaceholder = dto.inlineQueryPlaceholder,
                    needLocation = dto.needLocation,
                    canConnectToBusiness = dto.canConnectToBusiness,
                    canBeAddedToAttachmentMenu = dto.canBeAddedToAttachmentMenu,
                    activeUserCount = dto.activeUserCount,
                )
            }
            is UserTypeDto.Unknown -> {
                return TdApi.UserTypeUnknown(
                )
            }
        }
    }

    fun map(dto: TdApi.VectorPathCommand): VectorPathCommandDto {
        when(dto) {
            is TdApi.VectorPathCommandLine -> {
                return VectorPathCommandDto.Line(
                    endPoint = map(dto.endPoint),
                )
            }
            is TdApi.VectorPathCommandCubicBezierCurve -> {
                return VectorPathCommandDto.CubicBezierCurve(
                    startControlPoint = map(dto.startControlPoint),
                    endControlPoint = map(dto.endControlPoint),
                    endPoint = map(dto.endPoint),
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: VectorPathCommandDto): TdApi.VectorPathCommand {
        when(dto) {
            is VectorPathCommandDto.Line -> {
                return TdApi.VectorPathCommandLine(
                    endPoint = map(dto.endPoint),
                )
            }
            is VectorPathCommandDto.CubicBezierCurve -> {
                return TdApi.VectorPathCommandCubicBezierCurve(
                    startControlPoint = map(dto.startControlPoint),
                    endControlPoint = map(dto.endControlPoint),
                    endPoint = map(dto.endPoint),
                )
            }
        }
    }

    fun map(dto: TdApi.WebAppOpenMode): WebAppOpenModeDto {
        when(dto) {
            is TdApi.WebAppOpenModeCompact -> {
                return WebAppOpenModeDto.Compact(
                )
            }
            is TdApi.WebAppOpenModeFullSize -> {
                return WebAppOpenModeDto.FullSize(
                )
            }
            is TdApi.WebAppOpenModeFullScreen -> {
                return WebAppOpenModeDto.FullScreen(
                )
            }
            else -> error("Unknown dto class")
        }
    }

    fun map(dto: WebAppOpenModeDto): TdApi.WebAppOpenMode {
        when(dto) {
            is WebAppOpenModeDto.Compact -> {
                return TdApi.WebAppOpenModeCompact(
                )
            }
            is WebAppOpenModeDto.FullSize -> {
                return TdApi.WebAppOpenModeFullSize(
                )
            }
            is WebAppOpenModeDto.FullScreen -> {
                return TdApi.WebAppOpenModeFullScreen(
                )
            }
        }
    }

    fun map(dto: TdApi.UpdateAuthorizationState): AuthorizationStateUpdateDto {
        return AuthorizationStateUpdateDto(
            authorizationState = map(dto.authorizationState),
        )
    }

    fun map(dto: AuthorizationStateUpdateDto): TdApi.UpdateAuthorizationState {
        return TdApi.UpdateAuthorizationState(
            authorizationState = map(dto.authorizationState),
        )
    }

    fun map(dto: TdApi.UpdateNewMessage): NewMessageUpdateDto {
        return NewMessageUpdateDto(
            message = map(dto.message),
        )
    }

    fun map(dto: NewMessageUpdateDto): TdApi.UpdateNewMessage {
        return TdApi.UpdateNewMessage(
            message = map(dto.message),
        )
    }

    fun map(dto: TdApi.UpdateMessageSendAcknowledged): MessageSendAcknowledgedUpdateDto {
        return MessageSendAcknowledgedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: MessageSendAcknowledgedUpdateDto): TdApi.UpdateMessageSendAcknowledged {
        return TdApi.UpdateMessageSendAcknowledged(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: TdApi.UpdateMessageSendSucceeded): MessageSendSucceededUpdateDto {
        return MessageSendSucceededUpdateDto(
            message = map(dto.message),
            oldMessageId = dto.oldMessageId,
        )
    }

    fun map(dto: MessageSendSucceededUpdateDto): TdApi.UpdateMessageSendSucceeded {
        return TdApi.UpdateMessageSendSucceeded(
            message = map(dto.message),
            oldMessageId = dto.oldMessageId,
        )
    }

    fun map(dto: TdApi.UpdateMessageSendFailed): MessageSendFailedUpdateDto {
        return MessageSendFailedUpdateDto(
            message = map(dto.message),
            oldMessageId = dto.oldMessageId,
            error = map(dto.error),
        )
    }

    fun map(dto: MessageSendFailedUpdateDto): TdApi.UpdateMessageSendFailed {
        return TdApi.UpdateMessageSendFailed(
            message = map(dto.message),
            oldMessageId = dto.oldMessageId,
            error = map(dto.error),
        )
    }

    fun map(dto: TdApi.UpdateMessageContent): MessageContentUpdateDto {
        return MessageContentUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            newContent = map(dto.newContent),
        )
    }

    fun map(dto: MessageContentUpdateDto): TdApi.UpdateMessageContent {
        return TdApi.UpdateMessageContent(
            chatId = dto.chatId,
            messageId = dto.messageId,
            newContent = map(dto.newContent),
        )
    }

    fun map(dto: TdApi.UpdateMessageEdited): MessageEditedUpdateDto {
        return MessageEditedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            editDate = dto.editDate,
            replyMarkup = dto.replyMarkup?.let { map(it) },
        )
    }

    fun map(dto: MessageEditedUpdateDto): TdApi.UpdateMessageEdited {
        return TdApi.UpdateMessageEdited(
            chatId = dto.chatId,
            messageId = dto.messageId,
            editDate = dto.editDate,
            replyMarkup = dto.replyMarkup?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateMessageIsPinned): MessageIsPinnedUpdateDto {
        return MessageIsPinnedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            isPinned = dto.isPinned,
        )
    }

    fun map(dto: MessageIsPinnedUpdateDto): TdApi.UpdateMessageIsPinned {
        return TdApi.UpdateMessageIsPinned(
            chatId = dto.chatId,
            messageId = dto.messageId,
            isPinned = dto.isPinned,
        )
    }

    fun map(dto: TdApi.UpdateMessageInteractionInfo): MessageInteractionInfoUpdateDto {
        return MessageInteractionInfoUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            interactionInfo = dto.interactionInfo?.let { map(it) },
        )
    }

    fun map(dto: MessageInteractionInfoUpdateDto): TdApi.UpdateMessageInteractionInfo {
        return TdApi.UpdateMessageInteractionInfo(
            chatId = dto.chatId,
            messageId = dto.messageId,
            interactionInfo = dto.interactionInfo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateMessageContentOpened): MessageContentOpenedUpdateDto {
        return MessageContentOpenedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: MessageContentOpenedUpdateDto): TdApi.UpdateMessageContentOpened {
        return TdApi.UpdateMessageContentOpened(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: TdApi.UpdateMessageMentionRead): MessageMentionReadUpdateDto {
        return MessageMentionReadUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            unreadMentionCount = dto.unreadMentionCount,
        )
    }

    fun map(dto: MessageMentionReadUpdateDto): TdApi.UpdateMessageMentionRead {
        return TdApi.UpdateMessageMentionRead(
            chatId = dto.chatId,
            messageId = dto.messageId,
            unreadMentionCount = dto.unreadMentionCount,
        )
    }

    fun map(dto: TdApi.UpdateMessageUnreadReactions): MessageUnreadReactionsUpdateDto {
        return MessageUnreadReactionsUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            unreadReactions = dto.unreadReactions.mapArray { map(it) },
            unreadReactionCount = dto.unreadReactionCount,
        )
    }

    fun map(dto: MessageUnreadReactionsUpdateDto): TdApi.UpdateMessageUnreadReactions {
        return TdApi.UpdateMessageUnreadReactions(
            chatId = dto.chatId,
            messageId = dto.messageId,
            unreadReactions = dto.unreadReactions.mapArray { map(it) },
            unreadReactionCount = dto.unreadReactionCount,
        )
    }

    fun map(dto: TdApi.UpdateMessageFactCheck): MessageFactCheckUpdateDto {
        return MessageFactCheckUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            factCheck = map(dto.factCheck),
        )
    }

    fun map(dto: MessageFactCheckUpdateDto): TdApi.UpdateMessageFactCheck {
        return TdApi.UpdateMessageFactCheck(
            chatId = dto.chatId,
            messageId = dto.messageId,
            factCheck = map(dto.factCheck),
        )
    }

    fun map(dto: TdApi.UpdateMessageLiveLocationViewed): MessageLiveLocationViewedUpdateDto {
        return MessageLiveLocationViewedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: MessageLiveLocationViewedUpdateDto): TdApi.UpdateMessageLiveLocationViewed {
        return TdApi.UpdateMessageLiveLocationViewed(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: TdApi.UpdateVideoPublished): VideoPublishedUpdateDto {
        return VideoPublishedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: VideoPublishedUpdateDto): TdApi.UpdateVideoPublished {
        return TdApi.UpdateVideoPublished(
            chatId = dto.chatId,
            messageId = dto.messageId,
        )
    }

    fun map(dto: TdApi.UpdateNewChat): NewChatUpdateDto {
        return NewChatUpdateDto(
            chat = map(dto.chat),
        )
    }

    fun map(dto: NewChatUpdateDto): TdApi.UpdateNewChat {
        return TdApi.UpdateNewChat(
            chat = map(dto.chat),
        )
    }

    fun map(dto: TdApi.UpdateChatTitle): ChatTitleUpdateDto {
        return ChatTitleUpdateDto(
            chatId = dto.chatId,
            title = dto.title,
        )
    }

    fun map(dto: ChatTitleUpdateDto): TdApi.UpdateChatTitle {
        return TdApi.UpdateChatTitle(
            chatId = dto.chatId,
            title = dto.title,
        )
    }

    fun map(dto: TdApi.UpdateChatPhoto): ChatPhotoUpdateDto {
        return ChatPhotoUpdateDto(
            chatId = dto.chatId,
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: ChatPhotoUpdateDto): TdApi.UpdateChatPhoto {
        return TdApi.UpdateChatPhoto(
            chatId = dto.chatId,
            photo = dto.photo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatAccentColors): ChatAccentColorsUpdateDto {
        return ChatAccentColorsUpdateDto(
            chatId = dto.chatId,
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            profileAccentColorId = dto.profileAccentColorId,
            profileBackgroundCustomEmojiId = dto.profileBackgroundCustomEmojiId,
        )
    }

    fun map(dto: ChatAccentColorsUpdateDto): TdApi.UpdateChatAccentColors {
        return TdApi.UpdateChatAccentColors(
            chatId = dto.chatId,
            accentColorId = dto.accentColorId,
            backgroundCustomEmojiId = dto.backgroundCustomEmojiId,
            profileAccentColorId = dto.profileAccentColorId,
            profileBackgroundCustomEmojiId = dto.profileBackgroundCustomEmojiId,
        )
    }

    fun map(dto: TdApi.UpdateChatPermissions): ChatPermissionsUpdateDto {
        return ChatPermissionsUpdateDto(
            chatId = dto.chatId,
            permissions = map(dto.permissions),
        )
    }

    fun map(dto: ChatPermissionsUpdateDto): TdApi.UpdateChatPermissions {
        return TdApi.UpdateChatPermissions(
            chatId = dto.chatId,
            permissions = map(dto.permissions),
        )
    }

    fun map(dto: TdApi.UpdateChatLastMessage): ChatLastMessageUpdateDto {
        return ChatLastMessageUpdateDto(
            chatId = dto.chatId,
            lastMessage = dto.lastMessage?.let { map(it) },
            positions = dto.positions.mapArray { map(it) },
        )
    }

    fun map(dto: ChatLastMessageUpdateDto): TdApi.UpdateChatLastMessage {
        return TdApi.UpdateChatLastMessage(
            chatId = dto.chatId,
            lastMessage = dto.lastMessage?.let { map(it) },
            positions = dto.positions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatPosition): ChatPositionUpdateDto {
        return ChatPositionUpdateDto(
            chatId = dto.chatId,
            position = map(dto.position),
        )
    }

    fun map(dto: ChatPositionUpdateDto): TdApi.UpdateChatPosition {
        return TdApi.UpdateChatPosition(
            chatId = dto.chatId,
            position = map(dto.position),
        )
    }

    fun map(dto: TdApi.UpdateChatAddedToList): ChatAddedToListUpdateDto {
        return ChatAddedToListUpdateDto(
            chatId = dto.chatId,
            chatList = map(dto.chatList),
        )
    }

    fun map(dto: ChatAddedToListUpdateDto): TdApi.UpdateChatAddedToList {
        return TdApi.UpdateChatAddedToList(
            chatId = dto.chatId,
            chatList = map(dto.chatList),
        )
    }

    fun map(dto: TdApi.UpdateChatRemovedFromList): ChatRemovedFromListUpdateDto {
        return ChatRemovedFromListUpdateDto(
            chatId = dto.chatId,
            chatList = map(dto.chatList),
        )
    }

    fun map(dto: ChatRemovedFromListUpdateDto): TdApi.UpdateChatRemovedFromList {
        return TdApi.UpdateChatRemovedFromList(
            chatId = dto.chatId,
            chatList = map(dto.chatList),
        )
    }

    fun map(dto: TdApi.UpdateChatReadInbox): ChatReadInboxUpdateDto {
        return ChatReadInboxUpdateDto(
            chatId = dto.chatId,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            unreadCount = dto.unreadCount,
        )
    }

    fun map(dto: ChatReadInboxUpdateDto): TdApi.UpdateChatReadInbox {
        return TdApi.UpdateChatReadInbox(
            chatId = dto.chatId,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            unreadCount = dto.unreadCount,
        )
    }

    fun map(dto: TdApi.UpdateChatReadOutbox): ChatReadOutboxUpdateDto {
        return ChatReadOutboxUpdateDto(
            chatId = dto.chatId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
        )
    }

    fun map(dto: ChatReadOutboxUpdateDto): TdApi.UpdateChatReadOutbox {
        return TdApi.UpdateChatReadOutbox(
            chatId = dto.chatId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
        )
    }

    fun map(dto: TdApi.UpdateChatActionBar): ChatActionBarUpdateDto {
        return ChatActionBarUpdateDto(
            chatId = dto.chatId,
            actionBar = dto.actionBar?.let { map(it) },
        )
    }

    fun map(dto: ChatActionBarUpdateDto): TdApi.UpdateChatActionBar {
        return TdApi.UpdateChatActionBar(
            chatId = dto.chatId,
            actionBar = dto.actionBar?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatBusinessBotManageBar): ChatBusinessBotManageBarUpdateDto {
        return ChatBusinessBotManageBarUpdateDto(
            chatId = dto.chatId,
            businessBotManageBar = dto.businessBotManageBar?.let { map(it) },
        )
    }

    fun map(dto: ChatBusinessBotManageBarUpdateDto): TdApi.UpdateChatBusinessBotManageBar {
        return TdApi.UpdateChatBusinessBotManageBar(
            chatId = dto.chatId,
            businessBotManageBar = dto.businessBotManageBar?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatAvailableReactions): ChatAvailableReactionsUpdateDto {
        return ChatAvailableReactionsUpdateDto(
            chatId = dto.chatId,
            availableReactions = map(dto.availableReactions),
        )
    }

    fun map(dto: ChatAvailableReactionsUpdateDto): TdApi.UpdateChatAvailableReactions {
        return TdApi.UpdateChatAvailableReactions(
            chatId = dto.chatId,
            availableReactions = map(dto.availableReactions),
        )
    }

    fun map(dto: TdApi.UpdateChatDraftMessage): ChatDraftMessageUpdateDto {
        return ChatDraftMessageUpdateDto(
            chatId = dto.chatId,
            draftMessage = dto.draftMessage?.let { map(it) },
            positions = dto.positions.mapArray { map(it) },
        )
    }

    fun map(dto: ChatDraftMessageUpdateDto): TdApi.UpdateChatDraftMessage {
        return TdApi.UpdateChatDraftMessage(
            chatId = dto.chatId,
            draftMessage = dto.draftMessage?.let { map(it) },
            positions = dto.positions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatEmojiStatus): ChatEmojiStatusUpdateDto {
        return ChatEmojiStatusUpdateDto(
            chatId = dto.chatId,
            emojiStatus = dto.emojiStatus?.let { map(it) },
        )
    }

    fun map(dto: ChatEmojiStatusUpdateDto): TdApi.UpdateChatEmojiStatus {
        return TdApi.UpdateChatEmojiStatus(
            chatId = dto.chatId,
            emojiStatus = dto.emojiStatus?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatMessageSender): ChatMessageSenderUpdateDto {
        return ChatMessageSenderUpdateDto(
            chatId = dto.chatId,
            messageSenderId = dto.messageSenderId?.let { map(it) },
        )
    }

    fun map(dto: ChatMessageSenderUpdateDto): TdApi.UpdateChatMessageSender {
        return TdApi.UpdateChatMessageSender(
            chatId = dto.chatId,
            messageSenderId = dto.messageSenderId?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatMessageAutoDeleteTime): ChatMessageAutoDeleteTimeUpdateDto {
        return ChatMessageAutoDeleteTimeUpdateDto(
            chatId = dto.chatId,
            messageAutoDeleteTime = dto.messageAutoDeleteTime,
        )
    }

    fun map(dto: ChatMessageAutoDeleteTimeUpdateDto): TdApi.UpdateChatMessageAutoDeleteTime {
        return TdApi.UpdateChatMessageAutoDeleteTime(
            chatId = dto.chatId,
            messageAutoDeleteTime = dto.messageAutoDeleteTime,
        )
    }

    fun map(dto: TdApi.UpdateChatNotificationSettings): ChatNotificationSettingsUpdateDto {
        return ChatNotificationSettingsUpdateDto(
            chatId = dto.chatId,
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: ChatNotificationSettingsUpdateDto): TdApi.UpdateChatNotificationSettings {
        return TdApi.UpdateChatNotificationSettings(
            chatId = dto.chatId,
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: TdApi.UpdateChatPendingJoinRequests): ChatPendingJoinRequestsUpdateDto {
        return ChatPendingJoinRequestsUpdateDto(
            chatId = dto.chatId,
            pendingJoinRequests = dto.pendingJoinRequests?.let { map(it) },
        )
    }

    fun map(dto: ChatPendingJoinRequestsUpdateDto): TdApi.UpdateChatPendingJoinRequests {
        return TdApi.UpdateChatPendingJoinRequests(
            chatId = dto.chatId,
            pendingJoinRequests = dto.pendingJoinRequests?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatReplyMarkup): ChatReplyMarkupUpdateDto {
        return ChatReplyMarkupUpdateDto(
            chatId = dto.chatId,
            replyMarkupMessageId = dto.replyMarkupMessageId,
        )
    }

    fun map(dto: ChatReplyMarkupUpdateDto): TdApi.UpdateChatReplyMarkup {
        return TdApi.UpdateChatReplyMarkup(
            chatId = dto.chatId,
            replyMarkupMessageId = dto.replyMarkupMessageId,
        )
    }

    fun map(dto: TdApi.UpdateChatBackground): ChatBackgroundUpdateDto {
        return ChatBackgroundUpdateDto(
            chatId = dto.chatId,
            background = dto.background?.let { map(it) },
        )
    }

    fun map(dto: ChatBackgroundUpdateDto): TdApi.UpdateChatBackground {
        return TdApi.UpdateChatBackground(
            chatId = dto.chatId,
            background = dto.background?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatTheme): ChatThemeUpdateDto {
        return ChatThemeUpdateDto(
            chatId = dto.chatId,
            themeName = dto.themeName,
        )
    }

    fun map(dto: ChatThemeUpdateDto): TdApi.UpdateChatTheme {
        return TdApi.UpdateChatTheme(
            chatId = dto.chatId,
            themeName = dto.themeName,
        )
    }

    fun map(dto: TdApi.UpdateChatUnreadMentionCount): ChatUnreadMentionCountUpdateDto {
        return ChatUnreadMentionCountUpdateDto(
            chatId = dto.chatId,
            unreadMentionCount = dto.unreadMentionCount,
        )
    }

    fun map(dto: ChatUnreadMentionCountUpdateDto): TdApi.UpdateChatUnreadMentionCount {
        return TdApi.UpdateChatUnreadMentionCount(
            chatId = dto.chatId,
            unreadMentionCount = dto.unreadMentionCount,
        )
    }

    fun map(dto: TdApi.UpdateChatUnreadReactionCount): ChatUnreadReactionCountUpdateDto {
        return ChatUnreadReactionCountUpdateDto(
            chatId = dto.chatId,
            unreadReactionCount = dto.unreadReactionCount,
        )
    }

    fun map(dto: ChatUnreadReactionCountUpdateDto): TdApi.UpdateChatUnreadReactionCount {
        return TdApi.UpdateChatUnreadReactionCount(
            chatId = dto.chatId,
            unreadReactionCount = dto.unreadReactionCount,
        )
    }

    fun map(dto: TdApi.UpdateChatVideoChat): ChatVideoChatUpdateDto {
        return ChatVideoChatUpdateDto(
            chatId = dto.chatId,
            videoChat = map(dto.videoChat),
        )
    }

    fun map(dto: ChatVideoChatUpdateDto): TdApi.UpdateChatVideoChat {
        return TdApi.UpdateChatVideoChat(
            chatId = dto.chatId,
            videoChat = map(dto.videoChat),
        )
    }

    fun map(dto: TdApi.UpdateChatDefaultDisableNotification): ChatDefaultDisableNotificationUpdateDto {
        return ChatDefaultDisableNotificationUpdateDto(
            chatId = dto.chatId,
            defaultDisableNotification = dto.defaultDisableNotification,
        )
    }

    fun map(dto: ChatDefaultDisableNotificationUpdateDto): TdApi.UpdateChatDefaultDisableNotification {
        return TdApi.UpdateChatDefaultDisableNotification(
            chatId = dto.chatId,
            defaultDisableNotification = dto.defaultDisableNotification,
        )
    }

    fun map(dto: TdApi.UpdateChatHasProtectedContent): ChatHasProtectedContentUpdateDto {
        return ChatHasProtectedContentUpdateDto(
            chatId = dto.chatId,
            hasProtectedContent = dto.hasProtectedContent,
        )
    }

    fun map(dto: ChatHasProtectedContentUpdateDto): TdApi.UpdateChatHasProtectedContent {
        return TdApi.UpdateChatHasProtectedContent(
            chatId = dto.chatId,
            hasProtectedContent = dto.hasProtectedContent,
        )
    }

    fun map(dto: TdApi.UpdateChatIsTranslatable): ChatIsTranslatableUpdateDto {
        return ChatIsTranslatableUpdateDto(
            chatId = dto.chatId,
            isTranslatable = dto.isTranslatable,
        )
    }

    fun map(dto: ChatIsTranslatableUpdateDto): TdApi.UpdateChatIsTranslatable {
        return TdApi.UpdateChatIsTranslatable(
            chatId = dto.chatId,
            isTranslatable = dto.isTranslatable,
        )
    }

    fun map(dto: TdApi.UpdateChatIsMarkedAsUnread): ChatIsMarkedAsUnreadUpdateDto {
        return ChatIsMarkedAsUnreadUpdateDto(
            chatId = dto.chatId,
            isMarkedAsUnread = dto.isMarkedAsUnread,
        )
    }

    fun map(dto: ChatIsMarkedAsUnreadUpdateDto): TdApi.UpdateChatIsMarkedAsUnread {
        return TdApi.UpdateChatIsMarkedAsUnread(
            chatId = dto.chatId,
            isMarkedAsUnread = dto.isMarkedAsUnread,
        )
    }

    fun map(dto: TdApi.UpdateChatViewAsTopics): ChatViewAsTopicsUpdateDto {
        return ChatViewAsTopicsUpdateDto(
            chatId = dto.chatId,
            viewAsTopics = dto.viewAsTopics,
        )
    }

    fun map(dto: ChatViewAsTopicsUpdateDto): TdApi.UpdateChatViewAsTopics {
        return TdApi.UpdateChatViewAsTopics(
            chatId = dto.chatId,
            viewAsTopics = dto.viewAsTopics,
        )
    }

    fun map(dto: TdApi.UpdateChatBlockList): ChatBlockListUpdateDto {
        return ChatBlockListUpdateDto(
            chatId = dto.chatId,
            blockList = dto.blockList?.let { map(it) },
        )
    }

    fun map(dto: ChatBlockListUpdateDto): TdApi.UpdateChatBlockList {
        return TdApi.UpdateChatBlockList(
            chatId = dto.chatId,
            blockList = dto.blockList?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatHasScheduledMessages): ChatHasScheduledMessagesUpdateDto {
        return ChatHasScheduledMessagesUpdateDto(
            chatId = dto.chatId,
            hasScheduledMessages = dto.hasScheduledMessages,
        )
    }

    fun map(dto: ChatHasScheduledMessagesUpdateDto): TdApi.UpdateChatHasScheduledMessages {
        return TdApi.UpdateChatHasScheduledMessages(
            chatId = dto.chatId,
            hasScheduledMessages = dto.hasScheduledMessages,
        )
    }

    fun map(dto: TdApi.UpdateChatFolders): ChatFoldersUpdateDto {
        return ChatFoldersUpdateDto(
            chatFolders = dto.chatFolders.mapArray { map(it) },
            mainChatListPosition = dto.mainChatListPosition,
            areTagsEnabled = dto.areTagsEnabled,
        )
    }

    fun map(dto: ChatFoldersUpdateDto): TdApi.UpdateChatFolders {
        return TdApi.UpdateChatFolders(
            chatFolders = dto.chatFolders.mapArray { map(it) },
            mainChatListPosition = dto.mainChatListPosition,
            areTagsEnabled = dto.areTagsEnabled,
        )
    }

    fun map(dto: TdApi.UpdateChatOnlineMemberCount): ChatOnlineMemberCountUpdateDto {
        return ChatOnlineMemberCountUpdateDto(
            chatId = dto.chatId,
            onlineMemberCount = dto.onlineMemberCount,
        )
    }

    fun map(dto: ChatOnlineMemberCountUpdateDto): TdApi.UpdateChatOnlineMemberCount {
        return TdApi.UpdateChatOnlineMemberCount(
            chatId = dto.chatId,
            onlineMemberCount = dto.onlineMemberCount,
        )
    }

    fun map(dto: TdApi.UpdateSavedMessagesTopic): SavedMessagesTopicUpdateDto {
        return SavedMessagesTopicUpdateDto(
            topic = map(dto.topic),
        )
    }

    fun map(dto: SavedMessagesTopicUpdateDto): TdApi.UpdateSavedMessagesTopic {
        return TdApi.UpdateSavedMessagesTopic(
            topic = map(dto.topic),
        )
    }

    fun map(dto: TdApi.UpdateSavedMessagesTopicCount): SavedMessagesTopicCountUpdateDto {
        return SavedMessagesTopicCountUpdateDto(
            topicCount = dto.topicCount,
        )
    }

    fun map(dto: SavedMessagesTopicCountUpdateDto): TdApi.UpdateSavedMessagesTopicCount {
        return TdApi.UpdateSavedMessagesTopicCount(
            topicCount = dto.topicCount,
        )
    }

    fun map(dto: TdApi.UpdateQuickReplyShortcut): QuickReplyShortcutUpdateDto {
        return QuickReplyShortcutUpdateDto(
            shortcut = map(dto.shortcut),
        )
    }

    fun map(dto: QuickReplyShortcutUpdateDto): TdApi.UpdateQuickReplyShortcut {
        return TdApi.UpdateQuickReplyShortcut(
            shortcut = map(dto.shortcut),
        )
    }

    fun map(dto: TdApi.UpdateQuickReplyShortcutDeleted): QuickReplyShortcutDeletedUpdateDto {
        return QuickReplyShortcutDeletedUpdateDto(
            shortcutId = dto.shortcutId,
        )
    }

    fun map(dto: QuickReplyShortcutDeletedUpdateDto): TdApi.UpdateQuickReplyShortcutDeleted {
        return TdApi.UpdateQuickReplyShortcutDeleted(
            shortcutId = dto.shortcutId,
        )
    }

    fun map(dto: TdApi.UpdateQuickReplyShortcuts): QuickReplyShortcutsUpdateDto {
        return QuickReplyShortcutsUpdateDto(
            shortcutIds = dto.shortcutIds,
        )
    }

    fun map(dto: QuickReplyShortcutsUpdateDto): TdApi.UpdateQuickReplyShortcuts {
        return TdApi.UpdateQuickReplyShortcuts(
            shortcutIds = dto.shortcutIds,
        )
    }

    fun map(dto: TdApi.UpdateQuickReplyShortcutMessages): QuickReplyShortcutMessagesUpdateDto {
        return QuickReplyShortcutMessagesUpdateDto(
            shortcutId = dto.shortcutId,
            messages = dto.messages.mapArray { map(it) },
        )
    }

    fun map(dto: QuickReplyShortcutMessagesUpdateDto): TdApi.UpdateQuickReplyShortcutMessages {
        return TdApi.UpdateQuickReplyShortcutMessages(
            shortcutId = dto.shortcutId,
            messages = dto.messages.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateForumTopicInfo): ForumTopicInfoUpdateDto {
        return ForumTopicInfoUpdateDto(
            info = map(dto.info),
        )
    }

    fun map(dto: ForumTopicInfoUpdateDto): TdApi.UpdateForumTopicInfo {
        return TdApi.UpdateForumTopicInfo(
            info = map(dto.info),
        )
    }

    fun map(dto: TdApi.UpdateForumTopic): ForumTopicUpdateDto {
        return ForumTopicUpdateDto(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            isPinned = dto.isPinned,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: ForumTopicUpdateDto): TdApi.UpdateForumTopic {
        return TdApi.UpdateForumTopic(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            isPinned = dto.isPinned,
            lastReadInboxMessageId = dto.lastReadInboxMessageId,
            lastReadOutboxMessageId = dto.lastReadOutboxMessageId,
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: TdApi.UpdateScopeNotificationSettings): ScopeNotificationSettingsUpdateDto {
        return ScopeNotificationSettingsUpdateDto(
            scope = map(dto.scope),
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: ScopeNotificationSettingsUpdateDto): TdApi.UpdateScopeNotificationSettings {
        return TdApi.UpdateScopeNotificationSettings(
            scope = map(dto.scope),
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: TdApi.UpdateReactionNotificationSettings): ReactionNotificationSettingsUpdateDto {
        return ReactionNotificationSettingsUpdateDto(
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: ReactionNotificationSettingsUpdateDto): TdApi.UpdateReactionNotificationSettings {
        return TdApi.UpdateReactionNotificationSettings(
            notificationSettings = map(dto.notificationSettings),
        )
    }

    fun map(dto: TdApi.UpdateNotification): NotificationUpdateDto {
        return NotificationUpdateDto(
            notificationGroupId = dto.notificationGroupId,
            notification = map(dto.notification),
        )
    }

    fun map(dto: NotificationUpdateDto): TdApi.UpdateNotification {
        return TdApi.UpdateNotification(
            notificationGroupId = dto.notificationGroupId,
            notification = map(dto.notification),
        )
    }

    fun map(dto: TdApi.UpdateNotificationGroup): NotificationGroupUpdateDto {
        return NotificationGroupUpdateDto(
            notificationGroupId = dto.notificationGroupId,
            type = map(dto.type),
            chatId = dto.chatId,
            notificationSettingsChatId = dto.notificationSettingsChatId,
            notificationSoundId = dto.notificationSoundId,
            totalCount = dto.totalCount,
            addedNotifications = dto.addedNotifications.mapArray { map(it) },
            removedNotificationIds = dto.removedNotificationIds,
        )
    }

    fun map(dto: NotificationGroupUpdateDto): TdApi.UpdateNotificationGroup {
        return TdApi.UpdateNotificationGroup(
            notificationGroupId = dto.notificationGroupId,
            type = map(dto.type),
            chatId = dto.chatId,
            notificationSettingsChatId = dto.notificationSettingsChatId,
            notificationSoundId = dto.notificationSoundId,
            totalCount = dto.totalCount,
            addedNotifications = dto.addedNotifications.mapArray { map(it) },
            removedNotificationIds = dto.removedNotificationIds,
        )
    }

    fun map(dto: TdApi.UpdateActiveNotifications): ActiveNotificationsUpdateDto {
        return ActiveNotificationsUpdateDto(
            groups = dto.groups.mapArray { map(it) },
        )
    }

    fun map(dto: ActiveNotificationsUpdateDto): TdApi.UpdateActiveNotifications {
        return TdApi.UpdateActiveNotifications(
            groups = dto.groups.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateHavePendingNotifications): HavePendingNotificationsUpdateDto {
        return HavePendingNotificationsUpdateDto(
            haveDelayedNotifications = dto.haveDelayedNotifications,
            haveUnreceivedNotifications = dto.haveUnreceivedNotifications,
        )
    }

    fun map(dto: HavePendingNotificationsUpdateDto): TdApi.UpdateHavePendingNotifications {
        return TdApi.UpdateHavePendingNotifications(
            haveDelayedNotifications = dto.haveDelayedNotifications,
            haveUnreceivedNotifications = dto.haveUnreceivedNotifications,
        )
    }

    fun map(dto: TdApi.UpdateDeleteMessages): DeleteMessagesUpdateDto {
        return DeleteMessagesUpdateDto(
            chatId = dto.chatId,
            messageIds = dto.messageIds,
            isPermanent = dto.isPermanent,
            fromCache = dto.fromCache,
        )
    }

    fun map(dto: DeleteMessagesUpdateDto): TdApi.UpdateDeleteMessages {
        return TdApi.UpdateDeleteMessages(
            chatId = dto.chatId,
            messageIds = dto.messageIds,
            isPermanent = dto.isPermanent,
            fromCache = dto.fromCache,
        )
    }

    fun map(dto: TdApi.UpdateChatAction): ChatActionUpdateDto {
        return ChatActionUpdateDto(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            senderId = map(dto.senderId),
            action = map(dto.action),
        )
    }

    fun map(dto: ChatActionUpdateDto): TdApi.UpdateChatAction {
        return TdApi.UpdateChatAction(
            chatId = dto.chatId,
            messageThreadId = dto.messageThreadId,
            senderId = map(dto.senderId),
            action = map(dto.action),
        )
    }

    fun map(dto: TdApi.UpdateUserStatus): UserStatusUpdateDto {
        return UserStatusUpdateDto(
            userId = dto.userId,
            status = map(dto.status),
        )
    }

    fun map(dto: UserStatusUpdateDto): TdApi.UpdateUserStatus {
        return TdApi.UpdateUserStatus(
            userId = dto.userId,
            status = map(dto.status),
        )
    }

    fun map(dto: TdApi.UpdateUser): UserUpdateDto {
        return UserUpdateDto(
            user = map(dto.user),
        )
    }

    fun map(dto: UserUpdateDto): TdApi.UpdateUser {
        return TdApi.UpdateUser(
            user = map(dto.user),
        )
    }

    fun map(dto: TdApi.UpdateBasicGroup): BasicGroupUpdateDto {
        return BasicGroupUpdateDto(
            basicGroup = map(dto.basicGroup),
        )
    }

    fun map(dto: BasicGroupUpdateDto): TdApi.UpdateBasicGroup {
        return TdApi.UpdateBasicGroup(
            basicGroup = map(dto.basicGroup),
        )
    }

    fun map(dto: TdApi.UpdateSupergroup): SupergroupUpdateDto {
        return SupergroupUpdateDto(
            supergroup = map(dto.supergroup),
        )
    }

    fun map(dto: SupergroupUpdateDto): TdApi.UpdateSupergroup {
        return TdApi.UpdateSupergroup(
            supergroup = map(dto.supergroup),
        )
    }

    fun map(dto: TdApi.UpdateSecretChat): SecretChatUpdateDto {
        return SecretChatUpdateDto(
            secretChat = map(dto.secretChat),
        )
    }

    fun map(dto: SecretChatUpdateDto): TdApi.UpdateSecretChat {
        return TdApi.UpdateSecretChat(
            secretChat = map(dto.secretChat),
        )
    }

    fun map(dto: TdApi.UpdateUserFullInfo): UserFullInfoUpdateDto {
        return UserFullInfoUpdateDto(
            userId = dto.userId,
            userFullInfo = map(dto.userFullInfo),
        )
    }

    fun map(dto: UserFullInfoUpdateDto): TdApi.UpdateUserFullInfo {
        return TdApi.UpdateUserFullInfo(
            userId = dto.userId,
            userFullInfo = map(dto.userFullInfo),
        )
    }

    fun map(dto: TdApi.UpdateBasicGroupFullInfo): BasicGroupFullInfoUpdateDto {
        return BasicGroupFullInfoUpdateDto(
            basicGroupId = dto.basicGroupId,
            basicGroupFullInfo = map(dto.basicGroupFullInfo),
        )
    }

    fun map(dto: BasicGroupFullInfoUpdateDto): TdApi.UpdateBasicGroupFullInfo {
        return TdApi.UpdateBasicGroupFullInfo(
            basicGroupId = dto.basicGroupId,
            basicGroupFullInfo = map(dto.basicGroupFullInfo),
        )
    }

    fun map(dto: TdApi.UpdateSupergroupFullInfo): SupergroupFullInfoUpdateDto {
        return SupergroupFullInfoUpdateDto(
            supergroupId = dto.supergroupId,
            supergroupFullInfo = map(dto.supergroupFullInfo),
        )
    }

    fun map(dto: SupergroupFullInfoUpdateDto): TdApi.UpdateSupergroupFullInfo {
        return TdApi.UpdateSupergroupFullInfo(
            supergroupId = dto.supergroupId,
            supergroupFullInfo = map(dto.supergroupFullInfo),
        )
    }

    fun map(dto: TdApi.UpdateServiceNotification): ServiceNotificationUpdateDto {
        return ServiceNotificationUpdateDto(
            type = dto.type,
            content = map(dto.content),
        )
    }

    fun map(dto: ServiceNotificationUpdateDto): TdApi.UpdateServiceNotification {
        return TdApi.UpdateServiceNotification(
            type = dto.type,
            content = map(dto.content),
        )
    }

    fun map(dto: TdApi.UpdateFile): FileUpdateDto {
        return FileUpdateDto(
            file = map(dto.file),
        )
    }

    fun map(dto: FileUpdateDto): TdApi.UpdateFile {
        return TdApi.UpdateFile(
            file = map(dto.file),
        )
    }

    fun map(dto: TdApi.UpdateFileGenerationStart): FileGenerationStartUpdateDto {
        return FileGenerationStartUpdateDto(
            generationId = dto.generationId,
            originalPath = dto.originalPath,
            destinationPath = dto.destinationPath,
            conversion = dto.conversion,
        )
    }

    fun map(dto: FileGenerationStartUpdateDto): TdApi.UpdateFileGenerationStart {
        return TdApi.UpdateFileGenerationStart(
            generationId = dto.generationId,
            originalPath = dto.originalPath,
            destinationPath = dto.destinationPath,
            conversion = dto.conversion,
        )
    }

    fun map(dto: TdApi.UpdateFileGenerationStop): FileGenerationStopUpdateDto {
        return FileGenerationStopUpdateDto(
            generationId = dto.generationId,
        )
    }

    fun map(dto: FileGenerationStopUpdateDto): TdApi.UpdateFileGenerationStop {
        return TdApi.UpdateFileGenerationStop(
            generationId = dto.generationId,
        )
    }

    fun map(dto: TdApi.UpdateFileDownloads): FileDownloadsUpdateDto {
        return FileDownloadsUpdateDto(
            totalSize = dto.totalSize,
            totalCount = dto.totalCount,
            downloadedSize = dto.downloadedSize,
        )
    }

    fun map(dto: FileDownloadsUpdateDto): TdApi.UpdateFileDownloads {
        return TdApi.UpdateFileDownloads(
            totalSize = dto.totalSize,
            totalCount = dto.totalCount,
            downloadedSize = dto.downloadedSize,
        )
    }

    fun map(dto: TdApi.UpdateFileAddedToDownloads): FileAddedToDownloadsUpdateDto {
        return FileAddedToDownloadsUpdateDto(
            fileDownload = map(dto.fileDownload),
            counts = map(dto.counts),
        )
    }

    fun map(dto: FileAddedToDownloadsUpdateDto): TdApi.UpdateFileAddedToDownloads {
        return TdApi.UpdateFileAddedToDownloads(
            fileDownload = map(dto.fileDownload),
            counts = map(dto.counts),
        )
    }

    fun map(dto: TdApi.UpdateFileDownload): FileDownloadUpdateDto {
        return FileDownloadUpdateDto(
            fileId = dto.fileId,
            completeDate = dto.completeDate,
            isPaused = dto.isPaused,
            counts = map(dto.counts),
        )
    }

    fun map(dto: FileDownloadUpdateDto): TdApi.UpdateFileDownload {
        return TdApi.UpdateFileDownload(
            fileId = dto.fileId,
            completeDate = dto.completeDate,
            isPaused = dto.isPaused,
            counts = map(dto.counts),
        )
    }

    fun map(dto: TdApi.UpdateFileRemovedFromDownloads): FileRemovedFromDownloadsUpdateDto {
        return FileRemovedFromDownloadsUpdateDto(
            fileId = dto.fileId,
            counts = map(dto.counts),
        )
    }

    fun map(dto: FileRemovedFromDownloadsUpdateDto): TdApi.UpdateFileRemovedFromDownloads {
        return TdApi.UpdateFileRemovedFromDownloads(
            fileId = dto.fileId,
            counts = map(dto.counts),
        )
    }

    fun map(dto: TdApi.UpdateApplicationVerificationRequired): ApplicationVerificationRequiredUpdateDto {
        return ApplicationVerificationRequiredUpdateDto(
            verificationId = dto.verificationId,
            nonce = dto.nonce,
            cloudProjectNumber = dto.cloudProjectNumber,
        )
    }

    fun map(dto: ApplicationVerificationRequiredUpdateDto): TdApi.UpdateApplicationVerificationRequired {
        return TdApi.UpdateApplicationVerificationRequired(
            verificationId = dto.verificationId,
            nonce = dto.nonce,
            cloudProjectNumber = dto.cloudProjectNumber,
        )
    }

    fun map(dto: TdApi.UpdateApplicationRecaptchaVerificationRequired): ApplicationRecaptchaVerificationRequiredUpdateDto {
        return ApplicationRecaptchaVerificationRequiredUpdateDto(
            verificationId = dto.verificationId,
            action = dto.action,
            recaptchaKeyId = dto.recaptchaKeyId,
        )
    }

    fun map(dto: ApplicationRecaptchaVerificationRequiredUpdateDto): TdApi.UpdateApplicationRecaptchaVerificationRequired {
        return TdApi.UpdateApplicationRecaptchaVerificationRequired(
            verificationId = dto.verificationId,
            action = dto.action,
            recaptchaKeyId = dto.recaptchaKeyId,
        )
    }

    fun map(dto: TdApi.UpdateCall): CallUpdateDto {
        return CallUpdateDto(
            call = map(dto.call),
        )
    }

    fun map(dto: CallUpdateDto): TdApi.UpdateCall {
        return TdApi.UpdateCall(
            call = map(dto.call),
        )
    }

    fun map(dto: TdApi.UpdateGroupCall): GroupCallUpdateDto {
        return GroupCallUpdateDto(
            groupCall = map(dto.groupCall),
        )
    }

    fun map(dto: GroupCallUpdateDto): TdApi.UpdateGroupCall {
        return TdApi.UpdateGroupCall(
            groupCall = map(dto.groupCall),
        )
    }

    fun map(dto: TdApi.UpdateGroupCallParticipant): GroupCallParticipantUpdateDto {
        return GroupCallParticipantUpdateDto(
            groupCallId = dto.groupCallId,
            participant = map(dto.participant),
        )
    }

    fun map(dto: GroupCallParticipantUpdateDto): TdApi.UpdateGroupCallParticipant {
        return TdApi.UpdateGroupCallParticipant(
            groupCallId = dto.groupCallId,
            participant = map(dto.participant),
        )
    }

    fun map(dto: TdApi.UpdateGroupCallParticipants): GroupCallParticipantsUpdateDto {
        return GroupCallParticipantsUpdateDto(
            groupCallId = dto.groupCallId,
            participantUserIds = dto.participantUserIds,
        )
    }

    fun map(dto: GroupCallParticipantsUpdateDto): TdApi.UpdateGroupCallParticipants {
        return TdApi.UpdateGroupCallParticipants(
            groupCallId = dto.groupCallId,
            participantUserIds = dto.participantUserIds,
        )
    }

    fun map(dto: TdApi.UpdateGroupCallVerificationState): GroupCallVerificationStateUpdateDto {
        return GroupCallVerificationStateUpdateDto(
            groupCallId = dto.groupCallId,
            generation = dto.generation,
            emojis = dto.emojis,
        )
    }

    fun map(dto: GroupCallVerificationStateUpdateDto): TdApi.UpdateGroupCallVerificationState {
        return TdApi.UpdateGroupCallVerificationState(
            groupCallId = dto.groupCallId,
            generation = dto.generation,
            emojis = dto.emojis,
        )
    }

    fun map(dto: TdApi.UpdateNewCallSignalingData): NewCallSignalingDataUpdateDto {
        return NewCallSignalingDataUpdateDto(
            callId = dto.callId,
            data = dto.data,
        )
    }

    fun map(dto: NewCallSignalingDataUpdateDto): TdApi.UpdateNewCallSignalingData {
        return TdApi.UpdateNewCallSignalingData(
            callId = dto.callId,
            data = dto.data,
        )
    }

    fun map(dto: TdApi.UpdateUserPrivacySettingRules): UserPrivacySettingRulesUpdateDto {
        return UserPrivacySettingRulesUpdateDto(
            setting = map(dto.setting),
            rules = map(dto.rules),
        )
    }

    fun map(dto: UserPrivacySettingRulesUpdateDto): TdApi.UpdateUserPrivacySettingRules {
        return TdApi.UpdateUserPrivacySettingRules(
            setting = map(dto.setting),
            rules = map(dto.rules),
        )
    }

    fun map(dto: TdApi.UpdateUnreadMessageCount): UnreadMessageCountUpdateDto {
        return UnreadMessageCountUpdateDto(
            chatList = map(dto.chatList),
            unreadCount = dto.unreadCount,
            unreadUnmutedCount = dto.unreadUnmutedCount,
        )
    }

    fun map(dto: UnreadMessageCountUpdateDto): TdApi.UpdateUnreadMessageCount {
        return TdApi.UpdateUnreadMessageCount(
            chatList = map(dto.chatList),
            unreadCount = dto.unreadCount,
            unreadUnmutedCount = dto.unreadUnmutedCount,
        )
    }

    fun map(dto: TdApi.UpdateUnreadChatCount): UnreadChatCountUpdateDto {
        return UnreadChatCountUpdateDto(
            chatList = map(dto.chatList),
            totalCount = dto.totalCount,
            unreadCount = dto.unreadCount,
            unreadUnmutedCount = dto.unreadUnmutedCount,
            markedAsUnreadCount = dto.markedAsUnreadCount,
            markedAsUnreadUnmutedCount = dto.markedAsUnreadUnmutedCount,
        )
    }

    fun map(dto: UnreadChatCountUpdateDto): TdApi.UpdateUnreadChatCount {
        return TdApi.UpdateUnreadChatCount(
            chatList = map(dto.chatList),
            totalCount = dto.totalCount,
            unreadCount = dto.unreadCount,
            unreadUnmutedCount = dto.unreadUnmutedCount,
            markedAsUnreadCount = dto.markedAsUnreadCount,
            markedAsUnreadUnmutedCount = dto.markedAsUnreadUnmutedCount,
        )
    }

    fun map(dto: TdApi.UpdateStory): StoryUpdateDto {
        return StoryUpdateDto(
            story = map(dto.story),
        )
    }

    fun map(dto: StoryUpdateDto): TdApi.UpdateStory {
        return TdApi.UpdateStory(
            story = map(dto.story),
        )
    }

    fun map(dto: TdApi.UpdateStoryDeleted): StoryDeletedUpdateDto {
        return StoryDeletedUpdateDto(
            storyPosterChatId = dto.storyPosterChatId,
            storyId = dto.storyId,
        )
    }

    fun map(dto: StoryDeletedUpdateDto): TdApi.UpdateStoryDeleted {
        return TdApi.UpdateStoryDeleted(
            storyPosterChatId = dto.storyPosterChatId,
            storyId = dto.storyId,
        )
    }

    fun map(dto: TdApi.UpdateStoryPostSucceeded): StoryPostSucceededUpdateDto {
        return StoryPostSucceededUpdateDto(
            story = map(dto.story),
            oldStoryId = dto.oldStoryId,
        )
    }

    fun map(dto: StoryPostSucceededUpdateDto): TdApi.UpdateStoryPostSucceeded {
        return TdApi.UpdateStoryPostSucceeded(
            story = map(dto.story),
            oldStoryId = dto.oldStoryId,
        )
    }

    fun map(dto: TdApi.UpdateStoryPostFailed): StoryPostFailedUpdateDto {
        return StoryPostFailedUpdateDto(
            story = map(dto.story),
            error = map(dto.error),
            errorType = dto.errorType?.let { map(it) },
        )
    }

    fun map(dto: StoryPostFailedUpdateDto): TdApi.UpdateStoryPostFailed {
        return TdApi.UpdateStoryPostFailed(
            story = map(dto.story),
            error = map(dto.error),
            errorType = dto.errorType?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatActiveStories): ChatActiveStoriesUpdateDto {
        return ChatActiveStoriesUpdateDto(
            activeStories = map(dto.activeStories),
        )
    }

    fun map(dto: ChatActiveStoriesUpdateDto): TdApi.UpdateChatActiveStories {
        return TdApi.UpdateChatActiveStories(
            activeStories = map(dto.activeStories),
        )
    }

    fun map(dto: TdApi.UpdateStoryListChatCount): StoryListChatCountUpdateDto {
        return StoryListChatCountUpdateDto(
            storyList = map(dto.storyList),
            chatCount = dto.chatCount,
        )
    }

    fun map(dto: StoryListChatCountUpdateDto): TdApi.UpdateStoryListChatCount {
        return TdApi.UpdateStoryListChatCount(
            storyList = map(dto.storyList),
            chatCount = dto.chatCount,
        )
    }

    fun map(dto: TdApi.UpdateStoryStealthMode): StoryStealthModeUpdateDto {
        return StoryStealthModeUpdateDto(
            activeUntilDate = dto.activeUntilDate,
            cooldownUntilDate = dto.cooldownUntilDate,
        )
    }

    fun map(dto: StoryStealthModeUpdateDto): TdApi.UpdateStoryStealthMode {
        return TdApi.UpdateStoryStealthMode(
            activeUntilDate = dto.activeUntilDate,
            cooldownUntilDate = dto.cooldownUntilDate,
        )
    }

    fun map(dto: TdApi.UpdateOption): OptionUpdateDto {
        return OptionUpdateDto(
            name = dto.name,
            value = map(dto.value),
        )
    }

    fun map(dto: OptionUpdateDto): TdApi.UpdateOption {
        return TdApi.UpdateOption(
            name = dto.name,
            value = map(dto.value),
        )
    }

    fun map(dto: TdApi.UpdateStickerSet): StickerSetUpdateDto {
        return StickerSetUpdateDto(
            stickerSet = map(dto.stickerSet),
        )
    }

    fun map(dto: StickerSetUpdateDto): TdApi.UpdateStickerSet {
        return TdApi.UpdateStickerSet(
            stickerSet = map(dto.stickerSet),
        )
    }

    fun map(dto: TdApi.UpdateInstalledStickerSets): InstalledStickerSetsUpdateDto {
        return InstalledStickerSetsUpdateDto(
            stickerType = map(dto.stickerType),
            stickerSetIds = dto.stickerSetIds,
        )
    }

    fun map(dto: InstalledStickerSetsUpdateDto): TdApi.UpdateInstalledStickerSets {
        return TdApi.UpdateInstalledStickerSets(
            stickerType = map(dto.stickerType),
            stickerSetIds = dto.stickerSetIds,
        )
    }

    fun map(dto: TdApi.UpdateTrendingStickerSets): TrendingStickerSetsUpdateDto {
        return TrendingStickerSetsUpdateDto(
            stickerType = map(dto.stickerType),
            stickerSets = map(dto.stickerSets),
        )
    }

    fun map(dto: TrendingStickerSetsUpdateDto): TdApi.UpdateTrendingStickerSets {
        return TdApi.UpdateTrendingStickerSets(
            stickerType = map(dto.stickerType),
            stickerSets = map(dto.stickerSets),
        )
    }

    fun map(dto: TdApi.UpdateRecentStickers): RecentStickersUpdateDto {
        return RecentStickersUpdateDto(
            isAttached = dto.isAttached,
            stickerIds = dto.stickerIds,
        )
    }

    fun map(dto: RecentStickersUpdateDto): TdApi.UpdateRecentStickers {
        return TdApi.UpdateRecentStickers(
            isAttached = dto.isAttached,
            stickerIds = dto.stickerIds,
        )
    }

    fun map(dto: TdApi.UpdateFavoriteStickers): FavoriteStickersUpdateDto {
        return FavoriteStickersUpdateDto(
            stickerIds = dto.stickerIds,
        )
    }

    fun map(dto: FavoriteStickersUpdateDto): TdApi.UpdateFavoriteStickers {
        return TdApi.UpdateFavoriteStickers(
            stickerIds = dto.stickerIds,
        )
    }

    fun map(dto: TdApi.UpdateSavedAnimations): SavedAnimationsUpdateDto {
        return SavedAnimationsUpdateDto(
            animationIds = dto.animationIds,
        )
    }

    fun map(dto: SavedAnimationsUpdateDto): TdApi.UpdateSavedAnimations {
        return TdApi.UpdateSavedAnimations(
            animationIds = dto.animationIds,
        )
    }

    fun map(dto: TdApi.UpdateSavedNotificationSounds): SavedNotificationSoundsUpdateDto {
        return SavedNotificationSoundsUpdateDto(
            notificationSoundIds = dto.notificationSoundIds,
        )
    }

    fun map(dto: SavedNotificationSoundsUpdateDto): TdApi.UpdateSavedNotificationSounds {
        return TdApi.UpdateSavedNotificationSounds(
            notificationSoundIds = dto.notificationSoundIds,
        )
    }

    fun map(dto: TdApi.UpdateDefaultBackground): DefaultBackgroundUpdateDto {
        return DefaultBackgroundUpdateDto(
            forDarkTheme = dto.forDarkTheme,
            background = dto.background?.let { map(it) },
        )
    }

    fun map(dto: DefaultBackgroundUpdateDto): TdApi.UpdateDefaultBackground {
        return TdApi.UpdateDefaultBackground(
            forDarkTheme = dto.forDarkTheme,
            background = dto.background?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatThemes): ChatThemesUpdateDto {
        return ChatThemesUpdateDto(
            chatThemes = dto.chatThemes.mapArray { map(it) },
        )
    }

    fun map(dto: ChatThemesUpdateDto): TdApi.UpdateChatThemes {
        return TdApi.UpdateChatThemes(
            chatThemes = dto.chatThemes.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateAccentColors): AccentColorsUpdateDto {
        return AccentColorsUpdateDto(
            colors = dto.colors.mapArray { map(it) },
            availableAccentColorIds = dto.availableAccentColorIds,
        )
    }

    fun map(dto: AccentColorsUpdateDto): TdApi.UpdateAccentColors {
        return TdApi.UpdateAccentColors(
            colors = dto.colors.mapArray { map(it) },
            availableAccentColorIds = dto.availableAccentColorIds,
        )
    }

    fun map(dto: TdApi.UpdateProfileAccentColors): ProfileAccentColorsUpdateDto {
        return ProfileAccentColorsUpdateDto(
            colors = dto.colors.mapArray { map(it) },
            availableAccentColorIds = dto.availableAccentColorIds,
        )
    }

    fun map(dto: ProfileAccentColorsUpdateDto): TdApi.UpdateProfileAccentColors {
        return TdApi.UpdateProfileAccentColors(
            colors = dto.colors.mapArray { map(it) },
            availableAccentColorIds = dto.availableAccentColorIds,
        )
    }

    fun map(dto: TdApi.UpdateLanguagePackStrings): LanguagePackStringsUpdateDto {
        return LanguagePackStringsUpdateDto(
            localizationTarget = dto.localizationTarget,
            languagePackId = dto.languagePackId,
            strings = dto.strings.mapArray { map(it) },
        )
    }

    fun map(dto: LanguagePackStringsUpdateDto): TdApi.UpdateLanguagePackStrings {
        return TdApi.UpdateLanguagePackStrings(
            localizationTarget = dto.localizationTarget,
            languagePackId = dto.languagePackId,
            strings = dto.strings.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateConnectionState): ConnectionStateUpdateDto {
        return ConnectionStateUpdateDto(
            state = map(dto.state),
        )
    }

    fun map(dto: ConnectionStateUpdateDto): TdApi.UpdateConnectionState {
        return TdApi.UpdateConnectionState(
            state = map(dto.state),
        )
    }

    fun map(dto: TdApi.UpdateFreezeState): FreezeStateUpdateDto {
        return FreezeStateUpdateDto(
            isFrozen = dto.isFrozen,
            freezingDate = dto.freezingDate,
            deletionDate = dto.deletionDate,
            appealLink = dto.appealLink,
        )
    }

    fun map(dto: FreezeStateUpdateDto): TdApi.UpdateFreezeState {
        return TdApi.UpdateFreezeState(
            isFrozen = dto.isFrozen,
            freezingDate = dto.freezingDate,
            deletionDate = dto.deletionDate,
            appealLink = dto.appealLink,
        )
    }

    fun map(dto: TdApi.UpdateTermsOfService): TermsOfServiceUpdateDto {
        return TermsOfServiceUpdateDto(
            termsOfServiceId = dto.termsOfServiceId,
            termsOfService = map(dto.termsOfService),
        )
    }

    fun map(dto: TermsOfServiceUpdateDto): TdApi.UpdateTermsOfService {
        return TdApi.UpdateTermsOfService(
            termsOfServiceId = dto.termsOfServiceId,
            termsOfService = map(dto.termsOfService),
        )
    }

    fun map(dto: TdApi.UpdateUnconfirmedSession): UnconfirmedSessionUpdateDto {
        return UnconfirmedSessionUpdateDto(
            session = dto.session?.let { map(it) },
        )
    }

    fun map(dto: UnconfirmedSessionUpdateDto): TdApi.UpdateUnconfirmedSession {
        return TdApi.UpdateUnconfirmedSession(
            session = dto.session?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateAttachmentMenuBots): AttachmentMenuBotsUpdateDto {
        return AttachmentMenuBotsUpdateDto(
            bots = dto.bots.mapArray { map(it) },
        )
    }

    fun map(dto: AttachmentMenuBotsUpdateDto): TdApi.UpdateAttachmentMenuBots {
        return TdApi.UpdateAttachmentMenuBots(
            bots = dto.bots.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateWebAppMessageSent): WebAppMessageSentUpdateDto {
        return WebAppMessageSentUpdateDto(
            webAppLaunchId = dto.webAppLaunchId,
        )
    }

    fun map(dto: WebAppMessageSentUpdateDto): TdApi.UpdateWebAppMessageSent {
        return TdApi.UpdateWebAppMessageSent(
            webAppLaunchId = dto.webAppLaunchId,
        )
    }

    fun map(dto: TdApi.UpdateActiveEmojiReactions): ActiveEmojiReactionsUpdateDto {
        return ActiveEmojiReactionsUpdateDto(
            emojis = dto.emojis,
        )
    }

    fun map(dto: ActiveEmojiReactionsUpdateDto): TdApi.UpdateActiveEmojiReactions {
        return TdApi.UpdateActiveEmojiReactions(
            emojis = dto.emojis,
        )
    }

    fun map(dto: TdApi.UpdateAvailableMessageEffects): AvailableMessageEffectsUpdateDto {
        return AvailableMessageEffectsUpdateDto(
            reactionEffectIds = dto.reactionEffectIds,
            stickerEffectIds = dto.stickerEffectIds,
        )
    }

    fun map(dto: AvailableMessageEffectsUpdateDto): TdApi.UpdateAvailableMessageEffects {
        return TdApi.UpdateAvailableMessageEffects(
            reactionEffectIds = dto.reactionEffectIds,
            stickerEffectIds = dto.stickerEffectIds,
        )
    }

    fun map(dto: TdApi.UpdateDefaultReactionType): DefaultReactionTypeUpdateDto {
        return DefaultReactionTypeUpdateDto(
            reactionType = map(dto.reactionType),
        )
    }

    fun map(dto: DefaultReactionTypeUpdateDto): TdApi.UpdateDefaultReactionType {
        return TdApi.UpdateDefaultReactionType(
            reactionType = map(dto.reactionType),
        )
    }

    fun map(dto: TdApi.UpdateDefaultPaidReactionType): DefaultPaidReactionTypeUpdateDto {
        return DefaultPaidReactionTypeUpdateDto(
            type = map(dto.type),
        )
    }

    fun map(dto: DefaultPaidReactionTypeUpdateDto): TdApi.UpdateDefaultPaidReactionType {
        return TdApi.UpdateDefaultPaidReactionType(
            type = map(dto.type),
        )
    }

    fun map(dto: TdApi.UpdateSavedMessagesTags): SavedMessagesTagsUpdateDto {
        return SavedMessagesTagsUpdateDto(
            savedMessagesTopicId = dto.savedMessagesTopicId,
            tags = map(dto.tags),
        )
    }

    fun map(dto: SavedMessagesTagsUpdateDto): TdApi.UpdateSavedMessagesTags {
        return TdApi.UpdateSavedMessagesTags(
            savedMessagesTopicId = dto.savedMessagesTopicId,
            tags = map(dto.tags),
        )
    }

    fun map(dto: TdApi.UpdateActiveLiveLocationMessages): ActiveLiveLocationMessagesUpdateDto {
        return ActiveLiveLocationMessagesUpdateDto(
            messages = dto.messages.mapArray { map(it) },
        )
    }

    fun map(dto: ActiveLiveLocationMessagesUpdateDto): TdApi.UpdateActiveLiveLocationMessages {
        return TdApi.UpdateActiveLiveLocationMessages(
            messages = dto.messages.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateOwnedStarCount): OwnedStarCountUpdateDto {
        return OwnedStarCountUpdateDto(
            starAmount = map(dto.starAmount),
        )
    }

    fun map(dto: OwnedStarCountUpdateDto): TdApi.UpdateOwnedStarCount {
        return TdApi.UpdateOwnedStarCount(
            starAmount = map(dto.starAmount),
        )
    }

    fun map(dto: TdApi.UpdateChatRevenueAmount): ChatRevenueAmountUpdateDto {
        return ChatRevenueAmountUpdateDto(
            chatId = dto.chatId,
            revenueAmount = map(dto.revenueAmount),
        )
    }

    fun map(dto: ChatRevenueAmountUpdateDto): TdApi.UpdateChatRevenueAmount {
        return TdApi.UpdateChatRevenueAmount(
            chatId = dto.chatId,
            revenueAmount = map(dto.revenueAmount),
        )
    }

    fun map(dto: TdApi.UpdateStarRevenueStatus): StarRevenueStatusUpdateDto {
        return StarRevenueStatusUpdateDto(
            ownerId = map(dto.ownerId),
            status = map(dto.status),
        )
    }

    fun map(dto: StarRevenueStatusUpdateDto): TdApi.UpdateStarRevenueStatus {
        return TdApi.UpdateStarRevenueStatus(
            ownerId = map(dto.ownerId),
            status = map(dto.status),
        )
    }

    fun map(dto: TdApi.UpdateSpeechRecognitionTrial): SpeechRecognitionTrialUpdateDto {
        return SpeechRecognitionTrialUpdateDto(
            maxMediaDuration = dto.maxMediaDuration,
            weeklyCount = dto.weeklyCount,
            leftCount = dto.leftCount,
            nextResetDate = dto.nextResetDate,
        )
    }

    fun map(dto: SpeechRecognitionTrialUpdateDto): TdApi.UpdateSpeechRecognitionTrial {
        return TdApi.UpdateSpeechRecognitionTrial(
            maxMediaDuration = dto.maxMediaDuration,
            weeklyCount = dto.weeklyCount,
            leftCount = dto.leftCount,
            nextResetDate = dto.nextResetDate,
        )
    }

    fun map(dto: TdApi.UpdateDiceEmojis): DiceEmojisUpdateDto {
        return DiceEmojisUpdateDto(
            emojis = dto.emojis,
        )
    }

    fun map(dto: DiceEmojisUpdateDto): TdApi.UpdateDiceEmojis {
        return TdApi.UpdateDiceEmojis(
            emojis = dto.emojis,
        )
    }

    fun map(dto: TdApi.UpdateAnimatedEmojiMessageClicked): AnimatedEmojiMessageClickedUpdateDto {
        return AnimatedEmojiMessageClickedUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            sticker = map(dto.sticker),
        )
    }

    fun map(dto: AnimatedEmojiMessageClickedUpdateDto): TdApi.UpdateAnimatedEmojiMessageClicked {
        return TdApi.UpdateAnimatedEmojiMessageClicked(
            chatId = dto.chatId,
            messageId = dto.messageId,
            sticker = map(dto.sticker),
        )
    }

    fun map(dto: TdApi.UpdateAnimationSearchParameters): AnimationSearchParametersUpdateDto {
        return AnimationSearchParametersUpdateDto(
            provider = dto.provider,
            emojis = dto.emojis,
        )
    }

    fun map(dto: AnimationSearchParametersUpdateDto): TdApi.UpdateAnimationSearchParameters {
        return TdApi.UpdateAnimationSearchParameters(
            provider = dto.provider,
            emojis = dto.emojis,
        )
    }

    fun map(dto: TdApi.UpdateSuggestedActions): SuggestedActionsUpdateDto {
        return SuggestedActionsUpdateDto(
            addedActions = dto.addedActions.mapArray { map(it) },
            removedActions = dto.removedActions.mapArray { map(it) },
        )
    }

    fun map(dto: SuggestedActionsUpdateDto): TdApi.UpdateSuggestedActions {
        return TdApi.UpdateSuggestedActions(
            addedActions = dto.addedActions.mapArray { map(it) },
            removedActions = dto.removedActions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateSpeedLimitNotification): SpeedLimitNotificationUpdateDto {
        return SpeedLimitNotificationUpdateDto(
            isUpload = dto.isUpload,
        )
    }

    fun map(dto: SpeedLimitNotificationUpdateDto): TdApi.UpdateSpeedLimitNotification {
        return TdApi.UpdateSpeedLimitNotification(
            isUpload = dto.isUpload,
        )
    }

    fun map(dto: TdApi.UpdateContactCloseBirthdays): ContactCloseBirthdaysUpdateDto {
        return ContactCloseBirthdaysUpdateDto(
            closeBirthdayUsers = dto.closeBirthdayUsers.mapArray { map(it) },
        )
    }

    fun map(dto: ContactCloseBirthdaysUpdateDto): TdApi.UpdateContactCloseBirthdays {
        return TdApi.UpdateContactCloseBirthdays(
            closeBirthdayUsers = dto.closeBirthdayUsers.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateAutosaveSettings): AutosaveSettingsUpdateDto {
        return AutosaveSettingsUpdateDto(
            scope = map(dto.scope),
            settings = dto.settings?.let { map(it) },
        )
    }

    fun map(dto: AutosaveSettingsUpdateDto): TdApi.UpdateAutosaveSettings {
        return TdApi.UpdateAutosaveSettings(
            scope = map(dto.scope),
            settings = dto.settings?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateBusinessConnection): BusinessConnectionUpdateDto {
        return BusinessConnectionUpdateDto(
            connection = map(dto.connection),
        )
    }

    fun map(dto: BusinessConnectionUpdateDto): TdApi.UpdateBusinessConnection {
        return TdApi.UpdateBusinessConnection(
            connection = map(dto.connection),
        )
    }

    fun map(dto: TdApi.UpdateNewBusinessMessage): NewBusinessMessageUpdateDto {
        return NewBusinessMessageUpdateDto(
            connectionId = dto.connectionId,
            message = map(dto.message),
        )
    }

    fun map(dto: NewBusinessMessageUpdateDto): TdApi.UpdateNewBusinessMessage {
        return TdApi.UpdateNewBusinessMessage(
            connectionId = dto.connectionId,
            message = map(dto.message),
        )
    }

    fun map(dto: TdApi.UpdateBusinessMessageEdited): BusinessMessageEditedUpdateDto {
        return BusinessMessageEditedUpdateDto(
            connectionId = dto.connectionId,
            message = map(dto.message),
        )
    }

    fun map(dto: BusinessMessageEditedUpdateDto): TdApi.UpdateBusinessMessageEdited {
        return TdApi.UpdateBusinessMessageEdited(
            connectionId = dto.connectionId,
            message = map(dto.message),
        )
    }

    fun map(dto: TdApi.UpdateBusinessMessagesDeleted): BusinessMessagesDeletedUpdateDto {
        return BusinessMessagesDeletedUpdateDto(
            connectionId = dto.connectionId,
            chatId = dto.chatId,
            messageIds = dto.messageIds,
        )
    }

    fun map(dto: BusinessMessagesDeletedUpdateDto): TdApi.UpdateBusinessMessagesDeleted {
        return TdApi.UpdateBusinessMessagesDeleted(
            connectionId = dto.connectionId,
            chatId = dto.chatId,
            messageIds = dto.messageIds,
        )
    }

    fun map(dto: TdApi.UpdateNewInlineQuery): NewInlineQueryUpdateDto {
        return NewInlineQueryUpdateDto(
            id = dto.id,
            senderUserId = dto.senderUserId,
            userLocation = dto.userLocation?.let { map(it) },
            chatType = dto.chatType?.let { map(it) },
            query = dto.query,
            offset = dto.offset,
        )
    }

    fun map(dto: NewInlineQueryUpdateDto): TdApi.UpdateNewInlineQuery {
        return TdApi.UpdateNewInlineQuery(
            id = dto.id,
            senderUserId = dto.senderUserId,
            userLocation = dto.userLocation?.let { map(it) },
            chatType = dto.chatType?.let { map(it) },
            query = dto.query,
            offset = dto.offset,
        )
    }

    fun map(dto: TdApi.UpdateNewChosenInlineResult): NewChosenInlineResultUpdateDto {
        return NewChosenInlineResultUpdateDto(
            senderUserId = dto.senderUserId,
            userLocation = dto.userLocation?.let { map(it) },
            query = dto.query,
            resultId = dto.resultId,
            inlineMessageId = dto.inlineMessageId,
        )
    }

    fun map(dto: NewChosenInlineResultUpdateDto): TdApi.UpdateNewChosenInlineResult {
        return TdApi.UpdateNewChosenInlineResult(
            senderUserId = dto.senderUserId,
            userLocation = dto.userLocation?.let { map(it) },
            query = dto.query,
            resultId = dto.resultId,
            inlineMessageId = dto.inlineMessageId,
        )
    }

    fun map(dto: TdApi.UpdateNewCallbackQuery): NewCallbackQueryUpdateDto {
        return NewCallbackQueryUpdateDto(
            id = dto.id,
            senderUserId = dto.senderUserId,
            chatId = dto.chatId,
            messageId = dto.messageId,
            chatInstance = dto.chatInstance,
            payload = map(dto.payload),
        )
    }

    fun map(dto: NewCallbackQueryUpdateDto): TdApi.UpdateNewCallbackQuery {
        return TdApi.UpdateNewCallbackQuery(
            id = dto.id,
            senderUserId = dto.senderUserId,
            chatId = dto.chatId,
            messageId = dto.messageId,
            chatInstance = dto.chatInstance,
            payload = map(dto.payload),
        )
    }

    fun map(dto: TdApi.UpdateNewInlineCallbackQuery): NewInlineCallbackQueryUpdateDto {
        return NewInlineCallbackQueryUpdateDto(
            id = dto.id,
            senderUserId = dto.senderUserId,
            inlineMessageId = dto.inlineMessageId,
            chatInstance = dto.chatInstance,
            payload = map(dto.payload),
        )
    }

    fun map(dto: NewInlineCallbackQueryUpdateDto): TdApi.UpdateNewInlineCallbackQuery {
        return TdApi.UpdateNewInlineCallbackQuery(
            id = dto.id,
            senderUserId = dto.senderUserId,
            inlineMessageId = dto.inlineMessageId,
            chatInstance = dto.chatInstance,
            payload = map(dto.payload),
        )
    }

    fun map(dto: TdApi.UpdateNewBusinessCallbackQuery): NewBusinessCallbackQueryUpdateDto {
        return NewBusinessCallbackQueryUpdateDto(
            id = dto.id,
            senderUserId = dto.senderUserId,
            connectionId = dto.connectionId,
            message = map(dto.message),
            chatInstance = dto.chatInstance,
            payload = map(dto.payload),
        )
    }

    fun map(dto: NewBusinessCallbackQueryUpdateDto): TdApi.UpdateNewBusinessCallbackQuery {
        return TdApi.UpdateNewBusinessCallbackQuery(
            id = dto.id,
            senderUserId = dto.senderUserId,
            connectionId = dto.connectionId,
            message = map(dto.message),
            chatInstance = dto.chatInstance,
            payload = map(dto.payload),
        )
    }

    fun map(dto: TdApi.UpdateNewShippingQuery): NewShippingQueryUpdateDto {
        return NewShippingQueryUpdateDto(
            id = dto.id,
            senderUserId = dto.senderUserId,
            invoicePayload = dto.invoicePayload,
            shippingAddress = map(dto.shippingAddress),
        )
    }

    fun map(dto: NewShippingQueryUpdateDto): TdApi.UpdateNewShippingQuery {
        return TdApi.UpdateNewShippingQuery(
            id = dto.id,
            senderUserId = dto.senderUserId,
            invoicePayload = dto.invoicePayload,
            shippingAddress = map(dto.shippingAddress),
        )
    }

    fun map(dto: TdApi.UpdateNewPreCheckoutQuery): NewPreCheckoutQueryUpdateDto {
        return NewPreCheckoutQueryUpdateDto(
            id = dto.id,
            senderUserId = dto.senderUserId,
            currency = dto.currency,
            totalAmount = dto.totalAmount,
            invoicePayload = dto.invoicePayload,
            shippingOptionId = dto.shippingOptionId,
            orderInfo = dto.orderInfo?.let { map(it) },
        )
    }

    fun map(dto: NewPreCheckoutQueryUpdateDto): TdApi.UpdateNewPreCheckoutQuery {
        return TdApi.UpdateNewPreCheckoutQuery(
            id = dto.id,
            senderUserId = dto.senderUserId,
            currency = dto.currency,
            totalAmount = dto.totalAmount,
            invoicePayload = dto.invoicePayload,
            shippingOptionId = dto.shippingOptionId,
            orderInfo = dto.orderInfo?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateNewCustomEvent): NewCustomEventUpdateDto {
        return NewCustomEventUpdateDto(
            event = dto.event,
        )
    }

    fun map(dto: NewCustomEventUpdateDto): TdApi.UpdateNewCustomEvent {
        return TdApi.UpdateNewCustomEvent(
            event = dto.event,
        )
    }

    fun map(dto: TdApi.UpdateNewCustomQuery): NewCustomQueryUpdateDto {
        return NewCustomQueryUpdateDto(
            id = dto.id,
            data = dto.data,
            timeout = dto.timeout,
        )
    }

    fun map(dto: NewCustomQueryUpdateDto): TdApi.UpdateNewCustomQuery {
        return TdApi.UpdateNewCustomQuery(
            id = dto.id,
            data = dto.data,
            timeout = dto.timeout,
        )
    }

    fun map(dto: TdApi.UpdatePoll): PollUpdateDto {
        return PollUpdateDto(
            poll = map(dto.poll),
        )
    }

    fun map(dto: PollUpdateDto): TdApi.UpdatePoll {
        return TdApi.UpdatePoll(
            poll = map(dto.poll),
        )
    }

    fun map(dto: TdApi.UpdatePollAnswer): PollAnswerUpdateDto {
        return PollAnswerUpdateDto(
            pollId = dto.pollId,
            voterId = map(dto.voterId),
            optionIds = dto.optionIds,
        )
    }

    fun map(dto: PollAnswerUpdateDto): TdApi.UpdatePollAnswer {
        return TdApi.UpdatePollAnswer(
            pollId = dto.pollId,
            voterId = map(dto.voterId),
            optionIds = dto.optionIds,
        )
    }

    fun map(dto: TdApi.UpdateChatMember): ChatMemberUpdateDto {
        return ChatMemberUpdateDto(
            chatId = dto.chatId,
            actorUserId = dto.actorUserId,
            date = dto.date,
            inviteLink = dto.inviteLink?.let { map(it) },
            viaJoinRequest = dto.viaJoinRequest,
            viaChatFolderInviteLink = dto.viaChatFolderInviteLink,
            oldChatMember = map(dto.oldChatMember),
            newChatMember = map(dto.newChatMember),
        )
    }

    fun map(dto: ChatMemberUpdateDto): TdApi.UpdateChatMember {
        return TdApi.UpdateChatMember(
            chatId = dto.chatId,
            actorUserId = dto.actorUserId,
            date = dto.date,
            inviteLink = dto.inviteLink?.let { map(it) },
            viaJoinRequest = dto.viaJoinRequest,
            viaChatFolderInviteLink = dto.viaChatFolderInviteLink,
            oldChatMember = map(dto.oldChatMember),
            newChatMember = map(dto.newChatMember),
        )
    }

    fun map(dto: TdApi.UpdateNewChatJoinRequest): NewChatJoinRequestUpdateDto {
        return NewChatJoinRequestUpdateDto(
            chatId = dto.chatId,
            request = map(dto.request),
            userChatId = dto.userChatId,
            inviteLink = dto.inviteLink?.let { map(it) },
        )
    }

    fun map(dto: NewChatJoinRequestUpdateDto): TdApi.UpdateNewChatJoinRequest {
        return TdApi.UpdateNewChatJoinRequest(
            chatId = dto.chatId,
            request = map(dto.request),
            userChatId = dto.userChatId,
            inviteLink = dto.inviteLink?.let { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateChatBoost): ChatBoostUpdateDto {
        return ChatBoostUpdateDto(
            chatId = dto.chatId,
            boost = map(dto.boost),
        )
    }

    fun map(dto: ChatBoostUpdateDto): TdApi.UpdateChatBoost {
        return TdApi.UpdateChatBoost(
            chatId = dto.chatId,
            boost = map(dto.boost),
        )
    }

    fun map(dto: TdApi.UpdateMessageReaction): MessageReactionUpdateDto {
        return MessageReactionUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            actorId = map(dto.actorId),
            date = dto.date,
            oldReactionTypes = dto.oldReactionTypes.mapArray { map(it) },
            newReactionTypes = dto.newReactionTypes.mapArray { map(it) },
        )
    }

    fun map(dto: MessageReactionUpdateDto): TdApi.UpdateMessageReaction {
        return TdApi.UpdateMessageReaction(
            chatId = dto.chatId,
            messageId = dto.messageId,
            actorId = map(dto.actorId),
            date = dto.date,
            oldReactionTypes = dto.oldReactionTypes.mapArray { map(it) },
            newReactionTypes = dto.newReactionTypes.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdateMessageReactions): MessageReactionsUpdateDto {
        return MessageReactionsUpdateDto(
            chatId = dto.chatId,
            messageId = dto.messageId,
            date = dto.date,
            reactions = dto.reactions.mapArray { map(it) },
        )
    }

    fun map(dto: MessageReactionsUpdateDto): TdApi.UpdateMessageReactions {
        return TdApi.UpdateMessageReactions(
            chatId = dto.chatId,
            messageId = dto.messageId,
            date = dto.date,
            reactions = dto.reactions.mapArray { map(it) },
        )
    }

    fun map(dto: TdApi.UpdatePaidMediaPurchased): PaidMediaPurchasedUpdateDto {
        return PaidMediaPurchasedUpdateDto(
            userId = dto.userId,
            payload = dto.payload,
        )
    }

    fun map(dto: PaidMediaPurchasedUpdateDto): TdApi.UpdatePaidMediaPurchased {
        return TdApi.UpdatePaidMediaPurchased(
            userId = dto.userId,
            payload = dto.payload,
        )
    }

    fun map(dto: TdApi.Update): UpdateDto {
        when(dto) {
            is TdApi.UpdateAuthorizationState -> return map(dto)
            is TdApi.UpdateNewMessage -> return map(dto)
            is TdApi.UpdateMessageSendAcknowledged -> return map(dto)
            is TdApi.UpdateMessageSendSucceeded -> return map(dto)
            is TdApi.UpdateMessageSendFailed -> return map(dto)
            is TdApi.UpdateMessageContent -> return map(dto)
            is TdApi.UpdateMessageEdited -> return map(dto)
            is TdApi.UpdateMessageIsPinned -> return map(dto)
            is TdApi.UpdateMessageInteractionInfo -> return map(dto)
            is TdApi.UpdateMessageContentOpened -> return map(dto)
            is TdApi.UpdateMessageMentionRead -> return map(dto)
            is TdApi.UpdateMessageUnreadReactions -> return map(dto)
            is TdApi.UpdateMessageFactCheck -> return map(dto)
            is TdApi.UpdateMessageLiveLocationViewed -> return map(dto)
            is TdApi.UpdateVideoPublished -> return map(dto)
            is TdApi.UpdateNewChat -> return map(dto)
            is TdApi.UpdateChatTitle -> return map(dto)
            is TdApi.UpdateChatPhoto -> return map(dto)
            is TdApi.UpdateChatAccentColors -> return map(dto)
            is TdApi.UpdateChatPermissions -> return map(dto)
            is TdApi.UpdateChatLastMessage -> return map(dto)
            is TdApi.UpdateChatPosition -> return map(dto)
            is TdApi.UpdateChatAddedToList -> return map(dto)
            is TdApi.UpdateChatRemovedFromList -> return map(dto)
            is TdApi.UpdateChatReadInbox -> return map(dto)
            is TdApi.UpdateChatReadOutbox -> return map(dto)
            is TdApi.UpdateChatActionBar -> return map(dto)
            is TdApi.UpdateChatBusinessBotManageBar -> return map(dto)
            is TdApi.UpdateChatAvailableReactions -> return map(dto)
            is TdApi.UpdateChatDraftMessage -> return map(dto)
            is TdApi.UpdateChatEmojiStatus -> return map(dto)
            is TdApi.UpdateChatMessageSender -> return map(dto)
            is TdApi.UpdateChatMessageAutoDeleteTime -> return map(dto)
            is TdApi.UpdateChatNotificationSettings -> return map(dto)
            is TdApi.UpdateChatPendingJoinRequests -> return map(dto)
            is TdApi.UpdateChatReplyMarkup -> return map(dto)
            is TdApi.UpdateChatBackground -> return map(dto)
            is TdApi.UpdateChatTheme -> return map(dto)
            is TdApi.UpdateChatUnreadMentionCount -> return map(dto)
            is TdApi.UpdateChatUnreadReactionCount -> return map(dto)
            is TdApi.UpdateChatVideoChat -> return map(dto)
            is TdApi.UpdateChatDefaultDisableNotification -> return map(dto)
            is TdApi.UpdateChatHasProtectedContent -> return map(dto)
            is TdApi.UpdateChatIsTranslatable -> return map(dto)
            is TdApi.UpdateChatIsMarkedAsUnread -> return map(dto)
            is TdApi.UpdateChatViewAsTopics -> return map(dto)
            is TdApi.UpdateChatBlockList -> return map(dto)
            is TdApi.UpdateChatHasScheduledMessages -> return map(dto)
            is TdApi.UpdateChatFolders -> return map(dto)
            is TdApi.UpdateChatOnlineMemberCount -> return map(dto)
            is TdApi.UpdateSavedMessagesTopic -> return map(dto)
            is TdApi.UpdateSavedMessagesTopicCount -> return map(dto)
            is TdApi.UpdateQuickReplyShortcut -> return map(dto)
            is TdApi.UpdateQuickReplyShortcutDeleted -> return map(dto)
            is TdApi.UpdateQuickReplyShortcuts -> return map(dto)
            is TdApi.UpdateQuickReplyShortcutMessages -> return map(dto)
            is TdApi.UpdateForumTopicInfo -> return map(dto)
            is TdApi.UpdateForumTopic -> return map(dto)
            is TdApi.UpdateScopeNotificationSettings -> return map(dto)
            is TdApi.UpdateReactionNotificationSettings -> return map(dto)
            is TdApi.UpdateNotification -> return map(dto)
            is TdApi.UpdateNotificationGroup -> return map(dto)
            is TdApi.UpdateActiveNotifications -> return map(dto)
            is TdApi.UpdateHavePendingNotifications -> return map(dto)
            is TdApi.UpdateDeleteMessages -> return map(dto)
            is TdApi.UpdateChatAction -> return map(dto)
            is TdApi.UpdateUserStatus -> return map(dto)
            is TdApi.UpdateUser -> return map(dto)
            is TdApi.UpdateBasicGroup -> return map(dto)
            is TdApi.UpdateSupergroup -> return map(dto)
            is TdApi.UpdateSecretChat -> return map(dto)
            is TdApi.UpdateUserFullInfo -> return map(dto)
            is TdApi.UpdateBasicGroupFullInfo -> return map(dto)
            is TdApi.UpdateSupergroupFullInfo -> return map(dto)
            is TdApi.UpdateServiceNotification -> return map(dto)
            is TdApi.UpdateFile -> return map(dto)
            is TdApi.UpdateFileGenerationStart -> return map(dto)
            is TdApi.UpdateFileGenerationStop -> return map(dto)
            is TdApi.UpdateFileDownloads -> return map(dto)
            is TdApi.UpdateFileAddedToDownloads -> return map(dto)
            is TdApi.UpdateFileDownload -> return map(dto)
            is TdApi.UpdateFileRemovedFromDownloads -> return map(dto)
            is TdApi.UpdateApplicationVerificationRequired -> return map(dto)
            is TdApi.UpdateApplicationRecaptchaVerificationRequired -> return map(dto)
            is TdApi.UpdateCall -> return map(dto)
            is TdApi.UpdateGroupCall -> return map(dto)
            is TdApi.UpdateGroupCallParticipant -> return map(dto)
            is TdApi.UpdateGroupCallParticipants -> return map(dto)
            is TdApi.UpdateGroupCallVerificationState -> return map(dto)
            is TdApi.UpdateNewCallSignalingData -> return map(dto)
            is TdApi.UpdateUserPrivacySettingRules -> return map(dto)
            is TdApi.UpdateUnreadMessageCount -> return map(dto)
            is TdApi.UpdateUnreadChatCount -> return map(dto)
            is TdApi.UpdateStory -> return map(dto)
            is TdApi.UpdateStoryDeleted -> return map(dto)
            is TdApi.UpdateStoryPostSucceeded -> return map(dto)
            is TdApi.UpdateStoryPostFailed -> return map(dto)
            is TdApi.UpdateChatActiveStories -> return map(dto)
            is TdApi.UpdateStoryListChatCount -> return map(dto)
            is TdApi.UpdateStoryStealthMode -> return map(dto)
            is TdApi.UpdateOption -> return map(dto)
            is TdApi.UpdateStickerSet -> return map(dto)
            is TdApi.UpdateInstalledStickerSets -> return map(dto)
            is TdApi.UpdateTrendingStickerSets -> return map(dto)
            is TdApi.UpdateRecentStickers -> return map(dto)
            is TdApi.UpdateFavoriteStickers -> return map(dto)
            is TdApi.UpdateSavedAnimations -> return map(dto)
            is TdApi.UpdateSavedNotificationSounds -> return map(dto)
            is TdApi.UpdateDefaultBackground -> return map(dto)
            is TdApi.UpdateChatThemes -> return map(dto)
            is TdApi.UpdateAccentColors -> return map(dto)
            is TdApi.UpdateProfileAccentColors -> return map(dto)
            is TdApi.UpdateLanguagePackStrings -> return map(dto)
            is TdApi.UpdateConnectionState -> return map(dto)
            is TdApi.UpdateFreezeState -> return map(dto)
            is TdApi.UpdateTermsOfService -> return map(dto)
            is TdApi.UpdateUnconfirmedSession -> return map(dto)
            is TdApi.UpdateAttachmentMenuBots -> return map(dto)
            is TdApi.UpdateWebAppMessageSent -> return map(dto)
            is TdApi.UpdateActiveEmojiReactions -> return map(dto)
            is TdApi.UpdateAvailableMessageEffects -> return map(dto)
            is TdApi.UpdateDefaultReactionType -> return map(dto)
            is TdApi.UpdateDefaultPaidReactionType -> return map(dto)
            is TdApi.UpdateSavedMessagesTags -> return map(dto)
            is TdApi.UpdateActiveLiveLocationMessages -> return map(dto)
            is TdApi.UpdateOwnedStarCount -> return map(dto)
            is TdApi.UpdateChatRevenueAmount -> return map(dto)
            is TdApi.UpdateStarRevenueStatus -> return map(dto)
            is TdApi.UpdateSpeechRecognitionTrial -> return map(dto)
            is TdApi.UpdateDiceEmojis -> return map(dto)
            is TdApi.UpdateAnimatedEmojiMessageClicked -> return map(dto)
            is TdApi.UpdateAnimationSearchParameters -> return map(dto)
            is TdApi.UpdateSuggestedActions -> return map(dto)
            is TdApi.UpdateSpeedLimitNotification -> return map(dto)
            is TdApi.UpdateContactCloseBirthdays -> return map(dto)
            is TdApi.UpdateAutosaveSettings -> return map(dto)
            is TdApi.UpdateBusinessConnection -> return map(dto)
            is TdApi.UpdateNewBusinessMessage -> return map(dto)
            is TdApi.UpdateBusinessMessageEdited -> return map(dto)
            is TdApi.UpdateBusinessMessagesDeleted -> return map(dto)
            is TdApi.UpdateNewInlineQuery -> return map(dto)
            is TdApi.UpdateNewChosenInlineResult -> return map(dto)
            is TdApi.UpdateNewCallbackQuery -> return map(dto)
            is TdApi.UpdateNewInlineCallbackQuery -> return map(dto)
            is TdApi.UpdateNewBusinessCallbackQuery -> return map(dto)
            is TdApi.UpdateNewShippingQuery -> return map(dto)
            is TdApi.UpdateNewPreCheckoutQuery -> return map(dto)
            is TdApi.UpdateNewCustomEvent -> return map(dto)
            is TdApi.UpdateNewCustomQuery -> return map(dto)
            is TdApi.UpdatePoll -> return map(dto)
            is TdApi.UpdatePollAnswer -> return map(dto)
            is TdApi.UpdateChatMember -> return map(dto)
            is TdApi.UpdateNewChatJoinRequest -> return map(dto)
            is TdApi.UpdateChatBoost -> return map(dto)
            is TdApi.UpdateMessageReaction -> return map(dto)
            is TdApi.UpdateMessageReactions -> return map(dto)
            is TdApi.UpdatePaidMediaPurchased -> return map(dto)
            else -> error("Unknown dto class")
        }
    }
}
