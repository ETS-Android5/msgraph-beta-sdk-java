// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAppConfigurationSchema;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store App Configuration Schema Collection Page.
 */
public class AndroidManagedStoreAppConfigurationSchemaCollectionPage extends BaseCollectionPage<AndroidManagedStoreAppConfigurationSchema, IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder> implements IAndroidManagedStoreAppConfigurationSchemaCollectionPage {

    /**
     * A collection page for AndroidManagedStoreAppConfigurationSchema
     *
     * @param response the serialized AndroidManagedStoreAppConfigurationSchemaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AndroidManagedStoreAppConfigurationSchemaCollectionPage(final AndroidManagedStoreAppConfigurationSchemaCollectionResponse response, final IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
