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
import com.microsoft.graph.models.HybridAgentUpdaterConfiguration;
import com.microsoft.graph.models.OnPremisesAgentGroup;
import com.microsoft.graph.models.OnPremisesAgent;
import com.microsoft.graph.models.ConnectorGroup;
import com.microsoft.graph.models.Connector;
import com.microsoft.graph.models.PublishedResource;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.OnPremisesAgentGroupCollectionPage;
import com.microsoft.graph.requests.OnPremisesAgentCollectionPage;
import com.microsoft.graph.requests.ConnectorGroupCollectionPage;
import com.microsoft.graph.requests.ConnectorCollectionPage;
import com.microsoft.graph.requests.PublishedResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Publishing Profile.
 */
public class OnPremisesPublishingProfile extends Entity implements IJsonBackedObject {


    /**
     * The Hybrid Agent Updater Configuration.
     * Represents a hybridAgentUpdaterConfiguration object.
     */
    @SerializedName(value = "hybridAgentUpdaterConfiguration", alternate = {"HybridAgentUpdaterConfiguration"})
    @Expose
	@Nullable
    public HybridAgentUpdaterConfiguration hybridAgentUpdaterConfiguration;

    /**
     * The Is Enabled.
     * Represents if Azure AD Application Proxy is enabled for the tenant.
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
	@Nullable
    public Boolean isEnabled;

    /**
     * The Agent Groups.
     * List of existing onPremisesAgentGroup objects. Read-only. Nullable.
     */
    @SerializedName(value = "agentGroups", alternate = {"AgentGroups"})
    @Expose
	@Nullable
    public OnPremisesAgentGroupCollectionPage agentGroups;

    /**
     * The Agents.
     * List of existing onPremisesAgent objects. Read-only. Nullable.
     */
    @SerializedName(value = "agents", alternate = {"Agents"})
    @Expose
	@Nullable
    public OnPremisesAgentCollectionPage agents;

    /**
     * The Connector Groups.
     * List of existing connectorGroup objects for applications published through Application Proxy. Read-only. Nullable.
     */
    @SerializedName(value = "connectorGroups", alternate = {"ConnectorGroups"})
    @Expose
	@Nullable
    public ConnectorGroupCollectionPage connectorGroups;

    /**
     * The Connectors.
     * List of existing connector objects for applications published through Application Proxy. Read-only. Nullable.
     */
    @SerializedName(value = "connectors", alternate = {"Connectors"})
    @Expose
	@Nullable
    public ConnectorCollectionPage connectors;

    /**
     * The Published Resources.
     * List of existing publishedResource objects. Read-only. Nullable.
     */
    @SerializedName(value = "publishedResources", alternate = {"PublishedResources"})
    @Expose
	@Nullable
    public PublishedResourceCollectionPage publishedResources;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("agentGroups")) {
            agentGroups = serializer.deserializeObject(json.get("agentGroups"), OnPremisesAgentGroupCollectionPage.class);
        }

        if (json.has("agents")) {
            agents = serializer.deserializeObject(json.get("agents"), OnPremisesAgentCollectionPage.class);
        }

        if (json.has("connectorGroups")) {
            connectorGroups = serializer.deserializeObject(json.get("connectorGroups"), ConnectorGroupCollectionPage.class);
        }

        if (json.has("connectors")) {
            connectors = serializer.deserializeObject(json.get("connectors"), ConnectorCollectionPage.class);
        }

        if (json.has("publishedResources")) {
            publishedResources = serializer.deserializeObject(json.get("publishedResources"), PublishedResourceCollectionPage.class);
        }
    }
}
