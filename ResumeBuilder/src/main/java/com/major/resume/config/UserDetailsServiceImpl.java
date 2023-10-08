//package com.major.resume.config;
//
//import com.major.resume.entities.user.User;
//import com.major.resume.repository.user.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Controller;
//
//@Controller
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        User user = userRepository.getUserByUserName(userName);
//        if (user == null) {
//            throw new UsernameNotFoundException("Could not find user !!");
//        }
//        CustomUserDetails customUserDetails = new CustomUserDetails(user);
//        return customUserDetails;
//    }
//}
