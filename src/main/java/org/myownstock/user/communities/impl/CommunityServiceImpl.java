package org.myownstock.user.communities.impl;

import org.myownstock.user.communities.Community;
import org.myownstock.user.communities.CommunityService;
import org.myownstock.user.communities.ICommunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private ICommunity repository;
    public Community add (Community community) {
        return repository.save(community);
    }
}
