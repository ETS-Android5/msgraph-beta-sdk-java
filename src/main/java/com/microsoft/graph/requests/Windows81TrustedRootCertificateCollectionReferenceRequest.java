// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WindowsWiredNetworkConfiguration;
import com.microsoft.graph.models.Windows81TrustedRootCertificate;
import com.microsoft.graph.models.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import com.microsoft.graph.models.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.Windows81TrustedRootCertificateWithReferenceRequest;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateReferenceRequestBuilder;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateWithReferenceRequestBuilder;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionWithReferencesRequest;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.Windows81TrustedRootCertificate;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Trusted Root Certificate Collection Reference Request.
 */
public class Windows81TrustedRootCertificateCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<Windows81TrustedRootCertificate, Windows81TrustedRootCertificateWithReferenceRequest, Windows81TrustedRootCertificateReferenceRequestBuilder, Windows81TrustedRootCertificateWithReferenceRequestBuilder, Windows81TrustedRootCertificateCollectionResponse, Windows81TrustedRootCertificateCollectionWithReferencesPage, Windows81TrustedRootCertificateCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of Windows81TrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81TrustedRootCertificateCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81TrustedRootCertificateCollectionResponse.class, Windows81TrustedRootCertificateCollectionWithReferencesPage.class, Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public Windows81TrustedRootCertificateCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
