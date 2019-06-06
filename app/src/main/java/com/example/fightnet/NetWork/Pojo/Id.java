package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Id {

@SerializedName("timestamp")
@Expose
private Long timestamp;
@SerializedName("machineIdentifier")
@Expose
private Long machineIdentifier;
@SerializedName("processIdentifier")
@Expose
private Long processIdentifier;
@SerializedName("counter")
@Expose
private Long counter;
@SerializedName("time")
@Expose
private Long time;
@SerializedName("date")
@Expose
private Long date;
@SerializedName("timeSecond")
@Expose
private Long timeSecond;

public Long getTimestamp() {
return timestamp;
}

public void setTimestamp(Long timestamp) {
this.timestamp = timestamp;
}

public Long getMachineIdentifier() {
return machineIdentifier;
}

public void setMachineIdentifier(Long machineIdentifier) {
this.machineIdentifier = machineIdentifier;
}

public Long getProcessIdentifier() {
return processIdentifier;
}

public void setProcessIdentifier(Long processIdentifier) {
this.processIdentifier = processIdentifier;
}

public Long getCounter() {
return counter;
}

public void setCounter(Long counter) {
this.counter = counter;
}

public Long getTime() {
return time;
}

public void setTime(Long time) {
this.time = time;
}

public Long getDate() {
return date;
}

public void setDate(Long date) {
this.date = date;
}

public Long getTimeSecond() {
return timeSecond;
}

public void setTimeSecond(Long timeSecond) {
this.timeSecond = timeSecond;
}

}