// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsQualityUpdateProfile;
import com.microsoft.graph.models.WindowsQualityUpdateProfileAssignment;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.WindowsQualityUpdateProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.WindowsQualityUpdateProfileAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Quality Update Profile Request Builder.
 */
public class WindowsQualityUpdateProfileRequestBuilder extends BaseRequestBuilder<WindowsQualityUpdateProfile> {

    /**
     * The request builder for the WindowsQualityUpdateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsQualityUpdateProfileRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WindowsQualityUpdateProfileRequest instance
     */
    @Nonnull
    public WindowsQualityUpdateProfileRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WindowsQualityUpdateProfileRequest instance
     */
    @Nonnull
    public WindowsQualityUpdateProfileRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WindowsQualityUpdateProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the WindowsQualityUpdateProfileAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public WindowsQualityUpdateProfileAssignmentCollectionRequestBuilder assignments() {
        return new WindowsQualityUpdateProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the WindowsQualityUpdateProfileAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public WindowsQualityUpdateProfileAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new WindowsQualityUpdateProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public WindowsQualityUpdateProfileAssignRequestBuilder assign(@Nonnull final WindowsQualityUpdateProfileAssignParameterSet parameters) {
        return new WindowsQualityUpdateProfileAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
