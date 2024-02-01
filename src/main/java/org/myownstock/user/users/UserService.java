package org.myownstock.user.users;

import org.myownstock.user.helpers.services.Service;
import org.myownstock.user.users.dto.UserAddRequestDto;

public interface UserService extends Service<User> {
    User addFromDto(UserAddRequestDto user) throws Exception;
}
