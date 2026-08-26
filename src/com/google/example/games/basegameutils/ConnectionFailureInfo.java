package com.google.example.games.basegameutils;

public class ConnectionFailureInfo {
    private final int serviceErrorCode;
    private final int activityResultCode;

    public ConnectionFailureInfo(final int serviceErrorCode) {
        this(serviceErrorCode, -1);
    }

    public ConnectionFailureInfo(final int serviceErrorCode, final int activityResultCode) {
        this.serviceErrorCode = serviceErrorCode;
        this.activityResultCode = activityResultCode;
    }

    public int getServiceErrorCode() {
        return this.serviceErrorCode;
    }

    public int getActivityResultCode() {
        return this.activityResultCode;
    }

    @Override
    public String toString() {
        return "ConnectionFailureInfo{" + status(this.serviceErrorCode) + ", result=" + result(this.activityResultCode) + '}';
    }

    private static String status(final int value) {
        switch (value) {
            case 0: return "SUCCESS";
            case 1: return "SERVICE_MISSING";
            case 2: return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3: return "SERVICE_DISABLED";
            case 9: return "SERVICE_INVALID";
            case 18: return "SERVICE_UPDATING";
            case 19: return "SERVICE_MISSING_PERMISSION";
            default: return "UNKNOWN_STATUS_" + value;
        }
    }

    private static String result(final int value) {
        switch (value) {
            case 0: return "RESULT_CANCELED";
            case -1: return "RESULT_OK";
            default: return "RESULT_" + value;
        }
    }
}
