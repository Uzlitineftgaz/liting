package uz.neft.liting.blog;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.neft.liting.template.RestCrud;
import uz.neft.liting.user.User;

import java.util.Optional;

@RestController
@RequestMapping("api/blog")
public class BlogController implements RestCrud<Blog> {


    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @Override
    public HttpEntity<?> all(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> sortBy) {
        return blogService.all(page, pageSize, sortBy).response();
    }

    @Override
    public HttpEntity<?> add(Blog blog, User user) {
        return blogService.add(blog).response();
    }

    @Override
    public HttpEntity<?> edit(Blog blog, User user) {
        return null;
    }

    @Override
    public HttpEntity<?> delete(Integer id, User user) {
        return null;
    }

    @Override
    public HttpEntity<?> one(Integer id) {
        return blogService.one(id).response();
    }
}
