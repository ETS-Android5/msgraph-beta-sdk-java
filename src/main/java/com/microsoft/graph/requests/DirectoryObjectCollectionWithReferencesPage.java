// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.UnifiedRoleManagementPolicyRuleTarget;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.DirectoryObjectCollectionWithReferencesPage;
import com.microsoft.graph.requests.DirectoryObjectCollectionResponse;
import com.microsoft.graph.models.DirectoryObject;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Collection With References Page.
 */
public class DirectoryObjectCollectionWithReferencesPage extends BaseCollectionPage<DirectoryObject, DirectoryObjectCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for DirectoryObject
     *
     * @param response the serialized DirectoryObjectCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectoryObjectCollectionWithReferencesPage(@Nonnull final DirectoryObjectCollectionResponse response, @Nullable final DirectoryObjectCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for DirectoryObject
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DirectoryObjectCollectionWithReferencesPage(@Nonnull final java.util.List<DirectoryObject> pageContents, @Nullable final DirectoryObjectCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
