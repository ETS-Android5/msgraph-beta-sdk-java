// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AppConsentRequestScope;
import com.microsoft.graph.models.UserConsentRequest;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.UserConsentRequestCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Consent Request.
 */
public class AppConsentRequest extends Entity implements IJsonBackedObject {


    /**
     * The App Display Name.
     * The display name of the app for which consent is requested. Required. Supports $filter (eq only) and $orderby.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
	@Nullable
    public String appDisplayName;

    /**
     * The App Id.
     * The identifier of the application. Required. Supports $filter (eq only) and $orderby.
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The Consent Type.
     * The consent type of the request. Possible values are: Static and Dynamic. These represent static and dynamic permissions, respectively, requested in the consent workflow. Supports $filter (eq only) and $orderby. Required.
     */
    @SerializedName(value = "consentType", alternate = {"ConsentType"})
    @Expose
	@Nullable
    public String consentType;

    /**
     * The Pending Scopes.
     * A list of pending scopes waiting for approval. Required.
     */
    @SerializedName(value = "pendingScopes", alternate = {"PendingScopes"})
    @Expose
	@Nullable
    public java.util.List<AppConsentRequestScope> pendingScopes;

    /**
     * The User Consent Requests.
     * A list of pending user consent requests.
     */
    @SerializedName(value = "userConsentRequests", alternate = {"UserConsentRequests"})
    @Expose
	@Nullable
    public UserConsentRequestCollectionPage userConsentRequests;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("userConsentRequests")) {
            userConsentRequests = serializer.deserializeObject(json.get("userConsentRequests"), UserConsentRequestCollectionPage.class);
        }
    }
}
