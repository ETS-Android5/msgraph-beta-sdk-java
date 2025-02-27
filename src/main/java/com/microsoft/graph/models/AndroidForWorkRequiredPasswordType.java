// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Android For Work Required Password Type.
*/
public enum AndroidForWorkRequiredPasswordType
{
    /**
    * device Default
    */
    DEVICE_DEFAULT,
    /**
    * low Security Biometric
    */
    LOW_SECURITY_BIOMETRIC,
    /**
    * required
    */
    REQUIRED,
    /**
    * at Least Numeric
    */
    AT_LEAST_NUMERIC,
    /**
    * numeric Complex
    */
    NUMERIC_COMPLEX,
    /**
    * at Least Alphabetic
    */
    AT_LEAST_ALPHABETIC,
    /**
    * at Least Alphanumeric
    */
    AT_LEAST_ALPHANUMERIC,
    /**
    * alphanumeric With Symbols
    */
    ALPHANUMERIC_WITH_SYMBOLS,
    /**
    * For AndroidForWorkRequiredPasswordType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
