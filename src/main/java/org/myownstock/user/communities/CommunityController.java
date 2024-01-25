package org.myownstock.user.communities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/communities")
public class CommunityController {
    @Autowired
    CommunityService communityService;
    @PostMapping
    public Community add(@RequestBody Community community) {
        return communityService.add(community);
    }
}
