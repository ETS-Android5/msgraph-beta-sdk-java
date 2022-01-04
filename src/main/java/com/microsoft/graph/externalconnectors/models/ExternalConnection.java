// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.externalconnectors.models.Configuration;
import com.microsoft.graph.externalconnectors.models.SearchSettings;
import com.microsoft.graph.externalconnectors.models.ConnectionState;
import com.microsoft.graph.externalconnectors.models.ExternalGroup;
import com.microsoft.graph.externalconnectors.models.ExternalItem;
import com.microsoft.graph.externalconnectors.models.ConnectionOperation;
import com.microsoft.graph.externalconnectors.models.ConnectionQuota;
import com.microsoft.graph.externalconnectors.models.Schema;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.externalconnectors.requests.ExternalGroupCollectionPage;
import com.microsoft.graph.externalconnectors.requests.ExternalItemCollectionPage;
import com.microsoft.graph.externalconnectors.requests.ConnectionOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection.
 */
public class ExternalConnection extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     */
    @SerializedName(value = "configuration", alternate = {"Configuration"})
    @Expose
	@Nullable
    public Configuration configuration;

    /**
     * The Connector Id.
     * The Teams App ID. Optional.
     */
    @SerializedName(value = "connectorId", alternate = {"ConnectorId"})
    @Expose
	@Nullable
    public String connectorId;

    /**
     * The Description.
     * Description of the connection displayed in the Microsoft 365 admin center. Optional.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Ingested Items Count.
     * 
     */
    @SerializedName(value = "ingestedItemsCount", alternate = {"IngestedItemsCount"})
    @Expose
	@Nullable
    public Long ingestedItemsCount;

    /**
     * The Name.
     * The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Search Settings.
     * The settings configuring the search experience for content in this connection, such as the display templates for search results.
     */
    @SerializedName(value = "searchSettings", alternate = {"SearchSettings"})
    @Expose
	@Nullable
    public SearchSettings searchSettings;

    /**
     * The State.
     * Indicates the current state of the connection. Possible values are: draft, ready, obsolete, limitExceeded, unknownFutureValue.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ConnectionState state;

    /**
     * The Groups.
     * Read-only. Nullable.
     */
    @SerializedName(value = "groups", alternate = {"Groups"})
    @Expose
	@Nullable
    public ExternalGroupCollectionPage groups;

    /**
     * The Items.
     * Read-only. Nullable.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
	@Nullable
    public ExternalItemCollectionPage items;

    /**
     * The Operations.
     * Read-only. Nullable.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public ConnectionOperationCollectionPage operations;

    /**
     * The Quota.
     * 
     */
    @SerializedName(value = "quota", alternate = {"Quota"})
    @Expose
	@Nullable
    public ConnectionQuota quota;

    /**
     * The Schema.
     * Read-only. Nullable.
     */
    @SerializedName(value = "schema", alternate = {"Schema"})
    @Expose
	@Nullable
    public Schema schema;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("groups")) {
            groups = serializer.deserializeObject(json.get("groups"), ExternalGroupCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items"), ExternalItemCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), ConnectionOperationCollectionPage.class);
        }
    }
}
