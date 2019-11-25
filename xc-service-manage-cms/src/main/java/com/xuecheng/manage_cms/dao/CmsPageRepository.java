package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author bigStone
 * @date 2019/9/16 23:05
 */

public interface CmsPageRepository extends MongoRepository<CmsPage, String> {

    //根据页面名称查询
    CmsPage findByPageName(String pageName);
    //据页面名称， 站点Id， webPath查询
    CmsPage findByPageNameAndSiteIdAndPageWebPath(String pageName, String siteId, String pageWebPath);



}
