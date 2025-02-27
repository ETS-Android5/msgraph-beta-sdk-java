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
import com.microsoft.graph.models.PrinterShareViewpoint;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.models.User;
import com.microsoft.graph.models.Printer;
import com.microsoft.graph.models.PrinterBase;
import com.microsoft.graph.requests.GroupCollectionPage;
import com.microsoft.graph.requests.UserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share.
 */
public class PrinterShare extends PrinterBase implements IJsonBackedObject {


    /**
     * The Allow All Users.
     * If true, all users and groups will be granted access to this printer share. This supersedes the allow lists defined by the allowedUsers and allowedGroups navigation properties.
     */
    @SerializedName(value = "allowAllUsers", alternate = {"AllowAllUsers"})
    @Expose
	@Nullable
    public Boolean allowAllUsers;

    /**
     * The Created Date Time.
     * The DateTimeOffset when the printer share was created. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The View Point.
     * 
     */
    @SerializedName(value = "viewPoint", alternate = {"ViewPoint"})
    @Expose
	@Nullable
    public PrinterShareViewpoint viewPoint;

    /**
     * The Allowed Groups.
     * The groups whose users have access to print using the printer.
     */
	@Nullable
    public GroupCollectionPage allowedGroups;

    /**
     * The Allowed Users.
     * The users who have access to print using the printer.
     */
	@Nullable
    public UserCollectionPage allowedUsers;

    /**
     * The Printer.
     * The printer that this printer share is related to.
     */
    @SerializedName(value = "printer", alternate = {"Printer"})
    @Expose
	@Nullable
    public Printer printer;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("allowedGroups")) {
            allowedGroups = serializer.deserializeObject(json.get("allowedGroups"), GroupCollectionPage.class);
        }

        if (json.has("allowedUsers")) {
            allowedUsers = serializer.deserializeObject(json.get("allowedUsers"), UserCollectionPage.class);
        }
    }
}
