// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition.
 */
public class ManagementCondition extends Entity implements IJsonBackedObject {


    /**
     * The Applicable Platforms.
     * The applicable platforms for this management condition.
     */
    @SerializedName(value = "applicablePlatforms", alternate = {"ApplicablePlatforms"})
    @Expose
    public java.util.List<DevicePlatformType> applicablePlatforms;

    /**
     * The Created Date Time.
     * The time the management condition was created. Generated service side.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * The admin defined description of the management condition.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The admin defined name of the management condition.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The ETag.
     * ETag of the management condition. Updated service side.
     */
    @SerializedName(value = "eTag", alternate = {"ETag"})
    @Expose
    public String eTag;

    /**
     * The Modified Date Time.
     * The time the management condition was last modified. Updated service side.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Unique Name.
     * Unique name for the management condition. Used in management condition expressions.
     */
    @SerializedName(value = "uniqueName", alternate = {"UniqueName"})
    @Expose
    public String uniqueName;

    /**
     * The Management Condition Statements.
     * The management condition statements associated to the management condition.
     */
    public ManagementConditionStatementCollectionPage managementConditionStatements;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("managementConditionStatements")) {
            managementConditionStatements = serializer.deserializeObject(json.get("managementConditionStatements").toString(), ManagementConditionStatementCollectionPage.class);
        }
    }
}
