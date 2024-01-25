package org.myownstock.user.communities.impl;

import org.myownstock.user.communities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserToCommunityServiceImpl implements UserToCommunityService {
    @Autowired
    IUserToCommunity repository;

    @Override
    public UserToCommunity add(UserToCommunity userToCommunity) {
        return repository.save(userToCommunity);
    }
}
