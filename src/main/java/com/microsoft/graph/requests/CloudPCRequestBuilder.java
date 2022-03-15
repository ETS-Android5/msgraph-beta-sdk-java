// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CloudPC;
import com.microsoft.graph.models.CloudPcUserAccountType;
import com.microsoft.graph.models.CloudPcOperatingSystem;
import com.microsoft.graph.models.CloudPcLaunchInfo;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.CloudPCChangeUserAccountTypeParameterSet;
import com.microsoft.graph.models.CloudPCRenameParameterSet;
import com.microsoft.graph.models.CloudPCReprovisionParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PCRequest Builder.
 */
public class CloudPCRequestBuilder extends BaseRequestBuilder<CloudPC> {

    /**
     * The request builder for the CloudPC
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPCRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CloudPCRequest instance
     */
    @Nonnull
    public CloudPCRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CloudPCRequest instance
     */
    @Nonnull
    public CloudPCRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.CloudPCRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CloudPCChangeUserAccountTypeRequestBuilder changeUserAccountType(@Nonnull final CloudPCChangeUserAccountTypeParameterSet parameters) {
        return new CloudPCChangeUserAccountTypeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.changeUserAccountType"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CloudPCEndGracePeriodRequestBuilder endGracePeriod() {
        return new CloudPCEndGracePeriodRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.endGracePeriod"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CloudPCRebootRequestBuilder reboot() {
        return new CloudPCRebootRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reboot"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CloudPCRenameRequestBuilder rename(@Nonnull final CloudPCRenameParameterSet parameters) {
        return new CloudPCRenameRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rename"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CloudPCReprovisionRequestBuilder reprovision(@Nonnull final CloudPCReprovisionParameterSet parameters) {
        return new CloudPCReprovisionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reprovision"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CloudPCTroubleshootRequestBuilder troubleshoot() {
        return new CloudPCTroubleshootRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.troubleshoot"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CloudPCGetCloudPcLaunchInfoRequestBuilder getCloudPcLaunchInfo() {
        return new CloudPCGetCloudPcLaunchInfoRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCloudPcLaunchInfo"), getClient(), null);
    }
}
