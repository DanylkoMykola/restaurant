package com.team3.restaurant.service.producer;

import com.team3.restaurant.dao.repo.CustomerRepo;
import com.team3.restaurant.dao.repo.GoodsRepo;
import com.team3.restaurant.service.dto.GoodsDto;
import com.team3.restaurant.service.dto.OrderDto;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProducerService {

    private final CustomerRepo customerRepo;
    private final GoodsRepo goodsRepo;

    public ProducerService(CustomerRepo customerRepo, GoodsRepo goodsRepo) {
        this.customerRepo = customerRepo;
        this.goodsRepo = goodsRepo;
    }

    public List<OrderDto> generateOrders() {
        List<OrderDto> allOrders = new ArrayList<>();
        List<Long> allIds = customerRepo.getALlIds();
        for(Long id : allIds){
            allOrders.add(generateSingleOrder(id));
        }
        return allOrders;
    }

    private OrderDto generateSingleOrder(Long customerId){
        OrderDto orderDto = new OrderDto();
        List<GoodsDto> goodsDtoList = new ArrayList<>();
        List<Long> goodsIds = goodsRepo.getALlIds();

        orderDto.setCustomerId(customerId);
        orderDto.setDiscount(customerRepo.getDiscountById(customerId));
        orderDto.setOrderDateTime(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES));
        for(Long id : goodsIds){
            GoodsDto tempDto = new GoodsDto();
            tempDto.setGoodsId(id);
            tempDto.setAmount((int)((Math.random() * (100 - 50)) + 50));
            goodsDtoList.add(tempDto);
        }
        orderDto.setGoodsList(goodsDtoList);
        return orderDto;
    }

}
