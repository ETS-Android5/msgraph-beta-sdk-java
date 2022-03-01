// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContentInfo;
import com.microsoft.graph.models.ClassificationResult;
import com.microsoft.graph.models.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.InformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder;
import com.microsoft.graph.requests.InformationProtectionLabelEvaluateClassificationResultsCollectionResponse;
import com.microsoft.graph.models.InformationProtectionAction;
import com.microsoft.graph.models.InformationProtectionLabelEvaluateClassificationResultsParameterSet;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Classification Results Collection Request.
 * @deprecated This API will no longer be accessible, please see microsoft.graph.security.informationProtection APIs.
 */
@Deprecated
public class InformationProtectionLabelEvaluateClassificationResultsCollectionRequest extends BaseActionCollectionRequest<InformationProtectionAction, InformationProtectionLabelEvaluateClassificationResultsCollectionResponse, InformationProtectionLabelEvaluateClassificationResultsCollectionPage> {


    /** The body for the method */
    @Nullable
    public InformationProtectionLabelEvaluateClassificationResultsParameterSet body;


    /**
     * The request for this InformationProtectionLabelEvaluateClassificationResults
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InformationProtectionLabelEvaluateClassificationResultsCollectionResponse.class, InformationProtectionLabelEvaluateClassificationResultsCollectionPage.class, InformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder.class);
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }
    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public InformationProtectionLabelEvaluateClassificationResultsCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}
