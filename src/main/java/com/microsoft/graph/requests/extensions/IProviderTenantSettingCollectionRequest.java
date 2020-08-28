// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.ProviderTenantSetting;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Provider Tenant Setting Collection Request.
 */
public interface IProviderTenantSettingCollectionRequest {

    void get(final ICallback<IProviderTenantSettingCollectionPage> callback);

    IProviderTenantSettingCollectionPage get() throws ClientException;

    void post(final ProviderTenantSetting newProviderTenantSetting, final ICallback<ProviderTenantSetting> callback);

    ProviderTenantSetting post(final ProviderTenantSetting newProviderTenantSetting) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IProviderTenantSettingCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IProviderTenantSettingCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IProviderTenantSettingCollectionRequest top(final int value);

}
