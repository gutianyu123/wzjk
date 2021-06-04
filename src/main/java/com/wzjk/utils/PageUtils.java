package com.wzjk.utils;

import com.github.pagehelper.Page;

public class PageUtils {

	@SuppressWarnings("rawtypes")
	public static void converPageData(Page param, Page result){
		result.setPageNum(param.getPageNum());
		result.setTotal(param.getTotal());
		result.setPages(param.getPages());
		
	}
}

