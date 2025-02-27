// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewScheduleDefinitionFilterByCurrentUserOptions;
import com.microsoft.graph.models.AccessReviewScheduleDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionFilterByCurrentUserCollectionPage;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionFilterByCurrentUserCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Definition Filter By Current User Collection Page.
 */
public class AccessReviewScheduleDefinitionFilterByCurrentUserCollectionPage extends BaseCollectionPage<AccessReviewScheduleDefinition, AccessReviewScheduleDefinitionFilterByCurrentUserCollectionRequestBuilder> {

    /**
     * A collection page for AccessReviewScheduleDefinition.
     *
     * @param response The serialized AccessReviewScheduleDefinitionFilterByCurrentUserCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessReviewScheduleDefinitionFilterByCurrentUserCollectionPage(@Nonnull final AccessReviewScheduleDefinitionFilterByCurrentUserCollectionResponse response, @Nonnull final AccessReviewScheduleDefinitionFilterByCurrentUserCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for AccessReviewScheduleDefinitionFilterByCurrentUser
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessReviewScheduleDefinitionFilterByCurrentUserCollectionPage(@Nonnull final java.util.List<AccessReviewScheduleDefinition> pageContents, @Nullable final AccessReviewScheduleDefinitionFilterByCurrentUserCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
