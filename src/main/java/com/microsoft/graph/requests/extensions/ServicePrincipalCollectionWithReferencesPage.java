// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OrgContact;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.Credential;
import com.microsoft.graph.models.extensions.PasswordSingleSignOnCredentialSet;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IServicePrincipalCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ServicePrincipalCollectionResponse;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Collection With References Page.
 */
public class ServicePrincipalCollectionWithReferencesPage extends BaseCollectionPage<ServicePrincipal, IServicePrincipalCollectionWithReferencesRequestBuilder> implements IServicePrincipalCollectionWithReferencesPage {

    /**
     * A collection page for ServicePrincipal
     *
     * @param response the serialized ServicePrincipalCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ServicePrincipalCollectionWithReferencesPage(final ServicePrincipalCollectionResponse response, final IServicePrincipalCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
