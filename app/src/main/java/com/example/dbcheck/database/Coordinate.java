package com.example.dbcheck.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "coordinates")
public class Coordinate {

    @PrimaryKey(autoGenerate = true)
    public int id;
    public String workType;
    public int terminalNo;
    public String registerType;
    public int storageSource;
    public int storageDestination;
    public int itemNo;
    public int epc;
    public String registerDate;
    public String registerCD;


    public Coordinate(String workType, int terminalNo, String registerType, int storageSource, int storageDestination, int itemNo, int epc, String registerDate, String registerCD) {
        this.workType = workType;
        this.terminalNo = terminalNo;
        this.registerType = registerType;
        this.storageSource = storageSource;
        this.storageDestination = storageDestination;
        this.itemNo = itemNo;
        this.epc = epc;
        this.registerDate = registerDate;
        this.registerCD = registerCD;
    }
    public Coordinate(int i) {
        this.workType = "type:"+i;
        this.terminalNo = i;
        this.registerType = ""+i;
        this.storageSource = i;
        this.storageDestination = i;
        this.itemNo = i;
        this.epc = i;
        this.registerDate = ""+i;
        this.registerCD = ""+i;
    }

    public int getId() {
        return id;
    }

    public String getWorkType() {
        return workType;
    }

    public int getTerminalNo() {
        return terminalNo;
    }

    public String getRegisterType() {
        return registerType;
    }

    public int getStorageSource() {
        return storageSource;
    }

    public int getStorageDestination() {
        return storageDestination;
    }

    public int getItemNo() {
        return itemNo;
    }

    public int getEpc() {
        return epc;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public String getRegisterCD() {
        return registerCD;
    }
}
