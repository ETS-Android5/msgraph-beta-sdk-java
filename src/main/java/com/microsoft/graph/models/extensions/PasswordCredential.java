// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Password Credential.
 */
public class PasswordCredential implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Custom Key Identifier.
     * Do not use.
     */
    @SerializedName(value = "customKeyIdentifier", alternate = {"CustomKeyIdentifier"})
    @Expose
    public byte[] customKeyIdentifier;

    /**
     * The Display Name.
     * Friendly name for the password. Optional.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The End Date Time.
     * The date and time at which the password expires represented using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Optional.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Hint.
     * Contains the first three characters of the password. Read-only.
     */
    @SerializedName(value = "hint", alternate = {"Hint"})
    @Expose
    public String hint;

    /**
     * The Key Id.
     * The unique identifier for the password.
     */
    @SerializedName(value = "keyId", alternate = {"KeyId"})
    @Expose
    public java.util.UUID keyId;

    /**
     * The Secret Text.
     * Read-only; Contains the strong passwords generated by Azure AD that are 16-64 characters in length. The generated password value is only returned during the initial POST request to addPassword. There is no way to retrieve this password in the future.
     */
    @SerializedName(value = "secretText", alternate = {"SecretText"})
    @Expose
    public String secretText;

    /**
     * The Start Date Time.
     * The date and time at which the password becomes valid. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Optional.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;


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
