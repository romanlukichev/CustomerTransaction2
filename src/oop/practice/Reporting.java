package oop.practice;

import java.util.Date;

/**
 * Created by Roman on 21.09.2016.
 */
public interface Reporting {
    ////////////////////////////////////////////////////////////////////////////////////
    // methods specific to reporting
    public String getName();

    public  Date getDate();

    public  String productBreakdown();
}
