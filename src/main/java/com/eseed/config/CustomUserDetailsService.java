package com.eseed.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eseed.entity.UserRegEntity;
import com.eseed.repo.UserRegRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	
	
    @Autowired
    private UserRegRepo userRepository;
    
    

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
    	System.out.println("username------------------------------------------------->"+username);
    	//UserRegEntity user = userRepository.findByUserid(username);  
    	
    	UserRegEntity user = userRepository.getUserDetailsEseed(username);  
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
     

        // Create a GrantedAuthority for the role
//List<GrantedAuthority> authorities = getAuthoritiesByTypeUser(user.getType_user());
//        
//        // Create a UserDetails object representing the user
//        UserDetails userDetails = User.withUsername(user.getName())
//                .password(user.getEncpassword())
//                .authorities(authorities)
//                .build();
//        
//        return userDetails;
        return new UserPrincipal(user);
       
    }
    
//    private List<GrantedAuthority> getAuthoritiesByTypeUser(String typeUser) {
//        
//    	
//    	System.out.println("typeUser--------------------->"+typeUser);
//        List<GrantedAuthority> authorities = new ArrayList();
//        
//        // Example logic:
//        
//        
//        if ("25".equals(typeUser)) {
//            authorities.add(new SimpleGrantedAuthority("ROLE_CUSTOM")); 
//        }
//        
//        return authorities;
//    }
    
    
    
}