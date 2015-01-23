package org.subins.webmvc.dto;

public class TillRecordDTO {

    private String id;
    private String timestamp;
    private String ean;
    private String unit_price;
    private String  quantity;
    private String total_price;

    public TillRecordDTO(String id, String timestamp, String ean, String unit_price, String quantity, String total_price) {
        this.id = id;
        this.timestamp = timestamp;
        this.ean = ean;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.total_price = total_price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }
}
