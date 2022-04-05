// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
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

import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionWithReferencesPage;
import com.microsoft.graph.requests.Windows81TrustedRootCertificateCollectionResponse;
import com.microsoft.graph.models.Windows81TrustedRootCertificate;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Trusted Root Certificate Collection With References Page.
 */
public class Windows81TrustedRootCertificateCollectionWithReferencesPage extends BaseCollectionPage<Windows81TrustedRootCertificate, Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for Windows81TrustedRootCertificate
     *
     * @param response the serialized Windows81TrustedRootCertificateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public Windows81TrustedRootCertificateCollectionWithReferencesPage(@Nonnull final Windows81TrustedRootCertificateCollectionResponse response, @Nullable final Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for Windows81TrustedRootCertificate
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public Windows81TrustedRootCertificateCollectionWithReferencesPage(@Nonnull final java.util.List<Windows81TrustedRootCertificate> pageContents, @Nullable final Windows81TrustedRootCertificateCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
