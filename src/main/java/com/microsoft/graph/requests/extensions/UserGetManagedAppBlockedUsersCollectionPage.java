// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserGetManagedAppBlockedUsersCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppBlockedUsersCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetManagedAppBlockedUsersCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed App Blocked Users Collection Page.
 */
public class UserGetManagedAppBlockedUsersCollectionPage extends BaseCollectionPage<String, IUserGetManagedAppBlockedUsersCollectionRequestBuilder> implements IUserGetManagedAppBlockedUsersCollectionPage {

    /**
     * A collection page for String.
     *
     * @param response The serialized UserGetManagedAppBlockedUsersCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserGetManagedAppBlockedUsersCollectionPage(final UserGetManagedAppBlockedUsersCollectionResponse response, final IUserGetManagedAppBlockedUsersCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
