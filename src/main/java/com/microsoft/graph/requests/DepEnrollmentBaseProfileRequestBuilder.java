// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DepEnrollmentBaseProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.EnrollmentProfileUpdateDeviceProfileAssignmentParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Enrollment Base Profile Request Builder.
 */
public class DepEnrollmentBaseProfileRequestBuilder extends BaseRequestBuilder<DepEnrollmentBaseProfile> {

    /**
     * The request builder for the DepEnrollmentBaseProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepEnrollmentBaseProfileRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DepEnrollmentBaseProfileRequest instance
     */
    @Nonnull
    public DepEnrollmentBaseProfileRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DepEnrollmentBaseProfileRequest instance
     */
    @Nonnull
    public DepEnrollmentBaseProfileRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DepEnrollmentBaseProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EnrollmentProfileSetDefaultProfileRequestBuilder setDefaultProfile() {
        return new EnrollmentProfileSetDefaultProfileRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setDefaultProfile"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public EnrollmentProfileUpdateDeviceProfileAssignmentRequestBuilder updateDeviceProfileAssignment(@Nonnull final EnrollmentProfileUpdateDeviceProfileAssignmentParameterSet parameters) {
        return new EnrollmentProfileUpdateDeviceProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateDeviceProfileAssignment"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EnrollmentProfileExportMobileConfigRequestBuilder exportMobileConfig() {
        return new EnrollmentProfileExportMobileConfigRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.exportMobileConfig"), getClient(), null);
    }
}
