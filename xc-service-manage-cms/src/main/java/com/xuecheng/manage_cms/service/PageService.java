package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.dao.CmsPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bigStone
 * @date 2019/9/18 23:21
 */
@Service
public class PageService {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) {
        if(page <= 0){
            page = 1;
        }
        page = page - 1;
        if(size <= 10){
            size = 10;
        }
        Pageable pageable = PageRequest.of(page, size);
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageAliase(queryPageRequest.getPageAliase());
        cmsPage.setSiteId(queryPageRequest.getSiteId());
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
        exampleMatcher = exampleMatcher.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        exampleMatcher = exampleMatcher.withMatcher("siteId", ExampleMatcher.GenericPropertyMatchers.contains());
        //定义Example
        Example<CmsPage> cmsPageExample = Example.of(cmsPage, exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(cmsPageExample, pageable);
        QueryResult queryResult = new QueryResult();
        queryResult.setList(all.getContent());//数据列表
        queryResult.setTotal(all.getTotalElements());//数据总记录数
        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return queryResponseResult;
    }

    //新增页面
    public CmsPageResult add(CmsPage cmsPage){
        //校验页面名称，站点Id， webPath的唯一性
        //根据页面名称， 站点Id， webPath去cms_page查询，如果查到则说明已经存在， 如果查询不到，则继续添加
        CmsPage cmsPage1 = cmsPageRepository.findByPageNameAndSiteIdAndPageWebPath(cmsPage.getPageName(), cmsPage.getSiteId(), cmsPage.getPageWebPath());
        if(cmsPage1 == null){
            //调用dao新增页面
            cmsPage.setPageId(null);
            cmsPageRepository.save(cmsPage);
            return new CmsPageResult(CommonCode.SUCCESS, cmsPage);
        }
        return new CmsPageResult(CommonCode.FAIL, null);
    }



}
