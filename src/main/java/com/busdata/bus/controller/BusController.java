package com.busdata.bus.controller;
import com.busdata.bus.entity.Bus;
import com.busdata.bus.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusRepository busRepository;
            //分页查询
    @GetMapping("/findAll/{page}/{size}")
    public Page<Bus> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Pageable pageable = PageRequest.of(page - 1, size);
        return busRepository.findAll(pageable);
    }
            //保存数据
    @PostMapping("/save")
    public String save(@RequestBody Bus bus){
        Bus result=busRepository.save(bus);
        if (result!=null){
            return "success";
        }else{
            return "error";
        }
    }
            //根据id找到相对应的数据
    @GetMapping("/findById/{id}")
    public Bus findById(@PathVariable("id") Integer id){
        return busRepository.findById(id).get();
    }
            //存入数据
    @PutMapping("/update")
    public String update(@RequestBody Bus bus){
        Bus result=busRepository.save(bus);
        if (result!=null){
            return "success";
        }else{
            return "error";
        }
    }
            //根据参数id删除数据
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        busRepository.deleteById(id);
    }
}
