// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Mac OSSoftware Update Delay Policy.
*/
public enum MacOSSoftwareUpdateDelayPolicy
{
    /**
    * none
    */
    NONE,
    /**
    * delay OSUpdate Visibility
    */
    DELAY_OS_UPDATE_VISIBILITY,
    /**
    * delay App Update Visibility
    */
    DELAY_APP_UPDATE_VISIBILITY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * delay Major Os Update Visibility
    */
    DELAY_MAJOR_OS_UPDATE_VISIBILITY,
    /**
    * For MacOSSoftwareUpdateDelayPolicy values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
