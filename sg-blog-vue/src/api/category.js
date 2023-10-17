import request from '@/utils/request'

// 查询分类列表
export function getCategoryList() {
    return request({
        url: '/category/categoryList',
        headers: {
          isToken: false
        },
        method: 'get'
    })
}
