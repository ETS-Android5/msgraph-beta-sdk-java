// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Certificate Destination Store.
*/
public enum CertificateDestinationStore
{
    /**
    * computer Cert Store Root
    */
    COMPUTER_CERT_STORE_ROOT,
    /**
    * computer Cert Store Intermediate
    */
    COMPUTER_CERT_STORE_INTERMEDIATE,
    /**
    * user Cert Store Intermediate
    */
    USER_CERT_STORE_INTERMEDIATE,
    /**
    * For CertificateDestinationStore values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
