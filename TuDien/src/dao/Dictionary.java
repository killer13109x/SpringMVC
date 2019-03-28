package dao;

import org.springframework.stereotype.Service;

@Service
public interface Dictionary {
    String search(String english);
}
