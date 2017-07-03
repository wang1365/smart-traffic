package com.sap.icn.traffic.calculator;

import java.util.List;

/**
 * Created by I321761 on 2017/7/3.
 */
public class TaxiModel {
    public static class EdgeSpeed {
        public long edgeId;
        public float speed;
        public float vkt;
        public int flowCount;
        public EdgeSpeed() {
        }
    }

    public static class TimedSegmentSpeeds {
        public String timestamp;
        public List<SegmentSpeed> segSpeeds;

        public TimedSegmentSpeeds() {
        }
    }

    public static class SegmentSpeed {
        public long segId;
        public float speed;
        public float vkt;
        public int flowCount;

        public SegmentSpeed() {
        }
    }

    public static class TaxiSlotStats {
        public String timestamp;
        public int devCount;
        public int recordsCount;
        public int taxiDevCount;
        public int taxiRecordsCount;
        public int loadedTaxiDevCount;
        public int loadedTaxiRecordsCount;
        public int dupCount;
        public double dupRatio = -1.0D;
        public int invalidCount;
        public double invalidRatio = -1.0D;
        public double avgSpeed = -1.0D;
        public double avgNon0Speed = -1.0D;
        public double zeroSpeedRatio = -1.0D;
        public double avgInsertDelay = -1.0D;
        public double avgInterval = -1.0D;

        public TaxiSlotStats() {
        }
    }

    public static class GPSPoint {
        public String devId;
        public double lat;
        public double lng;
        public String gpsTime;
        public String receiveTime;
        public float speed;
        public short heading;
        public byte passengerState;
        public byte plateColor;

        public GPSPoint() {
        }
    }

    public static class TaxiMonitorSlotsParams {
        public double minLat;
        public double maxLat;
        public double minLng;
        public double maxLng;
        public boolean outputSegmentSpeed;
        public boolean calcEdgeSpeed = true;
        public int timePointType = 1;
        public String timePointFrom;
        public String timePointTo;
        public int timeWindow = 300;
        public int timeWindowForSpeed = 900;
        public boolean calcErrFlags = true;
        public int maxTimeInterval = 180;
        public double minDistInterval = 10.0D;
        public double maxDistInterval = 3000.0D;
        public int passengerStateFilter = 1;
        public boolean plateColorEffective;
        public int taxiPlateColor;
        public String taxiPlateRegex = "";
        public boolean enableDbgLog;

        public TaxiMonitorSlotsParams() {
        }
    }
}
