// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationAssignment;
import com.microsoft.graph.requests.EducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationCategoryRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentResourceRequestBuilder;
import com.microsoft.graph.requests.EducationRubricRequestBuilder;
import com.microsoft.graph.requests.EducationSubmissionCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationSubmissionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Request Builder.
 */
public class EducationAssignmentRequestBuilder extends BaseRequestBuilder<EducationAssignment> {

    /**
     * The request builder for the EducationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationAssignmentRequest instance
     */
    @Nonnull
    public EducationAssignmentRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationAssignmentRequest instance
     */
    @Nonnull
    public EducationAssignmentRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EducationAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EducationCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationCategoryCollectionRequestBuilder categories() {
        return new EducationCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationCategoryRequestBuilder categories(@Nonnull final String id) {
        return new EducationCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationAssignmentResource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationAssignmentResourceCollectionRequestBuilder resources() {
        return new EducationAssignmentResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resources"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationAssignmentResource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationAssignmentResourceRequestBuilder resources(@Nonnull final String id) {
        return new EducationAssignmentResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resources") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EducationRubric
     *
     * @return the EducationRubricRequestBuilder instance
     */
    @Nonnull
    public EducationRubricRequestBuilder rubric() {
        return new EducationRubricRequestBuilder(getRequestUrlWithAdditionalSegment("rubric"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationSubmission collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public EducationSubmissionCollectionRequestBuilder submissions() {
        return new EducationSubmissionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("submissions"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationSubmission item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public EducationSubmissionRequestBuilder submissions(@Nonnull final String id) {
        return new EducationSubmissionRequestBuilder(getRequestUrlWithAdditionalSegment("submissions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EducationAssignmentPublishRequestBuilder publish() {
        return new EducationAssignmentPublishRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.publish"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @deprecated The getResourcesFolderUrl API is deprecated and will stop returning data on May 17, 2021. Please use the new property resourcesFolderUrl exposed on educationAssignment entity to fetch this info.
     */
    @Deprecated
    @Nonnull
    public EducationAssignmentGetResourcesFolderUrlRequestBuilder getResourcesFolderUrl() {
        return new EducationAssignmentGetResourcesFolderUrlRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getResourcesFolderUrl"), getClient(), null);
    }
}
