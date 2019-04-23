package com.codehub.java.jvm;

/**
 * System中提供了一个native方法arraycopy()
 * @author Kay
 *
 */
public class SystemArrayCopyTest {
    public static void main(String[] args) {
        User[] users = new User[]{new User(1,"admin","admin@qq.com"),new User(2,"maco","maco@qq,com"),new User(3,"kitty","kitty@qq,com")};
        User[] userCopy = new User[users.length];
        
        System.arraycopy(users, 0, userCopy, 0, users.length);
        System.out.println("源对象与目标对象物理地址是否相同：" + (users[0] == userCopy[0] ? "相同，浅拷贝" : "不相同，深拷贝"));
        
        userCopy[0].setUsername("Kay");
        for(User user : users) {
            System.out.println(user.toString());
        }
    }
}

class User {
    private Integer id;
    private String username;
    private String email;
    
    public User() {
        
    }
    
    public User(Integer id, String username, String email) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
    }
}