package com.devmaster.lesson08_thuchanh_bai3.service;

import com.devmaster.lesson08_thuchanh_bai3.entity.Configuration;
import com.devmaster.lesson08_thuchanh_bai3.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {
    @Autowired
    private ConfigurationRepository configurationRepository;

    public List<Configuration> getAllConfigurations() {
        return configurationRepository.findAll();
    }
    public Configuration getConfigurationById(Long id) {
        return configurationRepository.findById(id).orElse(null);
    }
    public Configuration saveConfiguration(Configuration configuration) {
        return configurationRepository.save(configuration);
    }

    public List<Configuration> getAllConfigurationById(List<Long> ids) {
        return configurationRepository.findAllById(ids);
    }
    public void deleteConfigurationById(Long id) {
        configurationRepository.deleteById(id);
    }
}
