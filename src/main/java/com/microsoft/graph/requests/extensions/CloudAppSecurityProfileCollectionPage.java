// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudAppSecurityProfile;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud App Security Profile Collection Page.
 */
public class CloudAppSecurityProfileCollectionPage extends BaseCollectionPage<CloudAppSecurityProfile, ICloudAppSecurityProfileCollectionRequestBuilder> implements ICloudAppSecurityProfileCollectionPage {

    /**
     * A collection page for CloudAppSecurityProfile
     *
     * @param response the serialized CloudAppSecurityProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudAppSecurityProfileCollectionPage(final CloudAppSecurityProfileCollectionResponse response, final ICloudAppSecurityProfileCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
