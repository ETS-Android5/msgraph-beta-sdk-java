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
import com.microsoft.graph.models.PermissionScope;
import com.microsoft.graph.models.PreAuthorizedApplication;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Api Application.
 */
public class ApiApplication implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Accept Mapped Claims.
     * When true, allows an application to use claims mapping without specifying a custom signing key.
     */
    @SerializedName(value = "acceptMappedClaims", alternate = {"AcceptMappedClaims"})
    @Expose
	@Nullable
    public Boolean acceptMappedClaims;

    /**
     * The Known Client Applications.
     * Used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app. If you set the appID of the client app to this value, the user only consents once to the client app. Azure AD knows that consenting to the client means implicitly consenting to the web API and automatically provisions service principals for both APIs at the same time. Both the client and the web API app must be registered in the same tenant.
     */
    @SerializedName(value = "knownClientApplications", alternate = {"KnownClientApplications"})
    @Expose
	@Nullable
    public java.util.List<java.util.UUID> knownClientApplications;

    /**
     * The Oauth2Permission Scopes.
     * The definition of the delegated permissions exposed by the web API represented by this application registration. These delegated permissions may be requested by a client application, and may be granted by users or administrators during consent. Delegated permissions are sometimes referred to as OAuth 2.0 scopes.
     */
    @SerializedName(value = "oauth2PermissionScopes", alternate = {"Oauth2PermissionScopes"})
    @Expose
	@Nullable
    public java.util.List<PermissionScope> oauth2PermissionScopes;

    /**
     * The Pre Authorized Applications.
     * Lists the client applications that are pre-authorized with the specified delegated permissions to access this application's APIs. Users are not required to consent to any pre-authorized application (for the permissions specified). However, any additional permissions not listed in preAuthorizedApplications (requested through incremental consent for example) will require user consent.
     */
    @SerializedName(value = "preAuthorizedApplications", alternate = {"PreAuthorizedApplications"})
    @Expose
	@Nullable
    public java.util.List<PreAuthorizedApplication> preAuthorizedApplications;

    /**
     * The Requested Access Token Version.
     * Specifies the access token version expected by this resource. This changes the version and format of the JWT produced independent of the endpoint or client used to request the access token.  The endpoint used, v1.0 or v2.0, is chosen by the client and only impacts the version of id_tokens. Resources need to explicitly configure requestedAccessTokenVersion to indicate the supported access token format.  Possible values for requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1, which corresponds to the v1.0 endpoint.  If signInAudience on the application is configured as AzureADandPersonalMicrosoftAccount, the value for this property must be 2
     */
    @SerializedName(value = "requestedAccessTokenVersion", alternate = {"RequestedAccessTokenVersion"})
    @Expose
	@Nullable
    public Integer requestedAccessTokenVersion;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
