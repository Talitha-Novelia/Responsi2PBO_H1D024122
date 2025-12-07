public interface AksesSistem {
    
    // Abstract Methods
    void login(String pin);
    void logout();
    
    // Default Method
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
