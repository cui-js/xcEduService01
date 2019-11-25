package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author bigStone
 * @date 2019/11/10 16:13
 */
public interface CmsSiteRepository extends MongoRepository<CmsSite, String> {


}
