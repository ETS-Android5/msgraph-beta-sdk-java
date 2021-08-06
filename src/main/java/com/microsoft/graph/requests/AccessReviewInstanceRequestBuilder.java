// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewInstance;
import com.microsoft.graph.models.AccessReviewInstanceFilterByCurrentUserOptions;
import com.microsoft.graph.requests.AccessReviewReviewerCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewReviewerRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.AccessReviewScheduleDefinitionWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.AccessReviewInstanceBatchRecordDecisionsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Request Builder.
 */
public class AccessReviewInstanceRequestBuilder extends BaseRequestBuilder<AccessReviewInstance> {

    /**
     * The request builder for the AccessReviewInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewInstanceRequest instance
     */
    @Nonnull
    public AccessReviewInstanceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewInstanceRequest instance
     */
    @Nonnull
    public AccessReviewInstanceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessReviewInstanceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AccessReviewReviewer collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessReviewReviewerCollectionRequestBuilder contactedReviewers() {
        return new AccessReviewReviewerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contactedReviewers"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewReviewer item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessReviewReviewerRequestBuilder contactedReviewers(@Nonnull final String id) {
        return new AccessReviewReviewerRequestBuilder(getRequestUrlWithAdditionalSegment("contactedReviewers") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the AccessReviewInstanceDecisionItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public AccessReviewInstanceDecisionItemCollectionRequestBuilder decisions() {
        return new AccessReviewInstanceDecisionItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("decisions"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessReviewInstanceDecisionItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public AccessReviewInstanceDecisionItemRequestBuilder decisions(@Nonnull final String id) {
        return new AccessReviewInstanceDecisionItemRequestBuilder(getRequestUrlWithAdditionalSegment("decisions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AccessReviewScheduleDefinition
     *
     * @return the AccessReviewScheduleDefinitionWithReferenceRequestBuilder instance
     */
    @Nonnull
    public AccessReviewScheduleDefinitionWithReferenceRequestBuilder definition() {
        return new AccessReviewScheduleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definition"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AccessReviewInstanceStopRequestBuilder stop() {
        return new AccessReviewInstanceStopRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.stop"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AccessReviewInstanceAcceptRecommendationsRequestBuilder acceptRecommendations() {
        return new AccessReviewInstanceAcceptRecommendationsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.acceptRecommendations"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AccessReviewInstanceApplyDecisionsRequestBuilder applyDecisions() {
        return new AccessReviewInstanceApplyDecisionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.applyDecisions"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public AccessReviewInstanceBatchRecordDecisionsRequestBuilder batchRecordDecisions(@Nonnull final AccessReviewInstanceBatchRecordDecisionsParameterSet parameters) {
        return new AccessReviewInstanceBatchRecordDecisionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.batchRecordDecisions"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AccessReviewInstanceResetDecisionsRequestBuilder resetDecisions() {
        return new AccessReviewInstanceResetDecisionsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetDecisions"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public AccessReviewInstanceSendReminderRequestBuilder sendReminder() {
        return new AccessReviewInstanceSendReminderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendReminder"), getClient(), null);
    }
}
