// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileAppRelationshipType;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Relationship.
 */
public class MobileAppRelationship extends Entity implements IJsonBackedObject {


    /**
     * The Target Display Name.
     * The target mobile app's display name.
     */
    @SerializedName(value = "targetDisplayName", alternate = {"TargetDisplayName"})
    @Expose
	@Nullable
    public String targetDisplayName;

    /**
     * The Target Display Version.
     * The target mobile app's display version.
     */
    @SerializedName(value = "targetDisplayVersion", alternate = {"TargetDisplayVersion"})
    @Expose
	@Nullable
    public String targetDisplayVersion;

    /**
     * The Target Id.
     * The target mobile app's app id.
     */
    @SerializedName(value = "targetId", alternate = {"TargetId"})
    @Expose
	@Nullable
    public String targetId;

    /**
     * The Target Publisher.
     * The target mobile app's publisher.
     */
    @SerializedName(value = "targetPublisher", alternate = {"TargetPublisher"})
    @Expose
	@Nullable
    public String targetPublisher;

    /**
     * The Target Type.
     * The type of relationship indicating whether the target is a parent or child. Possible values are: child, parent.
     */
    @SerializedName(value = "targetType", alternate = {"TargetType"})
    @Expose
	@Nullable
    public MobileAppRelationshipType targetType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
