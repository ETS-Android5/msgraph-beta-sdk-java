// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.ediscovery.requests.extensions.ITagAsHierarchyCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.extensions.TagAsHierarchyCollectionPage;
import com.microsoft.graph.ediscovery.requests.extensions.TagAsHierarchyCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag As Hierarchy Collection Page.
 */
public class TagAsHierarchyCollectionPage extends BaseCollectionPage<Tag, ITagAsHierarchyCollectionRequestBuilder> implements ITagAsHierarchyCollectionPage {

    /**
     * A collection page for Tag.
     *
     * @param response The serialized TagAsHierarchyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TagAsHierarchyCollectionPage(final TagAsHierarchyCollectionResponse response, final ITagAsHierarchyCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
