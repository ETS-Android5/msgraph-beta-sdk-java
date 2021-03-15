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
import com.microsoft.graph.models.DevicePlatformType;
import com.microsoft.graph.models.ManagementConditionExpression;
import com.microsoft.graph.models.ManagementCondition;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ManagementConditionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement.
 */
public class ManagementConditionStatement extends Entity implements IJsonBackedObject {


    /**
     * The Applicable Platforms.
     * This is calculated from looking the management conditions associated to the management condition statement and finding the intersection of applicable platforms.
     */
    @SerializedName(value = "applicablePlatforms", alternate = {"ApplicablePlatforms"})
    @Expose
	@Nullable
    public java.util.List<DevicePlatformType> applicablePlatforms;

    /**
     * The Created Date Time.
     * The time the management condition statement was created. Generated service side.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Description.
     * The admin defined description of the management condition statement.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The admin defined name of the management condition statement.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The ETag.
     * ETag of the management condition statement. Updated service side.
     */
    @SerializedName(value = "eTag", alternate = {"ETag"})
    @Expose
	@Nullable
    public String eTag;

    /**
     * The Expression.
     * The management condition statement expression used to evaluate if a management condition statement was activated/deactivated.
     */
    @SerializedName(value = "expression", alternate = {"Expression"})
    @Expose
	@Nullable
    public ManagementConditionExpression expression;

    /**
     * The Modified Date Time.
     * The time the management condition statement was last modified. Updated service side.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime modifiedDateTime;

    /**
     * The Management Conditions.
     * The management conditions associated to the management condition statement.
     */
	@Nullable
    public ManagementConditionCollectionPage managementConditions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("managementConditions")) {
            managementConditions = serializer.deserializeObject(json.get("managementConditions"), ManagementConditionCollectionPage.class);
        }
    }
}
