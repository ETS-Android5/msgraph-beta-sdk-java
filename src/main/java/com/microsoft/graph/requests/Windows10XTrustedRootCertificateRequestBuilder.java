// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10XTrustedRootCertificate;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileAssignment;
import com.microsoft.graph.models.PolicyPlatformType;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DeviceManagementResourceAccessProfileBaseAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10XTrusted Root Certificate Request Builder.
 */
public class Windows10XTrustedRootCertificateRequestBuilder extends BaseRequestBuilder<Windows10XTrustedRootCertificate> {

    /**
     * The request builder for the Windows10XTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10XTrustedRootCertificateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the Windows10XTrustedRootCertificateRequest instance
     */
    @Nonnull
    public Windows10XTrustedRootCertificateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the Windows10XTrustedRootCertificateRequest instance
     */
    @Nonnull
    public Windows10XTrustedRootCertificateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.Windows10XTrustedRootCertificateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceManagementResourceAccessProfileAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder assignments() {
        return new DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementResourceAccessProfileAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementResourceAccessProfileAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceManagementResourceAccessProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder assign(@Nonnull final DeviceManagementResourceAccessProfileBaseAssignParameterSet parameters) {
        return new DeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
