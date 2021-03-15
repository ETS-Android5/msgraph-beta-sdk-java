// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.GroupPolicyConfiguration;
import com.microsoft.graph.requests.GroupPolicyConfigurationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.GroupPolicyConfigurationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Collection Page.
 */
public class GroupPolicyConfigurationCollectionPage extends BaseCollectionPage<GroupPolicyConfiguration, GroupPolicyConfigurationCollectionRequestBuilder> {

    /**
     * A collection page for GroupPolicyConfiguration
     *
     * @param response the serialized GroupPolicyConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyConfigurationCollectionPage(@Nonnull final GroupPolicyConfigurationCollectionResponse response, @Nonnull final GroupPolicyConfigurationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for GroupPolicyConfiguration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GroupPolicyConfigurationCollectionPage(@Nonnull final java.util.List<GroupPolicyConfiguration> pageContents, @Nullable final GroupPolicyConfigurationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
