package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

/**
 * @author  bigStone
 * @date 2019/9/15 21:52
 */
@Data
public class QueryPageRequest {
    //接受页面查询的查询条件
    //站点ID
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模板Id
    private String templateId;


}
