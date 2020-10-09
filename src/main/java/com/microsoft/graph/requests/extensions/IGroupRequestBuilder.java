// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceSpecificPermissionGrantRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectorySettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProfilePhotoRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICalendarRequestBuilder;
import com.microsoft.graph.requests.extensions.IPlannerGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Request Builder.
 */
public interface IGroupRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    IGroupRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupRequest instance
     */
    IGroupRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAppRoleAssignmentCollectionRequestBuilder appRoleAssignments();

    IAppRoleAssignmentRequestBuilder appRoleAssignments(final String id);

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    IDirectoryObjectWithReferenceRequestBuilder createdOnBehalfOf();

    IEndpointCollectionRequestBuilder endpoints();

    IEndpointRequestBuilder endpoints(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder memberOf();

    IDirectoryObjectWithReferenceRequestBuilder memberOf(final String id);

    IUserCollectionWithReferencesRequestBuilder memberOfAsUser();

    IUserWithReferenceRequestBuilder memberOfAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder memberOfAsGroup();

    IGroupWithReferenceRequestBuilder memberOfAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder memberOfAsApplication();

    IApplicationWithReferenceRequestBuilder memberOfAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder memberOfAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder memberOfAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder memberOfAsDevice();

    IDeviceWithReferenceRequestBuilder memberOfAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder memberOfAsOrgContact();

    IOrgContactWithReferenceRequestBuilder memberOfAsOrgContact(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder members();

    IDirectoryObjectWithReferenceRequestBuilder members(final String id);

    IUserCollectionWithReferencesRequestBuilder membersAsUser();

    IUserWithReferenceRequestBuilder membersAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder membersAsGroup();

    IGroupWithReferenceRequestBuilder membersAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder membersAsApplication();

    IApplicationWithReferenceRequestBuilder membersAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder membersAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder membersAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder membersAsDevice();

    IDeviceWithReferenceRequestBuilder membersAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder membersAsOrgContact();

    IOrgContactWithReferenceRequestBuilder membersAsOrgContact(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder membersWithLicenseErrors();

    IDirectoryObjectWithReferenceRequestBuilder membersWithLicenseErrors(final String id);

    IUserCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsUser();

    IUserWithReferenceRequestBuilder membersWithLicenseErrorsAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsGroup();

    IGroupWithReferenceRequestBuilder membersWithLicenseErrorsAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsApplication();

    IApplicationWithReferenceRequestBuilder membersWithLicenseErrorsAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder membersWithLicenseErrorsAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsDevice();

    IDeviceWithReferenceRequestBuilder membersWithLicenseErrorsAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder membersWithLicenseErrorsAsOrgContact();

    IOrgContactWithReferenceRequestBuilder membersWithLicenseErrorsAsOrgContact(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder owners();

    IDirectoryObjectWithReferenceRequestBuilder owners(final String id);

    IUserCollectionWithReferencesRequestBuilder ownersAsUser();

    IUserWithReferenceRequestBuilder ownersAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder ownersAsGroup();

    IGroupWithReferenceRequestBuilder ownersAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder ownersAsApplication();

    IApplicationWithReferenceRequestBuilder ownersAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder ownersAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder ownersAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder ownersAsDevice();

    IDeviceWithReferenceRequestBuilder ownersAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder ownersAsOrgContact();

    IOrgContactWithReferenceRequestBuilder ownersAsOrgContact(final String id);

    IResourceSpecificPermissionGrantCollectionRequestBuilder permissionGrants();

    IResourceSpecificPermissionGrantRequestBuilder permissionGrants(final String id);

    IDirectorySettingCollectionRequestBuilder settings();

    IDirectorySettingRequestBuilder settings(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMemberOf();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMemberOf(final String id);

    IUserCollectionWithReferencesRequestBuilder transitiveMemberOfAsUser();

    IUserWithReferenceRequestBuilder transitiveMemberOfAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder transitiveMemberOfAsGroup();

    IGroupWithReferenceRequestBuilder transitiveMemberOfAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder transitiveMemberOfAsApplication();

    IApplicationWithReferenceRequestBuilder transitiveMemberOfAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMemberOfAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder transitiveMemberOfAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder transitiveMemberOfAsDevice();

    IDeviceWithReferenceRequestBuilder transitiveMemberOfAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder transitiveMemberOfAsOrgContact();

    IOrgContactWithReferenceRequestBuilder transitiveMemberOfAsOrgContact(final String id);

    IDirectoryObjectCollectionWithReferencesRequestBuilder transitiveMembers();

    IDirectoryObjectWithReferenceRequestBuilder transitiveMembers(final String id);

    IUserCollectionWithReferencesRequestBuilder transitiveMembersAsUser();

    IUserWithReferenceRequestBuilder transitiveMembersAsUser(final String id);

    IGroupCollectionWithReferencesRequestBuilder transitiveMembersAsGroup();

    IGroupWithReferenceRequestBuilder transitiveMembersAsGroup(final String id);

    IApplicationCollectionWithReferencesRequestBuilder transitiveMembersAsApplication();

    IApplicationWithReferenceRequestBuilder transitiveMembersAsApplication(final String id);

    IServicePrincipalCollectionWithReferencesRequestBuilder transitiveMembersAsServicePrincipal();

    IServicePrincipalWithReferenceRequestBuilder transitiveMembersAsServicePrincipal(final String id);

    IDeviceCollectionWithReferencesRequestBuilder transitiveMembersAsDevice();

    IDeviceWithReferenceRequestBuilder transitiveMembersAsDevice(final String id);

    IOrgContactCollectionWithReferencesRequestBuilder transitiveMembersAsOrgContact();

    IOrgContactWithReferenceRequestBuilder transitiveMembersAsOrgContact(final String id);

    IDirectoryObjectCollectionRequestBuilder acceptedSenders();

    IDirectoryObjectRequestBuilder acceptedSenders(final String id);

    /**
     * Gets the request builder for Calendar
     *
     * @return the ICalendarRequestBuilder instance
     */
    ICalendarRequestBuilder calendar();

    IEventCollectionRequestBuilder calendarView();

    IEventRequestBuilder calendarView(final String id);

    IConversationCollectionRequestBuilder conversations();

    IConversationRequestBuilder conversations(final String id);

    IEventCollectionRequestBuilder events();

    IEventRequestBuilder events(final String id);

    /**
     * Gets the request builder for ProfilePhoto
     *
     * @return the IProfilePhotoRequestBuilder instance
     */
    IProfilePhotoRequestBuilder photo();

    IProfilePhotoCollectionRequestBuilder photos();

    IProfilePhotoRequestBuilder photos(final String id);

    IDirectoryObjectCollectionRequestBuilder rejectedSenders();

    IDirectoryObjectRequestBuilder rejectedSenders(final String id);

    IConversationThreadCollectionRequestBuilder threads();

    IConversationThreadRequestBuilder threads(final String id);

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    IDriveRequestBuilder drive();

    IDriveCollectionRequestBuilder drives();

    IDriveRequestBuilder drives(final String id);

    ISiteCollectionRequestBuilder sites();

    ISiteRequestBuilder sites(final String id);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

    IGroupLifecyclePolicyCollectionRequestBuilder groupLifecyclePolicies();

    IGroupLifecyclePolicyRequestBuilder groupLifecyclePolicies(final String id);

    /**
     * Gets the request builder for PlannerGroup
     *
     * @return the IPlannerGroupRequestBuilder instance
     */
    IPlannerGroupRequestBuilder planner();

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    IOnenoteRequestBuilder onenote();

    /**
     * Gets the request builder for Team
     *
     * @return the ITeamRequestBuilder instance
     */
    ITeamRequestBuilder team();
    IGroupAssignLicenseRequestBuilder assignLicense(final java.util.List<AssignedLicense> addLicenses, final java.util.List<java.util.UUID> removeLicenses);

    IGroupCheckGrantedPermissionsForAppCollectionRequestBuilder checkGrantedPermissionsForApp();
    IGroupValidatePropertiesRequestBuilder validateProperties(final String displayName, final String mailNickname, final java.util.UUID onBehalfOfUserId);
    IGroupAddFavoriteRequestBuilder addFavorite();
    IGroupRemoveFavoriteRequestBuilder removeFavorite();
    IGroupResetUnseenCountRequestBuilder resetUnseenCount();
    IGroupSubscribeByMailRequestBuilder subscribeByMail();
    IGroupUnsubscribeByMailRequestBuilder unsubscribeByMail();
    IGroupEvaluateDynamicMembershipRequestBuilder evaluateDynamicMembership(final String memberId);
    IGroupRenewRequestBuilder renew();

}