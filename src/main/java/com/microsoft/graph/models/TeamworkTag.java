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
import com.microsoft.graph.models.TeamworkTagType;
import com.microsoft.graph.models.TeamworkTagMember;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.TeamworkTagMemberCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Tag.
 */
public class TeamworkTag extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Member Count.
     * 
     */
    @SerializedName(value = "memberCount", alternate = {"MemberCount"})
    @Expose
	@Nullable
    public Integer memberCount;

    /**
     * The Tag Type.
     * 
     */
    @SerializedName(value = "tagType", alternate = {"TagType"})
    @Expose
	@Nullable
    public TeamworkTagType tagType;

    /**
     * The Team Id.
     * 
     */
    @SerializedName(value = "teamId", alternate = {"TeamId"})
    @Expose
	@Nullable
    public String teamId;

    /**
     * The Members.
     * 
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
	@Nullable
    public TeamworkTagMemberCollectionPage members;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members"), TeamworkTagMemberCollectionPage.class);
        }
    }
}
