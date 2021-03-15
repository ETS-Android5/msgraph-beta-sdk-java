// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.ManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder;
import com.microsoft.graph.requests.ManagementConditionGetManagementConditionsForPlatformCollectionRequest;
import com.microsoft.graph.requests.ManagementConditionGetManagementConditionsForPlatformCollectionResponse;
import com.microsoft.graph.models.ManagementConditionGetManagementConditionsForPlatformParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Get Management Conditions For Platform Collection Request Builder.
 */
public class ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ManagementCondition, ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder, ManagementConditionGetManagementConditionsForPlatformCollectionResponse, ManagementConditionGetManagementConditionsForPlatformCollectionPage, ManagementConditionGetManagementConditionsForPlatformCollectionRequest> {

    /**
     * The request builder for this collection of ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder.class, ManagementConditionGetManagementConditionsForPlatformCollectionRequest.class);
    }
    /**
     * The request builder for this collection of ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagementConditionGetManagementConditionsForPlatformParameterSet parameters) {
        super(requestUrl, client, requestOptions, ManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder.class, ManagementConditionGetManagementConditionsForPlatformCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagementConditionGetManagementConditionsForPlatformCollectionRequest instance
     */
    @Override
    @Nonnull
    public ManagementConditionGetManagementConditionsForPlatformCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagementConditionGetManagementConditionsForPlatformCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
