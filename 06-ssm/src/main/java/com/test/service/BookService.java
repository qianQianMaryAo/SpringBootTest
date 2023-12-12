package com.test.service;


import com.test.domain.Book;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Transactional
public interface BookService {
    /**
     * 增加
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 更改
     * @param book
     * @return
     */
    public void update(Book book);

    /**
     * 通过id获取
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Book> getAll();
}
