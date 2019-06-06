package com.example.fightnet.NetWork.Pojo.Overview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Id {

@SerializedName("timestamp")
@Expose
private Integer timestamp;
@SerializedName("machineIdentifier")
@Expose
private Integer machineIdentifier;
@SerializedName("processIdentifier")
@Expose
private Integer processIdentifier;
@SerializedName("counter")
@Expose
private Integer counter;
@SerializedName("time")
@Expose
private Integer time;
@SerializedName("date")
@Expose
private Integer date;
@SerializedName("timeSecond")
@Expose
private Integer timeSecond;

public Integer getTimestamp() {
return timestamp;
}

public void setTimestamp(Integer timestamp) {
this.timestamp = timestamp;
}

public Integer getMachineIdentifier() {
return machineIdentifier;
}

public void setMachineIdentifier(Integer machineIdentifier) {
this.machineIdentifier = machineIdentifier;
}

public Integer getProcessIdentifier() {
return processIdentifier;
}

public void setProcessIdentifier(Integer processIdentifier) {
this.processIdentifier = processIdentifier;
}

public Integer getCounter() {
return counter;
}

public void setCounter(Integer counter) {
this.counter = counter;
}

public Integer getTime() {
return time;
}

public void setTime(Integer time) {
this.time = time;
}

public Integer getDate() {
return date;
}

public void setDate(Integer date) {
this.date = date;
}

public Integer getTimeSecond() {
return timeSecond;
}

public void setTimeSecond(Integer timeSecond) {
this.timeSecond = timeSecond;
}

}