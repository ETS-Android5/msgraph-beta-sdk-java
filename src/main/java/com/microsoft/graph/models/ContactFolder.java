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
import com.microsoft.graph.models.ContactFolder;
import com.microsoft.graph.models.Contact;
import com.microsoft.graph.models.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ContactFolderCollectionPage;
import com.microsoft.graph.requests.ContactCollectionPage;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder.
 */
public class ContactFolder extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The folder's display name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Parent Folder Id.
     * The ID of the folder's parent folder.
     */
    @SerializedName(value = "parentFolderId", alternate = {"ParentFolderId"})
    @Expose
	@Nullable
    public String parentFolderId;

    /**
     * The Well Known Name.
     * The name of the folder if the folder is a recognized folder. Currently contacts is the only recognized contacts folder.
     */
    @SerializedName(value = "wellKnownName", alternate = {"WellKnownName"})
    @Expose
	@Nullable
    public String wellKnownName;

    /**
     * The Child Folders.
     * The collection of child folders in the folder. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "childFolders", alternate = {"ChildFolders"})
    @Expose
	@Nullable
    public ContactFolderCollectionPage childFolders;

    /**
     * The Contacts.
     * The contacts in the folder. Navigation property. Read-only. Nullable.
     */
    @SerializedName(value = "contacts", alternate = {"Contacts"})
    @Expose
	@Nullable
    public ContactCollectionPage contacts;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the contactFolder. Read-only. Nullable.
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
	@Nullable
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the contactFolder. Read-only. Nullable.
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
	@Nullable
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("childFolders")) {
            childFolders = serializer.deserializeObject(json.get("childFolders"), ContactFolderCollectionPage.class);
        }

        if (json.has("contacts")) {
            contacts = serializer.deserializeObject(json.get("contacts"), ContactCollectionPage.class);
        }

        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties"), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties"), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }
    }
}
