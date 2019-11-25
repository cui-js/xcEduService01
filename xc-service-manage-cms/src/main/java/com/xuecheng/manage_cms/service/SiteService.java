package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsSite;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bigStone
 * @date 2019/11/10 16:14
 */
@Service
public class SiteService {

    @Autowired
    private CmsSiteRepository cmsSiteRepository;

    public QueryResponseResult findAll(QueryPageRequest queryPageRequest){
        List<CmsSite> siteList = cmsSiteRepository.findAll();
        QueryResult queryResult = new QueryResult();
        queryResult.setList(siteList);
        queryResult.setTotal(siteList.size());
        return new QueryResponseResult(CommonCode.SUCCESS, queryResult);

    }

}
