package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound();
        DogImplements dog1 = new DogImplements();
        dog1.makeSound();

        AnimalInterface1 cat2 = new CatImplements();
        cat2.makeSound();
        AnimalInterface1 dog2 = new DogImplements();
        dog2.makeSound();
        // 다형성 : 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();
        System.out.println(cat3.play("페르시안", "먼치킨"));

        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("진돗개", "시바견"));


//        AnimalInterface1 cat4 = new CatMultiImplements();
//        cat4.makeSound();
//        System.out.println(cat4.play("페르시안", "먼치킨"));
//        // AnimalInterface1 을 넣어버리면 animalInterface2 의 메서드 사용 불가
//        AnimalInterface1 dog4 = new DogMultiImplements();
//        dog4.makeSound();
//        System.out.println(dog4.play("진돗개", "시바견"));

        // 기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능 하나 '익명내부클래스' 방식으로 생성가능
        AnimalInterface1 ai1 = new AnimalInterface1() {
            @Override
            public void makeSound() {
                System.out.println("hello");
            }
        }; // 그자리에서 바로 구현하는 방식으로
        ai1.makeSound();

    }
}
