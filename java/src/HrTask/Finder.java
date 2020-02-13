package src.HrTask;

import java.util.*;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     * @param groups    группы *
     * @param targetAge возраст для поиска *
     * @return список имен групп из списка групп
     * старше возраста targetAge
     */

    public static Set<String> findOldMembers(List<MembersGroup> groups, int targetAge)
    {
        Set<String> newGroup = new HashSet<>();
        groups.stream()
                .forEach(s -> s.getMembers()
                .stream()
                .filter(t -> t.getAge() > targetAge)
                .forEach(w -> newGroup.add(w.getName())));

        return newGroup;
    }

    //Для проверки, убедиться что работает.
    public static void main(String[] args)
    {
        Member member1 = new Member("Vasya", 11);
        Member member2 = new Member("Sasha", 22);
        Member member3 = new Member("Masha", 33);
        List<Member> list = new ArrayList<>();
        list.add(member1);
        list.add(member2);
        list.add(member3);
        MembersGroup mGroup = new MembersGroup("Test", list);
        System.out.println(findOldMembers(Collections.singletonList(mGroup), 22));
    }
}


