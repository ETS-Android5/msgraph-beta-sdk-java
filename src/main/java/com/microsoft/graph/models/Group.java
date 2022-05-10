package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Group extends DirectoryObject implements Parsable {
    /** The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post. */
    private java.util.List<DirectoryObject> _acceptedSenders;
    /** The accessType property */
    private GroupAccessType _accessType;
    /** Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). */
    private Boolean _allowExternalSenders;
    /** Represents the app roles a group has been granted for an application. Supports $expand. */
    private java.util.List<AppRoleAssignment> _appRoleAssignments;
    /** The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on $select. */
    private java.util.List<AssignedLabel> _assignedLabels;
    /** The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq). Read-only. */
    private java.util.List<AssignedLicense> _assignedLicenses;
    /** Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). */
    private Boolean _autoSubscribeNewMembers;
    /** The group's calendar. Read-only. */
    private Calendar _calendar;
    /** The calendar view for the calendar. Read-only. */
    private java.util.List<Event> _calendarView;
    /** Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith). */
    private String _classification;
    /** The group's conversations. */
    private java.util.List<Conversation> _conversations;
    /** App ID of the app used to create the group. Can be null for some groups. Returned by default. Read-only. Supports $filter (eq, ne, not, in, startsWith). */
    private String _createdByAppId;
    /** Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only. */
    private OffsetDateTime _createdDateTime;
    /** The user (or application) that created the group. Note: This is not set if the user is an administrator. Read-only. */
    private DirectoryObject _createdOnBehalfOf;
    /** An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search. */
    private String _description;
    /** The display name for the group. Required. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy. */
    private String _displayName;
    /** The group's default drive. Read-only. */
    private Drive _drive;
    /** The group's drives. Read-only. */
    private java.util.List<Drive> _drives;
    /** Endpoints for the group. Read-only. Nullable. */
    private java.util.List<Endpoint> _endpoints;
    /** The group's events. */
    private java.util.List<Event> _events;
    /** Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only. */
    private OffsetDateTime _expirationDateTime;
    /** The collection of open extensions defined for the group. Read-only. Nullable. */
    private java.util.List<Extension> _extensions;
    /** The collection of lifecycle policies for this group. Read-only. Nullable. */
    private java.util.List<GroupLifecyclePolicy> _groupLifecyclePolicies;
    /** Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default. Supports $filter (eq, not). */
    private java.util.List<String> _groupTypes;
    /** Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true).  Supports $filter (eq). */
    private Boolean _hasMembersWithLicenseErrors;
    /** true if the group is not displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups; false otherwise. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). */
    private Boolean _hideFromAddressLists;
    /** true if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web, false otherwise. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). */
    private Boolean _hideFromOutlookClients;
    /** Identifies the info segments assigned to the group. Returned by default. Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _infoCatalogs;
    /** When a group is associated with a team, this property determines whether the team is in read-only mode. */
    private Boolean _isArchived;
    /** Indicates whether this group can be assigned to an Azure Active Directory role. Optional. This property can only be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true and the group cannot be a dynamic group (that is, groupTypes cannot contain DynamicMembership). Only callers in Global administrator and Privileged role administrator roles can set this property. The caller must be assigned the RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more, see Using a group to manage Azure AD role assignmentsReturned by default. Supports $filter (eq, ne, not). */
    private Boolean _isAssignableToRole;
    /** The isFavorite property */
    private Boolean _isFavorite;
    /** The isManagementRestricted property */
    private Boolean _isManagementRestricted;
    /** Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). */
    private Boolean _isSubscribedByMail;
    /** Indicates status of the group license assignment to all members of the group. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete. Returned only on $select. Read-only. */
    private LicenseProcessingState _licenseProcessingState;
    /** The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _mail;
    /** Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not, and eq on null values). */
    private Boolean _mailEnabled;
    /** The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters. This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] ' ; : . <> , SPACE. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). */
    private String _mailNickname;
    /** The mdmAppId property */
    private String _mdmAppId;
    /** Groups and administrative units that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _memberOf;
    /** Members of this group, who can be users, devices, other groups, or service principals. Supports the List members, Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&$select=id,displayName&$expand=members($select=id,userPrincipalName,displayName). */
    private java.util.List<DirectoryObject> _members;
    /** The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith). */
    private String _membershipRule;
    /** Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by default. Supports $filter (eq, ne, not, in). */
    private String _membershipRuleProcessingState;
    /** Describes the processing status for rules-based dynamic groups. The property is null for non-rule based dynamic groups or if the dynamic group processing has been paused. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). Read-only. */
    private MembershipRuleProcessingStatus _membershipRuleProcessingStatus;
    /** A list of group members with license errors from this group-based license assignment. Read-only. */
    private java.util.List<DirectoryObject> _membersWithLicenseErrors;
    /** Read-only. */
    private Onenote _onenote;
    /** Contains the on-premises domain FQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only. */
    private String _onPremisesDomainName;
    /** Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in). */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** Contains the on-premises netBios name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only. */
    private String _onPremisesNetBiosName;
    /** Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq, not). */
    private java.util.List<OnPremisesProvisioningError> _onPremisesProvisioningErrors;
    /** Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only. */
    private String _onPremisesSamAccountName;
    /** Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Supports $filter (eq including on null values). Read-only. */
    private String _onPremisesSecurityIdentifier;
    /** true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values). */
    private Boolean _onPremisesSyncEnabled;
    /** The organizationId property */
    private String _organizationId;
    /** The owners of the group who can be users or service principals. Nullable. If this property is not specified when creating a Microsoft 365 group, the calling user is automatically assigned as the group owner. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&$select=id,displayName&$expand=owners($select=id,userPrincipalName,displayName). */
    private java.util.List<DirectoryObject> _owners;
    /** The permissions that have been granted for a group to a specific application. Supports $expand. */
    private java.util.List<ResourceSpecificPermissionGrant> _permissionGrants;
    /** The group's profile photo. */
    private ProfilePhoto _photo;
    /** The profile photos owned by the group. Read-only. Nullable. */
    private java.util.List<ProfilePhoto> _photos;
    /** Selective Planner services available to the group. Read-only. Nullable. */
    private PlannerGroup _planner;
    /** The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator's preferred data location. To set this property, the calling user must be assigned one of the following Azure AD roles:  Global Administrator  User Account Administrator Directory Writer  Exchange Administrator  SharePoint Administrator  For more information about this property, see OneDrive Online Multi-Geo. Nullable. Returned by default. */
    private String _preferredDataLocation;
    /** The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values). */
    private String _preferredLanguage;
    /** Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required for filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith). */
    private java.util.List<String> _proxyAddresses;
    /** The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable */
    private java.util.List<DirectoryObject> _rejectedSenders;
    /** Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only. */
    private OffsetDateTime _renewedDateTime;
    /** Specifies the group behaviors that can be set for a Microsoft 365 group during creation. This can be set only as part of creation (POST). Possible values are AllowOnlyMembersToPost, HideGroupInOutlook, SubscribeNewGroupMembers, WelcomeEmailDisabled. For more information, see Set Microsoft 365 group behaviors and provisioning options. */
    private java.util.List<String> _resourceBehaviorOptions;
    /** Specifies the group resources that are provisioned as part of Microsoft 365 group creation, that are not normally part of default group creation. Possible value is Team. For more information, see Set Microsoft 365 group behaviors and provisioning options. Returned by default. Supports $filter (eq, not, startsWith. */
    private java.util.List<String> _resourceProvisioningOptions;
    /** Specifies whether the group is a security group. Required.Returned by default. Supports $filter (eq, ne, not, in). */
    private Boolean _securityEnabled;
    /** Security identifier of the group, used in Windows scenarios. Returned by default. */
    private String _securityIdentifier;
    /** Settings that can govern this group's behavior, like whether members can invite guest users to the group. Nullable. */
    private java.util.List<DirectorySetting> _settings;
    /** The list of SharePoint sites in this group. Access the default site with /sites/root. */
    private java.util.List<Site> _sites;
    /** The team associated with this group. */
    private Team _team;
    /** Specifies a Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default. */
    private String _theme;
    /** The group's conversation threads. Nullable. */
    private java.util.List<ConversationThread> _threads;
    /** The transitiveMemberOf property */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
    /** The transitiveMembers property */
    private java.util.List<DirectoryObject> _transitiveMembers;
    /** Count of conversations that have been delivered one or more new posts since the signed-in user's last visit to the group. This property is the same as unseenCount. Returned only on $select. */
    private Integer _unseenConversationsCount;
    /** Count of conversations that have received new posts since the signed-in user last visited the group. This property is the same as unseenConversationsCount.Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). */
    private Integer _unseenCount;
    /** Count of new posts that have been delivered to the group's conversations since the signed-in user's last visit to the group. Returned only on $select. */
    private Integer _unseenMessagesCount;
    /** Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or Hiddenmembership. Hiddenmembership can be set only for Microsoft 365 groups, when the groups are created. It can't be updated later. Other values of visibility can be updated after group creation. If visibility value is not specified during group creation on Microsoft Graph, a security group is created as Private by default and Microsoft 365 group is Public. Groups assignable to roles are always Private. See group visibility options to learn more. Returned by default. Nullable. */
    private String _visibility;
    /**
     * Instantiates a new group and sets the default values.
     * @return a void
     */
    public Group() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a group
     */
    @javax.annotation.Nonnull
    public static Group createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Group();
    }
    /**
     * Gets the acceptedSenders property value. The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getAcceptedSenders() {
        return this._acceptedSenders;
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a groupAccessType
     */
    @javax.annotation.Nullable
    public GroupAccessType getAccessType() {
        return this._accessType;
    }
    /**
     * Gets the allowExternalSenders property value. Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowExternalSenders() {
        return this._allowExternalSenders;
    }
    /**
     * Gets the appRoleAssignments property value. Represents the app roles a group has been granted for an application. Supports $expand.
     * @return a appRoleAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AppRoleAssignment> getAppRoleAssignments() {
        return this._appRoleAssignments;
    }
    /**
     * Gets the assignedLabels property value. The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on $select.
     * @return a assignedLabel
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLabel> getAssignedLabels() {
        return this._assignedLabels;
    }
    /**
     * Gets the assignedLicenses property value. The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq). Read-only.
     * @return a assignedLicense
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedLicense> getAssignedLicenses() {
        return this._assignedLicenses;
    }
    /**
     * Gets the autoSubscribeNewMembers property value. Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAutoSubscribeNewMembers() {
        return this._autoSubscribeNewMembers;
    }
    /**
     * Gets the calendar property value. The group's calendar. Read-only.
     * @return a calendar
     */
    @javax.annotation.Nullable
    public Calendar getCalendar() {
        return this._calendar;
    }
    /**
     * Gets the calendarView property value. The calendar view for the calendar. Read-only.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getCalendarView() {
        return this._calendarView;
    }
    /**
     * Gets the classification property value. Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getClassification() {
        return this._classification;
    }
    /**
     * Gets the conversations property value. The group's conversations.
     * @return a conversation
     */
    @javax.annotation.Nullable
    public java.util.List<Conversation> getConversations() {
        return this._conversations;
    }
    /**
     * Gets the createdByAppId property value. App ID of the app used to create the group. Can be null for some groups. Returned by default. Read-only. Supports $filter (eq, ne, not, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByAppId() {
        return this._createdByAppId;
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the createdOnBehalfOf property value. The user (or application) that created the group. Note: This is not set if the user is an administrator. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public DirectoryObject getCreatedOnBehalfOf() {
        return this._createdOnBehalfOf;
    }
    /**
     * Gets the description property value. An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the group. Required. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the drive property value. The group's default drive. Read-only.
     * @return a drive
     */
    @javax.annotation.Nullable
    public Drive getDrive() {
        return this._drive;
    }
    /**
     * Gets the drives property value. The group's drives. Read-only.
     * @return a drive
     */
    @javax.annotation.Nullable
    public java.util.List<Drive> getDrives() {
        return this._drives;
    }
    /**
     * Gets the endpoints property value. Endpoints for the group. Read-only. Nullable.
     * @return a endpoint
     */
    @javax.annotation.Nullable
    public java.util.List<Endpoint> getEndpoints() {
        return this._endpoints;
    }
    /**
     * Gets the events property value. The group's events.
     * @return a event
     */
    @javax.annotation.Nullable
    public java.util.List<Event> getEvents() {
        return this._events;
    }
    /**
     * Gets the expirationDateTime property value. Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this._expirationDateTime;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the group. Read-only. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Group currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("acceptedSenders", (n) -> { currentObject.setAcceptedSenders(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("accessType", (n) -> { currentObject.setAccessType(n.getEnumValue(GroupAccessType.class)); });
            this.put("allowExternalSenders", (n) -> { currentObject.setAllowExternalSenders(n.getBooleanValue()); });
            this.put("appRoleAssignments", (n) -> { currentObject.setAppRoleAssignments(n.getCollectionOfObjectValues(AppRoleAssignment::createFromDiscriminatorValue)); });
            this.put("assignedLabels", (n) -> { currentObject.setAssignedLabels(n.getCollectionOfObjectValues(AssignedLabel::createFromDiscriminatorValue)); });
            this.put("assignedLicenses", (n) -> { currentObject.setAssignedLicenses(n.getCollectionOfObjectValues(AssignedLicense::createFromDiscriminatorValue)); });
            this.put("autoSubscribeNewMembers", (n) -> { currentObject.setAutoSubscribeNewMembers(n.getBooleanValue()); });
            this.put("calendar", (n) -> { currentObject.setCalendar(n.getObjectValue(Calendar::createFromDiscriminatorValue)); });
            this.put("calendarView", (n) -> { currentObject.setCalendarView(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
            this.put("classification", (n) -> { currentObject.setClassification(n.getStringValue()); });
            this.put("conversations", (n) -> { currentObject.setConversations(n.getCollectionOfObjectValues(Conversation::createFromDiscriminatorValue)); });
            this.put("createdByAppId", (n) -> { currentObject.setCreatedByAppId(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("createdOnBehalfOf", (n) -> { currentObject.setCreatedOnBehalfOf(n.getObjectValue(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("drive", (n) -> { currentObject.setDrive(n.getObjectValue(Drive::createFromDiscriminatorValue)); });
            this.put("drives", (n) -> { currentObject.setDrives(n.getCollectionOfObjectValues(Drive::createFromDiscriminatorValue)); });
            this.put("endpoints", (n) -> { currentObject.setEndpoints(n.getCollectionOfObjectValues(Endpoint::createFromDiscriminatorValue)); });
            this.put("events", (n) -> { currentObject.setEvents(n.getCollectionOfObjectValues(Event::createFromDiscriminatorValue)); });
            this.put("expirationDateTime", (n) -> { currentObject.setExpirationDateTime(n.getOffsetDateTimeValue()); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("groupLifecyclePolicies", (n) -> { currentObject.setGroupLifecyclePolicies(n.getCollectionOfObjectValues(GroupLifecyclePolicy::createFromDiscriminatorValue)); });
            this.put("groupTypes", (n) -> { currentObject.setGroupTypes(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("hasMembersWithLicenseErrors", (n) -> { currentObject.setHasMembersWithLicenseErrors(n.getBooleanValue()); });
            this.put("hideFromAddressLists", (n) -> { currentObject.setHideFromAddressLists(n.getBooleanValue()); });
            this.put("hideFromOutlookClients", (n) -> { currentObject.setHideFromOutlookClients(n.getBooleanValue()); });
            this.put("infoCatalogs", (n) -> { currentObject.setInfoCatalogs(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("isArchived", (n) -> { currentObject.setIsArchived(n.getBooleanValue()); });
            this.put("isAssignableToRole", (n) -> { currentObject.setIsAssignableToRole(n.getBooleanValue()); });
            this.put("isFavorite", (n) -> { currentObject.setIsFavorite(n.getBooleanValue()); });
            this.put("isManagementRestricted", (n) -> { currentObject.setIsManagementRestricted(n.getBooleanValue()); });
            this.put("isSubscribedByMail", (n) -> { currentObject.setIsSubscribedByMail(n.getBooleanValue()); });
            this.put("licenseProcessingState", (n) -> { currentObject.setLicenseProcessingState(n.getObjectValue(LicenseProcessingState::createFromDiscriminatorValue)); });
            this.put("mail", (n) -> { currentObject.setMail(n.getStringValue()); });
            this.put("mailEnabled", (n) -> { currentObject.setMailEnabled(n.getBooleanValue()); });
            this.put("mailNickname", (n) -> { currentObject.setMailNickname(n.getStringValue()); });
            this.put("mdmAppId", (n) -> { currentObject.setMdmAppId(n.getStringValue()); });
            this.put("memberOf", (n) -> { currentObject.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("members", (n) -> { currentObject.setMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("membershipRule", (n) -> { currentObject.setMembershipRule(n.getStringValue()); });
            this.put("membershipRuleProcessingState", (n) -> { currentObject.setMembershipRuleProcessingState(n.getStringValue()); });
            this.put("membershipRuleProcessingStatus", (n) -> { currentObject.setMembershipRuleProcessingStatus(n.getObjectValue(MembershipRuleProcessingStatus::createFromDiscriminatorValue)); });
            this.put("membersWithLicenseErrors", (n) -> { currentObject.setMembersWithLicenseErrors(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("onenote", (n) -> { currentObject.setOnenote(n.getObjectValue(Onenote::createFromDiscriminatorValue)); });
            this.put("onPremisesDomainName", (n) -> { currentObject.setOnPremisesDomainName(n.getStringValue()); });
            this.put("onPremisesLastSyncDateTime", (n) -> { currentObject.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("onPremisesNetBiosName", (n) -> { currentObject.setOnPremisesNetBiosName(n.getStringValue()); });
            this.put("onPremisesProvisioningErrors", (n) -> { currentObject.setOnPremisesProvisioningErrors(n.getCollectionOfObjectValues(OnPremisesProvisioningError::createFromDiscriminatorValue)); });
            this.put("onPremisesSamAccountName", (n) -> { currentObject.setOnPremisesSamAccountName(n.getStringValue()); });
            this.put("onPremisesSecurityIdentifier", (n) -> { currentObject.setOnPremisesSecurityIdentifier(n.getStringValue()); });
            this.put("onPremisesSyncEnabled", (n) -> { currentObject.setOnPremisesSyncEnabled(n.getBooleanValue()); });
            this.put("organizationId", (n) -> { currentObject.setOrganizationId(n.getStringValue()); });
            this.put("owners", (n) -> { currentObject.setOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("permissionGrants", (n) -> { currentObject.setPermissionGrants(n.getCollectionOfObjectValues(ResourceSpecificPermissionGrant::createFromDiscriminatorValue)); });
            this.put("photo", (n) -> { currentObject.setPhoto(n.getObjectValue(ProfilePhoto::createFromDiscriminatorValue)); });
            this.put("photos", (n) -> { currentObject.setPhotos(n.getCollectionOfObjectValues(ProfilePhoto::createFromDiscriminatorValue)); });
            this.put("planner", (n) -> { currentObject.setPlanner(n.getObjectValue(PlannerGroup::createFromDiscriminatorValue)); });
            this.put("preferredDataLocation", (n) -> { currentObject.setPreferredDataLocation(n.getStringValue()); });
            this.put("preferredLanguage", (n) -> { currentObject.setPreferredLanguage(n.getStringValue()); });
            this.put("proxyAddresses", (n) -> { currentObject.setProxyAddresses(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("rejectedSenders", (n) -> { currentObject.setRejectedSenders(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("renewedDateTime", (n) -> { currentObject.setRenewedDateTime(n.getOffsetDateTimeValue()); });
            this.put("resourceBehaviorOptions", (n) -> { currentObject.setResourceBehaviorOptions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("resourceProvisioningOptions", (n) -> { currentObject.setResourceProvisioningOptions(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("securityEnabled", (n) -> { currentObject.setSecurityEnabled(n.getBooleanValue()); });
            this.put("securityIdentifier", (n) -> { currentObject.setSecurityIdentifier(n.getStringValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getCollectionOfObjectValues(DirectorySetting::createFromDiscriminatorValue)); });
            this.put("sites", (n) -> { currentObject.setSites(n.getCollectionOfObjectValues(Site::createFromDiscriminatorValue)); });
            this.put("team", (n) -> { currentObject.setTeam(n.getObjectValue(Team::createFromDiscriminatorValue)); });
            this.put("theme", (n) -> { currentObject.setTheme(n.getStringValue()); });
            this.put("threads", (n) -> { currentObject.setThreads(n.getCollectionOfObjectValues(ConversationThread::createFromDiscriminatorValue)); });
            this.put("transitiveMemberOf", (n) -> { currentObject.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("transitiveMembers", (n) -> { currentObject.setTransitiveMembers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
            this.put("unseenConversationsCount", (n) -> { currentObject.setUnseenConversationsCount(n.getIntegerValue()); });
            this.put("unseenCount", (n) -> { currentObject.setUnseenCount(n.getIntegerValue()); });
            this.put("unseenMessagesCount", (n) -> { currentObject.setUnseenMessagesCount(n.getIntegerValue()); });
            this.put("visibility", (n) -> { currentObject.setVisibility(n.getStringValue()); });
        }};
    }
    /**
     * Gets the groupLifecyclePolicies property value. The collection of lifecycle policies for this group. Read-only. Nullable.
     * @return a groupLifecyclePolicy
     */
    @javax.annotation.Nullable
    public java.util.List<GroupLifecyclePolicy> getGroupLifecyclePolicies() {
        return this._groupLifecyclePolicies;
    }
    /**
     * Gets the groupTypes property value. Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default. Supports $filter (eq, not).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getGroupTypes() {
        return this._groupTypes;
    }
    /**
     * Gets the hasMembersWithLicenseErrors property value. Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true).  Supports $filter (eq).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHasMembersWithLicenseErrors() {
        return this._hasMembersWithLicenseErrors;
    }
    /**
     * Gets the hideFromAddressLists property value. true if the group is not displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups; false otherwise. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideFromAddressLists() {
        return this._hideFromAddressLists;
    }
    /**
     * Gets the hideFromOutlookClients property value. true if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web, false otherwise. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getHideFromOutlookClients() {
        return this._hideFromOutlookClients;
    }
    /**
     * Gets the infoCatalogs property value. Identifies the info segments assigned to the group. Returned by default. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInfoCatalogs() {
        return this._infoCatalogs;
    }
    /**
     * Gets the isArchived property value. When a group is associated with a team, this property determines whether the team is in read-only mode.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsArchived() {
        return this._isArchived;
    }
    /**
     * Gets the isAssignableToRole property value. Indicates whether this group can be assigned to an Azure Active Directory role. Optional. This property can only be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true and the group cannot be a dynamic group (that is, groupTypes cannot contain DynamicMembership). Only callers in Global administrator and Privileged role administrator roles can set this property. The caller must be assigned the RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more, see Using a group to manage Azure AD role assignmentsReturned by default. Supports $filter (eq, ne, not).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssignableToRole() {
        return this._isAssignableToRole;
    }
    /**
     * Gets the isFavorite property value. The isFavorite property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsFavorite() {
        return this._isFavorite;
    }
    /**
     * Gets the isManagementRestricted property value. The isManagementRestricted property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsManagementRestricted() {
        return this._isManagementRestricted;
    }
    /**
     * Gets the isSubscribedByMail property value. Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSubscribedByMail() {
        return this._isSubscribedByMail;
    }
    /**
     * Gets the licenseProcessingState property value. Indicates status of the group license assignment to all members of the group. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete. Returned only on $select. Read-only.
     * @return a licenseProcessingState
     */
    @javax.annotation.Nullable
    public LicenseProcessingState getLicenseProcessingState() {
        return this._licenseProcessingState;
    }
    /**
     * Gets the mail property value. The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMail() {
        return this._mail;
    }
    /**
     * Gets the mailEnabled property value. Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not, and eq on null values).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMailEnabled() {
        return this._mailEnabled;
    }
    /**
     * Gets the mailNickname property value. The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters. This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] ' ; : . <> , SPACE. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMailNickname() {
        return this._mailNickname;
    }
    /**
     * Gets the mdmAppId property value. The mdmAppId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmAppId() {
        return this._mdmAppId;
    }
    /**
     * Gets the memberOf property value. Groups and administrative units that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the members property value. Members of this group, who can be users, devices, other groups, or service principals. Supports the List members, Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&$select=id,displayName&$expand=members($select=id,userPrincipalName,displayName).
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMembers() {
        return this._members;
    }
    /**
     * Gets the membershipRule property value. The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMembershipRule() {
        return this._membershipRule;
    }
    /**
     * Gets the membershipRuleProcessingState property value. Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by default. Supports $filter (eq, ne, not, in).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMembershipRuleProcessingState() {
        return this._membershipRuleProcessingState;
    }
    /**
     * Gets the membershipRuleProcessingStatus property value. Describes the processing status for rules-based dynamic groups. The property is null for non-rule based dynamic groups or if the dynamic group processing has been paused. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). Read-only.
     * @return a membershipRuleProcessingStatus
     */
    @javax.annotation.Nullable
    public MembershipRuleProcessingStatus getMembershipRuleProcessingStatus() {
        return this._membershipRuleProcessingStatus;
    }
    /**
     * Gets the membersWithLicenseErrors property value. A list of group members with license errors from this group-based license assignment. Read-only.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMembersWithLicenseErrors() {
        return this._membersWithLicenseErrors;
    }
    /**
     * Gets the onenote property value. Read-only.
     * @return a onenote
     */
    @javax.annotation.Nullable
    public Onenote getOnenote() {
        return this._onenote;
    }
    /**
     * Gets the onPremisesDomainName property value. Contains the on-premises domain FQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesDomainName() {
        return this._onPremisesDomainName;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesNetBiosName property value. Contains the on-premises netBios name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesNetBiosName() {
        return this._onPremisesNetBiosName;
    }
    /**
     * Gets the onPremisesProvisioningErrors property value. Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq, not).
     * @return a onPremisesProvisioningError
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesProvisioningError> getOnPremisesProvisioningErrors() {
        return this._onPremisesProvisioningErrors;
    }
    /**
     * Gets the onPremisesSamAccountName property value. Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSamAccountName() {
        return this._onPremisesSamAccountName;
    }
    /**
     * Gets the onPremisesSecurityIdentifier property value. Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Supports $filter (eq including on null values). Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesSecurityIdentifier() {
        return this._onPremisesSecurityIdentifier;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the organizationId property value. The organizationId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOrganizationId() {
        return this._organizationId;
    }
    /**
     * Gets the owners property value. The owners of the group who can be users or service principals. Nullable. If this property is not specified when creating a Microsoft 365 group, the calling user is automatically assigned as the group owner. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&$select=id,displayName&$expand=owners($select=id,userPrincipalName,displayName).
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getOwners() {
        return this._owners;
    }
    /**
     * Gets the permissionGrants property value. The permissions that have been granted for a group to a specific application. Supports $expand.
     * @return a resourceSpecificPermissionGrant
     */
    @javax.annotation.Nullable
    public java.util.List<ResourceSpecificPermissionGrant> getPermissionGrants() {
        return this._permissionGrants;
    }
    /**
     * Gets the photo property value. The group's profile photo.
     * @return a profilePhoto
     */
    @javax.annotation.Nullable
    public ProfilePhoto getPhoto() {
        return this._photo;
    }
    /**
     * Gets the photos property value. The profile photos owned by the group. Read-only. Nullable.
     * @return a profilePhoto
     */
    @javax.annotation.Nullable
    public java.util.List<ProfilePhoto> getPhotos() {
        return this._photos;
    }
    /**
     * Gets the planner property value. Selective Planner services available to the group. Read-only. Nullable.
     * @return a plannerGroup
     */
    @javax.annotation.Nullable
    public PlannerGroup getPlanner() {
        return this._planner;
    }
    /**
     * Gets the preferredDataLocation property value. The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator's preferred data location. To set this property, the calling user must be assigned one of the following Azure AD roles:  Global Administrator  User Account Administrator Directory Writer  Exchange Administrator  SharePoint Administrator  For more information about this property, see OneDrive Online Multi-Geo. Nullable. Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredDataLocation() {
        return this._preferredDataLocation;
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredLanguage() {
        return this._preferredLanguage;
    }
    /**
     * Gets the proxyAddresses property value. Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required for filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getProxyAddresses() {
        return this._proxyAddresses;
    }
    /**
     * Gets the rejectedSenders property value. The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getRejectedSenders() {
        return this._rejectedSenders;
    }
    /**
     * Gets the renewedDateTime property value. Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRenewedDateTime() {
        return this._renewedDateTime;
    }
    /**
     * Gets the resourceBehaviorOptions property value. Specifies the group behaviors that can be set for a Microsoft 365 group during creation. This can be set only as part of creation (POST). Possible values are AllowOnlyMembersToPost, HideGroupInOutlook, SubscribeNewGroupMembers, WelcomeEmailDisabled. For more information, see Set Microsoft 365 group behaviors and provisioning options.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResourceBehaviorOptions() {
        return this._resourceBehaviorOptions;
    }
    /**
     * Gets the resourceProvisioningOptions property value. Specifies the group resources that are provisioned as part of Microsoft 365 group creation, that are not normally part of default group creation. Possible value is Team. For more information, see Set Microsoft 365 group behaviors and provisioning options. Returned by default. Supports $filter (eq, not, startsWith.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getResourceProvisioningOptions() {
        return this._resourceProvisioningOptions;
    }
    /**
     * Gets the securityEnabled property value. Specifies whether the group is a security group. Required.Returned by default. Supports $filter (eq, ne, not, in).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getSecurityEnabled() {
        return this._securityEnabled;
    }
    /**
     * Gets the securityIdentifier property value. Security identifier of the group, used in Windows scenarios. Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityIdentifier() {
        return this._securityIdentifier;
    }
    /**
     * Gets the settings property value. Settings that can govern this group's behavior, like whether members can invite guest users to the group. Nullable.
     * @return a directorySetting
     */
    @javax.annotation.Nullable
    public java.util.List<DirectorySetting> getSettings() {
        return this._settings;
    }
    /**
     * Gets the sites property value. The list of SharePoint sites in this group. Access the default site with /sites/root.
     * @return a site
     */
    @javax.annotation.Nullable
    public java.util.List<Site> getSites() {
        return this._sites;
    }
    /**
     * Gets the team property value. The team associated with this group.
     * @return a team
     */
    @javax.annotation.Nullable
    public Team getTeam() {
        return this._team;
    }
    /**
     * Gets the theme property value. Specifies a Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTheme() {
        return this._theme;
    }
    /**
     * Gets the threads property value. The group's conversation threads. Nullable.
     * @return a conversationThread
     */
    @javax.annotation.Nullable
    public java.util.List<ConversationThread> getThreads() {
        return this._threads;
    }
    /**
     * Gets the transitiveMemberOf property value. The transitiveMemberOf property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this._transitiveMemberOf;
    }
    /**
     * Gets the transitiveMembers property value. The transitiveMembers property
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMembers() {
        return this._transitiveMembers;
    }
    /**
     * Gets the unseenConversationsCount property value. Count of conversations that have been delivered one or more new posts since the signed-in user's last visit to the group. This property is the same as unseenCount. Returned only on $select.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnseenConversationsCount() {
        return this._unseenConversationsCount;
    }
    /**
     * Gets the unseenCount property value. Count of conversations that have received new posts since the signed-in user last visited the group. This property is the same as unseenConversationsCount.Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnseenCount() {
        return this._unseenCount;
    }
    /**
     * Gets the unseenMessagesCount property value. Count of new posts that have been delivered to the group's conversations since the signed-in user's last visit to the group. Returned only on $select.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUnseenMessagesCount() {
        return this._unseenMessagesCount;
    }
    /**
     * Gets the visibility property value. Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or Hiddenmembership. Hiddenmembership can be set only for Microsoft 365 groups, when the groups are created. It can't be updated later. Other values of visibility can be updated after group creation. If visibility value is not specified during group creation on Microsoft Graph, a security group is created as Private by default and Microsoft 365 group is Public. Groups assignable to roles are always Private. See group visibility options to learn more. Returned by default. Nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVisibility() {
        return this._visibility;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("acceptedSenders", this.getAcceptedSenders());
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeBooleanValue("allowExternalSenders", this.getAllowExternalSenders());
        writer.writeCollectionOfObjectValues("appRoleAssignments", this.getAppRoleAssignments());
        writer.writeCollectionOfObjectValues("assignedLabels", this.getAssignedLabels());
        writer.writeCollectionOfObjectValues("assignedLicenses", this.getAssignedLicenses());
        writer.writeBooleanValue("autoSubscribeNewMembers", this.getAutoSubscribeNewMembers());
        writer.writeObjectValue("calendar", this.getCalendar());
        writer.writeCollectionOfObjectValues("calendarView", this.getCalendarView());
        writer.writeStringValue("classification", this.getClassification());
        writer.writeCollectionOfObjectValues("conversations", this.getConversations());
        writer.writeStringValue("createdByAppId", this.getCreatedByAppId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeObjectValue("createdOnBehalfOf", this.getCreatedOnBehalfOf());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("drive", this.getDrive());
        writer.writeCollectionOfObjectValues("drives", this.getDrives());
        writer.writeCollectionOfObjectValues("endpoints", this.getEndpoints());
        writer.writeCollectionOfObjectValues("events", this.getEvents());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfObjectValues("groupLifecyclePolicies", this.getGroupLifecyclePolicies());
        writer.writeCollectionOfPrimitiveValues("groupTypes", this.getGroupTypes());
        writer.writeBooleanValue("hasMembersWithLicenseErrors", this.getHasMembersWithLicenseErrors());
        writer.writeBooleanValue("hideFromAddressLists", this.getHideFromAddressLists());
        writer.writeBooleanValue("hideFromOutlookClients", this.getHideFromOutlookClients());
        writer.writeCollectionOfPrimitiveValues("infoCatalogs", this.getInfoCatalogs());
        writer.writeBooleanValue("isArchived", this.getIsArchived());
        writer.writeBooleanValue("isAssignableToRole", this.getIsAssignableToRole());
        writer.writeBooleanValue("isFavorite", this.getIsFavorite());
        writer.writeBooleanValue("isManagementRestricted", this.getIsManagementRestricted());
        writer.writeBooleanValue("isSubscribedByMail", this.getIsSubscribedByMail());
        writer.writeObjectValue("licenseProcessingState", this.getLicenseProcessingState());
        writer.writeStringValue("mail", this.getMail());
        writer.writeBooleanValue("mailEnabled", this.getMailEnabled());
        writer.writeStringValue("mailNickname", this.getMailNickname());
        writer.writeStringValue("mdmAppId", this.getMdmAppId());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeCollectionOfObjectValues("members", this.getMembers());
        writer.writeStringValue("membershipRule", this.getMembershipRule());
        writer.writeStringValue("membershipRuleProcessingState", this.getMembershipRuleProcessingState());
        writer.writeObjectValue("membershipRuleProcessingStatus", this.getMembershipRuleProcessingStatus());
        writer.writeCollectionOfObjectValues("membersWithLicenseErrors", this.getMembersWithLicenseErrors());
        writer.writeObjectValue("onenote", this.getOnenote());
        writer.writeStringValue("onPremisesDomainName", this.getOnPremisesDomainName());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeStringValue("onPremisesNetBiosName", this.getOnPremisesNetBiosName());
        writer.writeCollectionOfObjectValues("onPremisesProvisioningErrors", this.getOnPremisesProvisioningErrors());
        writer.writeStringValue("onPremisesSamAccountName", this.getOnPremisesSamAccountName());
        writer.writeStringValue("onPremisesSecurityIdentifier", this.getOnPremisesSecurityIdentifier());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeStringValue("organizationId", this.getOrganizationId());
        writer.writeCollectionOfObjectValues("owners", this.getOwners());
        writer.writeCollectionOfObjectValues("permissionGrants", this.getPermissionGrants());
        writer.writeObjectValue("photo", this.getPhoto());
        writer.writeCollectionOfObjectValues("photos", this.getPhotos());
        writer.writeObjectValue("planner", this.getPlanner());
        writer.writeStringValue("preferredDataLocation", this.getPreferredDataLocation());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeCollectionOfPrimitiveValues("proxyAddresses", this.getProxyAddresses());
        writer.writeCollectionOfObjectValues("rejectedSenders", this.getRejectedSenders());
        writer.writeOffsetDateTimeValue("renewedDateTime", this.getRenewedDateTime());
        writer.writeCollectionOfPrimitiveValues("resourceBehaviorOptions", this.getResourceBehaviorOptions());
        writer.writeCollectionOfPrimitiveValues("resourceProvisioningOptions", this.getResourceProvisioningOptions());
        writer.writeBooleanValue("securityEnabled", this.getSecurityEnabled());
        writer.writeStringValue("securityIdentifier", this.getSecurityIdentifier());
        writer.writeCollectionOfObjectValues("settings", this.getSettings());
        writer.writeCollectionOfObjectValues("sites", this.getSites());
        writer.writeObjectValue("team", this.getTeam());
        writer.writeStringValue("theme", this.getTheme());
        writer.writeCollectionOfObjectValues("threads", this.getThreads());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeCollectionOfObjectValues("transitiveMembers", this.getTransitiveMembers());
        writer.writeIntegerValue("unseenConversationsCount", this.getUnseenConversationsCount());
        writer.writeIntegerValue("unseenCount", this.getUnseenCount());
        writer.writeIntegerValue("unseenMessagesCount", this.getUnseenMessagesCount());
        writer.writeStringValue("visibility", this.getVisibility());
    }
    /**
     * Sets the acceptedSenders property value. The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post.
     * @param value Value to set for the acceptedSenders property.
     * @return a void
     */
    public void setAcceptedSenders(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._acceptedSenders = value;
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     * @return a void
     */
    public void setAccessType(@javax.annotation.Nullable final GroupAccessType value) {
        this._accessType = value;
    }
    /**
     * Sets the allowExternalSenders property value. Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the allowExternalSenders property.
     * @return a void
     */
    public void setAllowExternalSenders(@javax.annotation.Nullable final Boolean value) {
        this._allowExternalSenders = value;
    }
    /**
     * Sets the appRoleAssignments property value. Represents the app roles a group has been granted for an application. Supports $expand.
     * @param value Value to set for the appRoleAssignments property.
     * @return a void
     */
    public void setAppRoleAssignments(@javax.annotation.Nullable final java.util.List<AppRoleAssignment> value) {
        this._appRoleAssignments = value;
    }
    /**
     * Sets the assignedLabels property value. The list of sensitivity label pairs (label ID, label name) associated with a Microsoft 365 group. Returned only on $select.
     * @param value Value to set for the assignedLabels property.
     * @return a void
     */
    public void setAssignedLabels(@javax.annotation.Nullable final java.util.List<AssignedLabel> value) {
        this._assignedLabels = value;
    }
    /**
     * Sets the assignedLicenses property value. The licenses that are assigned to the group. Returned only on $select. Supports $filter (eq). Read-only.
     * @param value Value to set for the assignedLicenses property.
     * @return a void
     */
    public void setAssignedLicenses(@javax.annotation.Nullable final java.util.List<AssignedLicense> value) {
        this._assignedLicenses = value;
    }
    /**
     * Sets the autoSubscribeNewMembers property value. Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group; do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the autoSubscribeNewMembers property.
     * @return a void
     */
    public void setAutoSubscribeNewMembers(@javax.annotation.Nullable final Boolean value) {
        this._autoSubscribeNewMembers = value;
    }
    /**
     * Sets the calendar property value. The group's calendar. Read-only.
     * @param value Value to set for the calendar property.
     * @return a void
     */
    public void setCalendar(@javax.annotation.Nullable final Calendar value) {
        this._calendar = value;
    }
    /**
     * Sets the calendarView property value. The calendar view for the calendar. Read-only.
     * @param value Value to set for the calendarView property.
     * @return a void
     */
    public void setCalendarView(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._calendarView = value;
    }
    /**
     * Sets the classification property value. Describes a classification for the group (such as low, medium or high business impact). Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @param value Value to set for the classification property.
     * @return a void
     */
    public void setClassification(@javax.annotation.Nullable final String value) {
        this._classification = value;
    }
    /**
     * Sets the conversations property value. The group's conversations.
     * @param value Value to set for the conversations property.
     * @return a void
     */
    public void setConversations(@javax.annotation.Nullable final java.util.List<Conversation> value) {
        this._conversations = value;
    }
    /**
     * Sets the createdByAppId property value. App ID of the app used to create the group. Can be null for some groups. Returned by default. Read-only. Supports $filter (eq, ne, not, in, startsWith).
     * @param value Value to set for the createdByAppId property.
     * @return a void
     */
    public void setCreatedByAppId(@javax.annotation.Nullable final String value) {
        this._createdByAppId = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the createdOnBehalfOf property value. The user (or application) that created the group. Note: This is not set if the user is an administrator. Read-only.
     * @param value Value to set for the createdOnBehalfOf property.
     * @return a void
     */
    public void setCreatedOnBehalfOf(@javax.annotation.Nullable final DirectoryObject value) {
        this._createdOnBehalfOf = value;
    }
    /**
     * Sets the description property value. An optional description for the group. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith) and $search.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the group. Required. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the drive property value. The group's default drive. Read-only.
     * @param value Value to set for the drive property.
     * @return a void
     */
    public void setDrive(@javax.annotation.Nullable final Drive value) {
        this._drive = value;
    }
    /**
     * Sets the drives property value. The group's drives. Read-only.
     * @param value Value to set for the drives property.
     * @return a void
     */
    public void setDrives(@javax.annotation.Nullable final java.util.List<Drive> value) {
        this._drives = value;
    }
    /**
     * Sets the endpoints property value. Endpoints for the group. Read-only. Nullable.
     * @param value Value to set for the endpoints property.
     * @return a void
     */
    public void setEndpoints(@javax.annotation.Nullable final java.util.List<Endpoint> value) {
        this._endpoints = value;
    }
    /**
     * Sets the events property value. The group's events.
     * @param value Value to set for the events property.
     * @return a void
     */
    public void setEvents(@javax.annotation.Nullable final java.util.List<Event> value) {
        this._events = value;
    }
    /**
     * Sets the expirationDateTime property value. Timestamp of when the group is set to expire. The value cannot be modified and is automatically populated when the group is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._expirationDateTime = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the group. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the groupLifecyclePolicies property value. The collection of lifecycle policies for this group. Read-only. Nullable.
     * @param value Value to set for the groupLifecyclePolicies property.
     * @return a void
     */
    public void setGroupLifecyclePolicies(@javax.annotation.Nullable final java.util.List<GroupLifecyclePolicy> value) {
        this._groupLifecyclePolicies = value;
    }
    /**
     * Sets the groupTypes property value. Specifies the group type and its membership. If the collection contains Unified, the group is a Microsoft 365 group; otherwise, it's either a security group or distribution group. For details, see groups overview.If the collection includes DynamicMembership, the group has dynamic membership; otherwise, membership is static. Returned by default. Supports $filter (eq, not).
     * @param value Value to set for the groupTypes property.
     * @return a void
     */
    public void setGroupTypes(@javax.annotation.Nullable final java.util.List<String> value) {
        this._groupTypes = value;
    }
    /**
     * Sets the hasMembersWithLicenseErrors property value. Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation. You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true).  Supports $filter (eq).
     * @param value Value to set for the hasMembersWithLicenseErrors property.
     * @return a void
     */
    public void setHasMembersWithLicenseErrors(@javax.annotation.Nullable final Boolean value) {
        this._hasMembersWithLicenseErrors = value;
    }
    /**
     * Sets the hideFromAddressLists property value. true if the group is not displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups; false otherwise. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the hideFromAddressLists property.
     * @return a void
     */
    public void setHideFromAddressLists(@javax.annotation.Nullable final Boolean value) {
        this._hideFromAddressLists = value;
    }
    /**
     * Sets the hideFromOutlookClients property value. true if the group is not displayed in Outlook clients, such as Outlook for Windows and Outlook on the web, false otherwise. Default value is false. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the hideFromOutlookClients property.
     * @return a void
     */
    public void setHideFromOutlookClients(@javax.annotation.Nullable final Boolean value) {
        this._hideFromOutlookClients = value;
    }
    /**
     * Sets the infoCatalogs property value. Identifies the info segments assigned to the group. Returned by default. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the infoCatalogs property.
     * @return a void
     */
    public void setInfoCatalogs(@javax.annotation.Nullable final java.util.List<String> value) {
        this._infoCatalogs = value;
    }
    /**
     * Sets the isArchived property value. When a group is associated with a team, this property determines whether the team is in read-only mode.
     * @param value Value to set for the isArchived property.
     * @return a void
     */
    public void setIsArchived(@javax.annotation.Nullable final Boolean value) {
        this._isArchived = value;
    }
    /**
     * Sets the isAssignableToRole property value. Indicates whether this group can be assigned to an Azure Active Directory role. Optional. This property can only be set while creating the group and is immutable. If set to true, the securityEnabled property must also be set to true and the group cannot be a dynamic group (that is, groupTypes cannot contain DynamicMembership). Only callers in Global administrator and Privileged role administrator roles can set this property. The caller must be assigned the RoleManagement.ReadWrite.Directory permission to set this property or update the membership of such groups. For more, see Using a group to manage Azure AD role assignmentsReturned by default. Supports $filter (eq, ne, not).
     * @param value Value to set for the isAssignableToRole property.
     * @return a void
     */
    public void setIsAssignableToRole(@javax.annotation.Nullable final Boolean value) {
        this._isAssignableToRole = value;
    }
    /**
     * Sets the isFavorite property value. The isFavorite property
     * @param value Value to set for the isFavorite property.
     * @return a void
     */
    public void setIsFavorite(@javax.annotation.Nullable final Boolean value) {
        this._isFavorite = value;
    }
    /**
     * Sets the isManagementRestricted property value. The isManagementRestricted property
     * @param value Value to set for the isManagementRestricted property.
     * @return a void
     */
    public void setIsManagementRestricted(@javax.annotation.Nullable final Boolean value) {
        this._isManagementRestricted = value;
    }
    /**
     * Sets the isSubscribedByMail property value. Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the isSubscribedByMail property.
     * @return a void
     */
    public void setIsSubscribedByMail(@javax.annotation.Nullable final Boolean value) {
        this._isSubscribedByMail = value;
    }
    /**
     * Sets the licenseProcessingState property value. Indicates status of the group license assignment to all members of the group. Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete. Returned only on $select. Read-only.
     * @param value Value to set for the licenseProcessingState property.
     * @return a void
     */
    public void setLicenseProcessingState(@javax.annotation.Nullable final LicenseProcessingState value) {
        this._licenseProcessingState = value;
    }
    /**
     * Sets the mail property value. The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the mail property.
     * @return a void
     */
    public void setMail(@javax.annotation.Nullable final String value) {
        this._mail = value;
    }
    /**
     * Sets the mailEnabled property value. Specifies whether the group is mail-enabled. Required. Returned by default. Supports $filter (eq, ne, not, and eq on null values).
     * @param value Value to set for the mailEnabled property.
     * @return a void
     */
    public void setMailEnabled(@javax.annotation.Nullable final Boolean value) {
        this._mailEnabled = value;
    }
    /**
     * Sets the mailNickname property value. The mail alias for the group, unique for Microsoft 365 groups in the organization. Maximum length is 64 characters. This property can contain only characters in the ASCII character set 0 - 127 except the following: @ () / [] ' ; : . <> , SPACE. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith).
     * @param value Value to set for the mailNickname property.
     * @return a void
     */
    public void setMailNickname(@javax.annotation.Nullable final String value) {
        this._mailNickname = value;
    }
    /**
     * Sets the mdmAppId property value. The mdmAppId property
     * @param value Value to set for the mdmAppId property.
     * @return a void
     */
    public void setMdmAppId(@javax.annotation.Nullable final String value) {
        this._mdmAppId = value;
    }
    /**
     * Sets the memberOf property value. Groups and administrative units that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the members property value. Members of this group, who can be users, devices, other groups, or service principals. Supports the List members, Add member, and Remove member operations. Nullable. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&$select=id,displayName&$expand=members($select=id,userPrincipalName,displayName).
     * @param value Value to set for the members property.
     * @return a void
     */
    public void setMembers(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._members = value;
    }
    /**
     * Sets the membershipRule property value. The rule that determines members for this group if the group is a dynamic group (groupTypes contains DynamicMembership). For more information about the syntax of the membership rule, see Membership Rules syntax. Returned by default. Supports $filter (eq, ne, not, ge, le, startsWith).
     * @param value Value to set for the membershipRule property.
     * @return a void
     */
    public void setMembershipRule(@javax.annotation.Nullable final String value) {
        this._membershipRule = value;
    }
    /**
     * Sets the membershipRuleProcessingState property value. Indicates whether the dynamic membership processing is on or paused. Possible values are On or Paused. Returned by default. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the membershipRuleProcessingState property.
     * @return a void
     */
    public void setMembershipRuleProcessingState(@javax.annotation.Nullable final String value) {
        this._membershipRuleProcessingState = value;
    }
    /**
     * Sets the membershipRuleProcessingStatus property value. Describes the processing status for rules-based dynamic groups. The property is null for non-rule based dynamic groups or if the dynamic group processing has been paused. Returned only on $select. Supported only on the Get group API (GET /groups/{ID}). Read-only.
     * @param value Value to set for the membershipRuleProcessingStatus property.
     * @return a void
     */
    public void setMembershipRuleProcessingStatus(@javax.annotation.Nullable final MembershipRuleProcessingStatus value) {
        this._membershipRuleProcessingStatus = value;
    }
    /**
     * Sets the membersWithLicenseErrors property value. A list of group members with license errors from this group-based license assignment. Read-only.
     * @param value Value to set for the membersWithLicenseErrors property.
     * @return a void
     */
    public void setMembersWithLicenseErrors(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._membersWithLicenseErrors = value;
    }
    /**
     * Sets the onenote property value. Read-only.
     * @param value Value to set for the onenote property.
     * @return a void
     */
    public void setOnenote(@javax.annotation.Nullable final Onenote value) {
        this._onenote = value;
    }
    /**
     * Sets the onPremisesDomainName property value. Contains the on-premises domain FQDN, also called dnsDomainName synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     * @param value Value to set for the onPremisesDomainName property.
     * @return a void
     */
    public void setOnPremisesDomainName(@javax.annotation.Nullable final String value) {
        this._onPremisesDomainName = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesNetBiosName property value. Contains the on-premises netBios name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Read-only.
     * @param value Value to set for the onPremisesNetBiosName property.
     * @return a void
     */
    public void setOnPremisesNetBiosName(@javax.annotation.Nullable final String value) {
        this._onPremisesNetBiosName = value;
    }
    /**
     * Sets the onPremisesProvisioningErrors property value. Errors when using Microsoft synchronization product during provisioning. Returned by default. Supports $filter (eq, not).
     * @param value Value to set for the onPremisesProvisioningErrors property.
     * @return a void
     */
    public void setOnPremisesProvisioningErrors(@javax.annotation.Nullable final java.util.List<OnPremisesProvisioningError> value) {
        this._onPremisesProvisioningErrors = value;
    }
    /**
     * Sets the onPremisesSamAccountName property value. Contains the on-premises SAM account name synchronized from the on-premises directory. The property is only populated for customers who are synchronizing their on-premises directory to Azure Active Directory via Azure AD Connect.Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith). Read-only.
     * @param value Value to set for the onPremisesSamAccountName property.
     * @return a void
     */
    public void setOnPremisesSamAccountName(@javax.annotation.Nullable final String value) {
        this._onPremisesSamAccountName = value;
    }
    /**
     * Sets the onPremisesSecurityIdentifier property value. Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Supports $filter (eq including on null values). Read-only.
     * @param value Value to set for the onPremisesSecurityIdentifier property.
     * @return a void
     */
    public void setOnPremisesSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._onPremisesSecurityIdentifier = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the organizationId property value. The organizationId property
     * @param value Value to set for the organizationId property.
     * @return a void
     */
    public void setOrganizationId(@javax.annotation.Nullable final String value) {
        this._organizationId = value;
    }
    /**
     * Sets the owners property value. The owners of the group who can be users or service principals. Nullable. If this property is not specified when creating a Microsoft 365 group, the calling user is automatically assigned as the group owner. Supports $expand including nested $select. For example, /groups?$filter=startsWith(displayName,'Role')&$select=id,displayName&$expand=owners($select=id,userPrincipalName,displayName).
     * @param value Value to set for the owners property.
     * @return a void
     */
    public void setOwners(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._owners = value;
    }
    /**
     * Sets the permissionGrants property value. The permissions that have been granted for a group to a specific application. Supports $expand.
     * @param value Value to set for the permissionGrants property.
     * @return a void
     */
    public void setPermissionGrants(@javax.annotation.Nullable final java.util.List<ResourceSpecificPermissionGrant> value) {
        this._permissionGrants = value;
    }
    /**
     * Sets the photo property value. The group's profile photo.
     * @param value Value to set for the photo property.
     * @return a void
     */
    public void setPhoto(@javax.annotation.Nullable final ProfilePhoto value) {
        this._photo = value;
    }
    /**
     * Sets the photos property value. The profile photos owned by the group. Read-only. Nullable.
     * @param value Value to set for the photos property.
     * @return a void
     */
    public void setPhotos(@javax.annotation.Nullable final java.util.List<ProfilePhoto> value) {
        this._photos = value;
    }
    /**
     * Sets the planner property value. Selective Planner services available to the group. Read-only. Nullable.
     * @param value Value to set for the planner property.
     * @return a void
     */
    public void setPlanner(@javax.annotation.Nullable final PlannerGroup value) {
        this._planner = value;
    }
    /**
     * Sets the preferredDataLocation property value. The preferred data location for the Microsoft 365 group. By default, the group inherits the group creator's preferred data location. To set this property, the calling user must be assigned one of the following Azure AD roles:  Global Administrator  User Account Administrator Directory Writer  Exchange Administrator  SharePoint Administrator  For more information about this property, see OneDrive Online Multi-Geo. Nullable. Returned by default.
     * @param value Value to set for the preferredDataLocation property.
     * @return a void
     */
    public void setPreferredDataLocation(@javax.annotation.Nullable final String value) {
        this._preferredDataLocation = value;
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for a Microsoft 365 group. Should follow ISO 639-1 Code; for example en-US. Returned by default. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values).
     * @param value Value to set for the preferredLanguage property.
     * @return a void
     */
    public void setPreferredLanguage(@javax.annotation.Nullable final String value) {
        this._preferredLanguage = value;
    }
    /**
     * Sets the proxyAddresses property value. Email addresses for the group that direct to the same group mailbox. For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required for filter expressions on multi-valued properties. Returned by default. Read-only. Not nullable. Supports $filter (eq, not, ge, le, startsWith).
     * @param value Value to set for the proxyAddresses property.
     * @return a void
     */
    public void setProxyAddresses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._proxyAddresses = value;
    }
    /**
     * Sets the rejectedSenders property value. The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable
     * @param value Value to set for the rejectedSenders property.
     * @return a void
     */
    public void setRejectedSenders(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._rejectedSenders = value;
    }
    /**
     * Sets the renewedDateTime property value. Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Returned by default. Supports $filter (eq, ne, not, ge, le, in). Read-only.
     * @param value Value to set for the renewedDateTime property.
     * @return a void
     */
    public void setRenewedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._renewedDateTime = value;
    }
    /**
     * Sets the resourceBehaviorOptions property value. Specifies the group behaviors that can be set for a Microsoft 365 group during creation. This can be set only as part of creation (POST). Possible values are AllowOnlyMembersToPost, HideGroupInOutlook, SubscribeNewGroupMembers, WelcomeEmailDisabled. For more information, see Set Microsoft 365 group behaviors and provisioning options.
     * @param value Value to set for the resourceBehaviorOptions property.
     * @return a void
     */
    public void setResourceBehaviorOptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._resourceBehaviorOptions = value;
    }
    /**
     * Sets the resourceProvisioningOptions property value. Specifies the group resources that are provisioned as part of Microsoft 365 group creation, that are not normally part of default group creation. Possible value is Team. For more information, see Set Microsoft 365 group behaviors and provisioning options. Returned by default. Supports $filter (eq, not, startsWith.
     * @param value Value to set for the resourceProvisioningOptions property.
     * @return a void
     */
    public void setResourceProvisioningOptions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._resourceProvisioningOptions = value;
    }
    /**
     * Sets the securityEnabled property value. Specifies whether the group is a security group. Required.Returned by default. Supports $filter (eq, ne, not, in).
     * @param value Value to set for the securityEnabled property.
     * @return a void
     */
    public void setSecurityEnabled(@javax.annotation.Nullable final Boolean value) {
        this._securityEnabled = value;
    }
    /**
     * Sets the securityIdentifier property value. Security identifier of the group, used in Windows scenarios. Returned by default.
     * @param value Value to set for the securityIdentifier property.
     * @return a void
     */
    public void setSecurityIdentifier(@javax.annotation.Nullable final String value) {
        this._securityIdentifier = value;
    }
    /**
     * Sets the settings property value. Settings that can govern this group's behavior, like whether members can invite guest users to the group. Nullable.
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final java.util.List<DirectorySetting> value) {
        this._settings = value;
    }
    /**
     * Sets the sites property value. The list of SharePoint sites in this group. Access the default site with /sites/root.
     * @param value Value to set for the sites property.
     * @return a void
     */
    public void setSites(@javax.annotation.Nullable final java.util.List<Site> value) {
        this._sites = value;
    }
    /**
     * Sets the team property value. The team associated with this group.
     * @param value Value to set for the team property.
     * @return a void
     */
    public void setTeam(@javax.annotation.Nullable final Team value) {
        this._team = value;
    }
    /**
     * Sets the theme property value. Specifies a Microsoft 365 group's color theme. Possible values are Teal, Purple, Green, Blue, Pink, Orange or Red. Returned by default.
     * @param value Value to set for the theme property.
     * @return a void
     */
    public void setTheme(@javax.annotation.Nullable final String value) {
        this._theme = value;
    }
    /**
     * Sets the threads property value. The group's conversation threads. Nullable.
     * @param value Value to set for the threads property.
     * @return a void
     */
    public void setThreads(@javax.annotation.Nullable final java.util.List<ConversationThread> value) {
        this._threads = value;
    }
    /**
     * Sets the transitiveMemberOf property value. The transitiveMemberOf property
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
    /**
     * Sets the transitiveMembers property value. The transitiveMembers property
     * @param value Value to set for the transitiveMembers property.
     * @return a void
     */
    public void setTransitiveMembers(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMembers = value;
    }
    /**
     * Sets the unseenConversationsCount property value. Count of conversations that have been delivered one or more new posts since the signed-in user's last visit to the group. This property is the same as unseenCount. Returned only on $select.
     * @param value Value to set for the unseenConversationsCount property.
     * @return a void
     */
    public void setUnseenConversationsCount(@javax.annotation.Nullable final Integer value) {
        this._unseenConversationsCount = value;
    }
    /**
     * Sets the unseenCount property value. Count of conversations that have received new posts since the signed-in user last visited the group. This property is the same as unseenConversationsCount.Returned only on $select. Supported only on the Get group API (GET /groups/{ID}).
     * @param value Value to set for the unseenCount property.
     * @return a void
     */
    public void setUnseenCount(@javax.annotation.Nullable final Integer value) {
        this._unseenCount = value;
    }
    /**
     * Sets the unseenMessagesCount property value. Count of new posts that have been delivered to the group's conversations since the signed-in user's last visit to the group. Returned only on $select.
     * @param value Value to set for the unseenMessagesCount property.
     * @return a void
     */
    public void setUnseenMessagesCount(@javax.annotation.Nullable final Integer value) {
        this._unseenMessagesCount = value;
    }
    /**
     * Sets the visibility property value. Specifies the group join policy and group content visibility for groups. Possible values are: Private, Public, or Hiddenmembership. Hiddenmembership can be set only for Microsoft 365 groups, when the groups are created. It can't be updated later. Other values of visibility can be updated after group creation. If visibility value is not specified during group creation on Microsoft Graph, a security group is created as Private by default and Microsoft 365 group is Public. Groups assignable to roles are always Private. See group visibility options to learn more. Returned by default. Nullable.
     * @param value Value to set for the visibility property.
     * @return a void
     */
    public void setVisibility(@javax.annotation.Nullable final String value) {
        this._visibility = value;
    }
}
