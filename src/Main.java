public class Main
{
    public static void main(String[] args)
    {
        User user1 = new User("test1","test1",24);
        User user2 = new User("test2","test2",22);
        User user3 = new User("test3","test3",17);
        User user4 = new User("test4","test4",14);
        User user5 = new User("test5","test5",27);
        User user6 = new User("test6","test6",30);
        User user7 = new User("test7","test7",12);
        User user8 = new User("test8","test8",64);
        User user9 = new User("test9","test9",16);
        User user10 = new User("test10","test10",24);
        User [] users = new User[]{ user1,
                                    user2,
                                    user3,
                                    user4,
                                    user5,
                                    user6,
                                    user7,
                                    user8,
                                    user9,
                                    user10};
        for (User u : users)
        {
        System.out.println(     "Name: "+ u.getName() +
                                " Surname: " + u.getSurname()+
                                " Age: " + u.getAge() +
                                " DateOfBirth " + u.getDateOfBirth());
        }
        System.out.println("\nUsers Adults ");
        for (User u : users
             )
        {
            if (u.isAdult(u.getAge()))
            {
                System.out.println(     "Name: "+ u.getName() +
                        " Surname: " + u.getSurname()+
                        " Age: " + u.getAge() +
                        " DateOfBirth " + u.getDateOfBirth());
            }
        }

    }
}
