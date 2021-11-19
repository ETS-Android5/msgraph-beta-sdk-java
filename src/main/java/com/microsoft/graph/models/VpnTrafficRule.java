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
import com.microsoft.graph.models.VpnTrafficRuleAppType;
import com.microsoft.graph.models.IPv4Range;
import com.microsoft.graph.models.NumberRange;
import com.microsoft.graph.models.VpnTrafficRuleRoutingPolicyType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpn Traffic Rule.
 */
public class VpnTrafficRule implements IJsonBackedObject {

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
     * The App Id.
     * App identifier, if this traffic rule is triggered by an app.
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
	@Nullable
    public String appId;

    /**
     * The App Type.
     * App type, if this traffic rule is triggered by an app.
     */
    @SerializedName(value = "appType", alternate = {"AppType"})
    @Expose
	@Nullable
    public VpnTrafficRuleAppType appType;

    /**
     * The Claims.
     * Claims associated with this traffic rule.
     */
    @SerializedName(value = "claims", alternate = {"Claims"})
    @Expose
	@Nullable
    public String claims;

    /**
     * The Local Address Ranges.
     * Local address range. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "localAddressRanges", alternate = {"LocalAddressRanges"})
    @Expose
	@Nullable
    public java.util.List<IPv4Range> localAddressRanges;

    /**
     * The Local Port Ranges.
     * Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "localPortRanges", alternate = {"LocalPortRanges"})
    @Expose
	@Nullable
    public java.util.List<NumberRange> localPortRanges;

    /**
     * The Name.
     * Name.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Protocols.
     * Protocols (0-255). Valid values 0 to 255
     */
    @SerializedName(value = "protocols", alternate = {"Protocols"})
    @Expose
	@Nullable
    public Integer protocols;

    /**
     * The Remote Address Ranges.
     * Remote address range. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "remoteAddressRanges", alternate = {"RemoteAddressRanges"})
    @Expose
	@Nullable
    public java.util.List<IPv4Range> remoteAddressRanges;

    /**
     * The Remote Port Ranges.
     * Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "remotePortRanges", alternate = {"RemotePortRanges"})
    @Expose
	@Nullable
    public java.util.List<NumberRange> remotePortRanges;

    /**
     * The Routing Policy Type.
     * When app triggered, indicates whether to enable split tunneling along this route.
     */
    @SerializedName(value = "routingPolicyType", alternate = {"RoutingPolicyType"})
    @Expose
	@Nullable
    public VpnTrafficRuleRoutingPolicyType routingPolicyType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
