// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.VpnEncryptionAlgorithmType;
import com.microsoft.graph.models.VpnIntegrityAlgorithmType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpn Security Association Parameters.
 */
public class IosVpnSecurityAssociationParameters implements IJsonBackedObject {

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
     * The Lifetime In Minutes.
     * Lifetime (minutes)
     */
    @SerializedName(value = "lifetimeInMinutes", alternate = {"LifetimeInMinutes"})
    @Expose
	@Nullable
    public Integer lifetimeInMinutes;

    /**
     * The Security Diffie Hellman Group.
     * Diffie-Hellman Group
     */
    @SerializedName(value = "securityDiffieHellmanGroup", alternate = {"SecurityDiffieHellmanGroup"})
    @Expose
	@Nullable
    public Integer securityDiffieHellmanGroup;

    /**
     * The Security Encryption Algorithm.
     * Encryption algorithm
     */
    @SerializedName(value = "securityEncryptionAlgorithm", alternate = {"SecurityEncryptionAlgorithm"})
    @Expose
	@Nullable
    public VpnEncryptionAlgorithmType securityEncryptionAlgorithm;

    /**
     * The Security Integrity Algorithm.
     * Integrity algorithm
     */
    @SerializedName(value = "securityIntegrityAlgorithm", alternate = {"SecurityIntegrityAlgorithm"})
    @Expose
	@Nullable
    public VpnIntegrityAlgorithmType securityIntegrityAlgorithm;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
