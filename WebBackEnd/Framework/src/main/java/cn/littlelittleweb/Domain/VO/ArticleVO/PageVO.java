package cn.littlelittleweb.Domain.VO.ArticleVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageVO {

    private List rows;
    private Long total;
}
