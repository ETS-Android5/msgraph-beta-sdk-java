// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AdministrativeUnit;
import com.microsoft.graph.models.DirectoryObject;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectWithReferenceRequestBuilder;
import com.microsoft.graph.requests.UserRequestBuilder;
import com.microsoft.graph.requests.GroupRequestBuilder;
import com.microsoft.graph.requests.ApplicationRequestBuilder;
import com.microsoft.graph.requests.ServicePrincipalRequestBuilder;
import com.microsoft.graph.requests.DeviceRequestBuilder;
import com.microsoft.graph.requests.OrgContactRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipCollectionRequestBuilder;
import com.microsoft.graph.requests.ScopedRoleMembershipRequestBuilder;
import com.microsoft.graph.requests.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.ExtensionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DirectoryObjectCheckMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectCheckMemberObjectsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberGroupsParameterSet;
import com.microsoft.graph.models.DirectoryObjectGetMemberObjectsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Request Builder.
 */
public class AdministrativeUnitRequestBuilder extends BaseRequestBuilder<AdministrativeUnit> {

    /**
     * The request builder for the AdministrativeUnit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdministrativeUnitRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AdministrativeUnitRequest instance
     */
    @Nonnull
    public AdministrativeUnitRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AdministrativeUnitRequest instance
     */
    @Nonnull
    public AdministrativeUnitRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AdministrativeUnitRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DirectoryObject collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DirectoryObjectCollectionWithReferencesRequestBuilder members() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    /**
     * Gets a request builder for the DirectoryObject item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DirectoryObjectWithReferenceRequestBuilder members(@Nonnull final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the User collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserCollectionRequestBuilder membersAsUser() {
        return new UserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.user", getClient(), null);
    }

    /**
     * Gets a request builder for the User item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserRequestBuilder membersAsUser(@Nonnull final String id) {
        return new UserRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.user", getClient(), null);
    }
    /**
     *  Gets a request builder for the Group collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public GroupCollectionRequestBuilder membersAsGroup() {
        return new GroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.group", getClient(), null);
    }

    /**
     * Gets a request builder for the Group item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public GroupRequestBuilder membersAsGroup(@Nonnull final String id) {
        return new GroupRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.group", getClient(), null);
    }
    /**
     *  Gets a request builder for the Application collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ApplicationCollectionRequestBuilder membersAsApplication() {
        return new ApplicationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.application", getClient(), null);
    }

    /**
     * Gets a request builder for the Application item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ApplicationRequestBuilder membersAsApplication(@Nonnull final String id) {
        return new ApplicationRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.application", getClient(), null);
    }
    /**
     *  Gets a request builder for the ServicePrincipal collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ServicePrincipalCollectionRequestBuilder membersAsServicePrincipal() {
        return new ServicePrincipalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.servicePrincipal", getClient(), null);
    }

    /**
     * Gets a request builder for the ServicePrincipal item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ServicePrincipalRequestBuilder membersAsServicePrincipal(@Nonnull final String id) {
        return new ServicePrincipalRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.servicePrincipal", getClient(), null);
    }
    /**
     *  Gets a request builder for the Device collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCollectionRequestBuilder membersAsDevice() {
        return new DeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.device", getClient(), null);
    }

    /**
     * Gets a request builder for the Device item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceRequestBuilder membersAsDevice(@Nonnull final String id) {
        return new DeviceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.device", getClient(), null);
    }
    /**
     *  Gets a request builder for the OrgContact collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public OrgContactCollectionRequestBuilder membersAsOrgContact() {
        return new OrgContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/microsoft.graph.orgContact", getClient(), null);
    }

    /**
     * Gets a request builder for the OrgContact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public OrgContactRequestBuilder membersAsOrgContact(@Nonnull final String id) {
        return new OrgContactRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id + "/microsoft.graph.orgContact", getClient(), null);
    }
    /**
     *  Gets a request builder for the ScopedRoleMembership collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ScopedRoleMembershipCollectionRequestBuilder scopedRoleMembers() {
        return new ScopedRoleMembershipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMembers"), getClient(), null);
    }

    /**
     * Gets a request builder for the ScopedRoleMembership item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ScopedRoleMembershipRequestBuilder scopedRoleMembers(@Nonnull final String id) {
        return new ScopedRoleMembershipRequestBuilder(getRequestUrlWithAdditionalSegment("scopedRoleMembers") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Extension collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    /**
     * Gets a request builder for the Extension item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExtensionRequestBuilder extensions(@Nonnull final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberGroupsCollectionRequestBuilder checkMemberGroups(@Nonnull final DirectoryObjectCheckMemberGroupsParameterSet parameters) {
        return new DirectoryObjectCheckMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectCheckMemberObjectsCollectionRequestBuilder checkMemberObjects(@Nonnull final DirectoryObjectCheckMemberObjectsParameterSet parameters) {
        return new DirectoryObjectCheckMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.checkMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberGroupsCollectionRequestBuilder getMemberGroups(@Nonnull final DirectoryObjectGetMemberGroupsParameterSet parameters) {
        return new DirectoryObjectGetMemberGroupsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberGroups"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DirectoryObjectGetMemberObjectsCollectionRequestBuilder getMemberObjects(@Nonnull final DirectoryObjectGetMemberObjectsParameterSet parameters) {
        return new DirectoryObjectGetMemberObjectsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getMemberObjects"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public DirectoryObjectRestoreRequestBuilder restore() {
        return new DirectoryObjectRestoreRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.restore"), getClient(), null);
    }
}
