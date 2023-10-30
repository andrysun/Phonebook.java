public class HW5 {
    public static void main(String[] args) {
        Phonebook Phonebook = new Phonebook();
        Phonebook.add("123456789", "Алиса");
        Phonebook.add("987654321", "Иван");
        Phonebook.add("456789123", "Владимир");
        Phonebook.add("321654987", "Давид");
        Phonebook.add("789123456", "Алексадра");
        Phonebook.add("654987321", "Сергей");
        Phonebook.add("234567891", "Иван");
        Phonebook.add("876543219", "Пётр");
        Phonebook.add("345678912", "Александра");
        Phonebook.add("432165498", "Андрей");
        Phonebook.add("876543219", "Степан");
        Phonebook.add("234567891", "Сергей");
        Phonebook.add("654987321", "Владимир");
        Phonebook.add("435455423", "Владимир");
        Phonebook.add("789123446", "Викторя");
        Phonebook.add("321654987", "Давид");
        Phonebook.add("321654987", "Виталий");
        Phonebook.add("321654987", "Виталий");
        System.out.println(Phonebook.getPhoneNum("654987321"));
        System.out.println(Phonebook.getByName("Давид"));
        System.out.println(Phonebook.getAll());
    }
}