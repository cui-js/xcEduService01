package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;

/**
 * @author bigStone
 * @date 2019/11/26 0:20
 */
@Api(value = "cms模板管理接口",description = "cms模板管理接口， 提供页面的增、删、改、查")
public interface CmsTemplateControllerApi {

    public QueryResponseResult findTemplateList();

}
