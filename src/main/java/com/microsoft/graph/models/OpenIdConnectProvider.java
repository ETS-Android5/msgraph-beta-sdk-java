// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.ClaimsMapping;
import com.microsoft.graph.models.OpenIdConnectResponseMode;
import com.microsoft.graph.models.OpenIdConnectResponseTypes;
import com.microsoft.graph.models.IdentityProvider;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Id Connect Provider.
 * @deprecated The identityProvider API is deprecated and will stop returning data on March 2023. Please use the new identityProviderBase API.
 */
@Deprecated
public class OpenIdConnectProvider extends IdentityProvider implements IJsonBackedObject {


    /**
     * The Claims Mapping.
     * After the OIDC provider sends an ID token back to Azure AD, Azure AD needs to be able to map the claims from the received token to the claims that Azure AD recognizes and uses. This complex type captures that mapping. It is a required property.
     */
    @SerializedName(value = "claimsMapping", alternate = {"ClaimsMapping"})
    @Expose
	@Nullable
    public ClaimsMapping claimsMapping;

    /**
     * The Domain Hint.
     * The domain hint can be used to skip directly to the sign-in page of the specified identity provider, instead of having the user make a selection among the list of available identity providers.
     */
    @SerializedName(value = "domainHint", alternate = {"DomainHint"})
    @Expose
	@Nullable
    public String domainHint;

    /**
     * The Metadata Url.
     * The URL for the metadata document of the OpenID Connect identity provider. Every OpenID Connect identity provider describes a metadata document that contains most of the information required to perform sign-in. This includes information such as the URLs to use and the location of the service's public signing keys. The OpenID Connect metadata document is always located at an endpoint that ends in .well-known/openid-configuration . For the OpenID Connect identity provider you are looking to add, you will need to provide the metadata URL. It is a required property and is read only after creation.
     */
    @SerializedName(value = "metadataUrl", alternate = {"MetadataUrl"})
    @Expose
	@Nullable
    public String metadataUrl;

    /**
     * The Response Mode.
     * The response mode defines the method that should be used to send the data back from the custom identity provider to Azure AD B2C. The following response modes can be used: form_post, query. query response mode means the code or token is returned as a query parameter. form_post response mode is recommended for the best security. The response is transmitted via the HTTP POST method, with the code or token being encoded in the body using the application/x-www-form-urlencoded format. It is a required property.
     */
    @SerializedName(value = "responseMode", alternate = {"ResponseMode"})
    @Expose
	@Nullable
    public OpenIdConnectResponseMode responseMode;

    /**
     * The Response Type.
     * response type describes what kind of information is sent back in the initial call to the authorization_endpoint of the custom identity provider. The following response types can be used: code , id_token , token. It is a required property.
     */
    @SerializedName(value = "responseType", alternate = {"ResponseType"})
    @Expose
	@Nullable
    public EnumSet<OpenIdConnectResponseTypes> responseType;

    /**
     * The Scope.
     * Scope defines the information and permissions you are looking to gather from your custom identity provider. OpenID Connect requests must contain the openid scope value in order to receive the ID token from the identity provider. Without the ID token, users are not able to sign in to Azure AD B2C using the custom identity provider. Other scopes can be appended separated by space. For more details about the scope limitations see RFC6749 Section 3.3. It is a required property.
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public String scope;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
