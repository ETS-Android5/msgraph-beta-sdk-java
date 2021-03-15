// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Win32LobApp;
import com.microsoft.graph.models.MobileAppAssignment;
import com.microsoft.graph.models.MobileAppRelationship;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.MobileAppRelationshipState;
import com.microsoft.graph.models.MobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.MobileAppAssignParameterSet;
import com.microsoft.graph.models.MobileAppUpdateRelationshipsParameterSet;
import com.microsoft.graph.models.MobileAppGetRelatedAppStatesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Win32Lob App Request Builder.
 */
public class Win32LobAppRequestBuilder extends BaseRequestBuilder<Win32LobApp> {

    /**
     * The request builder for the Win32LobApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Win32LobAppRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the Win32LobAppRequest instance
     */
    @Nonnull
    public Win32LobAppRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the Win32LobAppRequest instance
     */
    @Nonnull
    public Win32LobAppRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.Win32LobAppRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the MobileAppAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppAssignmentCollectionRequestBuilder assignments() {
        return new MobileAppAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new MobileAppAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppCategoryCollectionWithReferencesRequestBuilder categories() {
        return new MobileAppCategoryCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppCategoryWithReferenceRequestBuilder categories(@Nonnull final String id) {
        return new MobileAppCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppInstallStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppInstallStatusCollectionRequestBuilder deviceStatuses() {
        return new MobileAppInstallStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppInstallStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppInstallStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new MobileAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for MobileAppInstallSummary
     *
     * @return the MobileAppInstallSummaryRequestBuilder instance
     */
    @Nonnull
    public MobileAppInstallSummaryRequestBuilder installSummary() {
        return new MobileAppInstallSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("installSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppRelationship collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppRelationshipCollectionRequestBuilder relationships() {
        return new MobileAppRelationshipCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("relationships"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppRelationship item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppRelationshipRequestBuilder relationships(@Nonnull final String id) {
        return new MobileAppRelationshipRequestBuilder(getRequestUrlWithAdditionalSegment("relationships") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserAppInstallStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public UserAppInstallStatusCollectionRequestBuilder userStatuses() {
        return new UserAppInstallStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserAppInstallStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public UserAppInstallStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new UserAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppContent collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MobileAppContentCollectionRequestBuilder contentVersions() {
        return new MobileAppContentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppContent item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MobileAppContentRequestBuilder contentVersions(@Nonnull final String id) {
        return new MobileAppContentRequestBuilder(getRequestUrlWithAdditionalSegment("contentVersions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MobileAppAssignRequestBuilder assign(@Nonnull final MobileAppAssignParameterSet parameters) {
        return new MobileAppAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MobileAppUpdateRelationshipsRequestBuilder updateRelationships(@Nonnull final MobileAppUpdateRelationshipsParameterSet parameters) {
        return new MobileAppUpdateRelationshipsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateRelationships"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MobileAppGetRelatedAppStatesCollectionRequestBuilder getRelatedAppStates(@Nonnull final MobileAppGetRelatedAppStatesParameterSet parameters) {
        return new MobileAppGetRelatedAppStatesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRelatedAppStates"), getClient(), null, parameters);
    }
}
