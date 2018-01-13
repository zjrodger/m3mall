package com.zjrodger.e3mall.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemParamItem implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 
     */
    private Date created;

    /**
     * 
     */
    private Date updated;

    /**
     * 参数数据，格式为json格式
     */
    private String paramData;

    /**
     * 
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商品ID
     * @return item_id 商品ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 商品ID
     * @param itemId 商品ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 
     * @return created 
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 
     * @param created 
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 
     * @return updated 
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated 
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 参数数据，格式为json格式
     * @return param_data 参数数据，格式为json格式
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 参数数据，格式为json格式
     * @param paramData 参数数据，格式为json格式
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }

	@Override
	public String toString() {
		return "TbItemParamItem [id=" + id + ", itemId=" + itemId
				+ ", created=" + created + ", updated=" + updated
				+ ", paramData=" + paramData + "]";
	}
    
}