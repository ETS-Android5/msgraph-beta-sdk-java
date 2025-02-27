// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.models.RoleScopeTag;
import com.microsoft.graph.models.RoleScopeTagAutoAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.RoleScopeTagCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.RoleScopeTagCollectionWithReferencesPage;
import com.microsoft.graph.requests.RoleScopeTagCollectionResponse;
import com.microsoft.graph.models.RoleScopeTag;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Collection With References Page.
 */
public class RoleScopeTagCollectionWithReferencesPage extends BaseCollectionPage<RoleScopeTag, RoleScopeTagCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for RoleScopeTag
     *
     * @param response the serialized RoleScopeTagCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RoleScopeTagCollectionWithReferencesPage(@Nonnull final RoleScopeTagCollectionResponse response, @Nullable final RoleScopeTagCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for RoleScopeTag
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RoleScopeTagCollectionWithReferencesPage(@Nonnull final java.util.List<RoleScopeTag> pageContents, @Nullable final RoleScopeTagCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
