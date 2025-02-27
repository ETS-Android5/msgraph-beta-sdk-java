// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.GroupPolicyConfigurationUpdateDefinitionValuesRequest;
import com.microsoft.graph.models.GroupPolicyConfiguration;
import com.microsoft.graph.models.GroupPolicyDefinitionValue;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.GroupPolicyConfigurationUpdateDefinitionValuesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Update Definition Values Request Builder.
 */
public class GroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder extends BaseActionRequestBuilder<GroupPolicyConfiguration> {

    /**
     * The request builder for this GroupPolicyConfigurationUpdateDefinitionValues
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private GroupPolicyConfigurationUpdateDefinitionValuesParameterSet body;
    /**
     * The request builder for this GroupPolicyConfigurationUpdateDefinitionValues
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupPolicyConfigurationUpdateDefinitionValuesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupPolicyConfigurationUpdateDefinitionValuesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupPolicyConfigurationUpdateDefinitionValuesRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupPolicyConfigurationUpdateDefinitionValuesRequest instance
     */
    @Nonnull
    public GroupPolicyConfigurationUpdateDefinitionValuesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupPolicyConfigurationUpdateDefinitionValuesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupPolicyConfigurationUpdateDefinitionValuesRequest instance
     */
    @Nonnull
    public GroupPolicyConfigurationUpdateDefinitionValuesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupPolicyConfigurationUpdateDefinitionValuesRequest request = new GroupPolicyConfigurationUpdateDefinitionValuesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
