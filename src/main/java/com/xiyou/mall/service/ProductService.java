package com.xiyou.mall.service;

import com.github.pagehelper.PageInfo;
import com.xiyou.mall.model.pojo.Product;
import com.xiyou.mall.model.request.AddProductReq;
import com.xiyou.mall.model.request.ProductListReq;

/**
 * 描述：     商品Service
 */
public interface ProductService {

    void add(AddProductReq addProductReq);

    void update(Product updateProduct);

    void delete(Integer id);

    void batchUpdateSellStatus(Integer[] ids, Integer sellStatus);

    PageInfo listForAdmin(Integer pageNum, Integer pageSize);

    Product detail(Integer id);

    PageInfo list(ProductListReq productListReq);
}
