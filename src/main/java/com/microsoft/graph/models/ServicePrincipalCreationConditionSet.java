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
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Creation Condition Set.
 */
public class ServicePrincipalCreationConditionSet extends Entity implements IJsonBackedObject {


    /**
     * The Application Ids.
     * 
     */
    @SerializedName(value = "applicationIds", alternate = {"ApplicationIds"})
    @Expose
	@Nullable
    public java.util.List<String> applicationIds;

    /**
     * The Application Publisher Ids.
     * 
     */
    @SerializedName(value = "applicationPublisherIds", alternate = {"ApplicationPublisherIds"})
    @Expose
	@Nullable
    public java.util.List<String> applicationPublisherIds;

    /**
     * The Applications From Verified Publisher Only.
     * 
     */
    @SerializedName(value = "applicationsFromVerifiedPublisherOnly", alternate = {"ApplicationsFromVerifiedPublisherOnly"})
    @Expose
	@Nullable
    public Boolean applicationsFromVerifiedPublisherOnly;

    /**
     * The Application Tenant Ids.
     * 
     */
    @SerializedName(value = "applicationTenantIds", alternate = {"ApplicationTenantIds"})
    @Expose
	@Nullable
    public java.util.List<String> applicationTenantIds;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
