/**
 * Date:    2019/4/22 14:05
 * <author>
 * 陈柏
 */
package com.huahua.search.service;

import com.huahua.search.dao.SearchDao;
import com.huahua.search.pojo.ArticleEs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SearchService {

    @Autowired
    private SearchDao searchDao;

    public Page<ArticleEs> searchArticle(String keywords, Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return searchDao.findAllByTitleLikeOrContentLike(keywords,keywords,pageRequest);
    }

    public void add(ArticleEs articleEs) {
        searchDao.save(articleEs);
    }

    public void delete(String id) {
        searchDao.deleteById(id);
    }

    public void update(ArticleEs articleEs) {
        searchDao.save(articleEs);
    }

    public ArticleEs findById(String id) {
        ArticleEs articleEs = searchDao.findById(id).get();
        return articleEs;
    }
}
