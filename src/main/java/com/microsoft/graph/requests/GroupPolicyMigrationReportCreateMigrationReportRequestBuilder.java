// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.GroupPolicyMigrationReportCreateMigrationReportRequest;
import com.microsoft.graph.models.GroupPolicyMigrationReport;
import com.microsoft.graph.models.GroupPolicyObjectFile;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.GroupPolicyMigrationReportCreateMigrationReportParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Migration Report Create Migration Report Request Builder.
 */
public class GroupPolicyMigrationReportCreateMigrationReportRequestBuilder extends BaseActionRequestBuilder<String> {

    /**
     * The request builder for this GroupPolicyMigrationReportCreateMigrationReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyMigrationReportCreateMigrationReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private GroupPolicyMigrationReportCreateMigrationReportParameterSet body;
    /**
     * The request builder for this GroupPolicyMigrationReportCreateMigrationReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupPolicyMigrationReportCreateMigrationReportRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupPolicyMigrationReportCreateMigrationReportParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupPolicyMigrationReportCreateMigrationReportRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupPolicyMigrationReportCreateMigrationReportRequest instance
     */
    @Nonnull
    public GroupPolicyMigrationReportCreateMigrationReportRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupPolicyMigrationReportCreateMigrationReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupPolicyMigrationReportCreateMigrationReportRequest instance
     */
    @Nonnull
    public GroupPolicyMigrationReportCreateMigrationReportRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupPolicyMigrationReportCreateMigrationReportRequest request = new GroupPolicyMigrationReportCreateMigrationReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
