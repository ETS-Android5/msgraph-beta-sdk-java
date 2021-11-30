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
import com.microsoft.graph.models.Fido2KeyRestrictions;
import com.microsoft.graph.models.AuthenticationMethodTarget;
import com.microsoft.graph.models.AuthenticationMethodConfiguration;
import com.microsoft.graph.requests.AuthenticationMethodTargetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Authentication Method Configuration.
 */
public class Fido2AuthenticationMethodConfiguration extends AuthenticationMethodConfiguration implements IJsonBackedObject {


    /**
     * The Is Attestation Enforced.
     * Determines whether attestation must be enforced for FIDO2 security key registration.
     */
    @SerializedName(value = "isAttestationEnforced", alternate = {"IsAttestationEnforced"})
    @Expose
	@Nullable
    public Boolean isAttestationEnforced;

    /**
     * The Is Self Service Registration Allowed.
     * Determines if users can register new FIDO2 security keys.
     */
    @SerializedName(value = "isSelfServiceRegistrationAllowed", alternate = {"IsSelfServiceRegistrationAllowed"})
    @Expose
	@Nullable
    public Boolean isSelfServiceRegistrationAllowed;

    /**
     * The Key Restrictions.
     * Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of the authenticator.
     */
    @SerializedName(value = "keyRestrictions", alternate = {"KeyRestrictions"})
    @Expose
	@Nullable
    public Fido2KeyRestrictions keyRestrictions;

    /**
     * The Include Targets.
     * A collection of users or groups who are enabled to use the authentication method.
     */
    @SerializedName(value = "includeTargets", alternate = {"IncludeTargets"})
    @Expose
	@Nullable
    public AuthenticationMethodTargetCollectionPage includeTargets;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("includeTargets")) {
            includeTargets = serializer.deserializeObject(json.get("includeTargets"), AuthenticationMethodTargetCollectionPage.class);
        }
    }
}
