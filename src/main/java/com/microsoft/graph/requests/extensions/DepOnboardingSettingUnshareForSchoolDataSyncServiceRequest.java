// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingUnshareForSchoolDataSyncServiceRequest;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingUnshareForSchoolDataSyncServiceRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Unshare For School Data Sync Service Request.
 */
public class DepOnboardingSettingUnshareForSchoolDataSyncServiceRequest extends BaseRequest implements IDepOnboardingSettingUnshareForSchoolDataSyncServiceRequest {

    /**
     * The request for this DepOnboardingSettingUnshareForSchoolDataSyncService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingUnshareForSchoolDataSyncServiceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
    }

    /**
     * Creates the DepOnboardingSettingUnshareForSchoolDataSyncService
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<Void> callback) {
        final IExecutors executors = getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    post();
                    executors.performOnForeground((Void)null, callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    /**
     * Creates the DepOnboardingSettingUnshareForSchoolDataSyncService
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public void post() throws ClientException {
        this.send(HttpMethod.POST, null);
    }
}
