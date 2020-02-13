package src.HrTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Finder {

    /**
     * Поиск групп людей старше определенного возраста.
     * * *
     *
     * @param groups    группы *
     * @param targetAge возраст для поиска *
     * @return список имен групп из списка групп
     * старше возраста targetAge
     */
    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {

        Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    }

    public static void main(String[] args) {
        Member member1 = new Member("Vasya", 11);
        Member member2 = new Member("Sasha", 22);
        Member member3 = new Member("Masha", 33);
        List<Member> list = new ArrayList<>();
        list.add(member1);
        list.add(member2);
        list.add(member3);
        MembersGroup mGroup = new MembersGroup("Test", list);

        Stream.of(mGroup).filter(x -> x.equals(22))
                .forEach(System.out::println);
        //System.out.println("its here");

    }
}


