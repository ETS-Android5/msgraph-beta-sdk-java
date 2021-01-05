// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequest;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement Collection Request Builder.
 */
public class ManagementConditionStatementCollectionRequestBuilder extends BaseRequestBuilder implements IManagementConditionStatementCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagementConditionStatementCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagementConditionStatementCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagementConditionStatementCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagementConditionStatementRequestBuilder byId(final String id) {
        return new ManagementConditionStatementRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder getManagementConditionStatementsForPlatform(final DevicePlatformType platform) {
        return new ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getManagementConditionStatementsForPlatform"), getClient(), null, platform);
    }
}
