// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.BitLockerEncryptionMethod;
import com.microsoft.graph.models.BitLockerRecoveryOptions;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bit Locker Fixed Drive Policy.
 */
public class BitLockerFixedDrivePolicy implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Encryption Method.
     * Select the encryption method for fixed drives. Possible values are: aesCbc128, aesCbc256, xtsAes128, xtsAes256.
     */
    @SerializedName(value = "encryptionMethod", alternate = {"EncryptionMethod"})
    @Expose
	@Nullable
    public BitLockerEncryptionMethod encryptionMethod;

    /**
     * The Recovery Options.
     * This policy setting allows you to control how BitLocker-protected fixed data drives are recovered in the absence of the required credentials. This policy setting is applied when you turn on BitLocker.
     */
    @SerializedName(value = "recoveryOptions", alternate = {"RecoveryOptions"})
    @Expose
	@Nullable
    public BitLockerRecoveryOptions recoveryOptions;

    /**
     * The Require Encryption For Write Access.
     * This policy setting determines whether BitLocker protection is required for fixed data drives to be writable on a computer.
     */
    @SerializedName(value = "requireEncryptionForWriteAccess", alternate = {"RequireEncryptionForWriteAccess"})
    @Expose
	@Nullable
    public Boolean requireEncryptionForWriteAccess;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
