package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author bigStone
 * @date 2019/9/16 23:05
 */

public interface CmsPageRepository extends MongoRepository<CmsPage, String> {
}
