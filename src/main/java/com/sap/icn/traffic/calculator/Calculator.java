package com.sap.icn.traffic.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.Serializable;
import java.util.List;


/**
 * Created by I321761 on 2017/5/4.
 */
public class Calculator implements Serializable {
    private static Logger logger = LoggerFactory.getLogger(Calculator.class);

    public List<TaxiModel.EdgeSpeed> execute(List<TaxiModel.GPSPoint> taxiPoints, long timestampFrom, long timestampTo) {
        return null;
    }
}
