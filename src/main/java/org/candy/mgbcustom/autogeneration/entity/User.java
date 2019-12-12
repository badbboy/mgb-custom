package org.candy.mgbcustom.autogeneration.entity;

import java.util.Date;

/**
 * 商户信息表
 *
 * @author candy
 * @date   2019/12/12
 */
public class User {
    /** 商户ID */
    private String mchid;

    /** 名称 */
    private String name;

    /** 类型 */
    private String type;

    /** 请求私钥 */
    private String reqkey;

    /** 响应私钥 */
    private String reskey;

    /** 商户状态,0-停止使用,1-使用中 */
    private Byte state;

    /** 创建时间 */
    private Date createtime;

    /** 更新时间 */
    private Date updatetime;

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReqkey() {
        return reqkey;
    }

    public void setReqkey(String reqkey) {
        this.reqkey = reqkey;
    }

    public String getReskey() {
        return reskey;
    }

    public void setReskey(String reskey) {
        this.reskey = reskey;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}