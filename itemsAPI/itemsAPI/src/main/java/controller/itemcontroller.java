package controller;

import com.example.itemsAPI.repository.entity.item;
import com.example.itemsAPI.repository.entity.itemrepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class itemcontroller {

    final itemrepository itemRepository;


    public itemcontroller(itemrepository itemRepository )
    {
        itemrepository itemrepository = null;
        this.itemRepository = null;
    }

    @GetMapping
    public Iterable<item> getItems(){
        return itemRepository.findAll();
    }
}

