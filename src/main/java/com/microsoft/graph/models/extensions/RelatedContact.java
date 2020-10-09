// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ContactRelationship;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Related Contact.
 */
public class RelatedContact implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Access Consent.
     * Indicates whether the user has been consented to access student data.
     */
    @SerializedName(value = "accessConsent", alternate = {"AccessConsent"})
    @Expose
    public Boolean accessConsent;

    /**
     * The Display Name.
     * Name of the contact. Required.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Email Address.
     * Primary email address of the contact.
     */
    @SerializedName(value = "emailAddress", alternate = {"EmailAddress"})
    @Expose
    public String emailAddress;

    /**
     * The Id.
     * Identity of the contact within Azure Active Directory.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Mobile Phone.
     * Mobile phone number of the contact.
     */
    @SerializedName(value = "mobilePhone", alternate = {"MobilePhone"})
    @Expose
    public String mobilePhone;

    /**
     * The Relationship.
     * Relationship to the user. Possible values are parent, relative, aide, doctor, guardian, child, other, unknownFutureValue.
     */
    @SerializedName(value = "relationship", alternate = {"Relationship"})
    @Expose
    public ContactRelationship relationship;


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

    }
}
