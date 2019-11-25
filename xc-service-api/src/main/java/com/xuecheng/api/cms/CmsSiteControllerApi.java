package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author bigStone
 * @date 2019/11/10 22:53
 */
public interface CmsSiteControllerApi {

    public QueryResponseResult findSiteList(QueryPageRequest queryPageRequest);

}
