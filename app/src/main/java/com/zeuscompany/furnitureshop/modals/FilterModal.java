package com.zeuscompany.furnitureshop.modals;

/**
 * Created by vinup on 7/4/2018.
 */

public class FilterModal
{
    String filter_name;
    String filter_value;

    public FilterModal(String filter_name, String filter_value) {
        this.filter_name = filter_name;
        this.filter_value = filter_value;
    }

    public String getFilter_name() {
        return filter_name;
    }

    public void setFilter_name(String filter_name) {
        this.filter_name = filter_name;
    }

    public String getFilter_value() {
        return filter_value;
    }

    public void setFilter_value(String filter_value) {
        this.filter_value = filter_value;
    }
}
