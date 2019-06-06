package com.example.fightnet.NetWork.Pojo.Overview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wins {

@SerializedName("boxing")
@Expose
private Integer boxing;
@SerializedName("aikido")
@Expose
private Integer aikido;

public Integer getBoxing() {
return boxing;
}

public void setBoxing(Integer boxing) {
this.boxing = boxing;
}

public Integer getAikido() {
return aikido;
}

public void setAikido(Integer aikido) {
this.aikido = aikido;
}

}