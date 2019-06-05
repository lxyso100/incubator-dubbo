package org.apache.dubbo.demo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.StockService;

//@Service
public class StockServiceImpl implements StockService {
    @Override
    public Long findStockNumByName(String name) {
        return 20L;
    }
}
