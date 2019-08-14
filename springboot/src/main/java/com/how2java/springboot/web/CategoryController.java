package com.how2java.springboot.web;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
import com.how2java.springboot.mapper.CategoryMapper;
import com.how2java.springboot.pojo.Category;

/*
1. 接受listCategory映射
2. 然后获取所有的分类数据
3. 接着放入Model中
4. 跳转到listCategory.jsp中
 */
   
@Controller
public class CategoryController {
    @Autowired CategoryMapper categoryMapper;
      
    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryMapper.findAll();
          
        m.addAttribute("cs", cs);
          
        return "listCategory";
    }
      
}