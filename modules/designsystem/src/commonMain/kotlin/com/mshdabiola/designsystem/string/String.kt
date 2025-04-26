package com.mshdabiola.designsystem.string

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource
import wikipedia_common.modules.designsystem.generated.resources.Res
import wikipedia_common.modules.designsystem.generated.resources.about
import wikipedia_common.modules.designsystem.generated.resources.accept
import wikipedia_common.modules.designsystem.generated.resources.accept_permissions
import wikipedia_common.modules.designsystem.generated.resources.accurate_categories
import wikipedia_common.modules.designsystem.generated.resources.acknowledge_contributor
import wikipedia_common.modules.designsystem.generated.resources.add_category
import wikipedia_common.modules.designsystem.generated.resources.add_description
import wikipedia_common.modules.designsystem.generated.resources.add_image
import wikipedia_common.modules.designsystem.generated.resources.add_location
import wikipedia_common.modules.designsystem.generated.resources.add_new_categories
import wikipedia_common.modules.designsystem.generated.resources.add_new_language
import wikipedia_common.modules.designsystem.generated.resources.add_other_language
import wikipedia_common.modules.designsystem.generated.resources.add_photo
import wikipedia_common.modules.designsystem.generated.resources.adhere_to_policies
import wikipedia_common.modules.designsystem.generated.resources.allowed
import wikipedia_common.modules.designsystem.generated.resources.app_language
import wikipedia_common.modules.designsystem.generated.resources.app_name
import wikipedia_common.modules.designsystem.generated.resources.app_open_source_license
import wikipedia_common.modules.designsystem.generated.resources.appearance
import wikipedia_common.modules.designsystem.generated.resources.ask_location_permission
import wikipedia_common.modules.designsystem.generated.resources.ask_location_permission_summary
import wikipedia_common.modules.designsystem.generated.resources.audio
import wikipedia_common.modules.designsystem.generated.resources.bookmarks
import wikipedia_common.modules.designsystem.generated.resources.categories
import wikipedia_common.modules.designsystem.generated.resources.categories_label
import wikipedia_common.modules.designsystem.generated.resources.characters
import wikipedia_common.modules.designsystem.generated.resources.clearly_see_licensing
import wikipedia_common.modules.designsystem.generated.resources.close
import wikipedia_common.modules.designsystem.generated.resources.continue_label
import wikipedia_common.modules.designsystem.generated.resources.contribute_your_photos
import wikipedia_common.modules.designsystem.generated.resources.contributor
import wikipedia_common.modules.designsystem.generated.resources.copy_content_to_other
import wikipedia_common.modules.designsystem.generated.resources.copyright
import wikipedia_common.modules.designsystem.generated.resources.copyrighted
import wikipedia_common.modules.designsystem.generated.resources.correct
import wikipedia_common.modules.designsystem.generated.resources.custom_author_name
import wikipedia_common.modules.designsystem.generated.resources.dark
import wikipedia_common.modules.designsystem.generated.resources.default_description_language
import wikipedia_common.modules.designsystem.generated.resources.default_theme
import wikipedia_common.modules.designsystem.generated.resources.descriptions
import wikipedia_common.modules.designsystem.generated.resources.descriptions_label
import wikipedia_common.modules.designsystem.generated.resources.diagram
import wikipedia_common.modules.designsystem.generated.resources.discover_and_share
import wikipedia_common.modules.designsystem.generated.resources.display_campaigns
import wikipedia_common.modules.designsystem.generated.resources.display_nearby_notification
import wikipedia_common.modules.designsystem.generated.resources.dont_have_account
import wikipedia_common.modules.designsystem.generated.resources.easily_search_discover
import wikipedia_common.modules.designsystem.generated.resources.edit_details
import wikipedia_common.modules.designsystem.generated.resources.enable_record_location
import wikipedia_common.modules.designsystem.generated.resources.explore_as_guest
import wikipedia_common.modules.designsystem.generated.resources.explore_vast_library
import wikipedia_common.modules.designsystem.generated.resources.failed
import wikipedia_common.modules.designsystem.generated.resources.fan_art
import wikipedia_common.modules.designsystem.generated.resources.features_highlight
import wikipedia_common.modules.designsystem.generated.resources.follow_system
import wikipedia_common.modules.designsystem.generated.resources.forgot_password
import wikipedia_common.modules.designsystem.generated.resources.general
import wikipedia_common.modules.designsystem.generated.resources.get_started
import wikipedia_common.modules.designsystem.generated.resources.give_thanks
import wikipedia_common.modules.designsystem.generated.resources.graph
import wikipedia_common.modules.designsystem.generated.resources.home
import wikipedia_common.modules.designsystem.generated.resources.internet_pics
import wikipedia_common.modules.designsystem.generated.resources.language
import wikipedia_common.modules.designsystem.generated.resources.leaderboard
import wikipedia_common.modules.designsystem.generated.resources.light
import wikipedia_common.modules.designsystem.generated.resources.location
import wikipedia_common.modules.designsystem.generated.resources.location_label
import wikipedia_common.modules.designsystem.generated.resources.location_permission_rationale
import wikipedia_common.modules.designsystem.generated.resources.log_in
import wikipedia_common.modules.designsystem.generated.resources.login
import wikipedia_common.modules.designsystem.generated.resources.logos_covers
import wikipedia_common.modules.designsystem.generated.resources.logout
import wikipedia_common.modules.designsystem.generated.resources.main_navigator
import wikipedia_common.modules.designsystem.generated.resources.manage_exif_tags
import wikipedia_common.modules.designsystem.generated.resources.map
import wikipedia_common.modules.designsystem.generated.resources.media_licence
import wikipedia_common.modules.designsystem.generated.resources.message
import wikipedia_common.modules.designsystem.generated.resources.modules_ui_cbt_exam_part
import wikipedia_common.modules.designsystem.generated.resources.modules_ui_cbt_sections
import wikipedia_common.modules.designsystem.generated.resources.modules_ui_cbt_subject
import wikipedia_common.modules.designsystem.generated.resources.modules_ui_cbt_type
import wikipedia_common.modules.designsystem.generated.resources.mountains
import wikipedia_common.modules.designsystem.generated.resources.mshdabiola
import wikipedia_common.modules.designsystem.generated.resources.near_by
import wikipedia_common.modules.designsystem.generated.resources.next_image
import wikipedia_common.modules.designsystem.generated.resources.not_allowed
import wikipedia_common.modules.designsystem.generated.resources.not_set
import wikipedia_common.modules.designsystem.generated.resources.notification
import wikipedia_common.modules.designsystem.generated.resources.notifications
import wikipedia_common.modules.designsystem.generated.resources.old_photos
import wikipedia_common.modules.designsystem.generated.resources.original
import wikipedia_common.modules.designsystem.generated.resources.own_work
import wikipedia_common.modules.designsystem.generated.resources.password
import wikipedia_common.modules.designsystem.generated.resources.pending
import wikipedia_common.modules.designsystem.generated.resources.permissions
import wikipedia_common.modules.designsystem.generated.resources.photo_picker_risks
import wikipedia_common.modules.designsystem.generated.resources.privacy
import wikipedia_common.modules.designsystem.generated.resources.privacy_policy
import wikipedia_common.modules.designsystem.generated.resources.profile
import wikipedia_common.modules.designsystem.generated.resources.public_domain
import wikipedia_common.modules.designsystem.generated.resources.publish_changes
import wikipedia_common.modules.designsystem.generated.resources.ready_to_contribute
import wikipedia_common.modules.designsystem.generated.resources.record_location
import wikipedia_common.modules.designsystem.generated.resources.register
import wikipedia_common.modules.designsystem.generated.resources.reject
import wikipedia_common.modules.designsystem.generated.resources.relevant_categorization
import wikipedia_common.modules.designsystem.generated.resources.remove_image
import wikipedia_common.modules.designsystem.generated.resources.review
import wikipedia_common.modules.designsystem.generated.resources.save_in_app_shot
import wikipedia_common.modules.designsystem.generated.resources.save_picture_taken
import wikipedia_common.modules.designsystem.generated.resources.see_ongoing_campaigns
import wikipedia_common.modules.designsystem.generated.resources.select_exif_tags
import wikipedia_common.modules.designsystem.generated.resources.setting_navigator
import wikipedia_common.modules.designsystem.generated.resources.settings
import wikipedia_common.modules.designsystem.generated.resources.share_unique_perspectives
import wikipedia_common.modules.designsystem.generated.resources.show_nearby_notification
import wikipedia_common.modules.designsystem.generated.resources.skip_to_next_image
import wikipedia_common.modules.designsystem.generated.resources.start_exploring
import wikipedia_common.modules.designsystem.generated.resources.storage_permission_rationale
import wikipedia_common.modules.designsystem.generated.resources.str_arr
import wikipedia_common.modules.designsystem.generated.resources.support
import wikipedia_common.modules.designsystem.generated.resources.supporting_text
import wikipedia_common.modules.designsystem.generated.resources.tab
import wikipedia_common.modules.designsystem.generated.resources.take_photo
import wikipedia_common.modules.designsystem.generated.resources.terms_of_service
import wikipedia_common.modules.designsystem.generated.resources.thank_you_joining
import wikipedia_common.modules.designsystem.generated.resources.thank_you_message
import wikipedia_common.modules.designsystem.generated.resources.theme
import wikipedia_common.modules.designsystem.generated.resources.understand_usage_rights
import wikipedia_common.modules.designsystem.generated.resources.update
import wikipedia_common.modules.designsystem.generated.resources.upload
import wikipedia_common.modules.designsystem.generated.resources.uploads
import wikipedia_common.modules.designsystem.generated.resources.usage_guidelines_compliance
import wikipedia_common.modules.designsystem.generated.resources.use_custom_author_name
import wikipedia_common.modules.designsystem.generated.resources.use_custom_author_name_summary
import wikipedia_common.modules.designsystem.generated.resources.use_document_photo_picker
import wikipedia_common.modules.designsystem.generated.resources.user_talk_message
import wikipedia_common.modules.designsystem.generated.resources.username
import wikipedia_common.modules.designsystem.generated.resources.view_message
import wikipedia_common.modules.designsystem.generated.resources.watermarked
import wikipedia_common.modules.designsystem.generated.resources.wikimedia_commons_website
import wikipedia_common.modules.designsystem.generated.resources.wikipedia_common
import wikipedia_common.modules.designsystem.generated.resources.wikipedia_commons_app_description
import wikipedia_common.modules.designsystem.generated.resources.wikipedia_website
import wikipedia_common.modules.designsystem.generated.resources.wrong

val appName
    @Composable
    get() = stringResource(Res.string.app_name)

val subject
    @Composable
    get() = stringResource(Res.string.modules_ui_cbt_subject)

val type
    @Composable
    get() = stringResource(Res.string.modules_ui_cbt_type)

val examPart
    @Composable
    get() = stringArrayResource(Res.array.modules_ui_cbt_exam_part).toTypedArray()

val sections
    @Composable
    get() = stringArrayResource(Res.array.modules_ui_cbt_sections).toTypedArray()

@OptIn(ExperimentalResourceApi::class)
fun getFileUri(fileName: String) = Res.getUri(fileName)

@OptIn(ExperimentalResourceApi::class)
suspend fun getByte(fileName: String) = Res.readBytes(fileName)

val mainNavigator
    @Composable
    get() = stringArrayResource(Res.array.main_navigator)
val settingNavigator
    @Composable
    get() = stringArrayResource(Res.array.setting_navigator)

val cbtNavigator
    @Composable
    get() = stringArrayResource(Res.array.str_arr)

object AppStrings {
    val wikipediaCommon: String
        @Composable
        get() = stringResource(Res.string.wikipedia_common)

    val login: String
        @Composable
        get() = stringResource(Res.string.login)

    val register: String
        @Composable
        get() = stringResource(Res.string.register)

    val exploreAsGuest: String
        @Composable
        get() = stringResource(Res.string.explore_as_guest)

    val getStarted: String
        @Composable
        get() = stringResource(Res.string.get_started)

    val discoverAndShare: String
        @Composable
        get() = stringResource(Res.string.discover_and_share)

    val home: String
        @Composable
        get() = stringResource(Res.string.home)

    val notifications: String
        @Composable
        get() = stringResource(Res.string.notifications)

    val bookmarks: String
        @Composable
        get() = stringResource(Res.string.bookmarks)

    val nearBy: String
        @Composable
        get() = stringResource(Res.string.near_by)

    val profile: String
        @Composable
        get() = stringResource(Res.string.profile)

    val leaderboard: String
        @Composable
        get() = stringResource(Res.string.leaderboard)

    val review: String
        @Composable
        get() = stringResource(Res.string.review)

    val about: String
        @Composable
        get() = stringResource(Res.string.about)

    val settings: String
        @Composable
        get() = stringResource(Res.string.settings)

    val logout: String
        @Composable
        get() = stringResource(Res.string.logout)

    val editDetails: String
        @Composable
        get() = stringResource(Res.string.edit_details)

    val descriptions: String
        @Composable
        get() = stringResource(Res.string.descriptions)

    val wikipediaCommonsAppDescription: String
        @Composable
        get() = stringResource(Res.string.wikipedia_commons_app_description)

    val wikimediaCommonsWebsite: String
        @Composable
        get() = stringResource(Res.string.wikimedia_commons_website)

    val wikipediaWebsite: String
        @Composable
        get() = stringResource(Res.string.wikipedia_website)

    val support: String
        @Composable
        get() = stringResource(Res.string.support)

    val privacyPolicy: String
        @Composable
        get() = stringResource(Res.string.privacy_policy)

    val termsOfService: String
        @Composable
        get() = stringResource(Res.string.terms_of_service)

    val appOpenSourceLicense: String
        @Composable
        get() = stringResource(Res.string.app_open_source_license)

    val copyright: String
        @Composable
        get() = stringResource(Res.string.copyright)

    val privacy: String
        @Composable
        get() = stringResource(Res.string.privacy)

    val manageExifTags: String
        @Composable
        get() = stringResource(Res.string.manage_exif_tags)

    val selectExifTags: String
        @Composable
        get() = stringResource(Res.string.select_exif_tags)

    val upload: String
        @Composable
        get() = stringResource(Res.string.upload)

    val saveInAppShot: String
        @Composable
        get() = stringResource(Res.string.save_in_app_shot)

    val savePictureTaken: String
        @Composable
        get() = stringResource(Res.string.save_picture_taken)

    val recordLocation: String
        @Composable
        get() = stringResource(Res.string.record_location)

    val enableRecordLocation: String
        @Composable
        get() = stringResource(Res.string.enable_record_location)

    val useDocumentPhotoPicker: String
        @Composable
        get() = stringResource(Res.string.use_document_photo_picker)

    val photoPickerRisks: String
        @Composable
        get() = stringResource(Res.string.photo_picker_risks)

    val useCustomAuthorName: String
        @Composable
        get() = stringResource(Res.string.use_custom_author_name)

    val useCustomAuthorNameSummary: String
        @Composable
        get() = stringResource(Res.string.use_custom_author_name_summary)

    val customAuthorName: String
        @Composable
        get() = stringResource(Res.string.custom_author_name)

    val notSet: String
        @Composable
        get() = stringResource(Res.string.not_set)

    val general: String
        @Composable
        get() = stringResource(Res.string.general)

    val appLanguage: String
        @Composable
        get() = stringResource(Res.string.app_language)

    val defaultDescriptionLanguage: String
        @Composable
        get() = stringResource(Res.string.default_description_language)

    val displayNearbyNotification: String
        @Composable
        get() = stringResource(Res.string.display_nearby_notification)

    val showNearbyNotification: String
        @Composable
        get() = stringResource(Res.string.show_nearby_notification)

    val askLocationPermission: String
        @Composable
        get() = stringResource(Res.string.ask_location_permission)

    val askLocationPermissionSummary: String
        @Composable
        get() = stringResource(Res.string.ask_location_permission_summary)

    val displayCampaigns: String
        @Composable
        get() = stringResource(Res.string.display_campaigns)

    val seeOngoingCampaigns: String
        @Composable
        get() = stringResource(Res.string.see_ongoing_campaigns)

    val appearance: String
        @Composable
        get() = stringResource(Res.string.appearance)

    val theme: String
        @Composable
        get() = stringResource(Res.string.theme)

    val light: String
        @Composable
        get() = stringResource(Res.string.light)

    val dark: String
        @Composable
        get() = stringResource(Res.string.dark)

    val followSystem: String
        @Composable
        get() = stringResource(Res.string.follow_system)

    val defaultTheme: String
        @Composable
        get() = stringResource(Res.string.default_theme)

    val categories: String
        @Composable
        get() = stringResource(Res.string.categories)

    val language: String
        @Composable
        get() = stringResource(Res.string.language)

    val mediaLicence: String
        @Composable
        get() = stringResource(Res.string.media_licence)

    val copyContentToOther: String
        @Composable
        get() = stringResource(Res.string.copy_content_to_other)

    val addNewLanguage: String
        @Composable
        get() = stringResource(Res.string.add_new_language)

    val addPhoto: String
        @Composable
        get() = stringResource(Res.string.add_photo)

    val addImage: String
        @Composable
        get() = stringResource(Res.string.add_image)

    val removeImage: String
        @Composable
        get() = stringResource(Res.string.remove_image)

    val addCategory: String
        @Composable
        get() = stringResource(Res.string.add_category)

    val location: String
        @Composable
        get() = stringResource(Res.string.location)

    val addLocation: String
        @Composable
        get() = stringResource(Res.string.add_location)

    val mountains: String
        @Composable
        get() = stringResource(Res.string.mountains)

    val allowed: String
        @Composable
        get() = stringResource(Res.string.allowed)

    val notAllowed: String
        @Composable
        get() = stringResource(Res.string.not_allowed)

    val original: String
        @Composable
        get() = stringResource(Res.string.original)

    val ownWork: String
        @Composable
        get() = stringResource(Res.string.own_work)

    val publicDomain: String
        @Composable
        get() = stringResource(Res.string.public_domain)

    val oldPhotos: String
        @Composable
        get() = stringResource(Res.string.old_photos)

    val diagram: String
        @Composable
        get() = stringResource(Res.string.diagram)

    val graph: String
        @Composable
        get() = stringResource(Res.string.graph)

    val map: String
        @Composable
        get() = stringResource(Res.string.map)

    val copyrighted: String
        @Composable
        get() = stringResource(Res.string.copyrighted)

    val internetPics: String
        @Composable
        get() = stringResource(Res.string.internet_pics)

    val fanArt: String
        @Composable
        get() = stringResource(Res.string.fan_art)

    val characters: String
        @Composable
        get() = stringResource(Res.string.characters)

    val logosCovers: String
        @Composable
        get() = stringResource(Res.string.logos_covers)

    val watermarked: String
        @Composable
        get() = stringResource(Res.string.watermarked)

    val skipToNextImage: String
        @Composable
        get() = stringResource(Res.string.skip_to_next_image)

    val accept: String
        @Composable
        get() = stringResource(Res.string.accept)

    val reject: String
        @Composable
        get() = stringResource(Res.string.reject)

    val usageGuidelinesCompliance: String
        @Composable
        get() = stringResource(Res.string.usage_guidelines_compliance)

    val adhereToPolicies: String
        @Composable
        get() = stringResource(Res.string.adhere_to_policies)

    val relevantCategorization: String
        @Composable
        get() = stringResource(Res.string.relevant_categorization)

    val accurateCategories: String
        @Composable
        get() = stringResource(Res.string.accurate_categories)

    val correct: String
        @Composable
        get() = stringResource(Res.string.correct)

    val wrong: String
        @Composable
        get() = stringResource(Res.string.wrong)

    val acknowledgeContributor: String
        @Composable
        get() = stringResource(Res.string.acknowledge_contributor)

    val thankYouMessage: String
        @Composable
        get() = stringResource(Res.string.thank_you_message)

    val contributor: String
        @Composable
        get() = stringResource(Res.string.contributor)

    val nextImage: String
        @Composable
        get() = stringResource(Res.string.next_image)

    val giveThanks: String
        @Composable
        get() = stringResource(Res.string.give_thanks)

    val notification: String
        @Composable
        get() = stringResource(Res.string.notification)

    val message: String
        @Composable
        get() = stringResource(Res.string.message)

    val uploads: String
        @Composable
        get() = stringResource(Res.string.uploads)

    val audio: String
        @Composable
        get() = stringResource(Res.string.audio)

    val tab: String
        @Composable
        get() = stringResource(Res.string.tab)

    val userTalkMessage: String
        @Composable
        get() = stringResource(Res.string.user_talk_message)

    val viewMessage: String
        @Composable
        get() = stringResource(Res.string.view_message)

    val pending: String
        @Composable
        get() = stringResource(Res.string.pending)

    val failed: String
        @Composable
        get() = stringResource(Res.string.failed)

    val takePhoto: String
        @Composable
        get() = stringResource(Res.string.take_photo)

    val descriptionsLabel: String
        @Composable
        get() = stringResource(Res.string.descriptions_label)

    val categoriesLabel: String
        @Composable
        get() = stringResource(Res.string.categories_label)

    val locationLabel: String
        @Composable
        get() = stringResource(Res.string.location_label)

    val addOtherLanguage: String
        @Composable
        get() = stringResource(Res.string.add_other_language)

    val addNewCategories: String
        @Composable
        get() = stringResource(Res.string.add_new_categories)

    val publishChanges: String
        @Composable
        get() = stringResource(Res.string.publish_changes)

    val permissions: String
        @Composable
        get() = stringResource(Res.string.permissions)

    val acceptPermissions: String
        @Composable
        get() = stringResource(Res.string.accept_permissions)

    val continueLabel: String
        @Composable
        get() = stringResource(Res.string.continue_label)

    val storagePermissionRationale: String
        @Composable
        get() = stringResource(Res.string.storage_permission_rationale)

    val locationPermissionRationale: String
        @Composable
        get() = stringResource(Res.string.location_permission_rationale)

    val readyToContribute: String
        @Composable
        get() = stringResource(Res.string.ready_to_contribute)

    val thankYouJoining: String
        @Composable
        get() = stringResource(Res.string.thank_you_joining)

    val startExploring: String
        @Composable
        get() = stringResource(Res.string.start_exploring)

    val featuresHighlight: String
        @Composable
        get() = stringResource(Res.string.features_highlight)

    val exploreVastLibrary: String
        @Composable
        get() = stringResource(Res.string.explore_vast_library)

    val easilySearchDiscover: String
        @Composable
        get() = stringResource(Res.string.easily_search_discover)

    val contributeYourPhotos: String
        @Composable
        get() = stringResource(Res.string.contribute_your_photos)

    val shareUniquePerspectives: String
        @Composable
        get() = stringResource(Res.string.share_unique_perspectives)

    val understandUsageRights: String
        @Composable
        get() = stringResource(Res.string.understand_usage_rights)

    val clearlySeeLicensing: String
        @Composable
        get() = stringResource(Res.string.clearly_see_licensing)

    val logIn: String
        @Composable
        get() = stringResource(Res.string.log_in)

    val forgotPassword: String
        @Composable
        get() = stringResource(Res.string.forgot_password)

    val dontHaveAccount: String
        @Composable
        get() = stringResource(Res.string.dont_have_account)

    val username: String
        @Composable
        get() = stringResource(Res.string.username)

    val supportingText: String
        @Composable
        get() = stringResource(Res.string.supporting_text)

    val password: String
        @Composable
        get() = stringResource(Res.string.password)

    val close: String
        @Composable
        get() = stringResource(Res.string.close)

    val update: String
        @Composable
        get() = stringResource(Res.string.update)

    val addDescription: String
        @Composable
        get() = stringResource(Res.string.add_description)
}
