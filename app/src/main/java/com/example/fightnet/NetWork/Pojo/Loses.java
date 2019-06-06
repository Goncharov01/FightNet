package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loses {

@SerializedName("Freestyle wrestling")
@Expose
private Integer freestyleWrestling;
@SerializedName("Boxing")
@Expose
private Integer boxing;
@SerializedName("Muay Thai")
@Expose
private Integer muayThai;

public Integer getFreestyleWrestling() {
return freestyleWrestling;
}

public void setFreestyleWrestling(Integer freestyleWrestling) {
this.freestyleWrestling = freestyleWrestling;
}

public Integer getBoxing() {
return boxing;
}

public void setBoxing(Integer boxing) {
this.boxing = boxing;
}

public Integer getMuayThai() {
return muayThai;
}

public void setMuayThai(Integer muayThai) {
this.muayThai = muayThai;
}

}