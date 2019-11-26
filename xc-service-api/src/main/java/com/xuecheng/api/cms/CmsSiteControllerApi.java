package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;

/**
 * @author bigStone
 * @date 2019/11/10 22:53
 */
@Api(value = "cms站点管理接口",description = "cms页面管理接口， 提供页面的增、删、改、查")
public interface CmsSiteControllerApi {

    public QueryResponseResult findSiteList(QueryPageRequest queryPageRequest);

}
